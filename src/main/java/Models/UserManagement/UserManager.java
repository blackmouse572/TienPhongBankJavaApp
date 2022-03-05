package Models.UserManagement;


import Models.Database.TransactionFirebaseService;
import Models.Database.UserFirebaseService;
import Models.Validation;
import TextView.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Stack;
import java.util.concurrent.ExecutionException;


public class UserManager {
    User currentUser = new User();
    
    public boolean signUp() {
        try
        {   currentUser.updateInformation();
            currentUser.setPassword();
            //do capcha
            if (!Validation.checkCapcha()){
                System.out.println(Text.capchaFail);
                return false;
            }
            UserFirebaseService.signUp(currentUser);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean logIn() {
        try {
            System.out.print(Text.accountID);
            String accountID = Validation.checkInputAccountID();
            System.out.print(Text.passWord);
            String password = Validation.checkInputPassword();

            currentUser = UserFirebaseService.signIn(accountID, password);
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());;
            return false;
        }
        return true;
    }

    public void transferMoney() {
        System.out.print(Text.amountOfMoney);
        float moneyToTransfer = Validation.checkInputfloat();

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer
        if (currentUser.getAccountBalance() < moneyToTransfer + 50000) {
            System.out.println(Text.notEnoughMoney);
        }
        // The money to transfer must greater ot equal to 30000
        else if (moneyToTransfer > 30000) {
            System.out.print(Text.accountID);
            String receiver = Validation.checkInputAccountID();
            System.out.print(Text.note);
            String note = Validation.checkInputString();
            
            //do capcha
            if (!Validation.checkCapcha()){
                System.out.println(Text.capchaFail);
                return;
            }
            
            String action = "Transfer money";
            //get current time
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

            try {
                //Check if receiver is existed, will throw exception if not
                User receiverUser = UserFirebaseService.retrieveUser(receiver);
                
                //Check if receiver is exited ?
                if (receiverUser == null ){
                    System.out.println(Text.receiverNotExist);
                    return;
                }
                
                //Check if receiver is the same as sender
                if (currentUser.getAccountID().equals(receiverUser.getAccountID())) {
                    System.out.println(Text.seflTransfer);
                    return;
                }
                
                //Then create new transaction
                Transaction newTransaction = new Transaction(currentUser, receiverUser, moneyToTransfer, action, note);
                TransactionFirebaseService.transferTransaction(newTransaction);
                //Update current user account balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() - moneyToTransfer);
            } catch (InterruptedException | ExecutionException e) {
                System.err.println(e.getMessage());
            }
        }else{
            System.out.println(Text.amountOfMoney30000);
        }

    }

    public void withdraw() {
        System.out.print(Text.amountOfMoney);
        float moneyToWithdraw = Validation.checkInputfloat();

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer

        if (currentUser.getAccountBalance() < moneyToWithdraw + 50000) {
            System.out.println(Text.notEnoughMoney);
        }
        // The money to transfer must greater or equal to 30000
        else if (moneyToWithdraw >= 30000) {
            
            //do capcha
            if (!Validation.checkCapcha()){
                System.out.println(Text.capchaFail);
                return;
            }
            
            String action = "Withdraw money";
            try {
            //Create new transaction
                Transaction newTransaction = new Transaction(currentUser, moneyToWithdraw, action);
                TransactionFirebaseService.withdrawTransaction(newTransaction);
                //Update current user account balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() - moneyToWithdraw);
                System.out.println(Text.withdrawSuccess );
                System.out.println(Text.balance + currentUser.getAccountBalance());
            } catch (ExecutionException | InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }else{
            System.out.println(Text.amountOfMoney30000);
        }

    }

    public void deposit() {
        System.out.print(Text.amountOfMoney);
        float moneyToDeposit = Validation.checkInputfloat();

        if (moneyToDeposit < 10000) {
            System.out.println(Text.lowAmountMoney);
        } else {
            
            //do capcha
            if (!Validation.checkCapcha()){
                System.out.println(Text.capchaFail);
                return;
            }
            
            String action = "Add money to account";

            try {
                //Create new transaction
                Transaction newTransaction = new Transaction(currentUser, moneyToDeposit, action);
                TransactionFirebaseService.depositTransaction(newTransaction);
                //Update current user account balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() + moneyToDeposit);
            } catch (ExecutionException | InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public void changePassword(){
        System.out.print(Text.oldpass);
        String oldpass = Validation.checkInputPassword();
        if (oldpass.equals(currentUser.getPassword())){
            System.out.print(Text.newpass);
            String newpass = Validation.checkInputPassword();
            System.err.print(Text.confirmpass);
            String confirmpass = Validation.checkInputPassword();
            if (confirmpass.equals(newpass)){
                
                //do capcha
                if (!Validation.checkCapcha()){
                    System.out.println(Text.capchaFail);
                    return;
                }
                
                try {
                    UserFirebaseService.updateUserPassword(currentUser.getAccountID(), oldpass, newpass);
                } catch (InterruptedException | ExecutionException e) {
                    System.err.println(e.getMessage());
                }
                
            }else System.out.println(Text.confirmpassWrong);
        }else System.out.println(Text.wrongpass);
    }

    public void displayInfo() {
        currentUser.display();
    }

    public void displayTransactions() {
        Stack<Transaction> history ;
        try {
            history = TransactionFirebaseService.getAllTransactionsByUserId(currentUser.getAccountID());
            for (Transaction x : history) {
                System.out.println(x);
            }
        } catch (ExecutionException | InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

}

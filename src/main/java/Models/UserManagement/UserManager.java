package Models.UserManagement;


import Models.Database.TransactionFirebaseService;
import Models.Database.UserFirebaseService;
import Models.Validation;
import TextView.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserManager {
    User currentUser = new User();
    
    public boolean signUp() {
        try
        {   currentUser.updateInformation();
            currentUser.setPassword();
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
            String accountID = Validation.checkInputPhone();
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
            String receiver = Validation.checkInputPhone();
            String action = "Transfer money";
            System.out.print(Text.note);
            String note = Validation.checkInputString();
            //thua
            //get current time
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

            try {
                //Check if receiver is existed, will throw exception if not
                User receiverUser = UserFirebaseService.retrieveUser(receiver);
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
            try {
                UserFirebaseService.updateUserPassword(currentUser.getAccountID(), oldpass, newpass);
            } catch (InterruptedException | ExecutionException e) {
                System.err.println(e.getMessage());
            }
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

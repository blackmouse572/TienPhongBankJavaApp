package Models.UserManagement;

import TextView.Text;
import Models.Database.TransactionFirebaseService;
import Models.Database.UserFirebaseService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import Models.Validation;

public class UserManager {
    Text text;
    User currentUser;

    public UserManager(Text text) {
        this.text = text;
    }
    
    
    public boolean signUp() {
        try {
            currentUser.updateInformation();
            currentUser.setPassword();
            UserFirebaseService.signUp(currentUser);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean logIn() {
        try {
            String accountID = Validation.checkInputID(text);
            String password = Validation.checkInputPassword(text);

            currentUser = UserFirebaseService.signIn(accountID, password);
            currentUser.setText(text);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void transferMoney() {
        // TODO: @Duc valid to check float
        float moneyToTransfer = 500;

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer
        if (currentUser.getAccountBalance() < moneyToTransfer + 50000) {
            System.out.println(text.notEnoughMoney);
        }
        // The money to transfer must greater ot equal to 30000
        else if (moneyToTransfer > 30000) {

            String receiver = Validation.checkInputID(text);
            String action = "Transfer money";
            String note = Validation.checkInputString(text);
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
                e.printStackTrace();
            }
        }

    }

    public void withdraw() {
        // TODO: @Duc valid to check float
        float moneyToWithdraw = 500;

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer

        if (currentUser.getAccountBalance() < moneyToWithdraw + 50000) {
            System.out.println(text.notEnoughMoney);
        }
        // The money to transfer must greater ot equal to 30000
        else if (moneyToWithdraw > 30000) {
            String action = "Withdraw money";
            try {
            // TODO: @Bin Call API to Update User Account Balance
            //Create new transaction
                Transaction newTransaction = new Transaction(currentUser, moneyToWithdraw, action);
                TransactionFirebaseService.withdrawTransaction(newTransaction);
                //Update current user account balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() - moneyToWithdraw);
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
            // TODO: @Bin call API to update Transaction
        }

    }

    public void deposit() {
        // TODO: @Duc valid to check float
        float moneyToDeposit = 10000;

        if (moneyToDeposit < 10000) {
            System.out.println(text.lowAmountMoney);
        } else {
            String action = "Add money to account";

            try {
                //Create new transaction
                Transaction newTransaction = new Transaction(currentUser, moneyToDeposit, action);
                TransactionFirebaseService.depositTransaction(newTransaction);
                //Update current user account balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() + moneyToDeposit);
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
        }
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
            e.printStackTrace();
        }
    }

}

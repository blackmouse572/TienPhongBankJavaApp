package Models.UserManagement;


import Models.Database.TransactionFirebaseService;
import Models.Database.UserFirebaseService;
import Models.Validation;
import TextView.Text;

import java.util.Collections;
import java.util.Stack;


/**
 * This Class Give user options to choose to their account:
 * Transfer money,
 * Sign up,
 * Login,
 * Withdraw
 * deposit
 * display info
 *
 * @author lil_ink
 */
public class UserManager {
    User currentUser = new User();

    /**
     * This method is used for User create a new account
     *
     * @return true if create successful. false otherwise
     */

    public boolean signUp() {
        try {
            currentUser.updateInformation();
            currentUser.setPassword();
            // Do captcha
            if (!Validation.checkCapcha()) {
                System.out.println(Text.capchaFail);
                return false;
            }
            UserFirebaseService.signUp(currentUser);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * This method is used for User to log in
     *
     * @return true if create successful. false otherwise
     */
    public boolean logIn() {
        try {
            System.out.print(Text.accountID);
            String accountID = Validation.checkInputAccountID();
            System.out.print(Text.passWord);
            String password = Validation.checkInputPassword();

            currentUser = UserFirebaseService.signIn(accountID, password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * This method is used for User to transfer money to other User
     */
    public void transferMoney() {
        System.out.print(Text.amountOfMoney);
        float moneyToTransfer = Validation.checkInputfloat();

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer
        if (currentUser.getAccountBalance() < moneyToTransfer + 50000) {
            System.out.println(Text.notEnoughMoney);
        }
        // The money to transfer must greater ot equal to 30000
        else if (moneyToTransfer >= 30000 && moneyToTransfer < 2000000000) {
            System.out.print(Text.accountID);
            String receiver = Validation.checkInputAccountID();
            System.out.print(Text.note);
            String note = Validation.checkInputString();

            //do capcha
            if (!Validation.checkCapcha()) {
                System.out.println(Text.capchaFail);
                return;
            }

            String action = "Transfer money";

            try {
                //Check if receiver is existed, will throw exception if not
                User receiverUser = UserFirebaseService.retrieveUser(receiver);

                //Check if receiver is exited ?
                if (receiverUser == null) {
                    System.out.println(Text.receiverNotExist);
                    return;
                }

                //Check if receiver is the same as sender
                if (currentUser.getAccountID().equals(receiverUser.getAccountID())) {
                    System.out.println(Text.seflTransfer);
                    return;
                }

                //update sender balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() - moneyToTransfer);
                //update receiver balance
                receiverUser.setAccountBalance(receiverUser.getAccountBalance() + moneyToTransfer);

                //Then create new transaction
                Transaction newTransaction = new Transaction(currentUser, receiverUser, moneyToTransfer, action, note);
                TransactionFirebaseService.transferTransaction(newTransaction);

                //print current user account balance
                System.out.println(Text.balance + (int) currentUser.getAccountBalance());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println(Text.amountOfMoney30000);
        }

    }

    /**
     * This method is used for User to withdraw money
     */
    public void withdraw() {
        System.out.print(Text.amountOfMoney);
        float moneyToWithdraw = Validation.checkInputfloat();

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer

        if (currentUser.getAccountBalance() < moneyToWithdraw + 50000) {
            System.out.println(Text.notEnoughMoney);
        }
        // The money to transfer must greater or equal to 30000
        else if (moneyToWithdraw >= 30000 && moneyToWithdraw < 2000000000) {

            //do capcha
            if (!Validation.checkCapcha()) {
                System.out.println(Text.capchaFail);
                return;
            }

            String action = "Withdraw money";
            try {
                //Update current user account balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() - moneyToWithdraw);

                //Create new transaction
                Transaction newTransaction = new Transaction(currentUser, moneyToWithdraw, action);
                TransactionFirebaseService.withdrawTransaction(newTransaction);

                //print current user account balance
                System.out.println(Text.balance + (int) currentUser.getAccountBalance());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println(Text.amountOfMoney30000);
        }

    }

    /**
     * This method is used for User to add money to their account
     */
    public void deposit() {
        System.out.print(Text.amountOfMoney);
        float moneyToDeposit = Validation.checkInputfloat();

        if (moneyToDeposit < 10000) {
            System.out.println(Text.lowAmountMoney);
        } else {

            //do capcha
            if (!Validation.checkCapcha()) {
                System.out.println(Text.capchaFail);
                return;
            }

            String action = "Add money to account";

            try {
                //Update current user account balance
                currentUser.setAccountBalance(currentUser.getAccountBalance() + moneyToDeposit);

                //Create new transaction
                Transaction newTransaction = new Transaction(currentUser, moneyToDeposit, action);
                TransactionFirebaseService.depositTransaction(newTransaction);

                //print current user account balance
                System.out.println(Text.balance + (int) currentUser.getAccountBalance());

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    /**
     * This method is used for User to change their password
     */
    public void changePassword() {
        System.out.print(Text.oldpass);
        String oldpass = Validation.checkInputPassword();
        if (oldpass.equals(currentUser.getPassword())) {
            System.out.print(Text.newpass);
            String newpass = Validation.checkInputPassword();
            System.err.print(Text.confirmpass);
            String confirmpass = Validation.checkInputPassword();
            if (confirmpass.equals(newpass)) {
                if (!Validation.checkCapcha()) {
                    System.out.println(Text.capchaFail);
                    return;
                }
                try {
                    UserFirebaseService.updateUserPassword(currentUser.getAccountID(), oldpass, newpass);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } else System.out.println(Text.confirmpassWrong);
        } else System.out.println(Text.wrongpass);
    }

    /**
     * This method is used for User to display their basic info
     */
    public void displayInfo() {
        currentUser.display();
    }

    /**
     * This method is used for User to display their Transaction history
     */
    public void displayTransactions() {
        Stack<Transaction> history;
        try {
            history = TransactionFirebaseService.getAllTransactionsByUserId(currentUser.getAccountID());
            Collections.sort(history);
            for (Transaction x : history) {
                x.setCurentUser(currentUser);
                System.out.println(x);
                System.out.println("-----------------");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}

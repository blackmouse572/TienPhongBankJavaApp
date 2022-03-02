package main.java.Models.UserManagement;

import java.util.Stack;

public class UserManager {

    User currentUser = new User();

    public boolean createUser(){

        currentUser.updateInformation();
        currentUser.setPassword();
        // TODO: @Bin Call API to signUp

        return true;
    }

    public boolean checkUser(){
        // TODO: @Duc Use validation
        String phoneNumber = "";
        String password = "";

        // TODO: @Bin Call API To SignIn

        return true;
    }

    public void transferMoney(){
        // TODO: @Duc valid to check float
        float moneyToTransfer = 500;

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer
        if (currentUser.getAccountBalance() < moneyToTransfer + 50000 ){
            System.out.println("Money in account is not enough");
        }
        // The money to transfer must greater ot equal to 30000
        else if (moneyToTransfer > 30000){
            // TODO: @Bin API retrieve RECEIVER ID return ID if Existed, except if false
            String receiver = "";
            String action = "Transfer money";
            // TODO: @Duc check input String;
            String note = "";


            // TODO: @Bin Call API to Update Sender User Account Balance
            // TODO: @Bin Call API to Update Receiver User Account Balance

            // TODO: @Bin call API to update Transaction
        }

    }

    public void withdraw(){
        // TODO: @Duc valid to check float
        float moneyToWithdraw = 500;

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer

        if (currentUser.getAccountBalance() < moneyToWithdraw + 50000 ){
            System.out.println("Money in account is not enough");
        }
        // The money to transfer must greater ot equal to 30000
        else if (moneyToWithdraw > 30000){
            String action = "Withdraw money";

            // TODO: @Bin Call API to Update User Account Balance

            // TODO: @Bin call API to update Transaction
        }

    }

    public void addMoney(){
        // TODO: @Duc valid to check float
        float moneyToAdd = 10000;

        if (moneyToAdd< 10000 ){
            System.out.println("The Amount of Money is too low. Must be greater than 10,000");
        }
        else {
            String action = "Add money to account";

            // TODO: @Bin Call API to Update User Account Balance

            // TODO: @Bin call API to update Transaction
        }
    }

    public void displayInfo(){
        currentUser.display();
    }

    public void displayTransactions(){
        // TODO: @Bin call API return Transaction history
        Stack<Transaction> history = null;

        for (Transaction x: history){
            System.out.println(x);
        }
    }

}

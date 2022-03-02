package main.java.Models.UserManagement;

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

        // TODO: New User that have the same information
        // TODO: @Bin Call API To SignIn

        return true;
    }

    public void transferMoney(){
        // TODO: valid to check float
        float moneyToTransfer = 500;

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer
        // The money to transfer must greater ot equal to 30000
        if (currentUser.getAccountBalance() < moneyToTransfer + 50000 ){
            System.out.println("Money in account is not enough");
        }
        else if (moneyToTransfer > 30000){
            // TODO: @Bin API retrieve RECEIVER ID return ID if Existed, except if false
            String receiver = "";

            // TODO: @Bin Call API to Update User Account Balance

            // TODO: @Bin call API to update Transaction
        }

    }

    public void withdraw(){
        // TODO: Check valid balance (< Current balance, > 30,000)
    }

    public void addMoney(){
        // TODO: Check valid balance
    }


}

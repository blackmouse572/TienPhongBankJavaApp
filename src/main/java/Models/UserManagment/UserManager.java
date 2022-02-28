package main.java.Models.UserManagment;

public class UserManager {

    User currentUser = new User();

    public boolean createUser(){

        currentUser.updateInformation();
        currentUser.setPassword();
        try {
            Models.Database.UserFirebaseService.signUp(currentUser);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return true;
    }

    public boolean checkUser(){
        // TODO: Use validation
        String phoneNumber = "";
        String password = "";

        // TODO: New User that have the same information
        try {
            Models.Database.UserFirebaseService.signIn(phoneNumber, password);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return true;
    }

    public void transferMoney(){
        // TODO: valid to check float
        float moneyToTransfer = 50000;

        // Money to transfer must less than money in account
        // And Account must have at least 50000 in balance after transfer
        // The money to transfer must greater ot equal to 30000
        if (currentUser.getAccountBalance() < moneyToTransfer + 50000 ){
            System.out.println("Money in account is not enough");
        }
        else if (moneyToTransfer > 30000){

            try {
                Models.Database.UserFirebaseService.updateUserAccountBalance(currentUser.getPhoneNumber(), moneyToTransfer);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

            // TODO: API retrieve USER phone number if Existed, except if false
            String receiver = "";


        }

    }

    public void withdraw(){
        // TODO: Check valid balance (< Current balance, > 30,000)
    }

    public void addMoney(){
        // TODO: Check valid balance
    }


}

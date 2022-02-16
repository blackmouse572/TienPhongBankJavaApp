public class UserManager {

    User current = new User();

    public boolean createUser(){

        // TODO: Validate User by Phone number

        // TODO: call API add zo database
        User u = new User();
        return true;
    }

    public boolean checkUser(){
        // TODO: Get User by Phone number

        // TODO: New User that have the same information

        // TODO: check if password match

        return true;
    }

    public void transferMoney(){
        // TODO: Check valid balance (< Current balance, > 30,000)
    }

    public void withdraw(){
        // TODO: Check valid balance (< Current balance, > 30,000)
    }

    public void addMoney(){
        // TODO: Check valid balance
    }


}

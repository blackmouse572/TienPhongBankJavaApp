import java.util.Scanner;

public class Validation {
    private final static Scanner in = new Scanner (System.in);

        public static String checkInputName(){
            while (true) {
                String result = in.nextLine().trim();
                if (result.isEmpty()) {
                    //if name contain nothing then the program will tell you to type again
                    System.err.println("Name not empty");
                    System.out.print("Enter again: ");
                } else if(result.matches("[a-zA-Z ]+")){
                    return result;
                    //Name must be words not a number
                } else {System.err.println("Alphabet only");
                    System.out.print("Enter name again: ");
                }
            }
        }
    public static String checkInputAddress(){
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public static String checkInputPhone(){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Phone not empty(10 digits)");
                System.out.print("Enter again: ");
                // input number limit is 10 and start with 0 as a phone number (Ex:0234543545)
            } else if(result.matches("(0[3|5|7|8|9])+([0-9]{8})\b")){
                return result;
            } else {System.err.println("Number only(10 digits)");
                System.out.print("Enter phone again: ");
            }
        }
    }
    public static String checkInputEmail() {
        while(true){
            String email = in.nextLine().trim();
            if (email.isEmpty()) {
                System.err.println("Email not empty");
                System.out.print("Enter again: ");
                //email does not specialized case
            } else if(email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$")){
                return email;
            } else {System.err.println("Wrong format!!!");
                System.out.print("Enter email again: ");
                //email always end up with .com to be valid to create and check
            }
        }
    }
    public static String checkInputID(){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("ID not empty(10 digits)");
                System.out.print("Enter again: ");
            } else if(result.matches("(0)+([0-9]{11})\b")){
                //ID must be 12 max
                return result;
            } else {System.err.println("Number only(12 digits, start with 0)");
                System.out.print("Enter ID again: ");
            }
        }
    }
    public static boolean checkValidBalance(int balance){
    // balance need to be more or equal than 30000 to use, if not then account could not be tranfer money
        if(balance > 30000) return true;
        else return false;
    }
    public static String checkInputPassword(){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Password empty");
                //if password is empty, it will make the program to run again
                System.out.print("Enter again: ");
                //Password must contain more then 8 to 22 max
            } else if(result.matches("([0-9a-zA-Z])(?=\S+$).{7,20}$")){
                //Password do not contain space or special letter case
                return result;
            } else {System.err.println("Alphabet and number only");
                System.out.print("Enter again: ");
            }
        }
    }
    public static boolean checkSamePassword(String oldP, String newP){
        if(oldP.equals(newP)) return false;
        //If new password is the same as the old password then it will fail to change to the new one
        else return true;
    }
}

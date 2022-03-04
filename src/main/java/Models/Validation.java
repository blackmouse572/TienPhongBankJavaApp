package Models;
import TextView.Text;
import java.util.Scanner;


public class Validation {
    private final static Scanner in = new Scanner (System.in);

        public static String checkInputName(Text text){
            while (true) {
                String result = in.nextLine().trim();
                if (result.isEmpty()) {
                    //if name contain nothing then the program will tell you to type again
                    System.err.println(text.notEmpty);
                    System.out.print(text.enterAgain);
                } else if(result.matches("[a-zA-Z ]+")){
                    return result;
                    //Name must be words not a number
                } else {System.err.println(text.anphabetOnly);
                    System.out.print(text.enterAgain);
                }
            }
        }
        
        
    public static String checkInputPhone(Text text){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println(text.notEmpty);
                System.out.print(text.enterAgain);
                // input number limit is 10 and start with 0 as a inputPhone number (Ex:0234543545)
            } else if(result.matches("(0[3|5|7|8|9])+([0-9]{8})\b")){
                return result;
            } else {System.err.println(text.numberOnly10);
                System.out.print(text.enterAgain);
            }
        }
    }
    
    
    public static String checkInputEmail(Text text) {
        while(true){
            String email = in.nextLine().trim();
            if (email.isEmpty()) {
                System.err.println(text.notEmpty);
                System.out.print(text.enterAgain);
                //email does not specialized case
            } else if(email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@(([[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}])|(([a-zA-Z-0-9]+.)+[a-zA-Z]{2,}))$")){
                return email;
            } else {System.err.println(text.wrongFomat);
                System.out.print(text.enterAgain);
                //email always end up with .com to be valid to create and check
            }
        }
    }
    public static String checkInputID(Text text){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println(text.notEmpty);
                System.out.print(text.enterAgain);
            } else if(result.matches("(0)+([0-9]{11})\b")){
                //ID must be 12 max
                return result;
            } else {System.err.println(text.numberOnly12);
                System.out.print(text.enterAgain);
            }
        }
    }
    public static float checkInputBalance() {
        //loop until user input correct
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine().trim());
                if (result < 0 ) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Balancecan't be negetive");
                System.out.print("Enter again: ");
            }
        }
    public static String checkInputPassword(Text text){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println(text.notEmpty);
                //if password is empty, it will make the program to run again
                System.out.print(text.enterAgain);
                //Password must contain more then 8 to 22 max
            } else if(result.matches("([0-9a-zA-Z])(?=\\S+$).{7,20}$")){
                //Password do not contain space or special letter case
                return result;
            } else {System.err.println(text.anphabetAndNumberOnly);
                System.out.print(text.enterAgain);
            }
        }
    }
    public static boolean checkSamePassword(String oldP, String newP) {
        if (oldP.equals(newP)) return false;
            //If new password is the same as the old password then it will fail to change to the new one
        else return true;
    }
    
    public static String checkInputString(Text text) {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println(text.notEmpty);
                System.out.print(text.enterAgain);
            } else {
                return result;
            }
        }
    }
    
     public static int checkInputIntLimit(Text text,int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println(text.numberInRange+"[" + min + ", " + max + "]");
                System.out.print(text.enterAgain);
            }
        }
    }
}

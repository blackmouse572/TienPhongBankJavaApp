package Models;
import TextView.Text;
import java.util.Scanner;


public class Validation {
    private final static Scanner in = new Scanner (System.in);

        public static String checkInputName(){
            while (true) {
                String result = in.nextLine().trim();
                if (result.isEmpty()) {
                    //if name contain nothing then the program will tell you to type again
                    System.err.println(Text.notEmpty);
                    System.out.print(Text.enterAgain);
                } else if(result.matches("[a-zA-Z ]+")){
                    return result;
                    //Name must be words not a number
                } else {System.err.println(Text.anphabetOnly);
                    System.out.print(Text.enterAgain);
                }
            }
        }

    public static String checkInputPhone(){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println(Text.notEmpty);
                System.out.print(Text.enterAgain);
                // input number limit is 10 and start with 0 as a inputPhone number (Ex:0234543545)
            } else if(result.matches("(0[3|5|7|8|9])+([0-9]{8})\\b")){
                return result;
            } else {System.err.println(Text.numberOnly10);
                System.out.print(Text.enterAgain);
            }
        }
    }
    
    public static String checkInputAccountID(){
        return checkInputPhone();
    }
    
    
    public static String checkInputEmail() {
        while(true){
            String email = in.nextLine().trim();
            if (email.isEmpty()) {
                System.err.println(Text.notEmpty);
                System.out.print(Text.enterAgain);
                //email does not specialized case
            } else if(email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@(([[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}])|(([a-zA-Z-0-9]+.)+[a-zA-Z]{2,}))$")){
                return email;
            } else {System.err.println(Text.wrongEmailFomat);
                System.out.print(Text.enterAgain);
                //email always end up with .com to be valid to create and check
            }
        }
    }
    public static String checkInputCitizenID(){
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println(Text.notEmpty);
                System.out.print(Text.enterAgain);
            } else if(result.matches("(0)+([0-9]{11})\\b")){
                //ID must be 12 max
                return result;
            } else {System.err.println(Text.numberOnly12);
                System.out.print(Text.enterAgain);
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
                System.err.println(Text.negativeBalance);
                System.out.print(Text.enterAgain);
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
                System.err.println(Text.notEmpty);
                //if password is empty, it will make the program to run again
                System.out.print(Text.enterAgain);
                //Password must contain more than 8 to 22 max
            } else if(result.matches("([0-9a-zA-Z])(?=\\S+$).{7,20}$")){
                //Password do not contain space or special letter case
                return result;
            } else {System.err.println(Text.anphabetAndNumberOnly);
                System.out.print(Text.enterAgain);
            }
        }
    }
    public static boolean checkSamePassword(String oldP, String newP) {
        if (oldP.equals(newP)) return true;
            //If new password is the same as the old password then it will fail to change to the new one
        else return false;
    }
    
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println(Text.notEmpty);
                System.out.print(Text.enterAgain);
            } else {
                return result;
            }
        }
    }
    
     public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println(Text.numberInRange+"[" + min + ", " + max + "]");
                System.out.print(Text.enterAgain);
            }
        }
    }
     
     public static float checkInputfloat() {
        //loop until user input correct
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine());
                return result;
            } catch (Exception e) {
                System.err.println(Text.numberOnly);
                System.out.print(Text.enterAgain);
            }
        }
    }
    
    public static int generateCapcha(){
        return (int)(Math.random()*(9999-1000+1)+1000);
    } 
     
    public static boolean checkCapcha(){
            int cap = generateCapcha();
            System.out.println(Text.Capcha+"\n ------");
            System.out.println("| "+cap+" |");
            System.out.println(" ------");
            for(int i = 0; i <= 2; i++){
            System.out.print(Text.Capcha);
            int result = Integer.parseInt(in.nextLine().trim());
            if(result == cap) return true;
            else {
                System.out.println(Text.wrongCapcha+"!!("+(2-i)+Text.moreTime+")");
            }
            }
            return false;
        }
}

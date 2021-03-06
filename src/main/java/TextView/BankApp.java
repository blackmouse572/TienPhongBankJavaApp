
package TextView;

import Models.Database.FirebaseInit;
import Models.UserManagement.UserManager;
import java.util.Scanner;


public class BankApp {
    
    public static void main(String[] args) {
        new FirebaseInit().initialize();
       
        LangMenu langMenu = new LangMenu();
        while (true) {       
            //run langMenu to choose language
            String langFlag = langMenu.run();
            
            //define value for all atribute in Text
            Text.formatText(langFlag);
            
            //Let user choose to sign up or sign in
            LoginRegisterMenu loginRegisterMenu = new LoginRegisterMenu();
            loginRegisterMenu.run();
        }
    }    
}
// ----------------------------------------------
class LangMenu extends  Menu{ //alow user to choose a language for the program
     public String run(){
         String[] menu = {"TIEN PHONG BANK","English","Vietnamese","Exit"};
         switch(excute(menu)){
            case 1:
                return "EN";
            case 2:
                return "VI";
            case 3:
                System.exit(0);
            default: return null;
        }
    }
}
//--------------------------------------------
class LoginRegisterMenu extends  Menu{ // user choose to log in or sign up
    public void run(){
        UserManager userManager = new UserManager();
        while (true) {   
            // to mark login status
            boolean logFlag = false;
            
            switch(excute(Text.menu1)){
            case 2:
                System.out.println(Text.registerTitle); //print title
                if(!userManager.signUp()) break; // if sign up success, do not break, and go to case 1 to do log in
            case 1:
                System.out.println(Text.loginTitle); //print title
                logFlag = userManager.logIn();
                break;
            case 3:
                return;
        }
            if (logFlag == true){
                FeatureMenu featureMenu = new FeatureMenu();
                featureMenu.run(userManager);
            }
        } 
    }
}
//--------------------------------------------
class FeatureMenu extends Menu{
    public void enterToTurnBack(){
        Scanner sc = new Scanner (System.in);
        System.out.println(Text.turnBack);
        sc.nextLine();
        return;
    }
    
    public void run(UserManager userManager){
        while (true) {            
            switch(excute(Text.menu2)){
            case 1:
                System.out.println(Text.AccInFoTitle); //print title
                userManager.displayInfo();
                enterToTurnBack();
                break;
            case 2:
                System.out.println(Text.depositeTiTle); //print title
                userManager.deposit();
                enterToTurnBack();
                break;
            case 3:
                System.out.println(Text.withdrawTitle); //print title
                userManager.withdraw();
                enterToTurnBack();
                break;  
            case 4:
                System.out.println(Text.transferTitle); //print title
                userManager.transferMoney();
                enterToTurnBack();
                break;  
            case 5:
                System.out.println(Text.transactionHistoryTitle); //print title
                userManager.displayTransactions();
                enterToTurnBack();
                break;
            case 6:
                System.out.println(Text.changePassTitle); //print title
                userManager.changePassword();
                enterToTurnBack();
                break;
            case 7:
                return;
            }
        }
    }      
}



package TextView;

import Models.Database.FirebaseInit;
import Models.UserManagement.UserManager;


public class Main {
    
    public static void main(String[] args) {
        new FirebaseInit().initialize();
        
        LangMenu langMenu = new LangMenu();
        while (true) {            
            String langFlag = langMenu.run();
            //define value for all atribute in Text
            Text text = new Text(langFlag);
            
            Menu1 menu1 = new Menu1();
            menu1.run(text);
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
class Menu1 extends  Menu{ // user choose to log in or sign up
    public void run(Text text){
        UserManager userManager = new UserManager(text);
        while (true) {       
            boolean logFlag = false;
            
            switch(excute(text.menu1)){
            case 2:
                System.out.println(text.regesterTitle); //print title
                if(!userManager.signUp()) break; // if sign up success, do not break, and go to case 1 to do log in
            case 1:
                System.out.println(text.loginTitle); //print title
                logFlag = userManager.logIn();
                break;
            case 3:
                return;
        }
            if (logFlag = true){
                Menu2 menu2 = new Menu2();
                menu2.run(text,userManager);
            }
        } 
    }
}
//--------------------------------------------
class Menu2 extends Menu{
    public void run(Text text, UserManager userManager){
        while (true) {            
            switch(excute(text.menu2)){
            case 1:
                System.out.println(text.AccInFoTitle); //print title
                userManager.displayInfo();
                break;
            case 2:
                System.out.println(text.depositeTiTle); //print title
                userManager.deposit();
                break;
            case 3:
                System.out.println(text.withdrawTitle); //print title
                userManager.withdraw();
                break;  
            case 4:
                System.out.println(text.transferTitle); //print title
                userManager.transferMoney();
                break;  
            case 5:
                System.out.println(text.transactionHistoryTitle); //print title
                userManager.displayTransactions();
                break;
            case 6:
                //TODO: Change password
                break;
            case 7:
                return;
            }
        }
    }      
}


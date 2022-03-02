/**
 *
 * @NguyenPhuocTung
 */
package TextView;

import Database.FirebaseInit;

public class Main {
    
    public static void main(String[] args) {
        new FirebaseInit().initialize();
        
        Menu0 menu0 = new Menu0();
        while (true) {            
            String langFlag = menu0.run();
            //define value for all atribute in Text
            Text text = new Text(langFlag);
            
            Menu1 menu1 = new Menu1();
            //if in menu1 user choose 3, menu1 return false 
            menu1.run(text);
        }
    }    
}
// ----------------------------------------------
class Menu0 extends  Menu{
     public String run(){
         String[] menu0 = {"TIEN PHONG BANK","English","Vietnamese","Exit"};
         switch(excute(menu0)){
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
class Menu1 extends  Menu{
    public void run(Text text){
        User curentUser = null;
        while (true) {            
            switch(excute(text.menu1)){
            case 1:
                //TODO: LOG IN and assign value for curent user
                break;
            case 2:
                //TODO: REGISTER
                //TODO: if register success, do log in
                break;
            case 3:
                return;
        }
            if (curentUser!=null){
                Menu2 menu2 = new Menu2();
                menu2.run(text);
                curentUser = null;
            }
        } 
    }
}
//--------------------------------------------
class Menu2 extends Menu{
    public void run(Text text){
        while (true) {            
            switch(excute(text.menu2)){
            case 1:
                //TODO: show account info
                break;
            case 2:
                //TODO: Deposit
                break;
            case 3:
                //TODO: Withdraw
                break;  
            case 4:
                //TODO: Transfers
                break;  
            case 5:
                //TODO: Show history
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


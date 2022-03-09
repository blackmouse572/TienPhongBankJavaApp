
package TextView;

import Models.Validation;
import java.util.ArrayList;

public class  Menu {
    private int userChoice;
    private ArrayList<String> menuText = new ArrayList<>();

    public Menu() { 
    }   
    
    public void display(){
        System.out.println("\n========="+menuText.get(0)+"=========");
        if(menuText!= null){
            for(int i=1; i<menuText.size();i++) {
                System.out.println((i)+". "+menuText.get(i));
            }
        }
    }
 
    public int getUserChoice(){
        System.out.println(Text.yourChoice);
        userChoice = Validation.checkInputIntLimit( 1, menuText.size());
        return userChoice; 
    }

    public int excute(String[] options){
        menuText.clear();
        for(String s:options) menuText.add(s);
        display();
        return getUserChoice();        
        }
}

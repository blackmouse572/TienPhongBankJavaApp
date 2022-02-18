/**
 *
 * @NguyenPhuocTung
 */
package TextView;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class  Menu {
    private int userChoice;
    private ArrayList<String> menuText = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

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
                userChoice = scanner.nextInt();
           

        return userChoice; 
    }

    public int excute(String[] options){
        menuText.clear();
        for(String s:options) menuText.add(s);
        display();
        return getUserChoice();        
        }
}

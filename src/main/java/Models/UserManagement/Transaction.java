package Models.UserManagement;

import TextView.Text;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Transaction implements Comparable<Transaction>{
    User sender, receiver;
    float moneyAmount ;
    String action;
    String note;
    String time;
    //Transfer Constructor
    public Transaction(){};
    public Transaction(User sender, User receiver, float moneyAmount, String action, String note) {
        this.sender = sender;
        this.receiver = receiver;
        this.moneyAmount = moneyAmount;
        this.action = action;
        this.note = note;
        this.time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }
    //Deposit, Withdraw Constructor
    public Transaction(User sender, float moneyAmount, String action) {
        this.sender = sender;
        this.moneyAmount = moneyAmount;
        this.action = action;
        this.time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    public User getReceiver(){
        return receiver;
    }
    public User getSender(){
        return sender;
    }

    public float getMoneyAmount(){
        return moneyAmount;
    }

    public String getTime(){
        return time;
    }

    public String getAction(){
        return this.action;
    }

    public String getNote(){
        return this.note;
    }

    @Override
    public String toString() {
        switch (action){
            case "Transfer money":
                return time + ":\n"
                        + Text.transferMoney + (int) moneyAmount +"\n"
                        + Text.receiverAccountID + receiver.getAccountID()+"\n"
                        + Text.note + note+"\n"
                        + Text.balance + (int)sender.getAccountBalance();
            case "Withdraw money":
                return time + ":\n"
                        + Text.withdraw + (int) moneyAmount +"\n"
                        + Text.balance + (int)sender.getAccountBalance();
            case "Add money to account":
                return time + ":\n"
                        + Text.deposit + (int) moneyAmount +"\n"
                        + Text.balance + (int)sender.getAccountBalance();
            default:
                return "Transfer Information{" +
                "action = " + action + '\'' +
                "note = " + note + '\'' +
                "sender = " + sender + '\'' +
                "receiver = " + receiver + '\'' +
                "time = " + time + '\'' +
                '}';
        }  
    }

    @Override
    public int compareTo(Transaction o) {
        Date thisDate = null;
        Date oDate = null;
        
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            
             thisDate = format.parse(this.getTime());
             oDate = format.parse(o.getTime());
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
        return thisDate.compareTo(oDate);
    }
}

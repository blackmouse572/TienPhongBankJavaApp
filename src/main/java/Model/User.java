package main.java.Model;

import java.util.Stack;

public class User {
    private String accountID;
    private String password;
    private String name;
    private float accountBalance;
    private String citizenID;
    private String phoneNumber;
    private String emailAddress;
    private String streetAddress;
    private Stack<TransactionInfo> TH;

    public User(){
        this.updateInformation();
        // TODO: Random accountID
        this.setPassword();
    }

    public User(String accountID, String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress){
        this.accountID = accountID;
        this.password = password;
        this.accountBalance = accountBalance;
        this.citizenID = citizenID;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }
    // TODO get and set

    public void updateInformation() {
        System.out.print("Input name: ");
        // TODO: Check Valid name
        System.out.print("Input Citizen ID ");
        // TODO: Check Valid Citizen ID
        System.out.print("Input phone number ");
        // TODO: Check Valid Phone number
        System.out.print("Input email");
        // TODO: Check valid Email
        System.out.print("Input Address(Optional)");
        // TODO: Set Address
    }

    public void setBalance(float balance){
        this.accountBalance = balance;
        // TODO: Have user choose to do with accountBalance
    }

    public boolean setPassword(){
        System.out.print("Input password");
        // TODO: Check valid password
        // TODO: Check if password was the same
        return true;
    }
    public String getPassword(){
        return this.password;
    }

    public void addTransactionInfo(TransactionInfo TI){
        this.TH.push(TI);
    }

    public void getTransactionHistory(){
        for (TransactionInfo e : this.TH) {
            System.out.println(e);
        }
    }

    public void display(){
        System.out.println("Account ID:" +this.accountID);
        System.out.println("Name:" +this.name);
        System.out.println("Account Balance:" +this.accountBalance);
        System.out.println("Citizen ID:" +this.citizenID);
        System.out.println("Phone Number:" +this.phoneNumber);
        System.out.println("Email:" +this.emailAddress);
        System.out.println("Street Address:" +this.streetAddress);
    }
}

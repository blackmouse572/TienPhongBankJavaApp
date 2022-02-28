package main.java.Model;

import java.util.Stack;

public class User {
    private String phoneNumber;
    private String password;
    private String name;
    private float accountBalance;
    private String citizenID;
    private String emailAddress;
    private String streetAddress;
    private Stack<Transaction> TH;

    public User(){

    }

    public User(String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress){
        this.password = password;
        this.accountBalance = accountBalance;
        this.citizenID = citizenID;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(){
        // TODO validate number
        this.phoneNumber = "";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Stack<Transaction> getTH() {
        return TH;
    }

    public void setTH(Stack<Transaction> TH) {
        this.TH = TH;
    }

    public void updateInformation() {
        System.out.print("Input phone number ");
        // TODO: Check Valid Phone number
        System.out.print("Input name: ");
        // TODO: Check Valid name
        System.out.print("Input Citizen ID ");
        // TODO: Check Valid Citizen ID
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

    public void addTransactionInfo(Transaction TI){
        this.TH.push(TI);
    }


    public void getTransactionHistory(){
        for (Transaction e : this.TH) {
            System.out.println(e);
        }
    }

    public void display(){
        System.out.println("Phone Number:" +this.phoneNumber);
        System.out.println("Name:" +this.name);
        System.out.println("Account Balance:" +this.accountBalance);
        System.out.println("Citizen ID:" +this.citizenID);
        System.out.println("Email:" +this.emailAddress);
        System.out.println("Street Address:" +this.streetAddress);
    }
}

package main.java.Models.UserManagement;

import Models.Validation;
import TextView.Text;


public class User {
    private String accountID;
    private String password;
    private String name;
    private String phoneNumber;
    private float accountBalance;
    private String citizenID;
    private String emailAddress;
    private String streetAddress;
    
    private Text text;

    public User(Text text){
        this.text =text;
    }

    public void setText(Text text) {
        this.text = text;
    }
    
    public User(String accountID ,String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress){
        this.accountID = accountID;
        this.password = password;
        this.accountBalance = accountBalance;
        this.citizenID = citizenID;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountID(){
        return this.accountID;
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

    public void updateInformation() {
        System.out.print(text.phoneNumber);
        phoneNumber = Validation.checkInputPhone(text);
        System.out.print(text.userName);
        name = Validation.checkInputName(text);
        System.out.print(text.citizenID);
        citizenID = Validation.checkInputID(text);
        System.out.print(text.email);
        emailAddress = Validation.checkInputEmail(text);
        System.out.print(text.address);
        streetAddress = Validation.checkInputString(text);
    }

    public void setBalance(float balance){
        this.accountBalance = balance;
        // TODO: Have user choose to do with accountBalance
    }

    public boolean setPassword(){
        System.out.print(text.passWord);
        String newPassword = Validation.checkInputPassword(text);
        if(Validation.checkSamePassword(this.password,newPassword))
        return true;
        else return false;
    }
    public String getPassword(){
        return this.password;
    }


    public void display(){
        System.out.println(text.accountID + this.accountID);
        System.out.println(text.phoneNumber +this.phoneNumber);
        System.out.println(text.userName +this.name);
        System.out.println(text.accountBalance +this.accountBalance);
        System.out.println(text.citizenID +this.citizenID);
        System.out.println(text.email +this.emailAddress);
        System.out.println(text.address +this.streetAddress);
    }
}

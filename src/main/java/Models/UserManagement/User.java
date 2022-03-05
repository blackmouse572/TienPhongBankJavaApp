package Models.UserManagement;

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

    public User(String accountID, String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress) {
        this.accountID = accountID;
        this.password = password;
        this.accountBalance = accountBalance;
        this.citizenID = citizenID;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }

    public User() {
    }

    ;

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountID() {
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

    public void setPhoneNumber() {
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
        System.out.print(Text.phoneNumber);
        phoneNumber = Validation.checkInputPhone();
        System.out.print(Text.userName);
        name = Validation.checkInputName();
        System.out.print(Text.citizenID);
        citizenID = Validation.checkInputCitizenID();
        System.out.print(Text.email);
        emailAddress = Validation.checkInputEmail();
        System.out.print(Text.address);
        streetAddress = Validation.checkInputString();
    }

    public void setBalance(float balance) {
        this.accountBalance = balance;
        // TODO: Have user choose to do with accountBalance
    }

    public boolean setPassword() {
        System.out.print(Text.passWord);
        String newPassword = Validation.checkInputPassword();
        if (this.password != null) {
            if (Validation.checkSamePassword(this.password, newPassword)) ;
            return true;
        }
        this.password = newPassword;
        return false;
    }

    public String getPassword() {
        return this.password;
    }


    public void display() {
        System.out.println(Text.accountID + this.accountID);
        System.out.println(Text.phoneNumber + this.phoneNumber);
        System.out.println(Text.userName + this.name);
        System.out.println(Text.accountBalance + this.getAccountBalance());
        System.out.println(Text.citizenID + this.citizenID);
        System.out.println(Text.email + this.emailAddress);
        System.out.println(Text.address + this.streetAddress);
    }
}

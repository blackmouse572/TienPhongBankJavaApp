package Models.UserManagement;

/**
 *
 * This Class get hold of User Basic Information:
 * accountID (Id tai khoan)
 * password (Mat khau)
 * name (Ten nguoi dung)
 * phoneNumber (So dien thaoi)
 * accountBalance (So du tai khoan)
 * citizenID (CMND, CCCD)
 * email
 * streetAddress (Dia chi thuong tru)
 *
 * @author lil_ink
 */

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

    /*Getters and setters provide for API*/

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
        this.phoneNumber = Validation.checkInputPhone();
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

    public void setBalance(float balance) {
        this.accountBalance = balance;
    }
    
    /**
     * This method is used for used create a password when sign up
     * */
    public void setPassword() {
        System.out.print(Text.passWord);
        this.password = Validation.checkInputPassword();
    }

    public String getPassword() {
        return this.password;
    }

    /**
     * This method update User's basic information:
     * phoneNumber
     * name
     * citizenID
     * email
     * streetAddress
     * */
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

    /**
     * Display User's basic information
     * */
    public void display() {
        System.out.println(Text.accountID + this.accountID);
        System.out.println(Text.phoneNumber + this.phoneNumber);
        System.out.println(Text.userName + this.name);
        System.out.println(Text.accountBalance + (int)getAccountBalance());
        System.out.println(Text.citizenID + this.citizenID);
        System.out.println(Text.email + this.emailAddress);
        System.out.println(Text.address + this.streetAddress);
    }
}

package Model;

public class User {
    private String accountID;
    private String password;
    private String name;
    private float accountBalance;
    private String citizenID;
    private String phoneNumber;
    private String emailAddress;
    private String streetAddress;

    public User(){
        this.updateInformation();
        this.setPassword();
    }

    public User(String accountID, String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress){
        this.accountID = accountID;
        this.name = name;
        this.password = password;
        this.accountBalance = accountBalance;
        this.citizenID = citizenID;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
    }
    // TODO get and set


    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
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

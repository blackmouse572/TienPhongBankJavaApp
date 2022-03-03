
package TextView;


public class Text {
    
    //defaut languae : English
    public String [] menu1 = {"TIEN PHONG BANK","Log in","Regester","Turn back (Quay lai)"},
           menu2 = {"TIEN PHONG BANK","Account information","Deposit","Withdraw","Transfers","Transaction history","Change password","Log out"}; 
    
    public String loginTitle = "---------LOG IN---------",
                    regesterTitle="-----------REGESTER-----------",
                    AccInFoTitle="-------ACCOUNT INFORMATON-------",
                    depositeTiTle = "----------DEPOSITE---------",
                    withdrawTitle = "----------WITHDRAW---------",
                    transferTitle = "------------TRANSFER---------",
                    transactionHistoryTitle= "-----------TRANSACTION HISTORY---------",
                    turnBack = "(Enter == to turn back)",
                    phoneNumber = "Phone number: ",
                    email = "Email: ",
                    passWord = "Password: ",
                    CapchaText = "Captcha: ",
                    getCapchaText = "Enter captcha: ",
                    loginSuccessText = "Log in success!",
                    userName="Owner's name: ",
                    citizenID="Citizen ID: ",
                    address= "Adress: ",
                    accountID="Account ID: ",
                    accountBalance="Account Balance: ",
                    notEmpty = "Not empty",
                    enterAgain = "Enter again: ",
                    anphabetOnly = "Alphabet only",
                    numberOnly10 = "Number only(10 digits)",
                    wrongFomat="Wrong format!!!",
                    numberOnly12="Number only(12 digits, start with 0)",
                    anphabetAndNumberOnly = "Alphabet and number only",
                    numberInRange = "Please input number in rage ",
                    notEnoughMoney = "Money in account is not enough",
                    lowAmountMoney ="The Amount of Money is too low. Must be greater than 10,000",
                    yourChoice="Your Choice: ";

    public Text(String lang) {
        if (lang == "VI"){
            String[] viMenu1= {"TIEN PHONG BANK","Dang Nhap","Dang ky","Quay lai (Turn back)"};
            menu1 = viMenu1;
            String[] viMenu2= {"TIEN PHONG BANK","Thong tin tk","Nap tien","Rut tien","Chuyen tien","Lich su giao dich","Doi mat khau","Dang xuat"};
            menu2 = viMenu2;
            this.loginTitle = "----------DANG NHAP---------";
            this.regesterTitle="-----------DANG KY-----------";
            this.AccInFoTitle="-------THONG TIN TAI KHOAN-------";
            this.depositeTiTle = "-----------NAP TIEN----------";
            this.withdrawTitle = "----------RUT TIEN----------";
            this.transferTitle = "-----------CHUYEN TIEN---------";
            this.transactionHistoryTitle = "---------LICH SU GIAO DICH-----------";
            this.turnBack = "(Nhap == de quay lai)";
            this.phoneNumber = "So dien thoai: ";
            this.passWord = "Mat khau: ";
            this.CapchaText = "Captcha: ";
            this.getCapchaText = "Nhap lai captcha: ";
            this.loginSuccessText = "Dang nhap thanh cong!";
            this.userName="Chu tai khoan: ";
            this.citizenID="So CCCD/CMND: ";
            this.address= "Dia Chi: ";
            this.accountID="So tai khoan: ";
            this.accountBalance="So du tai khoan: ";
            this.notEmpty = "Khong duoc bo trong";
            this.enterAgain = "Nhap lai: ";
            this.anphabetOnly="Chi nhap chu cai";
            this.numberOnly10 = "Chi nhap so(10 chu so)";
            this.wrongFomat = "Sai dinh dang!!!";
            this.numberOnly12="Chi nhap so(12 chu so, bat dau bang 0)";
            this.anphabetAndNumberOnly = "Chi nhap chu cai va so";
            this.numberInRange = "Nhap so trong khoang ";
            this.notEnoughMoney = "Khong du tien trong  tai khoan";
            this.lowAmountMoney = "So tien qua nho, phai lon hon 10000";
            this.yourChoice = "Lua chon cua ban: ";
        }
    }  

    public Text() {
    }
}

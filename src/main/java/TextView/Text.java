/**
 *
 * @NguyenPhuocTung
 */
package TextView;


public class Text {
    public String loginTitle,turnBack,loginSuccessText,phoneNumber, passWord, CapchaText, getCapchaText,
            regesterTitle,userName, citizenID, email = "Email: " , address,accountBalance, passConfirmText, regesterSuccessText,
            accountID,AccInFoTitle;
    //validation:
    public String notEmpty,enterAgain,anphabetOnly,numberOnly10,wrongFomat,numberOnly12,anphabetAndNumberOnly,numberInRange;
    public String [] menu1,menu2  ; 

    public Text(String lang) {
        switch(lang){
            case "VI":
                String[] viMenu1= {"TIEN PHONG BANK","Dang Nhap","Dang ky","Quay lai (Turn back)"};
                menu1 = viMenu1;
                String[] viMenu2= {"TIEN PHONG BANK","Thong tin tk","Nap tien","Rut tien","Chuyen tien","Lich su giao dich","Doi mat khau","Dang xuat"};
                menu2 = viMenu2;
                this.loginTitle = "----------DANG NHAP---------";
                this.turnBack = "(Nhap == de quay lai)";
                this.phoneNumber = "So dien thoai: ";
                this.passWord = "Mat khau: ";
                this.CapchaText = "Captcha: ";
                this.getCapchaText = "Nhap lai captcha: ";
                this.loginSuccessText = "Dang nhap thanh cong!";
                this.regesterTitle="-----------DANG KY-----------";
                this.userName="Chu tai khoan: ";
                this.citizenID="So CCCD/CMND: ";
                this.address= "Dia Chi: ";
                this.accountID="So tai khoan: ";
                this.accountBalance="So du tai khoan: ";
                this.AccInFoTitle="-------THONG TIN TAI KHOAN-------";
                this.notEmpty = "Khong duoc bo trong";
                this.enterAgain = "Nhap lai: ";
                this.anphabetOnly="Chi nhap chu cai";
                this.numberOnly10 = "Chi nhap so(10 chu so)";
                this.wrongFomat = "Sai dinh dang!!!";
                this.numberOnly12="Chi nhap so(12 chu so, bat dau bang 0)";
                this.anphabetAndNumberOnly = "Chi nhap chu cai va so";
                this.numberInRange = "Nhap so trong khoang ";
                
                break;
            case "EN":
                String[] enMenu1 = {"TIEN PHONG BANK","Log in","Regester","Turn back (Quay lai)"};
                this.menu1 = enMenu1;
                String[] enMenu2= {"TIEN PHONG BANK","Account information","Deposit","Withdraw","Transfers","Transaction history","Change password","Log out"};
                menu2 = enMenu2;
                this.loginTitle = "---------LOG IN---------";
                this.turnBack = "(Enter == to turn back)";
                this.phoneNumber = "Phone number: ";
                this.passWord = "Password: ";
                this.CapchaText = "Captcha: ";
                this.getCapchaText = "Enter captcha: ";
                this.loginSuccessText = "Log in success!";
                this.regesterTitle="-----------REGESTER-----------";
                this.userName="Owner's name: ";
                this.citizenID="Citizen ID: ";
                this.address= "Adress: ";
                this.accountID="Account ID: ";
                this.accountBalance="Account Balance: ";
                this.AccInFoTitle="-------ACCOUNT INFORMATON-------";
                this.notEmpty = "Not empty";
                this.enterAgain = "Enter again: ";
                this.anphabetOnly = "Alphabet only";
                this.numberOnly10 = "Number only(10 digits)";
                this.wrongFomat="Wrong format!!!";
                this.numberOnly12="Number only(12 digits, start with 0)";
                this.anphabetAndNumberOnly = "Alphabet and number only";
                this.numberInRange = "Please input number in rage ";
                break;            
        }
    }  
}

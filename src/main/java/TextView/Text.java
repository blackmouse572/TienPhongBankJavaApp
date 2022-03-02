/**
 *
 * @NguyenPhuocTung
 */
package TextView;


public class Text {
    public String loginTitle,turnBackText,loginSuccessText,getPhoneText, getPassText, CapchaText, getCapchaText,
            regesterTitle,userNameText, idNumText, emailText = "Email: " , addressText, passConfirmText, regesterSuccessText,
            accNumText,AccInFoTitle;
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
                this.turnBackText = "(Nhap == de quay lai)";
                this.getPhoneText = "So dien thoai: ";
                this.getPassText = "Mat khau: ";
                this.CapchaText = "Captcha: ";
                this.getCapchaText = "Nhap lai captcha: ";
                this.loginSuccessText = "Dang nhap thanh cong!";
                this.regesterTitle="-----------DANG KY-----------";
                this.userNameText="Chu tai khoan: ";
                this.idNumText="So CCCD/CMND: ";
                this.addressText= "Dia Chi: ";
                this.accNumText="So tai khoan: ";
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
                this.turnBackText = "(Enter == to turn back)";
                this.getPhoneText = "Phone number: ";
                this.getPassText = "Password: ";
                this.CapchaText = "Captcha: ";
                this.getCapchaText = "Enter captcha: ";
                this.loginSuccessText = "Log in success!";
                this.regesterTitle="-----------REGESTER-----------";
                this.userNameText="Owner's name: ";
                this.idNumText="ID number: ";
                this.addressText= "Adress: ";
                this.accNumText="Acount number: ";
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

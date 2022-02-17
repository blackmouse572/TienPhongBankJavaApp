/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextView;

/**
 *
 * @author Admin
 */
public class Text {
    String loginTitle,turnBackText,loginSuccessText,getPhoneText, getPassText, CapchaText, getCapchaText,
            regesterTitle,userNameText, idNumText, emailText = "Email: " , addressText, passConfirmText, regesterSuccessText,
            accNumText;
    String [] menu1,menu2  ; 

    public Text(String lang) {
        switch(lang){
            case "VI":
                String[] viMenu1= {"TIEN PHONG BANK","Dang Nhap","Dang ky","Quay lai (Turn back)"};
                menu1 = viMenu1;
                String[] viMenu2= {"TIEN PHONG BANK","Thong tin tk","Nap tien","Rut tien","Lich su giao dich","Doi mat khau","Dang xuat"};
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
                
                
                
                
                break;
            case "EN":
                String[] enMenu1 = {"TIEN PHONG BANK","Log in","Regester","Turn back (Quay lai)"};
                this.menu1 = enMenu1;
                String[] enMenu2= {"TIEN PHONG BANK","Account information","Deposit","Withdraw","Transaction history","Change password","Log out"};
                menu2 = enMenu2;
                this.loginTitle = "---------LOG IN---------";
                this.turnBackText = "(Enter == to turn back)";
                this.getPhoneText = "Phone number: ";
                this.getPassText = "Password: ";
                this.CapchaText = "Captcha: ";
                this.getCapchaText = "Enter captcha: ";
                this.loginSuccessText = "Log in success!";
                break;            
        }
    }

    
    
    
    
}



    




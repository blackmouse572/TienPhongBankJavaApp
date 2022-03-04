
package TextView;

// Text class is use to suport mutiple language in the program
public class Text { 
    
    //defaut languae : English
    public static String [] menu1 = {"TIEN PHONG BANK","Log in","Register","Turn back (Quay lai)"},
           menu2 = {"TIEN PHONG BANK","Account information","Deposit","Withdraw","Transfers","Transaction history","Change password","Log out"}; 
    
    public static String loginTitle,
                    regesterTitle,
                    AccInFoTitle,
                    depositeTiTle,
                    withdrawTitle,
                    transferTitle,
                    transactionHistoryTitle,
                    turnBack,
                    phoneNumber,
                    email = "Email: ",
                    passWord ,
                    CapchaText ,
                    getCapchaText,
                    signInSuccess,
                    userName,
                    citizenID,
                    address,
                    accountID,
                    accountBalance,
                    notEmpty ,
                    enterAgain,
                    anphabetOnly ,
                    numberOnly10 ,
                    wrongFomat,
                    numberOnly12,
                    anphabetAndNumberOnly ,
                    numberInRange,
                    notEnoughMoney,
                    lowAmountMoney,
                    yourChoice="Your Choice: ",
                    negativeBalance,
                    accountIDExisted,
                    signUpSuccess,
                    signInFail,
                    userNotExist,
                    updateInfoSuccess,
                    updatePassSuccess,
                    updatePassFail,
                    updateBalanceSuccess;

    public static void formatText(String lang) {
        switch (lang){
            case "VI":
                String[] viMenu1= {"TIEN PHONG BANK","Dang Nhap","Dang ky","Quay lai (Turn back)"};
                menu1 = viMenu1;
                String[] viMenu2= {"TIEN PHONG BANK","Thong tin tk","Nap tien","Rut tien","Chuyen tien","Lich su giao dich","Doi mat khau","Dang xuat"};
                menu2 = viMenu2;
                loginTitle = "----------DANG NHAP---------";
                regesterTitle="-----------DANG KY-----------";
                AccInFoTitle="-------THONG TIN TAI KHOAN-------";
                depositeTiTle = "-----------NAP TIEN----------";
                withdrawTitle = "----------RUT TIEN----------";
                transferTitle = "-----------CHUYEN TIEN---------";
                transactionHistoryTitle = "---------LICH SU GIAO DICH-----------";
                turnBack = "(Nhap == de quay lai)";
                phoneNumber = "So dien thoai: ";
                passWord = "Mat khau: ";
                CapchaText = "Captcha: ";
                getCapchaText = "Nhap lai captcha: ";
                signInSuccess = "Dang nhap thanh cong!";
                signInFail = "Dang nhap that bai";
                signUpSuccess = "Dang ky thanh cong";
                userName="Chu tai khoan: ";
                citizenID="So CCCD/CMND: ";
                address= "Dia Chi: ";
                accountID="So tai khoan: ";
                accountBalance="So du tai khoan: ";
                notEmpty = "Khong duoc bo trong";
                enterAgain = "Nhap lai: ";
                anphabetOnly="Chi nhap chu cai";
                numberOnly10 = "Chi nhap so(10 chu so)";
                wrongFomat = "Sai dinh dang!!!";
                numberOnly12="Chi nhap so(12 chu so, bat dau bang 0)";
                anphabetAndNumberOnly = "Chi nhap chu cai va so";
                numberInRange = "Nhap so trong khoang ";
                notEnoughMoney = "Khong du tien trong  tai khoan";
                lowAmountMoney = "So tien qua nho, phai lon hon 10000";
                yourChoice = "Lua chon cua ban: ";
                negativeBalance = "So du khong khong duoc am";
                accountIDExisted= "So tai khoan da ton tai";
                userNotExist = "Nguoi dung khong ton tai";
                updateInfoSuccess = "Cap nhat thong tin thanh cong";
                updatePassSuccess = "Cap nhat mat khau thanh cong";
                updatePassFail = "Cap nhat mat khau that bai";
                updateBalanceSuccess = "Cap nhat so du tai khoan thanh cong";
                break;
                
            case "EN":
                String[] enMenu1= {"TIEN PHONG BANK","Log in","Regester","Turn back (Quay lai)"};
                menu1 = enMenu1;
                String[] enMenu2 = {"TIEN PHONG BANK","Account information","Deposit","Withdraw","Transfers","Transaction history","Change password","Log out"};
                menu2 = enMenu2;
                loginTitle = "---------LOG IN---------";
                regesterTitle="-----------REGESTER-----------";
                AccInFoTitle="-------ACCOUNT INFORMATON-------";
                depositeTiTle = "----------DEPOSITE---------";
                withdrawTitle = "----------WITHDRAW---------";
                transferTitle = "------------TRANSFER---------";
                transactionHistoryTitle= "-----------TRANSACTION HISTORY---------";
                turnBack = "(Enter == to turn back)";
                phoneNumber = "Phone number: ";
                email = "Email: ";
                passWord = "Password: ";
                CapchaText = "Captcha: ";
                getCapchaText = "Enter captcha: ";
                signInSuccess = "Sign in successful";
                signInFail = "Sign in failed";
                signUpSuccess = "Sign up successful";
                userName="Owner's name: ";
                citizenID="Citizen ID: ";
                address= "Adress: ";
                accountID="Account ID: ";
                accountBalance="Account Balance: ";
                notEmpty = "Not empty";
                enterAgain = "Enter again: ";
                anphabetOnly = "Alphabet only";
                numberOnly10 = "Number only(10 digits)";
                wrongFomat="Wrong format!!!";
                numberOnly12="Number only(12 digits, start with 0)";
                anphabetAndNumberOnly = "Alphabet and number only";
                numberInRange = "Please input number in rage ";
                notEnoughMoney = "Money in account is not enough";
                lowAmountMoney ="The Amount of Money is too low. Must be greater than 10,000";
                yourChoice="Your Choice: ";
                negativeBalance ="Balance must not be negative";
                accountIDExisted ="Account ID already exists";
                userNotExist = "User does not exist";
                updateInfoSuccess = "Update user's information successful";
                updatePassSuccess = "Update password successful";
                updatePassFail = "Update password failed";
                updateBalanceSuccess = "Update user account balance successful";
                break;
        }
    }
}

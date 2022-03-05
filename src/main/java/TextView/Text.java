
package TextView;

// Text class is use to suport mutiple language in the program
public class Text { 
    
    //defaut languae : English
    public static String [] menu1 = {"TIEN PHONG BANK","Log in","Register","Turn back (Quay lai)"},
           menu2 = {"TIEN PHONG BANK","Account information","Deposit","Withdraw","Transfers","Transaction history","Change password","Log out"}; 
    
    public static String loginTitle,
                    registerTitle,
                    AccInFoTitle,
                    depositeTiTle,
                    withdrawTitle,
                    transferTitle,
                    transactionHistoryTitle,
                    changePassTitle,
                    turnBack,
                    phoneNumber,
                    email = "Email: ",
                    passWord ,
                    Capcha ,
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
                    wrongEmailFomat,
                    numberOnly12,
                    numberOnly,
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
                    updateBalanceSuccess,
                    amountOfMoney,
                    amountOfMoney30000,
                    balance,
                    withdrawSuccess,
                    oldpass,
                    newpass,
                    confirmpass,
                    confirmpassWrong,
                    wrongpass,
                    registerWait,
                    signInWait,
                    changePassWait,
                    transferMoney,
                    receiverAccountID,
                    withdraw,
                    deposit,
                    wrongCapcha,
                    moreTime,
                    capchaFail,
                    note;

    public static void formatText(String lang) {
        switch (lang){
            case "VI":
                String[] viMenu1= {"TIEN PHONG BANK","Dang Nhap","Dang ky","Quay lai (Turn back)"};
                menu1 = viMenu1;
                String[] viMenu2= {"TIEN PHONG BANK","Thong tin tk","Nap tien","Rut tien","Chuyen tien","Lich su giao dich","Doi mat khau","Dang xuat"};
                menu2 = viMenu2;
                loginTitle = "----------DANG NHAP---------";
                registerTitle="-----------DANG KY-----------";
                AccInFoTitle="-------THONG TIN TAI KHOAN-------";
                depositeTiTle = "-----------NAP TIEN----------";
                withdrawTitle = "----------RUT TIEN----------";
                transferTitle = "-----------CHUYEN TIEN---------";
                changePassTitle = "-------------DOI MAT KHAU----------";
                transactionHistoryTitle = "---------LICH SU GIAO DICH-----------";
                turnBack = "(Nhan Enter de quay lai)";
                phoneNumber = "So dien thoai : ";
                passWord = "Mat khau: ";
                Capcha = "Captcha: ";
                getCapchaText = "Nhap lai captcha: ";
                signInSuccess = "Dang nhap thanh cong!";
                signInFail = "Dang nhap that bai";
                signUpSuccess = "Dang ky thanh cong";
                userName="Ho va Ten: ";
                citizenID="So CCCD/CMND: ";
                address= "Dia Chi: ";
                accountID="So tai khoan: ";
                accountBalance="So du tai khoan: ";
                notEmpty = "Khong duoc bo trong";
                enterAgain = "Nhap lai: ";
                anphabetOnly="Chi nhap chu cai";
                numberOnly10 = "Phai bao gom 10 chu so, bat dau bang (03)/(05)/(07)/(08)/(09)\nVD: 0322981303";
                wrongEmailFomat = "Sai dinh dang!!! (VD: username@gmail.com)";
                numberOnly12="Chi nhap so(12 chu so, bat dau bang 0)";
                numberOnly = "Chi nhap so";
                anphabetAndNumberOnly = "(7-20) ky tu gom chu va so";
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
                amountOfMoney = "So tien: ";
                note ="Ghi chu: ";
                amountOfMoney30000 ="So tien phai lon hon hoac bang 30000";
                balance = "So du: ";
                withdrawSuccess = "Rut tien thanh cong";
                oldpass = "Mat khau cu: ";
                newpass = "Mat khau moi: ";
                confirmpass ="Xac nhan mat khau: ";
                confirmpassWrong = "Mat khau xac nhan khong dung voi mat khau moi";
                wrongpass = "Sai mat khau";
                registerWait ="Dang dang ky tai khoan... (xin cho)";
                signInWait = "Dang dang nhap... (xin cho)";
                changePassWait ="Dang thay doi mat khau... (xin cho)";
                transferMoney = "Chuyen tien: ";
                receiverAccountID = "So tai khoan nguoi nhan: ";
                withdraw ="Rut tien: ";
                deposit = "Nap tien: ";
                wrongCapcha = "Capcha sai";
                moreTime = "Lan nhap nua";
                capchaFail = "Nhap Capcha that bai";
                
                break;
                
            case "EN":
                String[] enMenu1= {"TIEN PHONG BANK","Log in","Regester","Turn back (Quay lai)"};
                menu1 = enMenu1;
                String[] enMenu2 = {"TIEN PHONG BANK","Account information","Deposit","Withdraw","Transfers","Transaction history","Change password","Log out"};
                menu2 = enMenu2;
                loginTitle = "---------LOG IN---------";
                registerTitle="-----------REGISTER-----------";
                AccInFoTitle="-------ACCOUNT INFORMATON-------";
                depositeTiTle = "----------DEPOSITE---------";
                withdrawTitle = "----------WITHDRAW---------";
                transferTitle = "------------TRANSFER---------";
                transactionHistoryTitle= "-----------TRANSACTION HISTORY---------";
                changePassTitle = "--------------CHANGE PASSWORD-------------";
                turnBack = "(Press Enter to turn back)";
                phoneNumber = "Phone number: ";
                email = "Email: ";
                passWord = "Password: ";
                Capcha = "Captcha: ";
                getCapchaText = "Enter captcha: ";
                signInSuccess = "Sign in successful";
                signInFail = "Password or Account ID is wrong";
                signUpSuccess = "Sign up successful";
                userName="User's full name: ";
                citizenID="Citizen ID: ";
                address= "Adress: ";
                accountID="Account ID: ";
                accountBalance="Account Balance: ";
                notEmpty = "Not empty";
                enterAgain = "Enter again: ";
                anphabetOnly = "Alphabet only";
                numberOnly10 = "Include 10 digit, start with (03)/(05)/(07)/(08)/(09)\nEX: 0322981303";
                wrongEmailFomat="Wrong format!!! (EX: username@gmail.com)";
                numberOnly12="Number only(12 digits, start with 0)";
                numberOnly = "Only input number";
                anphabetAndNumberOnly = "(7-20) character include alphabet and number only";
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
                amountOfMoney = "Amount of money: ";
                note = "Note: ";
                amountOfMoney30000 ="Amount of money must be greater or equal to 30000";
                balance ="Balance: ";
                withdrawSuccess = "Withdraw successful";
                oldpass ="Old Password: ";
                newpass ="New Password: ";
                confirmpass = "Confirm password: ";
                confirmpassWrong = "Confirm password is not the same with new password";
                wrongpass = "Wrong password";
                registerWait = "Registering..... (Please wait!) ";
                signInWait = "Signing In...(Please wait)";
                changePassWait = "Changing password... (Please wait)";
                transferMoney = "Transfer money: ";
                receiverAccountID = "Receiver's account ID: ";
                withdraw = "Withdraw: ";
                deposit ="Deposit: ";
                wrongCapcha = "Wrong Capcha";
                moreTime = "More time";
                capchaFail = "Failed to confirm Capcha";
                break;
        }
    }
}

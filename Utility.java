import java.io.BufferedReader
import java.io.FileReader
import java.util.ArrayList

public class Utility {
    public ArrayList<Account> readFile(String fileName) {
        ArrayList<Account> accounts = new ArrayList<>();
        try{
            FileReader fR = new FileReader(fileName);
            BufferedReader bR = new BufferedReader(fR);
            String line;
               String() currentAcc = line.split("<>");
               String accNum = currentAcc[0];
               String accHolder = currentAcc[1];
               String openDate = currentAcc[2];
               double balance = Double.parseDouble(currentAcc[3]);
               Account acc = new Account(accNum,accHolder,openDate,balance);
               Accs.add(acc);
        }
    }
    catch (Exception e) {
        System.out.println(smth);
    }
}


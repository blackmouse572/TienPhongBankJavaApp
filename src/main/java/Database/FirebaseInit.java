package Database;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

public class FirebaseInit {
    @PostConstruct
    public void initialize(){
        try{

            FileInputStream serviceAccount = new FileInputStream("src/main/java/Database/PrivateService.json");
            
            FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .build();
            
            FirebaseApp.initializeApp(options);
            System.out.println("=================****================\n");
            System.out.println("Connecting to Firebase successfully.!\n");
            System.out.println("=================****================");

        }catch(Exception e){
            System.err.println("Error initializing firebase");
            System.err.print(e);
        }
    }
    public static void main(String[] args) {
        new FirebaseInit().initialize();

    }
}

package Models.Database;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

public class FirebaseInit {
    @PostConstruct
    public static void initialize(){
        try{
            System.out.println("Connect to Server");
            FileInputStream serviceAccount =
                    new FileInputStream("src/main/java/Models/Database/serviceAccountKey.json");
            
            FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .build();
            
            FirebaseApp.initializeApp(options);
            System.out.println("=================****================\n");
            System.out.println("              CONNECTED!             \n");
            System.out.println("=================****================");

        }catch(Exception e){
            System.err.println("Error initializing Firebase");
            System.err.print(e);
        }
    }
}

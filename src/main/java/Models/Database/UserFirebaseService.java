package Models.Database;

import Models.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;

public class FirebaseService {
    private static final Firestore db = FirestoreClient.getFirestore();
    private static CollectionReference account;

    public static boolean signUp(String accountID, String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress) {
        User user = new User(accountID, password, name, accountBalance, citizenID, phoneNumber, emailAddress, streetAddress);
        try {
            //TO DO: Validation information

            //check if user already exists
            if(checkIfAccountIDExists(accountID)) {
                throw new IllegalStateException("Account ID already exists");
            }
            //2. check if password is valid
            //3. check if citizenID is valid
            //4. check if phoneNumber is valid
            //5. check if emailAddress is valid

            //Push new user info to database
            ApiFuture<DocumentReference> future = db.collection("Account").add(user);
            System.out.println("Added user with ID: " + future.get().getId());
            //If id is not null, sign up successful
            if (future.get().getId() != null) {
                System.out.println("Sign up successful");
                return true;
            } else {
                throw new IllegalStateException("Sign up failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static boolean checkIfAccountIDExists(String accountID) {
        try {
            User user = retrieveUser(accountID);
            if (user.getAccountID() != null) {
                System.out.println("Account ID exists");
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    /*
    NOTICE: This method will be used to retrieve user info from database
    It can't know if the user exists or not, so it will return null if the user doesn't exist
    */
    public static User retrieveUser(String accountID) {
        try {
            CollectionReference account = db.collection("Account");
                Query query = account.whereEqualTo("accountID", accountID);
                ApiFuture<QuerySnapshot> future = query.get();
                User user = future.get().getDocuments().get(0).toObject(User.class);
                            return user;

        } catch (Exception e) {
            System.out.println("Retrieve user failed");
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static boolean signIn(String accountID, String password) {
        try {
            User user = retrieveUser(accountID);
            if (user.getPassword().equals(password)) {
                System.out.println("Sign in successful");
                return true;
            } else {
                throw new IllegalStateException("Sign in failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public static boolean UpdateUserBalance(String accountID, float newBalance) {

    }
}
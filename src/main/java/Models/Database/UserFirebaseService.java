package Models.Database;

import Models.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.jetbrains.annotations.Nullable;

public class UserFirebaseService {
    private static final Firestore db = FirestoreClient.getFirestore();
    private static CollectionReference account;

    public static boolean signUp(String accountID, String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress) {
        User user = new User(accountID, password, name, accountBalance, citizenID, phoneNumber, emailAddress, streetAddress);
        try {
            //TODO: Validation sign up information

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
            future.get().getId();
            System.out.println("Sign up successful");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
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
    public static @Nullable User retrieveUser(String accountID) {
        try {
            account = db.collection("Account");
                Query query = account.whereEqualTo("accountID", accountID);
                ApiFuture<QuerySnapshot> future = query.get();
            return future.get().getDocuments().get(0).toObject(User.class);

        } catch (Exception e) {
            System.out.println("Retrieve user failed");
            System.out.println(e.getMessage());
        }
        return null;
    }

    //Update User Info
    public static boolean updateUserInfo(String accountID, String password, String name, float accountBalance, String citizenID, String phoneNumber, String emailAddress, String streetAddress) {
        try {
            User user = retrieveUser(accountID);
            if (user != null) {
                user.setPassword(password);
                user.setName(name);
                user.setAccountBalance(accountBalance);
                user.setCitizenID(citizenID);
                user.setPhoneNumber(phoneNumber);
                user.setEmailAddress(emailAddress);
                user.setStreetAddress(streetAddress);
                account.document(accountID).set(user);
                System.out.println("Update user info successful");
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    //Update User Password
    public static boolean updateUserPassword(String accountID, String oldPassword, String newPassword) {
        try {
            User user = retrieveUser(accountID);
            if (user != null) {
                if (user.getPassword().equals(oldPassword)) {
                    user.setPassword(newPassword);
                    account.document(accountID).set(user);
                    System.out.println("Update user password successful");
                    return true;
                } else {
                    throw new IllegalStateException("Update user password failed");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    //Update User Account Balance
    public static boolean updateUserAccountBalance(String accountID, float accountBalance) {
        try {
            User user = retrieveUser(accountID);
            if (user != null) {
                user.setAccountBalance(accountBalance);
                account.document(accountID).set(user);
                System.out.println("Update user account balance successful");
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    //Update User Citizen ID
    public static boolean updateUserCitizenID(String accountID, String citizenID) {
        try {
            User user = retrieveUser(accountID);
            if (user != null) {
                user.setCitizenID(citizenID);
                account.document(accountID).set(user);
                System.out.println("Update user citizen ID successful");
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static boolean updateUserBalance(String accountID, float newBalance) {
        try {
            User user = retrieveUser(accountID);

            System.out.println("===== Update balance successful =====");
            System.out.println("Old balance: " + user.getAccountBalance());

            //Set new balance to user
            user.setAccountBalance(newBalance);
            //Update new balance to database
            ApiFuture<WriteResult> future = db.collection("Account").document(accountID).set(user);

            System.out.println("New balance: " + newBalance);
            System.out.println("At: " + future.get().getUpdateTime());
            System.out.println("=======================================");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public static boolean changeUserPassword(String accountID, String oldPassword, String newPassword) {
        try {
            //TODO: Validation newPassword
            User user = retrieveUser(accountID);
            //Check if old password is correct
            if (user.getPassword().equals(oldPassword)) {
                //Set new password
                user.setPassword(newPassword);
                //Update new user to database
                ApiFuture<WriteResult> future = db.collection("Account").document(accountID).set(user);
                System.out.println("Change password successful");
                return true;
            } else {
                throw new IllegalStateException("Change password failed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
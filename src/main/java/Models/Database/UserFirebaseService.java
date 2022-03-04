package Models.Database;


import Models.UserManagement.User;
import TextView.Text;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.ExecutionException;

public class UserFirebaseService {
    private static final Firestore db = FirestoreClient.getFirestore();
    private static CollectionReference account;

    /***
     * Create a new user. <B>Assumed</B> that all the information is correct.
     * Method will check if user is existed or not base on accountID.
     * @param newUser: User object with information that already validated.
     * @return true if create user successful, false if not.
     * @throws InterruptedException if something wrong with thread.
     * @throws ExecutionException if something wrong with thread.
     */
    public static User signUp(User newUser) throws InterruptedException, ExecutionException {
        System.out.println("Registering..... (Please wait!) ");
        //check if user already exists
        newUser.setAccountID(newUser.getPhoneNumber());
        if (checkIfAccountIDExists(newUser.getAccountID())) {
            throw new IllegalStateException(Text.accountIDExisted);
        }
        //Push new user info to database
        ApiFuture<DocumentReference> future = db.collection("Account").add(newUser);
        
        System.out.println(Text.signUpSuccess);
        System.out.println(Text.accountID + newUser.getAccountID());
        return newUser;
    }

    /**
     * Sign in with <B>ID</B> and <B>password</B>.
     *
     * @param accountID: ID of user.
     * @param password:  Password user has entered.
     * @return User object if sign in successful, null if not.
     */
    public static User signIn(String accountID, String password) throws IllegalStateException{
        System.out.println("Signing In...(Please wait)");
        User user = retrieveUser(accountID);
        if (user == null) {
            throw new IllegalStateException(Text.signInFail);
        }
        if (user.getPassword().equals(password)) {
            System.out.println(Text.signInSuccess);
            return user;
        } else {
            throw new IllegalStateException(Text.signInFail);
        }
    }

    /**
     * Check if account ID already exists.
     *
     * @param accountID: ID of user.
     * @return true if account ID already exists, false if not.
     */
    public static boolean checkIfAccountIDExists(String accountID) throws InterruptedException, ExecutionException {
        User user = retrieveUser(accountID);
        if(user == null) return false;
        return user.getAccountID() != null;
    }

    /**
     * Retrieve user info from database. <B>Assumed</B> that the user exists.
     *
     * @param accountID: ID of user.
     * @return User object if user exists, null if not.
     */
    public static @Nullable User retrieveUser(String accountID) {

        account = db.collection("Account");
        Query query = account.whereEqualTo("accountID", accountID);
        ApiFuture<QuerySnapshot> future = query.get();
        QuerySnapshot querySnapshot = null;
        try {
            querySnapshot = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        if (querySnapshot.isEmpty()) {
            return null;
        }
        return querySnapshot.toObjects(User.class).get(0);
    }

    /**
     * Update user info. <B>Assumed</B> that the user exists.
     *
     * @param accountID      new account ID.
     * @param password       new password.
     * @param name           new name.
     * @param accountBalance new account balance.
     * @param citizenID      new citizen ID.
     * @param phoneNumber    new phone number.
     * @param emailAddress   new email address.
     * @param streetAddress  new street address.
     * @return true if update successful, false if not.
     */
    public static boolean updateUserInfo(String accountID, String password, String name, float accountBalance,
                                         String citizenID, String phoneNumber, String emailAddress,
                                         String streetAddress) throws InterruptedException, ExecutionException {

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
            System.out.println(Text.updateInfoSuccess);
            return true;
        }
        return false;
    }

    /**
     * Used to change user's password. <B>Assumed</B> that the user exists.
     * @param accountID   current account ID.
     * @param oldPassword current password.
     * @param newPassword new password.
     * @return true if password change successful, false if not.
     */
    public static boolean updateUserPassword(String accountID, String oldPassword, String newPassword) throws InterruptedException, ExecutionException {

        User user = retrieveUser(accountID);
        if (user != null) {
            if (user.getPassword().equals(oldPassword)) {
                user.setPassword(newPassword);
                account.document(accountID).set(user);
                System.out.println(Text.updatePassSuccess);
                return true;
            } else {
                throw new IllegalStateException(Text.updatePassFail);
            }

        }
        return false;
    }

    /**
     * Used to change user's account balance. <B>Assumed</B> that the user exists.
     *
     * @param accountID      current account ID.
     * @param accountBalance new account balance.
     */
    public static void updateUserAccountBalance(String accountID, float accountBalance) throws InterruptedException, ExecutionException {
        try {
            User user = retrieveUser(accountID);
            if (user != null) {
                user.setBalance(accountBalance);
                account.document(accountID).set(user);
                System.out.println(Text.updateBalanceSuccess);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method to retrieve User Citizen ID.
     * @param accountID
     * @return  User Citizen ID.
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static String getCitizenID(String accountID) throws InterruptedException, ExecutionException {
        User user = retrieveUser(accountID);
        if (user != null) {
            return user.getCitizenID();
        }
        return null;
    }
}
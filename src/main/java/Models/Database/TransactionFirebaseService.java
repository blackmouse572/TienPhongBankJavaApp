package Models.Database;

import Models.UserManagement.Transaction;
import TextView.Text;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.ExecutionException;

public class TransactionFirebaseService {
    private static final Firestore db = FirestoreClient.getFirestore();
    private static CollectionReference transactions;

    /**
     *This API is used to push new transaction to firebase database.
     * It is <B>assumed</B> that Sender and Receiver are <B>already in the database</B>.
     * @param transaction: transaction object
     * ***/
    public static void transferTransaction(Transaction transaction) throws ExecutionException, InterruptedException {
        //Add new transaction to database
        transactions = db.collection("Transactions");
        transactions.add(transaction);
        System.out.println(Text.transferWait);

        /* Change the balance of the account that the transaction is made to
        *  and the balance of the account that the transaction is made from
        * by the amount of the transaction
         */

        //Get Send and Receiver's id
        String SenderId = transaction.getSender().getAccountID();
        String ReceiverId = transaction.getReceiver().getAccountID();
        //Get current balance of sender and receiver
        float senderBalance = transaction.getSender().getAccountBalance();
        float receiverBalance = transaction.getReceiver().getAccountBalance();

        //Get amount of transaction
        float amount = transaction.getMoneyAmount();
        //Change balance of sender and receiver
        senderBalance -= amount;
        receiverBalance += amount;
        //Update sender and receiver's balance in database
        UserFirebaseService.updateUserAccountBalance(SenderId, senderBalance);
        UserFirebaseService.updateUserAccountBalance(ReceiverId, receiverBalance);
        System.out.println(Text.transferSuccess);
    }
    //API to withdraw money from account
    public static void withdrawTransaction(Transaction transaction) throws ExecutionException, InterruptedException {
        //Get current balance of sender and receiver
        //Get amount of transaction
        float amount = transaction.getMoneyAmount();
        //Change balance of sender and receiver
        float senderBalance = transaction.getSender().getAccountBalance() - amount;
        //Update sender and receiver's balance in database
        System.out.println(Text.withdrawWait);
        UserFirebaseService.updateUserAccountBalance(transaction.getSender().getAccountID(), senderBalance);
        //Add new transaction to database
        transactions = db.collection("Transactions");
        transactions.add(transaction);
        System.out.println(Text.withdrawSuccess);

    }
    //API to deposit money to account
    //API to withdraw money from account
    public static void depositTransaction(Transaction transaction) throws ExecutionException, InterruptedException {
        //Get current balance of sender and receiver
        float amount = transaction.getMoneyAmount();
        //Change balance of sender and receiver
        float senderBalance = transaction.getSender().getAccountBalance() + amount;
        //Update sender and receiver's balance in database
        System.out.println(Text.depositWait);
        UserFirebaseService.updateUserAccountBalance(transaction.getSender().getAccountID(), senderBalance);
        //Add new transaction to database
        transactions = db.collection("Transactions");
        transactions.add(transaction);
        System.out.println(Text.depositSuccess);
    }

    /***
     * This API is used to get all transactions of a user. It is <B>assumed</B> that the user is in the database.
     * @param userId: Current user's id who is logged in
     * @return List of transactions
     * @throws ExecutionException if the query fails to execute.
     * @throws InterruptedException if the query was interrupted.
     */
    public static Stack<Transaction> getAllTransactionsByUserId(String userId) throws ExecutionException, InterruptedException {
        //Get all transactions by user id
        transactions = db.collection("Transactions");
        ApiFuture<QuerySnapshot> future = transactions.whereEqualTo("sender.accountID", userId).get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        Stack<Transaction> transactions = new Stack<>();
        for (QueryDocumentSnapshot document : documents) {
            transactions.push(document.toObject(Transaction.class));
        }
        return transactions;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIview;

import Models.Database.TransactionFirebaseService;
import Models.UserManagement.Transaction;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class TopUpForm extends javax.swing.JPanel {

    /**
     * Creates new form RegForm
     */
    public TopUpForm() {
        initComponents();
        createFormLanguage();
        
        // them 1 cai check captcha 
        captchaTxt.setText("pikachu");
        captchaTxt.setHorizontalAlignment( JTextField.CENTER );
    }
    
    // return default = ?
    // vietnamese => bundle = ///
    // english => bundle = ///
    
    private String returnBundle() {
        String bundle;
        if ( BankGUI.localeToString().equals("vi_VN") ) {
            bundle = "topup/Bundle_vi_VN_topup";
        }
        else {
            bundle = "topup/Bundle_en_US_topup";
        }
        return bundle;
    }
    
    private void createFormLanguage() {
        String bundle = returnBundle();
        ResourceBundle topup = ResourceBundle.getBundle(bundle, BankGUI.checkLocale() );
        TopUpForm.jLabel1.setText(topup.getString("TopUpForm.jLabel1.text"));
        TopUpForm.jLabel2.setText(topup.getString("TopUpForm.jLabel2.text"));
        TopUpForm.jLabel3.setText(topup.getString("TopUpForm.jLabel3.text"));
        TopUpForm.jLabel5.setText(topup.getString("TopUpForm.jLabel5.text"));
        TopUpForm.jLabel6.setText(topup.getString("TopUpForm.jLabel6.text"));
        TopUpForm.jButton2.setText(topup.getString("TopUpForm.jButton2.text"));
        // clear cache
        ResourceBundle.clearCache();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        captchaTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        recaptchaTxt = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("topup/Bundle_vi_VN_topup"); // NOI18N
        jLabel1.setText(bundle.getString("TopUpForm.jLabel1.text")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton2.setText(bundle.getString("TopUpForm.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(bundle.getString("TopUpForm.jLabel2.text")); // NOI18N
        jPanel2.add(jLabel2);

        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        jPanel2.add(amountTxt);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText(bundle.getString("TopUpForm.jLabel3.text")); // NOI18N
        jPanel2.add(jLabel3);
        jPanel2.add(descTxt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText(bundle.getString("TopUpForm.jLabel5.text")); // NOI18N
        jPanel2.add(jLabel5);

        captchaTxt.setEnabled(false);
        jPanel2.add(captchaTxt);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText(bundle.getString("TopUpForm.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6);
        jPanel2.add(recaptchaTxt);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        // check input empty
        if ( amountTxt.getText().trim().isEmpty() || descTxt.getText().trim().isEmpty() 
                || recaptchaTxt.getText().trim().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Money, description or captcha cannot be null!", "Show message", JOptionPane.ERROR_MESSAGE );
        } 
        // check recaptcha
        else if ( !recaptchaTxt.getText().equals( captchaTxt.getText() ) ) {
            JOptionPane.showMessageDialog(this, "Captcha is not matched!", "Show message", JOptionPane.ERROR_MESSAGE );
        } else {
            try {
                float moneyToDeposit= Float.parseFloat(amountTxt.getText());
                String desc=descTxt.getText();
                
                if ( moneyToDeposit < 10000) {
                    JOptionPane.showMessageDialog(this, "The Amount of Money is too low. Must be greater than 10,000", "Show message", JOptionPane.ERROR_MESSAGE );
                } else {
                    
                    String action = "Add money to account";

                    try {
                        //Create new transaction
                        Transaction newTransaction = new Transaction( BankGUI.currentUser, moneyToDeposit, action);
                        TransactionFirebaseService.depositTransaction(newTransaction);
                        //Update current user account balance
                        BankGUI.currentUser.setAccountBalance(BankGUI.currentUser.getAccountBalance() + moneyToDeposit);
                        // chay duoc thi bo dong nay
                        System.out.println("Success!");
                    } catch (ExecutionException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            catch ( Exception err ) {
                JOptionPane.showMessageDialog(this, "Money must be a number!", "Show message", JOptionPane.ERROR_MESSAGE );
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField captchaTxt;
    private javax.swing.JTextField descTxt;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField recaptchaTxt;
    // End of variables declaration//GEN-END:variables
}

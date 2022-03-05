/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUIview;

import Models.Database.UserFirebaseService;
import Models.UserManagement.User;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author phamn
 */
public class SignupForm extends javax.swing.JPanel {

    
/**
     * Creates new form SignUpForm
     */
    public SignupForm() {
        initComponents();
        createFormLanguage();
        
        // them 1 cai check captcha 
        captchaTxt.setText("pikachu");
        captchaTxt.setHorizontalAlignment( JTextField.CENTER );
        BankGUI.currentUser = new User();
    }
    
    // return default = ?
    // vietnamese => bundle = ///
    // english => bundle = ///
    
    private String returnBundle() {
        String bundle;
        if ( BankGUI.localeToString().equals("vi_VN") ) {
            bundle = "signup/Bundle_vi_VN_signup";
        }
        else {
            bundle = "signup/Bundle_en_US_signup";
        }
        return bundle;
    }
    
    private void createFormLanguage() {
        String bundle = returnBundle();
        ResourceBundle signup = ResourceBundle.getBundle(bundle, BankGUI.checkLocale() );
        SignupForm.jButton2.setText(signup.getString("SignupForm.jButton2.text"));
        SignupForm.jLabel1.setText(signup.getString("SignupForm.jLabel1.text"));
        SignupForm.jLabel2.setText(signup.getString("SignupForm.jLabel2.text"));
        SignupForm.jLabel3.setText(signup.getString("SignupForm.jLabel3.text"));
        SignupForm.jLabel4.setText(signup.getString("SignupForm.jLabel4.text"));
        SignupForm.jLabel5.setText(signup.getString("SignupForm.jLabel5.text"));
        SignupForm.jLabel6.setText(signup.getString("SignupForm.jLabel6.text"));
        SignupForm.jLabel7.setText(signup.getString("SignupForm.jLabel7.text"));
        SignupForm.jLabel9.setText(signup.getString("SignupForm.jLabel9.text"));
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
        accNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        citizenIDTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        passTxt1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        captchaTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        recaptchaTxt = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("signup/Bundle_vi_VN_signup"); // NOI18N
        jLabel1.setText(bundle.getString("SignupForm.jLabel1.text")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText(bundle.getString("SignupForm.jButton2.text")); // NOI18N
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
        jLabel2.setText(bundle.getString("SignupForm.jLabel2.text")); // NOI18N
        jPanel2.add(jLabel2);

        accNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(accNameTxt);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText(bundle.getString("SignupForm.jLabel3.text")); // NOI18N
        jPanel2.add(jLabel3);
        jPanel2.add(citizenIDTxt);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(bundle.getString("SignupForm.jLabel4.text")); // NOI18N
        jPanel2.add(jLabel4);
        jPanel2.add(telTxt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText(bundle.getString("SignupForm.jLabel5.text")); // NOI18N
        jPanel2.add(jLabel5);

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        jPanel2.add(addressTxt);

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        java.util.ResourceBundle bundle1 = java.util.ResourceBundle.getBundle("signup/Bundle"); // NOI18N
        jLabelEmail.setText(bundle1.getString("SignupForm.jLabelEmail.text")); // NOI18N
        jPanel2.add(jLabelEmail);

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        jPanel2.add(emailTxt);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText(bundle.getString("SignupForm.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6);
        jPanel2.add(passTxt);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText(bundle.getString("SignupForm.jLabel7.text")); // NOI18N
        jPanel2.add(jLabel7);
        jPanel2.add(passTxt1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(bundle.getString("SignupForm.jLabel8.text")); // NOI18N
        jPanel2.add(jLabel8);

        captchaTxt.setText(bundle1.getString("SignupForm.captchaTxt.text")); // NOI18N
        captchaTxt.setEnabled(false);
        jPanel2.add(captchaTxt);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(bundle.getString("SignupForm.jLabel9.text")); // NOI18N
        jPanel2.add(jLabel9);

        recaptchaTxt.setText(bundle1.getString("SignupForm.recaptchaTxt.text")); // NOI18N
        jPanel2.add(recaptchaTxt);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        // check empty
        if ( accNameTxt.getText().trim().isEmpty()
             || citizenIDTxt.getText().trim().isEmpty()
             || telTxt.getText().trim().isEmpty()
             || addressTxt.getText().trim().isEmpty()
             || emailTxt.getText().trim().isEmpty()
             || String.valueOf(passTxt.getPassword()).trim().equals("") 
             || String.valueOf(passTxt1.getPassword()).trim().equals("")
             || recaptchaTxt.getText().trim().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Password or captcha cannot be null!", "Show message", JOptionPane.ERROR_MESSAGE );
        }
        // check recaptcha
        else if ( !recaptchaTxt.getText().equals( captchaTxt.getText() ) ) {
            JOptionPane.showMessageDialog(this, "Captcha is not matched!", "Show message", JOptionPane.ERROR_MESSAGE );
        } 
        // check reinput pass match with new password
        else if ( !Arrays.equals( passTxt.getPassword(), passTxt1.getPassword()) ) {
            JOptionPane.showMessageDialog(this, "Re-input password is not matched with new password!", "Show message", JOptionPane.ERROR_MESSAGE );
        }
        else {
            String phoneNumber = telTxt.getText();
            String name = accNameTxt.getText();
            String citizenID = citizenIDTxt.getText();
            String emailAddress = emailTxt.getText();
            String streetAddress = addressTxt.getText();
            
            BankGUI.currentUser.setPhoneNumber(phoneNumber);
            BankGUI.currentUser.setName(name);
            BankGUI.currentUser.setCitizenID(citizenID);
            BankGUI.currentUser.setEmailAddress(emailAddress);
            BankGUI.currentUser.setStreetAddress(streetAddress);
            BankGUI.currentUser.setPassword( new String(passTxt.getPassword()) );
            
            try {
                UserFirebaseService.signUp(BankGUI.currentUser);
                JOptionPane.showMessageDialog(this, "Success!", "Show message", JOptionPane.INFORMATION_MESSAGE );
            } catch (InterruptedException | ExecutionException ex) {
                JOptionPane.showMessageDialog(this, "Account existed!", "Show message", JOptionPane.ERROR_MESSAGE );
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void accNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accNameTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNameTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField captchaTxt;
    private javax.swing.JTextField citizenIDTxt;
    private javax.swing.JTextField emailTxt;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelEmail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JPasswordField passTxt1;
    private javax.swing.JTextField recaptchaTxt;
    private javax.swing.JTextField telTxt;
    // End of variables declaration//GEN-END:variables
}

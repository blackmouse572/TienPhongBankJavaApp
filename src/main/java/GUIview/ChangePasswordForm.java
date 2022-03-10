/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUIview;

import Models.Database.UserFirebaseService;
import Models.Validation;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author phamn
 */
public class ChangePasswordForm extends javax.swing.JPanel {

    /**
    * Creates new form ChangePasswordForm
    */
    public ChangePasswordForm() {
        initComponents();
        createFormLanguage();
        if (BankGUI.currentUser != null ) {
            jTextField1.setText( BankGUI.currentUser.getAccountID() );
            jTextField1.setEnabled(false);
        } else if (BankGUI.currentUser == null ) {
            jTextField1.setEnabled(true);
        }
        
        // generate captcha
        captchaTxt.setText(Integer.toString(Validation.generateCapcha()));
        captchaTxt.setHorizontalAlignment( JTextField.CENTER );
    }
    
    // return default = ?
    // vietnamese => bundle = ///
    // english => bundle = ///
    
    private String returnBundle() {
        String bundle;
        if ( BankGUI.localeToString().equals("vi_VN") ) {
            bundle = "changepassword/Bundle_vi_VN_changepassword";
        }
        else {
            bundle = "changepassword/Bundle_en_US_changepassword";
        }
        return bundle;
    }
    
    private void createFormLanguage() {
        String bundle = returnBundle();
        ResourceBundle changePassword = ResourceBundle.getBundle(bundle, BankGUI.checkLocale() );
        ChangePasswordForm.jLabel1.setText(changePassword.getString("ChangePasswordForm.jLabel1.text"));
        ChangePasswordForm.jLabel2.setText(changePassword.getString("ChangePasswordForm.jLabel2.text"));
        ChangePasswordForm.jLabel6.setText(changePassword.getString("ChangePasswordForm.jLabel6.text"));
        ChangePasswordForm.jLabel7.setText(changePassword.getString("ChangePasswordForm.jLabel7.text"));
        ChangePasswordForm.jLabel8.setText(changePassword.getString("ChangePasswordForm.jLabel8.text"));
        ChangePasswordForm.jLabel10.setText(changePassword.getString("ChangePasswordForm.jLabel10.text"));
        ChangePasswordForm.jButton2.setText(changePassword.getString("ChangePasswordForm.jButton2.text"));
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
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        captchaTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        recaptchaTxt = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(369, 254));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("changepassword/Bundle_vi_VN_changepassword"); // NOI18N
        jLabel1.setText(bundle.getString("ChangePasswordForm.jLabel1.text")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton2.setText(bundle.getString("ChangePasswordForm.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(bundle.getString("ChangePasswordForm.jLabel2.text")); // NOI18N
        jPanel2.add(jLabel2);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText(bundle.getString("ChangePasswordForm.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6);
        jPanel2.add(jPasswordField1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText(bundle.getString("ChangePasswordForm.jLabel7.text")); // NOI18N
        jPanel2.add(jLabel7);
        jPanel2.add(jPasswordField2);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(bundle.getString("ChangePasswordForm.jLabel8.text")); // NOI18N
        jPanel2.add(jLabel8);
        jPanel2.add(jPasswordField3);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(bundle.getString("ChangePasswordForm.jLabel9.text")); // NOI18N
        jPanel2.add(jLabel9);

        captchaTxt.setText(bundle.getString("ChangePasswordForm.captchaTxt.text")); // NOI18N
        captchaTxt.setEnabled(false);
        jPanel2.add(captchaTxt);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(bundle.getString("ChangePasswordForm.jLabel10.text")); // NOI18N
        jPanel2.add(jLabel10);

        recaptchaTxt.setText(bundle.getString("ChangePasswordForm.recaptchaTxt.text")); // NOI18N
        jPanel2.add(recaptchaTxt);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if (BankGUI.currentUser != null ) {
            String accountID = BankGUI.currentUser.getAccountID();
            
            // check empty
            if ( String.valueOf(jPasswordField1.getPassword()).trim().equals("") 
                 || String.valueOf(jPasswordField2.getPassword()).trim().equals("")
                 || String.valueOf(jPasswordField3.getPassword()).trim().equals("")
                 || recaptchaTxt.getText().trim().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Password or captcha cannot be null!", "Show message", JOptionPane.ERROR_MESSAGE );
            }
            // check recaptcha
            else if ( !recaptchaTxt.getText().equals( captchaTxt.getText() ) ) {
                JOptionPane.showMessageDialog(this, "Captcha is not matched!", "Show message", JOptionPane.ERROR_MESSAGE );
            } 
            // check reinput pass match with new password
            else if ( !Arrays.equals(jPasswordField3.getPassword(), jPasswordField2.getPassword()) ) {
                JOptionPane.showMessageDialog(this, "Re-input password is not matched with new password!", "Show message", JOptionPane.ERROR_MESSAGE );
            }
            // check jPasswordField1 equal existed password
            else if ( !jPasswordField1.getPassword().equals(BankGUI.currentUser.getPassword()) ) {
                JOptionPane.showMessageDialog(this, "Not matched with old password!", "Show message", JOptionPane.ERROR_MESSAGE );
            }
            // TODO: check new password match old password => false
            else if ( jPasswordField2.getPassword().equals(BankGUI.currentUser.getPassword()) ) {
                JOptionPane.showMessageDialog(this, "New password cannot matched with old password!", "Show message", JOptionPane.ERROR_MESSAGE );
            }
            // update
            else {
//                String oldpass = new String (jPasswordField1.getPassword());
//                String newpass = new String (jPasswordField2.getPassword());
                
                String oldpass1 = new String(jPasswordField1.getPassword());
                // set password
                String oldpass =  Validation.checkInputPassword_GUI(oldpass1);
                
                String newpass1 = new String(jPasswordField1.getPassword());
                // set password
                String newpass =  Validation.checkInputPassword_GUI(newpass1);
                
                try {
                    UserFirebaseService.updateUserPassword(BankGUI.currentUser.getAccountID(), oldpass, newpass);
                    JOptionPane.showMessageDialog(this, "Success!", "Show message", JOptionPane.INFORMATION_MESSAGE );
                } catch (InterruptedException | ExecutionException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField captchaTxt;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField recaptchaTxt;
    // End of variables declaration//GEN-END:variables
}

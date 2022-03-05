/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUIview;

import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import Models.Validation;
import Models.Database.UserFirebaseService;

/**
 *
 * @author phamn
 */
public class LoginForm extends javax.swing.JPanel {

        /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        createFormLanguage();
    }
    
    private String returnBundle() {
        String bundle;
        if ( BankGUI.localeToString().equals("vi_VN") ) {
            bundle = "login/Bundle_vi_VN_login";
        }
        else {
            bundle = "login/Bundle_en_US_login";
        }
        return bundle;
    }
    
    private void createFormLanguage() {
        String bundle = returnBundle();
        ResourceBundle login = ResourceBundle.getBundle(bundle, BankGUI.checkLocale() );
        LoginForm.jLabel2.setText(login.getString("LoginForm.jLabel2.text"));
        LoginForm.jLabel3.setText(login.getString("LoginForm.jLabel3.text"));
        LoginForm.jLabel4.setText(login.getString("LoginForm.jLabel4.text"));
        LoginForm.jButton1.setText(login.getString("LoginForm.jButton1.text"));
        LoginForm.jButton2.setText(login.getString("LoginForm.jButton2.text"));
        LoginForm.jButton3.setText(login.getString("LoginForm.jButton3.text"));
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("login/Bundle_vi_VN_login"); // NOI18N
        jLabel2.setText(bundle.getString("LoginForm.jLabel2.text")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jButton1.setText(bundle.getString("LoginForm.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText(bundle.getString("LoginForm.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton3.setText(bundle.getString("LoginForm.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText(bundle.getString("LoginForm.jLabel3.text")); // NOI18N
        jPanel2.add(jLabel3);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText(bundle.getString("LoginForm.jLabel4.text")); // NOI18N
        jPanel2.add(jLabel4);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        // if account is not existed => showMessage: account or pass not existed
        // check account or password null
        if ( jTextField1.getText().isEmpty() || String.valueOf(jPasswordField1.getPassword()).trim().equals("") ) {
            JOptionPane.showMessageDialog(this, "Account or password is not valid!", "Show message", JOptionPane.ERROR_MESSAGE );
        }
        else {
            String accNo = jTextField1.getText();
//            String pass=new String( jPasswordField1.getPassword());
            
            String password = new String(jPasswordField1.getPassword());
            // set password
            String pass =  Validation.checkInputPassword_GUI(password);
            
            try {
                BankGUI.currentUser = UserFirebaseService.signIn(accNo, pass);
                // disable and enable
                BankGUI.transMenu.setEnabled(true);
                BankGUI.jMenuItemChangePass.setEnabled(true);
                BankGUI.jMenuItemLogOut.setEnabled(true);
                BankGUI.jMenuItemLogin.setEnabled(false);
                BankGUI.jMenuItemSignUp.setEnabled(false);
                jButton3.setEnabled(false);
                
                // code chay duoc thi bo
                System.out.println("Success!");
                
                JOptionPane.showMessageDialog(this, "Welcome customer "+BankGUI.currentUser.getName());
            }
            catch ( Exception err) {
                // code chay duoc thi bo
                System.out.println("Failed");
                
                JOptionPane.showMessageDialog(this, "Account or password is not valid!", "Show message", JOptionPane.ERROR_MESSAGE );
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BankGUI.mainPane.setBottomComponent( new SignupForm() );
        BankGUI.bank.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        BankGUI.mainPane.setBottomComponent( new ChangePasswordForm() );
        BankGUI.bank.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

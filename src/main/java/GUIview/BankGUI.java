/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIview;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author phamn
 */
public class BankGUI extends javax.swing.JFrame {

    /**
     * Creates new form BankGUI
     */
    public static BankGUI bank = new BankGUI();
    public BankGUI() {
        initComponents();
        mainPane.setBottomComponent(new LoginForm());
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSignUp = new javax.swing.JMenuItem();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogOut = new javax.swing.JMenuItem();
        transMenu = new javax.swing.JMenu();
        jMenuItemAccountInformation = new javax.swing.JMenuItem();
        jMenuItemTopUp = new javax.swing.JMenuItem();
        jMenuItemWithdrawal = new javax.swing.JMenuItem();
        jMenuItemTransfer = new javax.swing.JMenuItem();
        jMenuItemViewLog = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuLanguage = new javax.swing.JMenu();
        jCheckBoxMenuItemVietnamese = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemEnglish = new javax.swing.JCheckBoxMenuItem();
        jMenuItemChangePass = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        mainPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        mainPane.setTopComponent(jPanel1);

        getContentPane().add(mainPane);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/Bundle_vi_VN_gui"); // NOI18N
        jMenu1.setText(bundle.getString("BankGUI.jMenu1.text")); // NOI18N

        jMenuItemSignUp.setText(bundle.getString("BankGUI.jMenuItemSignUp.text")); // NOI18N
        jMenuItemSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSignUpActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSignUp);

        jMenuItemLogin.setText(bundle.getString("BankGUI.jMenuItemLogin.text")); // NOI18N
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLogin);

        jMenuItemLogOut.setText(bundle.getString("BankGUI.jMenuItemLogOut.text")); // NOI18N
        jMenuItemLogOut.setEnabled(false);
        jMenuItemLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLogOut);

        jMenuBar1.add(jMenu1);

        transMenu.setText(bundle.getString("BankGUI.transMenu.text")); // NOI18N

        jMenuItemAccountInformation.setText(bundle.getString("BankGUI.jMenuItemAccountInformation.text")); // NOI18N
        jMenuItemAccountInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccountInformationActionPerformed(evt);
            }
        });
        transMenu.add(jMenuItemAccountInformation);

        jMenuItemTopUp.setText(bundle.getString("BankGUI.jMenuItemTopUp.text")); // NOI18N
        jMenuItemTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTopUpActionPerformed(evt);
            }
        });
        transMenu.add(jMenuItemTopUp);

        jMenuItemWithdrawal.setText(bundle.getString("BankGUI.jMenuItemWithdrawal.text")); // NOI18N
        jMenuItemWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemWithdrawalActionPerformed(evt);
            }
        });
        transMenu.add(jMenuItemWithdrawal);

        jMenuItemTransfer.setText(bundle.getString("BankGUI.jMenuItemTransfer.text")); // NOI18N
        jMenuItemTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTransferActionPerformed(evt);
            }
        });
        transMenu.add(jMenuItemTransfer);

        jMenuItemViewLog.setText(bundle.getString("BankGUI.jMenuItemViewLog.text")); // NOI18N
        jMenuItemViewLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewLogActionPerformed(evt);
            }
        });
        transMenu.add(jMenuItemViewLog);

        jMenuBar1.add(transMenu);

        jMenu3.setText(bundle.getString("BankGUI.jMenu3.text")); // NOI18N

        jMenuLanguage.setText(bundle.getString("BankGUI.jMenuLanguage.text")); // NOI18N

        jCheckBoxMenuItemVietnamese.setSelected(true);
        jCheckBoxMenuItemVietnamese.setText(bundle.getString("BankGUI.jCheckBoxMenuItemVietnamese.text")); // NOI18N
        jCheckBoxMenuItemVietnamese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemVietnameseActionPerformed(evt);
            }
        });
        jMenuLanguage.add(jCheckBoxMenuItemVietnamese);

        jCheckBoxMenuItemEnglish.setText(bundle.getString("BankGUI.jCheckBoxMenuItemEnglish.text")); // NOI18N
        jCheckBoxMenuItemEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemEnglishActionPerformed(evt);
            }
        });
        jMenuLanguage.add(jCheckBoxMenuItemEnglish);

        jMenu3.add(jMenuLanguage);

        jMenuItemChangePass.setText(bundle.getString("BankGUI.jMenuItemChangePass.text")); // NOI18N
        jMenuItemChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChangePassActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemChangePass);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSignUpActionPerformed
        SignupForm tf= new SignupForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemSignUpActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        // TODO add your handling code here:
        LoginForm tf= new LoginForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jMenuItemLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemLogOutActionPerformed

    private void jMenuItemAccountInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAccountInformationActionPerformed
        // TODO add your handling code here:

        AccountInformationForm tf= new AccountInformationForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemAccountInformationActionPerformed

    private void jMenuItemTopUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTopUpActionPerformed
        // TODO add your handling code here:
        TopUpForm tf= new TopUpForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemTopUpActionPerformed

    private void jMenuItemWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWithdrawalActionPerformed
        // TODO add your handling code here:
        WithdrawalForm tf= new WithdrawalForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemWithdrawalActionPerformed

    private void jMenuItemTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTransferActionPerformed
        // TODO add your handling code here:
        TransferForm tf= new TransferForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemTransferActionPerformed

    private void jMenuItemViewLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewLogActionPerformed
        // TODO add your handling code here:
        ViewLogForm tf= new ViewLogForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemViewLogActionPerformed

    private void jCheckBoxMenuItemVietnameseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemVietnameseActionPerformed
        // TODO add your handling code here:
        // check vietnamese => remove english
        jCheckBoxMenuItemVietnamese.setSelected( true );
        jCheckBoxMenuItemEnglish.setSelected( false );

        // change language to Vietnamese
        
        // set locale default = VN
        Locale.setDefault( new Locale("vi", "VN"));
        // gui
        {
            String bundle = "gui/Bundle_vi_VN_gui";
            ResourceBundle gui = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            jMenu1.setText(gui.getString("BankGUI.jMenu1.text") );
            jMenuItemSignUp.setText(gui.getString("BankGUI.jMenuItemSignUp.text"));
            jMenuItemLogin.setText(gui.getString("BankGUI.jMenuItemLogin.text"));
            jMenuItemLogOut.setText(gui.getString("BankGUI.jMenuItemLogOut.text"));
            transMenu.setText(gui.getString("BankGUI.transMenu.text"));
            jMenuItemAccountInformation.setText(gui.getString("BankGUI.jMenuItemAccountInformation.text"));
            jMenuItemTopUp.setText(gui.getString("BankGUI.jMenuItemTopUp.text"));
            jMenuItemWithdrawal.setText(gui.getString("BankGUI.jMenuItemWithdrawal.text"));
            jMenuItemTransfer.setText(gui.getString("BankGUI.jMenuItemTransfer.text"));
            jMenuItemViewLog.setText(gui.getString("BankGUI.jMenuItemViewLog.text"));
            jMenu3.setText(gui.getString("BankGUI.jMenu3.text"));
            jMenuLanguage.setText(gui.getString("BankGUI.jMenuLanguage.text"));
            jCheckBoxMenuItemVietnamese.setText(gui.getString("BankGUI.jCheckBoxMenuItemVietnamese.text"));
            jCheckBoxMenuItemEnglish.setText(gui.getString("BankGUI.jCheckBoxMenuItemEnglish.text"));
            jMenuItemChangePass.setText(gui.getString("BankGUI.jMenuItemChangePass.text"));
        }
        
        // login
        {
            String bundle = "login/Bundle_vi_VN_login";
            ResourceBundle login = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            LoginForm.jLabel2.setText(login.getString("LoginForm.jLabel2.text"));
            LoginForm.jLabel3.setText(login.getString("LoginForm.jLabel3.text"));
            LoginForm.jLabel4.setText(login.getString("LoginForm.jLabel4.text"));
            LoginForm.jButton1.setText(login.getString("LoginForm.jButton1.text"));
            LoginForm.jButton2.setText(login.getString("LoginForm.jButton2.text"));
            LoginForm.jButton3.setText(login.getString("LoginForm.jButton3.text"));
        }
        
        // sign up
        {
            String bundle = "signup/Bundle_vi_VN_signup";
            ResourceBundle signup = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            SignupForm.jButton2.setText(signup.getString("SignupForm.jButton2.text"));
            SignupForm.jLabel1.setText(signup.getString("SignupForm.jLabel1.text"));
            SignupForm.jLabel2.setText(signup.getString("SignupForm.jLabel2.text"));
            SignupForm.jLabel3.setText(signup.getString("SignupForm.jLabel3.text"));
            SignupForm.jLabel4.setText(signup.getString("SignupForm.jLabel4.text"));
            SignupForm.jLabel5.setText(signup.getString("SignupForm.jLabel5.text"));
            SignupForm.jLabel6.setText(signup.getString("SignupForm.jLabel6.text"));
            SignupForm.jLabel7.setText(signup.getString("SignupForm.jLabel7.text"));
            SignupForm.jLabel9.setText(signup.getString("SignupForm.jLabel9.text"));
        }
        
        // change password
        {
            String bundle = "changepassword/Bundle_vi_VN_changepassword";
            ResourceBundle changePassword = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            ChangePasswordForm.jLabel1.setText(changePassword.getString("ChangePasswordForm.jLabel1.text"));
            ChangePasswordForm.jLabel2.setText(changePassword.getString("ChangePasswordForm.jLabel2.text"));
            ChangePasswordForm.jLabel6.setText(changePassword.getString("ChangePasswordForm.jLabel6.text"));
            ChangePasswordForm.jLabel7.setText(changePassword.getString("ChangePasswordForm.jLabel7.text"));
            ChangePasswordForm.jLabel8.setText(changePassword.getString("ChangePasswordForm.jLabel8.text"));
            ChangePasswordForm.jLabel10.setText(changePassword.getString("ChangePasswordForm.jLabel10.text"));
            ChangePasswordForm.jButton2.setText(changePassword.getString("ChangePasswordForm.jButton2.text"));
        }
        
        // topup
        {
            String bundle = "topup/Bundle_vi_VN_topup";
            ResourceBundle topup = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            TopUpForm.jLabel1.setText(topup.getString("TopUpForm.jLabel1.text"));
            TopUpForm.jLabel2.setText(topup.getString("TopUpForm.jLabel2.text"));
            TopUpForm.jLabel3.setText(topup.getString("TopUpForm.jLabel3.text"));
            TopUpForm.jLabel5.setText(topup.getString("TopUpForm.jLabel5.text"));
            TopUpForm.jLabel6.setText(topup.getString("TopUpForm.jLabel6.text"));
            TopUpForm.jButton2.setText(topup.getString("TopUpForm.jButton2.text"));
        }
        
        // transfer
        {
            String bundle = "transfer/Bundle_vi_VN_transfer";
            ResourceBundle transfer = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            TransferForm.jLabel1.setText(transfer.getString("TransferForm.jLabel1.text"));
            TransferForm.jLabel6.setText(transfer.getString("TransferForm.jLabel6.text"));
            TransferForm.jLabel2.setText(transfer.getString("TransferForm.jLabel2.text"));
            TransferForm.jLabel3.setText(transfer.getString("TransferForm.jLabel3.text"));
            TransferForm.jLabel5.setText(transfer.getString("TransferForm.jLabel5.text"));
            TransferForm.jLabel7.setText(transfer.getString("TransferForm.jLabel7.text"));
            TransferForm.jButton2.setText(transfer.getString("TransferForm.jButton2.text"));
        }
        
        // account information
        {
            String bundle = "accountinformation/Bundle_vi_VN_accountinformation";
            ResourceBundle accInfor = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            AccountInformationForm.jLabel1.setText(accInfor.getString("AccountInformationForm.jLabel1.text"));
            AccountInformationForm.jLabel6.setText(accInfor.getString("AccountInformationForm.jLabel6.text"));
            AccountInformationForm.jLabel2.setText(accInfor.getString("AccountInformationForm.jLabel2.text"));
            AccountInformationForm.jLabel3.setText(accInfor.getString("AccountInformationForm.jLabel3.text"));
            AccountInformationForm.jLabel5.setText(accInfor.getString("AccountInformationForm.jLabel5.text"));
            AccountInformationForm.jLabel7.setText(accInfor.getString("AccountInformationForm.jLabel7.text"));
            AccountInformationForm.jLabel8.setText(accInfor.getString("AccountInformationForm.jLabel8.text"));
        }
        
        // clear cache
        ResourceBundle.clearCache();
    }//GEN-LAST:event_jCheckBoxMenuItemVietnameseActionPerformed

    private void jCheckBoxMenuItemEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemEnglishActionPerformed
        // TODO add your handling code here:
        // check english => remove vietnamese
        jCheckBoxMenuItemEnglish.setSelected( true );
        jCheckBoxMenuItemVietnamese.setSelected( false );

        // change language to English

        // set locale default = US
        Locale.setDefault( new Locale("en", "US"));
        // gui
        {
            String bundle = "gui/Bundle_en_US_gui";
            ResourceBundle gui = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            jMenu1.setText(gui.getString("BankGUI.jMenu1.text") );
            jMenuItemSignUp.setText(gui.getString("BankGUI.jMenuItemSignUp.text"));
            jMenuItemLogin.setText(gui.getString("BankGUI.jMenuItemLogin.text"));
            jMenuItemLogOut.setText(gui.getString("BankGUI.jMenuItemLogOut.text"));
            transMenu.setText(gui.getString("BankGUI.transMenu.text"));
            jMenuItemAccountInformation.setText(gui.getString("BankGUI.jMenuItemAccountInformation.text"));
            jMenuItemTopUp.setText(gui.getString("BankGUI.jMenuItemTopUp.text"));
            jMenuItemWithdrawal.setText(gui.getString("BankGUI.jMenuItemWithdrawal.text"));
            jMenuItemTransfer.setText(gui.getString("BankGUI.jMenuItemTransfer.text"));
            jMenuItemViewLog.setText(gui.getString("BankGUI.jMenuItemViewLog.text"));
            jMenu3.setText(gui.getString("BankGUI.jMenu3.text"));
            jMenuLanguage.setText(gui.getString("BankGUI.jMenuLanguage.text"));
            jCheckBoxMenuItemVietnamese.setText(gui.getString("BankGUI.jCheckBoxMenuItemVietnamese.text"));
            jCheckBoxMenuItemEnglish.setText(gui.getString("BankGUI.jCheckBoxMenuItemEnglish.text"));
            jMenuItemChangePass.setText(gui.getString("BankGUI.jMenuItemChangePass.text"));
        }
        
        // login
        {
            String bundle = "login/Bundle_en_US_login";
            ResourceBundle login = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            LoginForm.jLabel2.setText(login.getString("LoginForm.jLabel2.text"));
            LoginForm.jLabel3.setText(login.getString("LoginForm.jLabel3.text"));
            LoginForm.jLabel4.setText(login.getString("LoginForm.jLabel4.text"));
            LoginForm.jButton1.setText(login.getString("LoginForm.jButton1.text"));
            LoginForm.jButton2.setText(login.getString("LoginForm.jButton2.text"));
            LoginForm.jButton3.setText(login.getString("LoginForm.jButton3.text"));
        }
        
        // sign up
        {
            String bundle = "signup/Bundle_en_US_signup";
            ResourceBundle signup = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            SignupForm.jButton2.setText(signup.getString("SignupForm.jButton2.text"));
            SignupForm.jLabel1.setText(signup.getString("SignupForm.jLabel1.text"));
            SignupForm.jLabel2.setText(signup.getString("SignupForm.jLabel2.text"));
            SignupForm.jLabel3.setText(signup.getString("SignupForm.jLabel3.text"));
            SignupForm.jLabel4.setText(signup.getString("SignupForm.jLabel4.text"));
            SignupForm.jLabel5.setText(signup.getString("SignupForm.jLabel5.text"));
            SignupForm.jLabel6.setText(signup.getString("SignupForm.jLabel6.text"));
            SignupForm.jLabel7.setText(signup.getString("SignupForm.jLabel7.text"));
            SignupForm.jLabel9.setText(signup.getString("SignupForm.jLabel9.text"));
        }
        
        // change password
        {
            String bundle = "changepassword/Bundle_en_US_changepassword";
            ResourceBundle changePassword = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            ChangePasswordForm.jLabel1.setText(changePassword.getString("ChangePasswordForm.jLabel1.text"));
            ChangePasswordForm.jLabel2.setText(changePassword.getString("ChangePasswordForm.jLabel2.text"));
            ChangePasswordForm.jLabel6.setText(changePassword.getString("ChangePasswordForm.jLabel6.text"));
            ChangePasswordForm.jLabel7.setText(changePassword.getString("ChangePasswordForm.jLabel7.text"));
            ChangePasswordForm.jLabel8.setText(changePassword.getString("ChangePasswordForm.jLabel8.text"));
            ChangePasswordForm.jLabel10.setText(changePassword.getString("ChangePasswordForm.jLabel10.text"));
            ChangePasswordForm.jButton2.setText(changePassword.getString("ChangePasswordForm.jButton2.text"));
        }
        
        // topup
        {
            String bundle = "topup/Bundle_en_US_topup";
            ResourceBundle topup = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            TopUpForm.jLabel1.setText(topup.getString("TopUpForm.jLabel1.text"));
            TopUpForm.jLabel2.setText(topup.getString("TopUpForm.jLabel2.text"));
            TopUpForm.jLabel3.setText(topup.getString("TopUpForm.jLabel3.text"));
            TopUpForm.jLabel5.setText(topup.getString("TopUpForm.jLabel5.text"));
            TopUpForm.jLabel6.setText(topup.getString("TopUpForm.jLabel6.text"));
            TopUpForm.jButton2.setText(topup.getString("TopUpForm.jButton2.text"));
        }
        
        // transfer
        {
            String bundle = "transfer/Bundle_en_US_transfer";
            ResourceBundle transfer = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            TransferForm.jLabel1.setText(transfer.getString("TransferForm.jLabel1.text"));
            TransferForm.jLabel6.setText(transfer.getString("TransferForm.jLabel6.text"));
            TransferForm.jLabel2.setText(transfer.getString("TransferForm.jLabel2.text"));
            TransferForm.jLabel3.setText(transfer.getString("TransferForm.jLabel3.text"));
            TransferForm.jLabel5.setText(transfer.getString("TransferForm.jLabel5.text"));
            TransferForm.jLabel7.setText(transfer.getString("TransferForm.jLabel7.text"));
            TransferForm.jButton2.setText(transfer.getString("TransferForm.jButton2.text"));
        }
        
        // view log
        {
            String bundle = "viewlog/Bundle_en_US_viewlog";
            ResourceBundle viewlog = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            ViewLogForm.jLabel2.setText(viewlog.getString("ViewLogForm.jLabel2.text"));
        }
        
        // withdrawal
        {
            String bundle = "withdrawal/Bundle_en_US_withdrawal";
            ResourceBundle withdrawal = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            WithdrawalForm.jLabel1.setText(withdrawal.getString("WithdrawalForm.jLabel1.text"));
            WithdrawalForm.jLabel2.setText(withdrawal.getString("WithdrawalForm.jLabel2.text"));
            WithdrawalForm.jLabel4.setText(withdrawal.getString("WithdrawalForm.jLabel4.text"));
            WithdrawalForm.jLabel5.setText(withdrawal.getString("WithdrawalForm.jLabel5.text"));
            WithdrawalForm.jLabel6.setText(withdrawal.getString("WithdrawalForm.jLabel6.text"));
            WithdrawalForm.jButton2.setText(withdrawal.getString("WithdrawalForm.jButton2.text"));
        }
        
        // account information
        {
            String bundle = "accountinformation/Bundle_en_US_accountinformation";
            ResourceBundle accInfor = ResourceBundle.getBundle( bundle, Locale.getDefault() );
            AccountInformationForm.jLabel1.setText(accInfor.getString("AccountInformationForm.jLabel1.text"));
            AccountInformationForm.jLabel6.setText(accInfor.getString("AccountInformationForm.jLabel6.text"));
            AccountInformationForm.jLabel2.setText(accInfor.getString("AccountInformationForm.jLabel2.text"));
            AccountInformationForm.jLabel3.setText(accInfor.getString("AccountInformationForm.jLabel3.text"));
            AccountInformationForm.jLabel5.setText(accInfor.getString("AccountInformationForm.jLabel5.text"));
            AccountInformationForm.jLabel7.setText(accInfor.getString("AccountInformationForm.jLabel7.text"));
            AccountInformationForm.jLabel8.setText(accInfor.getString("AccountInformationForm.jLabel8.text"));
        }
        
        // clear cache
        ResourceBundle.clearCache();
    }//GEN-LAST:event_jCheckBoxMenuItemEnglishActionPerformed

    private void jMenuItemChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChangePassActionPerformed
        // TODO add your handling code here:
        ChangePasswordForm tf= new ChangePasswordForm();
        mainPane.setBottomComponent(tf);
        this.pack();
    }//GEN-LAST:event_jMenuItemChangePassActionPerformed

    // get locale default
    public static Locale checkLocale() {
        Locale.setDefault(new Locale("vi", "VN"));
        if ( jCheckBoxMenuItemVietnamese.isSelected() ) {
            Locale.setDefault(new Locale("vi", "VN"));
        }
        else if ( jCheckBoxMenuItemEnglish.isSelected() ) {
            Locale.setDefault(new Locale("en", "US"));
        }
        return Locale.getDefault();
    }
    
    // return string of locale
    public static String localeToString() {
        Locale l = checkLocale();
        return l.getLanguage() + "_" + l.getCountry();
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemEnglish;
    private static javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemVietnamese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private static javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAccountInformation;
    private javax.swing.JMenuItem jMenuItemChangePass;
    private javax.swing.JMenuItem jMenuItemLogOut;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemSignUp;
    private javax.swing.JMenuItem jMenuItemTopUp;
    private javax.swing.JMenuItem jMenuItemTransfer;
    private javax.swing.JMenuItem jMenuItemViewLog;
    private javax.swing.JMenuItem jMenuItemWithdrawal;
    private javax.swing.JMenu jMenuLanguage;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JSplitPane mainPane;
    public static javax.swing.JMenu transMenu;
    // End of variables declaration//GEN-END:variables
}

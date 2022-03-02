/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUIview;

import java.util.ResourceBundle;

/**
 *
 * @author phamn
 */
public class WithdrawalForm extends javax.swing.JPanel {

    /**
     * Creates new form WithdrawalForm
     */
    public WithdrawalForm() {
        initComponents();
        createFormLanguage();
    }
    
    // return default = ?
    // vietnamese => bundle = ///
    // english => bundle = ///
    
    private String returnBundle() {
        String bundle;
        if ( BankGUI.localeToString().equals("vi_VN") ) {
            bundle = "withdrawal/Bundle_vi_VN_withdrawal";
        }
        else {
            bundle = "withdrawal/Bundle_en_US_withdrawal";
        }
        return bundle;
    }
    
    private void createFormLanguage() {
        String bundle = returnBundle();
        ResourceBundle withdrawal = ResourceBundle.getBundle(bundle, BankGUI.checkLocale() );
        WithdrawalForm.jLabel1.setText(withdrawal.getString("WithdrawalForm.jLabel1.text"));
        WithdrawalForm.jLabel2.setText(withdrawal.getString("WithdrawalForm.jLabel2.text"));
        WithdrawalForm.jLabel4.setText(withdrawal.getString("WithdrawalForm.jLabel4.text"));
        WithdrawalForm.jLabel5.setText(withdrawal.getString("WithdrawalForm.jLabel5.text"));
        WithdrawalForm.jLabel6.setText(withdrawal.getString("WithdrawalForm.jLabel6.text"));
        WithdrawalForm.jButton2.setText(withdrawal.getString("WithdrawalForm.jButton2.text"));
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
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descTxt1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descTxt2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descTxt3 = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("withdrawal/Bundle_vi_VN_withdrawal"); // NOI18N
        jLabel1.setText(bundle.getString("WithdrawalForm.jLabel1.text")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton2.setText(bundle.getString("WithdrawalForm.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel3.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(bundle.getString("WithdrawalForm.jLabel2.text")); // NOI18N
        jPanel3.add(jLabel2);

        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        jPanel3.add(amountTxt);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(bundle.getString("WithdrawalForm.jLabel4.text")); // NOI18N
        jPanel3.add(jLabel4);
        jPanel3.add(descTxt1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText(bundle.getString("WithdrawalForm.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5);
        jPanel3.add(descTxt2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText(bundle.getString("WithdrawalForm.jLabel6.text")); // NOI18N
        jPanel3.add(jLabel6);
        jPanel3.add(descTxt3);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        // code cua ho
        //        double bal=Double.parseDouble(amountTxt.getText());
        //        String desc=descTxt.getText();
        //        BankGUI.bank.doDeposit(BankGUI.curAcc.getAccNo(), bal, desc);
        //        JOptionPane.showMessageDialog(this,"Your new balance: "+BankGUI.curAcc.getBalance());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField descTxt1;
    private javax.swing.JTextField descTxt2;
    private javax.swing.JTextField descTxt3;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

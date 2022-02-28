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
public class AccountInformationForm extends javax.swing.JPanel {

    /**
     * Creates new form TransferForm
     */
    public AccountInformationForm() {
        initComponents();
        createFormLanguage();
    }
    
    // return default = ?
    // vietnamese => bundle = ///
    // english => bundle = ///
    
    private String returnBundle() {
        String bundle;
        if ( BankGUI.localeToString().equals("vi_VN") ) {
            bundle = "accountinformation/Bundle_vi_VN_accountinformation";
        }
        else {
            bundle = "accountinformation/Bundle_en_US_accountinformation";
        }
        return bundle;
    }
    
    private void createFormLanguage() {
        String bundle = returnBundle();
        ResourceBundle accInfor = ResourceBundle.getBundle(bundle, BankGUI.checkLocale() );
        AccountInformationForm.jLabel1.setText(accInfor.getString("AccountInformationForm.jLabel1.text"));
        AccountInformationForm.jLabel6.setText(accInfor.getString("AccountInformationForm.jLabel6.text"));
        AccountInformationForm.jLabel2.setText(accInfor.getString("AccountInformationForm.jLabel2.text"));
        AccountInformationForm.jLabel3.setText(accInfor.getString("AccountInformationForm.jLabel3.text"));
        AccountInformationForm.jLabel5.setText(accInfor.getString("AccountInformationForm.jLabel5.text"));
        AccountInformationForm.jLabel7.setText(accInfor.getString("AccountInformationForm.jLabel7.text"));
        AccountInformationForm.jLabel8.setText(accInfor.getString("AccountInformationForm.jLabel8.text"));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        descTxt3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descTxt2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        descTxt4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descTxt5 = new javax.swing.JTextField();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("accountinformation/Bundle_vi_VN_accountinformation"); // NOI18N
        jLabel1.setText(bundle.getString("AccountInformationForm.jLabel1.text_1")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        jPanel3.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText(bundle.getString("AccountInformationForm.jLabel6.text_1")); // NOI18N
        jPanel3.add(jLabel6);
        jPanel3.add(descTxt3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(bundle.getString("AccountInformationForm.jLabel2.text_1")); // NOI18N
        jPanel3.add(jLabel2);

        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        jPanel3.add(amountTxt);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText(bundle.getString("AccountInformationForm.jLabel3.text_1")); // NOI18N
        jPanel3.add(jLabel3);
        jPanel3.add(descTxt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText(bundle.getString("AccountInformationForm.jLabel5.text_1")); // NOI18N
        jPanel3.add(jLabel5);
        jPanel3.add(descTxt2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText(bundle.getString("AccountInformationForm.jLabel7.text_1")); // NOI18N
        jPanel3.add(jLabel7);
        jPanel3.add(descTxt4);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(bundle.getString("AccountInformationForm.jLabel8.text_1")); // NOI18N
        jPanel3.add(jLabel8);
        jPanel3.add(descTxt5);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField descTxt;
    private javax.swing.JTextField descTxt2;
    private javax.swing.JTextField descTxt3;
    private javax.swing.JTextField descTxt4;
    private javax.swing.JTextField descTxt5;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
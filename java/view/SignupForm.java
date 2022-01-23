/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        accNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addrTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        balanceTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        passTxt1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        passTxt2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        passTxt3 = new javax.swing.JPasswordField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Registration");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("Reset");
        jPanel1.add(jButton1);

        jButton2.setText("Register");
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
        jLabel2.setText("Chủ tài khoản");
        jPanel2.add(jLabel2);

        accNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(accNameTxt);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CMND/CCCD");
        jPanel2.add(jLabel3);
        jPanel2.add(addrTxt);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Điện thoại");
        jPanel2.add(jLabel4);
        jPanel2.add(telTxt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Địa chỉ");
        jPanel2.add(jLabel5);
        jPanel2.add(balanceTxt);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Mật khẩu");
        jPanel2.add(jLabel6);
        jPanel2.add(passTxt);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Xác nhận mật khẩu");
        jPanel2.add(jLabel7);
        jPanel2.add(passTxt1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Captcha");
        jPanel2.add(jLabel8);
        jPanel2.add(passTxt2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Xác thực Captcha");
        jPanel2.add(jLabel9);
        jPanel2.add(passTxt3);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        // code cua ho
//        String name=accNameTxt.getText();
//        String addr=addrTxt.getText();
//        String tel=telTxt.getText();
//        double bal=Double.parseDouble(balanceTxt.getText());
//        String pass=new String(passTxt.getPassword());
//        Account a= new Account(name,addr,tel,bal,pass);
//        BankGUI.bank.createAccount(a);
//        JOptionPane.showMessageDialog(this,"Your account No is "+a.getAccNo());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void accNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accNameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNameTxt;
    private javax.swing.JTextField addrTxt;
    private javax.swing.JTextField balanceTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JPasswordField passTxt1;
    private javax.swing.JPasswordField passTxt2;
    private javax.swing.JPasswordField passTxt3;
    private javax.swing.JTextField telTxt;
    // End of variables declaration//GEN-END:variables
}

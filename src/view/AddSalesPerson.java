/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.SalesPerson;
import control.SalesPersonControl;

/**
 *
 * @author ahmadnasser
 */
public class AddSalesPerson extends javax.swing.JFrame {

    SalesPersonControl SPCtrl;

    /**
     * Creates new form AddSalesPerson
     */
    public AddSalesPerson() {
        SPCtrl = new SalesPersonControl();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alreadyExists = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        yearsOfExp = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Add Sales Person");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 37, 192, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 85, -1, 26));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("SSN:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 177, 29, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Phone Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 177, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 259, -1, -1));

        alreadyExists.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(alreadyExists, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 210, 36));

        submitButton.setBackground(new java.awt.Color(107, 5, 107));
        submitButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 341, 84, 47));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Years of Experience:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 254, -1, 27));
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 117, 122, 23));
        getContentPane().add(yearsOfExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 287, 117, -1));
        getContentPane().add(ssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 205, 122, -1));
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 117, 122, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 287, 122, -1));
        getContentPane().add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 205, 117, 23));

        back.setBackground(new java.awt.Color(107, 5, 107));
        back.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 366, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pov-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        int status = SPCtrl.addSalesPerson(new SalesPerson(Integer.parseInt(this.ssn.getText()),
                this.firstName.getText(),
                this.lastName.getText(),
                Integer.parseInt(this.phoneNumber.getText()),
                this.email.getText(),
                Integer.parseInt(this.yearsOfExp.getText())));
        if (status == 0)
            this.setVisible(false);
        else if (status == 2)
            this.alreadyExists.setText("Sales person already exists.");
        else if (status == 1)
            this.alreadyExists.setText("Wrong email format.");
        else
            this.alreadyExists.setText("Error connecting to database.");
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            dispose();
        Main main = new Main();
        main.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(AddSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSalesPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alreadyExists;
    private javax.swing.JButton back;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField ssn;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField yearsOfExp;
    // End of variables declaration//GEN-END:variables
}

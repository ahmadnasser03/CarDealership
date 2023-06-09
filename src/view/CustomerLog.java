/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.Customers;
import control.CustomerControl;

/**
 *
 * @author lara.tawbeh
 */
public class CustomerLog extends javax.swing.JFrame {
    
    private CustomerControl customerCtrl;
    private Customers customer;

    /**
     * Creates new form Customer
     */
    public CustomerLog() {
        customerCtrl = new CustomerControl();
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
        ssn = new javax.swing.JTextField();
        doesNotExist = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Please enter your SSN:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 27));

        ssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnActionPerformed(evt);
            }
        });
        getContentPane().add(ssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 160, -1));

        doesNotExist.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(doesNotExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, 31));

        log.setBackground(new java.awt.Color(107, 5, 107));
        log.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        log.setText("Login");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        back.setBackground(new java.awt.Color(107, 5, 107));
        back.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pov-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 520, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon.jpeg.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        
        if (!this.ssn.getText().isEmpty()) {
            try {
                if ((customer = customerCtrl.getCustomerBySSN(Integer.parseInt(this.ssn.getText()))) != null) {
                    AsCustomer AC = new AsCustomer(customer);
                    System.out.println(customer);
                    AC.setVisible(true);
                    this.setVisible(false);
                } else {
                    
                    this.doesNotExist.setText("Customer does not exist.");
                }
            } catch (NullPointerException e) {
                this.doesNotExist.setText("Error connecting to database.");
            }
        }
    }//GEN-LAST:event_logActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel doesNotExist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton log;
    private javax.swing.JTextField ssn;
    // End of variables declaration//GEN-END:variables
}

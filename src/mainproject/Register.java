/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainproject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
/**
 *
 * @author FRANC
 */
public class Register extends javax.swing.JFrame {

    private final String url = "jdbc:mysql://localhost:3306/register?autoReconnect=true&useSSL=false";

    private final String username = "root";
    private final String password = "";
    private Connection connection;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        connectToDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jid = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jaddress = new javax.swing.JLabel();
        jgender = new javax.swing.JLabel();
        jcontact = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jtxtname = new javax.swing.JTextField();
        jtxtadress = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jtextcontact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnclear = new javax.swing.JButton();
        jbtnregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRATION FORM");

        jid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jid.setText("ID");

        jname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jname.setText("NAME");

        jaddress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jaddress.setText("ADDRESS");

        jgender.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jgender.setText("GENDER");

        jcontact.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jcontact.setText("CONTACT");

        jtxtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtidActionPerformed(evt);
            }
        });

        jtxtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnameActionPerformed(evt);
            }
        });

        jtxtadress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtadressActionPerformed(evt);
            }
        });

        jRadioButton1.setText("MALE");

        jRadioButton2.setText("FEMALE");

        jtextcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextcontactActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "ADDRESS", "GENDER", "CONTACT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbtnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnclear.setText("CLEAR");
        jbtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearActionPerformed(evt);
            }
        });

        jbtnregister.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnregister.setText("REGISTER");
        jbtnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(165, 165, 165)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jgender)
                                .addGap(51, 51, 51)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcontact)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jid, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jaddress)
                                                .addComponent(jname))
                                            .addGap(27, 27, 27)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtextcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jtxtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                    .addComponent(jtxtadress, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxtid, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(89, 89, 89)))
                        .addGap(22, 22, 22)
                        .addComponent(jbtnregister)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnregister)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jid)
                            .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jname)
                            .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtadress))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jgender)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton1)
                                .addComponent(jRadioButton2)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcontact)
                            .addComponent(jtextcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
       private void connectToDatabase() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to database.");
            e.printStackTrace();
        }
    }
    private void jbtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jbtnclearActionPerformed

    private void jbtnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnregisterActionPerformed
        // TODO add your handling code here:
        String id =jtxtid.getText();
        String name = jtxtname.getText();
        String gender = jRadioButton1.isSelected() ? "MALE" : "FEMALE";
        String address = jtxtadress.getText(); 
        String contact = jtextcontact.getText();
        
         try {
            String sql = "INSERT INTO students (id, name, gender, address, contact) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, gender);
            statement.setString(4, address);
            statement.setString(5, contact);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was registered successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to register user.");
            e.printStackTrace();
        }

           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{id, name, gender, address, contact});

        // Clear fields after registration
        clearFields();
    
    }//GEN-LAST:event_jbtnregisterActionPerformed

    private void jtxtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtidActionPerformed

    private void jtxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnameActionPerformed

    private void jtxtadressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtadressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtadressActionPerformed

    private void jtextcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextcontactActionPerformed
 private void clearFields() {
        // Clear all text fields and radio button selection
         jtxtid.setText("");
      jtxtname.setText("");
        buttonGroup1.clearSelection();
        jtxtadress.setText("");
        jtextcontact.setText("");
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
             try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
            return;
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jaddress;
    private javax.swing.JButton jbtnclear;
    private javax.swing.JButton jbtnregister;
    private javax.swing.JLabel jcontact;
    private javax.swing.JLabel jgender;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jname;
    private javax.swing.JTextField jtextcontact;
    private javax.swing.JTextField jtxtadress;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtname;
    // End of variables declaration//GEN-END:variables
}

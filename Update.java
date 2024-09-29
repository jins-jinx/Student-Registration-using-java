/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.lang.*;

public class Update extends javax.swing.JFrame {

     boolean search=true;
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Update() {
        initComponents();
         Connect();
        textPass.setText(""); textPass.setEnabled(false);
        textName.setText(""); textName.setEnabled(false);
        textLast.setText(""); textLast.setEnabled(false);
        textAddress.setText(""); textAddress.setEnabled(false);
        textMobileNo.setText(""); textMobileNo.setEnabled(false);
        textEmail.setText(""); textEmail.setEnabled(false);
        
        changePass.setEnabled(false);
        deleteButton.setEnabled(false);
        editButton.setEnabled(false);
        SearchButton.setEnabled(true);

        Update.this.setLocation(380,150);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchId = new javax.swing.JTextField();
        textPass = new javax.swing.JTextField();
        textLast = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textMobileNo = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        changePass = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mobile No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Last Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 130, -1));
        getContentPane().add(searchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, -1));
        getContentPane().add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, -1));
        getContentPane().add(textLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 180, 30));
        getContentPane().add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 430, -1));
        getContentPane().add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 290, -1));
        getContentPane().add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 30));

        textMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMobileNoActionPerformed(evt);
            }
        });
        getContentPane().add(textMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 290, -1));

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 70, 20));

        editButton.setForeground(new java.awt.Color(0, 204, 0));
        editButton.setText("Save  ");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 70, 20));

        deleteButton.setForeground(new java.awt.Color(255, 102, 102));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 70, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Student Information");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 20));

        changePass.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        changePass.setText("Change Password");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });
        getContentPane().add(changePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 100, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/Untitled design (7).png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){

            try {
                deleteButton.setEnabled(false);
                Connection cn;
                Statement st;
                String url;
                url = "jdbc:mysql://localhost:3306/isdb";
                Class.forName("com.mysql.cj.jdbc.Driver");
                cn = (Connection) DriverManager.getConnection(url, "root","09322622931fckyou");
                st = (Statement) cn.createStatement();
                st.executeUpdate("UPDATE reg_tbl SET  fname= '"
                    +textName.getText()+"',lname= '"
                    +textLast.getText()+"', address= '"
                    +textAddress.getText()+"',mobileno= '"
                    +textMobileNo.getText()+"',email = '"
                    +textEmail.getText()+"',password='"
                    +textPass.getText()
                    +"'Where Id = '"

                    +searchId.getText()+"' ");
                JOptionPane.showMessageDialog(null, "Record Updated","System Message",JOptionPane.INFORMATION_MESSAGE);
                  
                SearchButton.setEnabled(true);
                registerButton.setEnabled(true);
                searchId.setText(""); searchId.setEnabled(true);
                textPass.setText(""); textPass.setEnabled(false);
                textName.setText(""); textName.setEnabled(false);
                textLast.setText(""); textLast.setEnabled(false);
                textAddress.setText(""); textAddress.setEnabled(false);
                textMobileNo.setText(""); textMobileNo.setEnabled(false);
                textEmail.setText(""); textEmail.setEnabled(false);
                editButton.setEnabled(false);
                deleteButton.setEnabled(false);
                

            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        try {      
            pst = con.prepareStatement("select Id,fname,lname,address, mobileno,email, password from reg_tbl where Id=? ");
            int id = Integer.parseInt(searchId.getText());
            pst.setInt(1, id);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false)
                {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                                textName.setText("");
                                textLast.setText("");
                                textAddress.setText("");
                                textMobileNo.setText("");
                                textEmail.setText("");
                                textPass.setText("");
                                searchId.requestFocus();
                    }
                        else
                        {

            textName.setText(rs1.getString("fname"));
                        textLast.setText(rs1.getString("lname"));
                         textAddress.setText(rs1.getString("address"));
                          textMobileNo.setText(rs1.getString("mobileno"));
                           textEmail.setText(rs1.getString("email"));
                            textPass.setText(rs1.getString("password"));
                            
                            changePass.setEnabled(true);
                            textPass.setEnabled(false);
                            textName.setEnabled(true);
                            textLast.setEnabled(true);
                            textAddress.setEnabled(true);
                            textMobileNo.setEnabled(true);
                            textEmail.setEnabled(true);
                            deleteButton.setEnabled(true);
                            editButton.setEnabled(true);
        }
            
        } catch (SQLException ex) {
            //Logger.getLogger(SearchJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
           int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){
            try {
             Connection cn;
            Statement st;
            String url;



            url = "jdbc:mysql://localhost:3306/isdb";
            cn = (Connection) DriverManager.getConnection(url, "root","09322622931fckyou");
            st = (Statement) cn.createStatement();
             st.executeUpdate("UPDATE reg_tbl SET  fname= '"+textName.getText()+
                     "',lname= '"+textLast.getText()+
                     "', address= '"+textAddress.getText()+
                     "',mobileno= '"+textMobileNo.getText()+
                     "',email = '"+textEmail.getText()+
                      "',password = '"+textPass.getText()+
                     "'Where id = '"+searchId.getText()+"' ");

                String query;
                query = "Delete From reg_tbl Where Id='" + searchId.getText() + "'";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Deleted","System Message",JOptionPane.INFORMATION_MESSAGE);
                searchId.setText("");
                textPass.setText(""); textPass.setEnabled(false);
                textName.setText(""); textName.setEnabled(false);
                textLast.setText(""); textLast.setEnabled(false);
                textAddress.setText(""); textAddress.setEnabled(false);
                textMobileNo.setText(""); textMobileNo.setEnabled(false);
                textEmail.setText(""); textEmail.setEnabled(false);
                editButton.setEnabled(false);
                deleteButton.setEnabled(false);
           
            
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void textMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMobileNoActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        frameMain register= new frameMain();
        register.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassActionPerformed
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to change password?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){
                textPass.setEnabled(true);
                editButton.setEnabled(true);
                SearchButton.setEnabled(false);
                registerButton.setEnabled(false);
                searchId.setEnabled(false);
                deleteButton.setEnabled(false);
                textName.setEnabled(false);
                textLast.setEnabled(false);
                textAddress.setEnabled(false);
                textMobileNo.setEnabled(false);
                textEmail.setEnabled(false);    
        }
    }//GEN-LAST:event_changePassActionPerformed
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/isdb","root","09322622931fckyou");
            
        } catch (ClassNotFoundException ex) {
          
        } catch (SQLException ex) {
          
        }
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton changePass;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField searchId;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLast;
    private javax.swing.JTextField textMobileNo;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPass;
    // End of variables declaration//GEN-END:variables
}

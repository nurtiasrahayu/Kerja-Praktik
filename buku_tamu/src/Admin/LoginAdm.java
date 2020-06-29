package Admin;

import buku_tamu.koneksi;
import com.sun.glass.events.KeyEvent;
import home.Dashboard;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
// import end.finish;

public class LoginAdm extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdm
     */
    public LoginAdm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    public void login(){
        koneksi.getKoneksi();
       
       try{
            Statement stat = (Statement)koneksi.getKoneksi().createStatement();
            String sql = "SELECT * FROM adminakun WHERE Username = '" + vusername.getText()
                    +"' AND Password = '"+vpassword.getText()+"'";
            ResultSet res = stat.executeQuery(sql);
            res.next();
            res.last();
            
            if (res.getRow()==1){
                dispose();
                IsiBuku buku = new IsiBuku();
                buku.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(null, "Maaf Username/Password Anda salah");
                vusername.setText("");
                vpassword.setText("");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vpassword = new javax.swing.JPasswordField();
        vusername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2538, 1330));
        setPreferredSize(new java.awt.Dimension(2538, 1330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        vpassword.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        vpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vpasswordKeyPressed(evt);
            }
        });
        getContentPane().add(vpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 220, -1));

        vusername.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        vusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vusernameActionPerformed(evt);
            }
        });
        vusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vusernameKeyPressed(evt);
            }
        });
        getContentPane().add(vusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 220, -1));

        btnLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\buku_tamu\\src\\gambar\\Selamat Datang (8).png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-600, -170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void vusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vusernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vusernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            vpassword.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            vpassword.requestFocus();
        }
    }//GEN-LAST:event_vusernameKeyPressed

    private void vpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vpasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            vusername.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            vpassword.requestFocus();
            login();
        }
    }//GEN-LAST:event_vpasswordKeyPressed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btnLoginKeyPressed

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
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField vpassword;
    private javax.swing.JTextField vusername;
    // End of variables declaration//GEN-END:variables
}

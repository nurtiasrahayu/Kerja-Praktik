package buku_tamu;

import home.Dashboard;
import end.finish;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class formtamu extends javax.swing.JFrame {

    private DefaultTableModel model;
    String b, c, d, e, f, g, h;
    
    //public class UpdateBerlakuTableModel extends DefaultTableModel{
      //  JTable hk, imp;
        
        //public UpdateBerlakuTableModel (Object[][] values, Object[] header, JTabel hk, JTable imp){
            
        //}
    //}
    
    public formtamu() {
        initComponents();
        this.setLocationRelativeTo(null);
           
        /*model = new DefaultTableModel ();
        tabel.setModel(model);
        model.addColumn("Tanggal");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Alamat");
        model.addColumn("Pekerjaan");
        model.addColumn("Instansi");
        model.addColumn("Kepentingan");
       
        getData();*/
        
    }
    
    /*public void cariData(){
    
        model = new DefaultTableModel();
        
        tabel.setModel(model);
        model.addColumn("Tanggal");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Alamat");
        model.addColumn("Pekerjaan");
        model.addColumn("Instansi");
        model.addColumn("Kepentingan");
    //tabelTampil1.addColumn("ID");
    //tabelTampil1.addColumn("Nama ");
    //tabelTampil1.addColumn("Alamat ");
    //tabelTampil1.addColumn("JK ");
    //tabelTampil1.addColumn("Agama ");
        try{
            Statement stat = (Statement) koneksi.getKoneksi().createStatement(); 
            String sql = "Select * from tamu where Nama like '%" + txtCari.getText() + "%'" +
            "or Alamat like '%" + txtCari.getText() + "%'" +
            "or Instansi like '%" + txtCari.getText() + "%'"+
            "or Pekerjaan like '%" + txtCari.getText() + "%'" +
            "or Email like '%" + txtCari.getText() + "%'"+
            "or Tanggal like '%" + txtCari.getText() + "%'"+
            "or Kepentingan like '%" + txtCari.getText() + "%'";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("Tanggal"),
                    rs.getString("Nama"),
                    rs.getString("Email"),
                    rs.getString("Alamat"),
                    rs.getString("Pekerjaan"),
                    rs.getString("Instansi"),
                    rs.getString("Kepentingan"),
                });
            }
            
        }
        catch (Exception e){
        }
    }*/
    
    /*public void getData(){
       //model.getDataVector().removeAllElements();
       //model.fireTableDataChanged();
        
        try{
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            String sql = "SELECT * FROM tamu";
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                Object[] obj = new Object[7];
                obj[0] = res.getString("Tanggal");
                obj[1] = res.getString("Nama");
                obj[2] = res.getString("Email");
                obj[3] = res.getString("Alamat");
                obj[4] = res.getString("Pekerjaan");
                obj[5] = res.getString("Instansi");
                obj[6] = res.getString("Kepentingan");
                                
                //model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }*/
    
    public void loadData(){
        
        b   = nama.getText();
        c   = email.getText();
        d   = telp.getText();
        e   = alam.getText();
        f   = pek.getText();
        g   = ins.getText();
        h   = kep.getText();
    }
    
    public void saveData() {
        loadData();
        
        try{
            Statement stat = (Statement)koneksi.getKoneksi().createStatement();
            String sql = "Insert into tamu (Nama, Email, Telpon, Alamat, Pekerjaan, Instansi, Kepentingan)"
                    +"values ('"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')";
            stat.execute(sql);
            //PreparedStatement p = (PreparedStatement)koneksi.getKoneksi().prepareStatement(sql);
            //p.execute(sql);
            //getData();
            Reset();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    public void Reset(){
        b = " ";
        c = " ";
        d = " ";
        e = " ";
        f = " ";
        g = " ";
        h = " ";
        
        nama.setText(b);
        email.setText(c);
        telp.setText(d);
        alam.setText(e);
        pek.setText(f);
        ins.setText(g);
        kep.setText(h);
        
    }
    
    /*public void dataSelect(){
        int i = tabel.getSelectedRow();
        if (i == -1){
            return;
        }
        
        //jLabel2.setText(""+model.getValueAt(i, 0));
        nama.setText(""+model.getValueAt(i, 1));
        email.setText(""+model.getValueAt(i, 2));
        alam.setText(""+model.getValueAt(i, 3));
        pek.setText(""+model.getValueAt(i, 4));
        ins.setText(""+model.getValueAt(i, 5));
        kep.setText(""+model.getValueAt(i, 6));
    }
    
    public void deleteData(){
        loadData();
        
        int pesan = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data "+c+" ?", "Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION);
        if (pesan == JOptionPane.OK_OPTION){
            try{
                Statement stat = (Statement)koneksi.getKoneksi().createStatement();
                String sql = "DELETE FROM tamu WHERE Tanggal = '"+c+"'";
                PreparedStatement p = (PreparedStatement)koneksi.getKoneksi().prepareStatement(sql);
                p.executeUpdate();
                getData();
                Reset();
                JOptionPane.showMessageDialog(null, "Delete Berhasil");
            }catch(SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());
            }
        }
    }*/
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delet = new javax.swing.JButton();
        alam = new javax.swing.JTextField();
        pek = new javax.swing.JTextField();
        ins = new javax.swing.JTextField();
        kep = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        telp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("BUKU  TAMU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 380, 50));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 40, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Pekerjaan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        nama.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaKeyPressed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 340, -1));

        email.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 340, -1));

        simpan.setBackground(new java.awt.Color(204, 255, 255));
        simpan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        simpan.setForeground(new java.awt.Color(0, 51, 204));
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        simpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                simpanKeyReleased(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 100, 40));

        reset.setBackground(new java.awt.Color(204, 255, 255));
        reset.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 51, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 90, 40));

        delet.setBackground(new java.awt.Color(204, 255, 255));
        delet.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        delet.setForeground(new java.awt.Color(0, 51, 204));
        delet.setText("BATAL");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });
        getContentPane().add(delet, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 90, 40));

        alam.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        alam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alamKeyPressed(evt);
            }
        });
        getContentPane().add(alam, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 340, -1));

        pek.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        pek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pekKeyPressed(evt);
            }
        });
        getContentPane().add(pek, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 340, -1));

        ins.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insActionPerformed(evt);
            }
        });
        ins.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insKeyPressed(evt);
            }
        });
        getContentPane().add(ins, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 340, -1));

        kep.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        kep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kepActionPerformed(evt);
            }
        });
        kep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kepKeyPressed(evt);
            }
        });
        getContentPane().add(kep, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 340, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Instansi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Kepentingan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("GANTI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 880, 110, 40));

        telp.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telpKeyTyped(evt);
            }
        });
        getContentPane().add(telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 340, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Telpon");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\buku_tamu\\src\\gambar\\Selamat Datang (10)_1.png")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-610, -170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        saveData();
        new end.finish().show();
        dispose();
    }//GEN-LAST:event_simpanActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_resetActionPerformed

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        // TODO add your handling code here:
        dispose();
        new home.Dashboard().show();
    }//GEN-LAST:event_deletActionPerformed

    private void insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insActionPerformed

    private void namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            email.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN){
            email.requestFocus();
        }
    }//GEN-LAST:event_namaKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            telp.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN){
            telp.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_UP){
            nama.requestFocus();
        }
    }//GEN-LAST:event_emailKeyPressed

    private void alamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alamKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pek.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN){
            pek.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_UP){
            telp.requestFocus();
        }
    }//GEN-LAST:event_alamKeyPressed

    private void pekKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pekKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ins.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN){
            ins.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_UP){
            alam.requestFocus();
        }
    }//GEN-LAST:event_pekKeyPressed

    private void insKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            kep.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN){
            kep.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_UP){
            pek.requestFocus();
        }
    }//GEN-LAST:event_insKeyPressed

    private void kepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kepKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            ins.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            saveData();
            dispose();
            new end.finish().show();
        } 
    }//GEN-LAST:event_kepKeyPressed

    private void simpanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpanKeyReleased
        // TODO add your handling code here:
        saveData();
    }//GEN-LAST:event_simpanKeyReleased

    private void kepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kepActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kepActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //updateData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void telpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alam.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN){
            alam.requestFocus();
        }else if (evt.getKeyCode() == KeyEvent.VK_UP){
            email.requestFocus();
        }
    }//GEN-LAST:event_telpKeyPressed

    private void telpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACKSPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(null,"Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
        }
    }//GEN-LAST:event_telpKeyTyped
   
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
            java.util.logging.Logger.getLogger(formtamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formtamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formtamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formtamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                //new formtamu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alam;
    private javax.swing.JButton delet;
    private javax.swing.JTextField email;
    private javax.swing.JTextField ins;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kep;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField pek;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField telp;
    // End of variables declaration//GEN-END:variables
}

package Admin;

import buku_tamu.koneksi;
import home.Dashboard;
//import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
//import java.io.IOException;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class IsiBuku extends javax.swing.JFrame {
    private DefaultTableModel model;
    
    public IsiBuku() {
        initComponents();
        this.setLocationRelativeTo(null);
        tampilan();
    }

    public void tampilan (){
        //DefaultTableModel model = (DefaultTableModel) TABEL.getModel();
        
        model = new DefaultTableModel();
        
        TABEL.setModel(model);
        model.addColumn("Tanggal");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Telpon");
        model.addColumn("Alamat");
        model.addColumn("Pekerjaan");
        model.addColumn("Instansi");
        model.addColumn("Kepentingan");
        
        
        /*view buku = new view();
        Object obj[] = new Object[7];
        
            for(int i =0;i<buku.data.size();i++){
                obj[0] = buku.data.get(i).tgl;
                obj[1] = buku.data.get(i).nama;
                obj[2] = buku.data.get(i).email;
                obj[3] = buku.data.get(i).alam;
                obj[4] = buku.data.get(i).pek;
                obj[5] = buku.data.get(i).ins;
                obj[6] = buku.data.get(i).kep;
                model.addRow(obj);
            }*/
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            String sql = "SELECT * FROM tamu";
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                Object[] obj = new Object[8];
                obj[0] = res.getString("Tanggal");
                obj[1] = res.getString("Nama");
                obj[2] = res.getString("Email");
                obj[3] = res.getString("Telpon");
                obj[4] = res.getString("Alamat");
                obj[5] = res.getString("Pekerjaan");
                obj[6] = res.getString("Instansi");
                obj[7] = res.getString("Kepentingan");
                                
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    public void cariData(){
    
        model = new DefaultTableModel();
        
        TABEL.setModel(model);
        model.addColumn("Tanggal");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Telpon");
        model.addColumn("Alamat");
        model.addColumn("Pekerjaan");
        model.addColumn("Instansi");
        model.addColumn("Kepentingan");
        
        try{
            Statement stat = (Statement) koneksi.getKoneksi().createStatement(); 
            String sql = "Select * from tamu where Nama like '%" + txtCari.getText() + "%'" +
            "or Alamat like '%" + txtCari.getText() + "%'" +
            "or Instansi like '%" + txtCari.getText() + "%'"+
            "or Pekerjaan like '%" + txtCari.getText() + "%'" +
            "or Email like '%" + txtCari.getText() + "%'"+
            "or Telpon like '%" + txtCari.getText() + "%'"+
            "or Tanggal like '%" + txtCari.getText() + "%'"+
            "or Kepentingan like '%" + txtCari.getText() + "%'";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("Tanggal"),
                    rs.getString("Nama"),
                    rs.getString("Email"),
                    rs.getString("Telpon"),
                    rs.getString("Alamat"),
                    rs.getString("Pekerjaan"),
                    rs.getString("Instansi"),
                    rs.getString("Kepentingan"),
                });
            }
            
        }
        catch (Exception e){
        }
    }
    
    public void eksporexcel(){
        FileWriter fileWriter;
            
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try{
                TableModel tModel = TABEL.getModel();
                fileWriter = new FileWriter(new File(chooser.getSelectedFile() + ".xls"));           
            // write header
                for(int i = 0; i < tModel.getColumnCount(); i++){
                fileWriter.write(tModel.getColumnName(i).toUpperCase() + "\t");
            }
                fileWriter.write("\n");
            // write record
                for(int i=0; i < tModel.getRowCount(); i++) {
                for(int j=0; j < tModel.getColumnCount(); j++) {
                fileWriter.write(tModel.getValueAt(i,j).toString() + "\t");
            }
                fileWriter.write("\n");
            }
                fileWriter.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TABEL = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        expor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2538, 1330));
        setPreferredSize(new java.awt.Dimension(2538, 1330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABEL.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TABEL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABEL);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 950, 320));

        txtCari.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, -1));

        cari.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        cari.setForeground(new java.awt.Color(0, 0, 153));
        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        expor.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        expor.setForeground(new java.awt.Color(0, 0, 153));
        expor.setText("Export file to Excel");
        expor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exporActionPerformed(evt);
            }
        });
        getContentPane().add(expor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 270, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setText("Selesai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\buku_tamu\\src\\gambar\\Selamat Datang (11).png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-620, -180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_cariActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_txtCariKeyPressed

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_cariKeyPressed

    private void exporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exporActionPerformed
        // TODO add your handling code here:
        eksporexcel();
        /*try {
                FileWriter fw = new FileWriter("D:/file_Buku Tamu.csv");
                
                fw.write("Jadwal");
                fw.append(",");
                fw.write("Senin");
                fw.append(",");
                fw.write("Selasa");
                fw.append(",");
                fw.write("Rabu");
                fw.append(",");
                fw.write("Kamis");
                fw.append(",");
                fw.write("Jum'at\n");
                
                for (int i = 0; i < jadwalvariabel.pertemuan[0].length; i++) {
                    fw.write(jadwalvariabel.nama_hari[i] + " --- > ");
                    fw.append(",");
                    
                    for (int j = 0; j < jadwalvariabel.pertemuan[0][i].length; j++) {
                        fw.write(jadwalvariabel.nama_mapelIPA[jadwalvariabel.pertemuan[0][i][j]]);
                        fw.append(",");
                    }
                    fw.write("\n");
                }
                fw.flush();
                fw.close();
                
                JOptionPane.showMessageDialog(null, "Berhasil simpan ke excel ");
                File file = new File("D:/file_TPBb.csv");
                
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException e) {
                }
            } catch (Exception e) {
            }*/
    }//GEN-LAST:event_exporActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IsiBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IsiBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IsiBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsiBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTable TABEL;
    private javax.swing.JButton cari;
    private javax.swing.JButton expor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}

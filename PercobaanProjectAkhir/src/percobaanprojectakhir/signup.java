/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package percobaanprojectakhir;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ya991
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    Connection conn;
    public signup() {
        initComponents();
        conn = koneksi.getConnection();
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
        jLabel2 = new javax.swing.JLabel();
        tf_namaDokterSign = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf_sipDokterSign = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nomorWASign = new javax.swing.JTextField();
        tf_kodeotpDokterSign = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tf_passwordDokterSign = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 20, 33));
        jLabel2.setText("Sign Up");

        tf_namaDokterSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaDokterSignActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(49, 57, 87));
        jLabel6.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 57, 87));
        jLabel6.setText("Nama");

        jButton1.setBackground(new java.awt.Color(22, 45, 58));
        jButton1.setForeground(new java.awt.Color(249, 249, 249));
        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tf_sipDokterSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sipDokterSignActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(49, 57, 87));
        jLabel7.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 57, 87));
        jLabel7.setText("SIP");

        jLabel8.setBackground(new java.awt.Color(49, 57, 87));
        jLabel8.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(49, 57, 87));
        jLabel8.setText("Nomor WA");

        tf_nomorWASign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomorWASignActionPerformed(evt);
            }
        });

        tf_kodeotpDokterSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_kodeotpDokterSignActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(49, 57, 87));
        jLabel9.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 57, 87));
        jLabel9.setText("Kode OTP");

        jButton2.setBackground(new java.awt.Color(22, 45, 58));
        jButton2.setForeground(new java.awt.Color(249, 249, 249));
        jButton2.setText("Generate Kode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(49, 57, 87));
        jLabel11.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(49, 57, 87));
        jLabel11.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(tf_sipDokterSign)
                    .addComponent(tf_namaDokterSign)
                    .addComponent(jLabel8)
                    .addComponent(tf_nomorWASign)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_kodeotpDokterSign, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_passwordDokterSign))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_namaDokterSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_sipDokterSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nomorWASign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_kodeotpDokterSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_passwordDokterSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 510));

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Mask group (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_namaDokterSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaDokterSignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namaDokterSignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            try {
            // URL tujuan
            if (tf_namaDokterSign.getText().isEmpty() && tf_kodeotpDokterSign.getText().isEmpty() && tf_sipDokterSign.getText().isEmpty()
                    && tf_nomorWASign.getText().isEmpty() && tf_passwordDokterSign.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Isi Dulu Bro", "Warning!", JOptionPane.WARNING_MESSAGE);
            } else{   
                String url = "https://waotp.avrizal.my.id/api/verify-otp";

                // Mendapatkan input dari JTextField
                String userId = tf_namaDokterSign.getText(); 
                String otp = tf_kodeotpDokterSign.getText();

                String jsonBody = """
                        {
                            "userId": "%s",
                            "otp": "%s"
                        }
                        """.formatted(userId, otp);

                // Membuat HttpClient
                HttpClient client = HttpClient.newHttpClient();

                // Membuat HttpRequest (walau GET, body tetap disertakan)
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .header("Content-Type", "application/json")
                        .method("POST", HttpRequest.BodyPublishers.ofString(jsonBody)) // GET dengan body
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println("Response Code: " + response.statusCode());
                System.out.println("Response Body: " + response.body());
                if(response.statusCode() != 200){
                    JOptionPane.showMessageDialog(this, "Ada yang salah cuy", "Warning!", JOptionPane.WARNING_MESSAGE);
                } else{
                    String sql = "INSERT INTO tb_signdokter (namaDokter, sipDoklter, nomorWA, passwordDokter) VALUES (?, ?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, tf_namaDokterSign.getText());
                    ps.setString(2, tf_sipDokterSign.getText());
                    ps.setString(3, tf_nomorWASign.getText());
                    ps.setString(4, tf_passwordDokterSign.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data transaksi berhasil disimpan");
                    new loginDokter().setVisible(true);
                    dispose();
                    }
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_sipDokterSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sipDokterSignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sipDokterSignActionPerformed

    private void tf_nomorWASignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomorWASignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomorWASignActionPerformed

    private void tf_kodeotpDokterSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_kodeotpDokterSignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_kodeotpDokterSignActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            try {
            // URL tujuan
            if (tf_namaDokterSign.getText().isEmpty() && tf_kodeotpDokterSign.getText().isEmpty()
                    && tf_nomorWASign.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Isi Dulu Bro", "Warning!", JOptionPane.WARNING_MESSAGE);
            } else{   
                String url = "https://waotp.avrizal.my.id/api/generate-otp";

                // Mendapatkan input dari JTextField
                String userId = tf_namaDokterSign.getText(); 
                String phoneNumber = tf_nomorWASign.getText();

                String jsonBody = """
                        {
                            "userId": "%s",
                            "phoneNumber": "%s"
                        }
                        """.formatted(userId, phoneNumber);

                // Membuat HttpClient
                HttpClient client = HttpClient.newHttpClient();

                // Membuat HttpRequest (walau GET, body tetap disertakan)
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .header("Content-Type", "application/json")
                        .method("GET", HttpRequest.BodyPublishers.ofString(jsonBody)) // GET dengan body
                        .build();


                // Mengirim permintaan dan menerima respons
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Output respons
                System.out.println("Response Code: " + response.statusCode());
                System.out.println("Response Body: " + response.body());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tf_kodeotpDokterSign;
    private javax.swing.JTextField tf_namaDokterSign;
    private javax.swing.JTextField tf_nomorWASign;
    private javax.swing.JPasswordField tf_passwordDokterSign;
    private javax.swing.JTextField tf_sipDokterSign;
    // End of variables declaration//GEN-END:variables
}

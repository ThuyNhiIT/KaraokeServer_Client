
package gui.dialog;

import interfaceClient.NhanVienInter;
import interfaceClient.QuenMatKhauInter;
import interfaceClient.impl.NhanVienClient;
import interfaceClient.impl.QuenMatKhauClient;
//import connectDB.ConnectDB;

import javax.swing.JOptionPane;

/**
 * @author ADMIN
 */
public class DL_QuenMatKhau extends javax.swing.JDialog {

    /**
     * Creates new form DL_QuenMatKhau
     */
    public DL_QuenMatKhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(null);
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

        pnlTong = new javax.swing.JPanel();
        lblSDT = new javax.swing.JLabel();
        btnXacNhan = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        lblMKmoi = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        lblTieuDe = new javax.swing.JLabel();
        txtMKmoi = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnlTong.setBackground(new java.awt.Color(255, 255, 255));
        pnlTong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblSDT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSDT.setText("Số điện thoại");

        btnXacNhan.setBackground(new java.awt.Color(51, 204, 0));
        btnXacNhan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblMKmoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMKmoi.setText("Mật khẩu mới");

        btnHuy.setBackground(new java.awt.Color(255, 51, 51));
        btnHuy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        lblTieuDe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTieuDe.setText("QUÊN MẬT KHẨU");

        txtMKmoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlTongLayout = new javax.swing.GroupLayout(pnlTong);
        pnlTong.setLayout(pnlTongLayout);
        pnlTongLayout.setHorizontalGroup(
                pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTongLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(btnXacNhan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                        .addGroup(pnlTongLayout.createSequentialGroup()
                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTongLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblSDT)
                                                        .addComponent(lblMKmoi))
                                                .addGap(27, 27, 27)
                                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                                        .addComponent(txtMKmoi)))
                                        .addGroup(pnlTongLayout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(lblTieuDe)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTongLayout.setVerticalGroup(
                pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTongLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblTieuDe)
                                .addGap(32, 32, 32)
                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSDT)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMKmoi)
                                        .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXacNhan)
                                        .addComponent(btnHuy))
                                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
//        String soDienThoai = txtSDT.getText();
//        String matKhauMoi = hashPassword(txtMKmoi.getText());
//
//        if (SDT_tonTaiNV(soDienThoai)) {
//            updatePasswordTaiKhoan(soDienThoai, matKhauMoi);
//            System.out.println("Mật khẩu được cập nhật thành công");
//            JOptionPane.showMessageDialog(null, "Mật khẩu được cập nhật thành công !!!");
//            this.dispose();
//
//        } else {
//            System.out.println("SDT không tồn tại trong CSDL");
//            JOptionPane.showMessageDialog(null, "Số điện thoại không tồn tại !!! Vui lòng kiểm tra lại");
//        }


//        String soDienThoai = txtSDT.getText();
//        String matKhauMoi = txtMKmoi.getText();
//        QuenMatKhauInter quenMatKhauDao = new QuenMatKhauClient();
//        NhanVienInter nhanVienDao = new NhanVienClient();
//        if(nhanVienDao.SDT_tonTaiNV(soDienThoai)){
//            quenMatKhauDao.updatePasswordTaiKhoan(soDienThoai, matKhauMoi);
//            System.out.println("Mật khẩu được cập nhật thành công");
//            JOptionPane.showMessageDialog(null, "Mật khẩu được cập nhật thành công !!!");
//            this.dispose();
//        }else {
//            System.out.println("SDT không tồn tại trong CSDL");
//            JOptionPane.showMessageDialog(null, "Số điện thoại không tồn tại !!! Vui lòng kiểm tra lại");
//        }

        String soDienThoai = txtSDT.getText();
        String matKhauMoi = txtMKmoi.getText();
        QuenMatKhauInter quenMatKhauDao = new QuenMatKhauClient();
        //NhanVienInter nhanVienDao = new NhanVienClient();
        if(quenMatKhauDao.SDT_tonTaiNV(soDienThoai)){
            quenMatKhauDao.updatePasswordTaiKhoan(soDienThoai, matKhauMoi);
            System.out.println("Mật khẩu được cập nhật thành công");
            JOptionPane.showMessageDialog(null, "Mật khẩu được cập nhật thành công !!!");
            this.dispose();
        }else {
            System.out.println("SDT không tồn tại trong CSDL");
            JOptionPane.showMessageDialog(null, "Số điện thoại không tồn tại !!! Vui lòng kiểm tra lại");
        }



    }//GEN-LAST:event_btnXacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(DL_QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DL_QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DL_QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DL_QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DL_QuenMatKhau dialog = new DL_QuenMatKhau(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    //Kiem tra sdt co trong bang nhan vien khong
//    private boolean SDT_tonTaiNV(String soDienThoai) {
//        try {
//            Connection con = ConnectDB.getConnection();
//            String sql = "SELECT *FROM NhanVien WHERE SDT=?";
//            System.out.println("Xong");
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1, soDienThoai);
//            ResultSet rs = pst.executeQuery();
//            return rs.next();// true nếu sd ton tai bang nhan vien
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }

    //Update pass taikhoan
//    private void updatePasswordTaiKhoan(String soDienThoai, String matKhauMoi) {
//        try {
//            Connection conn = ConnectDB.getConnection();
//            String sql = "UPDATE TaiKhoan SET Password=? WHERE maNV IN(SELECT maNV FROM NhanVien WHERE SDT=?)";
//            System.out.println("Xong 2");
//            PreparedStatement pst = conn.prepareStatement(sql);
//
//            pst.setString(1, matKhauMoi);
//            pst.setString(2, soDienThoai);
//            pst.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }


//    private String hashPassword(String plainPassword) {
//        try {
//
//            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//            byte[] hashedBytes = messageDigest.digest(plainPassword.getBytes());
//            return Base64.getEncoder().encodeToString(hashedBytes);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel lblMKmoi;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pnlTong;
    private javax.swing.JPasswordField txtMKmoi;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}

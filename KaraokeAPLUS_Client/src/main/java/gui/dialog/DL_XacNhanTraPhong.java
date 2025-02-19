
package gui.dialog;


import gui.form.Form_QuanLyDatPhong;
import interfaceClient.ChiTietHoaDonPhongInter;
import interfaceClient.impl.ChiTietHoaDonPhongClient;

import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author HO MINH HAU
 */
public class DL_XacNhanTraPhong extends javax.swing.JDialog {

    private ChiTietHoaDonPhongInter cthdp_dao;

    public DL_XacNhanTraPhong(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cthdp_dao = new ChiTietHoaDonPhongClient();
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
        jLabel1 = new javax.swing.JLabel();
        btnYes = new gui.swing.RadiusButton();
        btnNo = new gui.swing.RadiusButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bạn có xác nhận trả phòng ?");

        btnYes.setBackground(new java.awt.Color(0, 255, 51));
        btnYes.setText("Có");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setBackground(new java.awt.Color(255, 0, 0));
        btnNo.setText("Không");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addContainerGap(22, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnNoActionPerformed


    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
//check connect
//        ConnectDB db = ConnectDB.getInstance();
//        try {
//            db.connect();
//            if (db != null) {
//                System.out.println("Connect success");
                DL_PhongDangSuDung dl = new DL_PhongDangSuDung((java.awt.Frame) SwingUtilities.getWindowAncestor(this), true);
                String maHDDSD = dl.getMaHDPDSD();
//                cthdp_dao.updateGioRa(maHDDSD,LocalDateTime.now());
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        this.dispose();
        DL_TraPhongVsThanhToan thanhToan = new DL_TraPhongVsThanhToan((java.awt.Frame) SwingUtilities.getWindowAncestor(this), true);
        thanhToan.setLocationRelativeTo(this);
        thanhToan.setVisible(true);

    }//GEN-LAST:event_btnYesActionPerformed

    /**
     * @param args the command line arguments
     */

    //</editor-fold>

    /* Create and display the dialog */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.swing.RadiusButton btnNo;
    private gui.swing.RadiusButton btnYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

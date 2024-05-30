/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.dialog;


import entity.MatHang;
import gui.form.Form_MatHang;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import interfaceClient.MatHangInter;
import interfaceClient.impl.MatHangClient;

/**
 * @author 84343
 */
public class DL_ThemMatHang extends javax.swing.JDialog {

    private MatHangInter mh_dao = new MatHangClient();
    private Form_MatHang qlmh;

    /**
     * Creates new form DL_ThemMatHang
     */
    public DL_ThemMatHang(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        mh_dao = new MatHangClient();
    }

    public String phatSinhMaMH() {
        List<MatHang> mhs = mh_dao.getalltbMatHang();
        String temp = null;

        for (MatHang mh : mhs) {
            temp = mh.getMaMH();
        }
        int count = laySoDuoi(temp);
        count++;

        String maMHang = String.format("MH%03d", count);
        return maMHang;
    }

    public int laySoDuoi(String str) {
        if (str == null) {
            return 0;
        } else {
            String numberStr = str.substring(2);//Loại bỏ kí tự "MH"
            int number = Integer.parseInt(numberStr);
            return number;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnThem = new javax.swing.JPanel();
        lblTenMH = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        txtTenMH = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnThem = new gui.swing.RadiusButton();
        btnXoaR = new gui.swing.RadiusButton();
        btnThoat = new gui.swing.RadiusButton();
        lblThemMH = new javax.swing.JLabel();
        radNhap = new javax.swing.JRadioButton();
        btnExit = new gui.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnThem.setBackground(new java.awt.Color(255, 255, 255));

        lblTenMH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTenMH.setText("Tên mặt hàng: ");

        lblGia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblGia.setText("Giá:");

        txtTenMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenMHActionPerformed(evt);
            }
        });

        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(41, 173, 86));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoaR.setBackground(new java.awt.Color(204, 204, 204));
        btnXoaR.setText("Xóa rỗng");
        btnXoaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaRActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(205, 13, 13));
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblThemMH.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblThemMH.setForeground(new java.awt.Color(41, 173, 86));
        lblThemMH.setText("THÊM MẶT HÀNG");

        radNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radNhap.setText("Nhập hàng");

        btnExit.setBackground(new java.awt.Color(255, 0, 51));
        btnExit.setBorder(null);
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("  X  ");
        btnExit.setEffectColor(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThemLayout = new javax.swing.GroupLayout(pnThem);
        pnThem.setLayout(pnThemLayout);
        pnThemLayout.setHorizontalGroup(
                pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThemLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoaR, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThemLayout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addGroup(pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThemLayout.createSequentialGroup()
                                                .addGroup(pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(pnThemLayout.createSequentialGroup()
                                                                .addComponent(lblTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtTenMH))
                                                        .addGroup(pnThemLayout.createSequentialGroup()
                                                                .addComponent(lblGia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(80, 80, 80)
                                                                .addGroup(pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(radNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(90, 90, 90))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThemLayout.createSequentialGroup()
                                                .addComponent(lblThemMH, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(148, 148, 148))
                                        .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnThemLayout.setVerticalGroup(
                pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThemLayout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblThemMH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblGia)
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radNhap)
                                .addGap(25, 25, 25)
                                .addGroup(pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenMHActionPerformed

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Thread addThread = new Thread(() -> {

            try {
                String maMH = phatSinhMaMH();
                String tenMH = txtTenMH.getText();
                Double gia = Double.parseDouble(txtGia.getText());
                Boolean tinhTrang = radNhap.isSelected();
                MatHang addMH = new MatHang(maMH, tenMH, gia, tinhTrang);
                mh_dao.addMatHang(addMH);

                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                });
            } catch (Exception ex) {
                Logger.getLogger(DL_ThemMatHang.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        addThread.start();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaRActionPerformed
        txtTenMH.setText("");
        txtGia.setText("");
        radNhap.setSelected(false);
        txtTenMH.requestFocus();
    }//GEN-LAST:event_btnXoaRActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        return;
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(DL_ThemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DL_ThemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DL_ThemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DL_ThemMatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DL_ThemMatHang dialog = new DL_ThemMatHang(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.swing.Button btnExit;
    private gui.swing.RadiusButton btnThem;
    private gui.swing.RadiusButton btnThoat;
    private gui.swing.RadiusButton btnXoaR;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblTenMH;
    private javax.swing.JLabel lblThemMH;
    private javax.swing.JPanel pnThem;
    private javax.swing.JRadioButton radNhap;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTenMH;
    // End of variables declaration//GEN-END:variables
}

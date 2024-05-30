
package gui.dialog;

/**
 * @author 84934
 */
public class DL_DangXuat extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public DL_DangXuat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        lbl_imgLogout = new javax.swing.JLabel();
        lbl_Logout = new javax.swing.JLabel();
        btnCo = new gui.swing.RadiusButton();
        btnKhong = new gui.swing.RadiusButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnlTong.setBackground(new java.awt.Color(255, 255, 255));

        lbl_imgLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-logout-96.png"))); // NOI18N

        lbl_Logout.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Logout.setText("Bạn chắc chắn muốn đăng xuất ?");

        btnCo.setBackground(new java.awt.Color(41, 173, 86));
        btnCo.setForeground(new java.awt.Color(255, 255, 255));
        btnCo.setText("Có");

        btnKhong.setBackground(new java.awt.Color(205, 13, 13));
        btnKhong.setForeground(new java.awt.Color(255, 255, 255));
        btnKhong.setText("Không");

        javax.swing.GroupLayout pnlTongLayout = new javax.swing.GroupLayout(pnlTong);
        pnlTong.setLayout(pnlTongLayout);
        pnlTongLayout.setHorizontalGroup(
                pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTongLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lbl_imgLogout)
                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTongLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlTongLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(btnCo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)
                                                .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTongLayout.setVerticalGroup(
                pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongLayout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_imgLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlTongLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(lbl_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DL_DangXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DL_DangXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DL_DangXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DL_DangXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DL_DangXuat dialog = new DL_DangXuat(new javax.swing.JFrame(), true);
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
    private gui.swing.RadiusButton btnCo;
    private gui.swing.RadiusButton btnKhong;
    private javax.swing.JLabel lbl_Logout;
    private javax.swing.JLabel lbl_imgLogout;
    private javax.swing.JPanel pnlTong;
    // End of variables declaration//GEN-END:variables
}

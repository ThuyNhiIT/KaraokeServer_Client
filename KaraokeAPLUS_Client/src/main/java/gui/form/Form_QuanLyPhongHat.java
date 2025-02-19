package gui.form;

import entity.KhachHang;
import entity.LoaiPhong;
import entity.PhongHat;
import gui.dialog.DL_ThemPhongHat;
import gui.swing.scrollbar.ScrollBarCustom;
import gui.swing.table.TableActionCellEditorPhongHat;
import gui.swing.table.TableActionCellRenderPhongHat;
import gui.swing.table.TableActionEventPhongHat;

import java.awt.Component;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import interfaceClient.LoaiPhongInter;
import interfaceClient.PhongHatInter;
import interfaceClient.impl.LoaiPhongClient;
import interfaceClient.impl.PhongHatClient;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * @author 84343
 */
public class Form_QuanLyPhongHat extends javax.swing.JPanel {

	private PhongHatInter ph_dao = new PhongHatClient();
	private LoaiPhongInter lp_dao = new LoaiPhongClient();
	private DefaultTableModel dtmPhongHat;
	private ArrayList<PhongHat> ds;

	double gia;

	public Form_QuanLyPhongHat() {
		initComponents();
		scr.getViewport().setOpaque(false);
		scr.setVerticalScrollBar(new ScrollBarCustom());

		TableActionEventPhongHat event = new TableActionEventPhongHat() {
			@Override
			public void sua(int row) {
				if (tblDSPH.getSelectedRowCount() > 0) {
					if (JOptionPane.showConfirmDialog(null, "Xác nhận sửa phòng hát đã chọn?", "Warning",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						int[] selectedRows = tblDSPH.getSelectedRows();

						Thread editThread = new Thread(() -> {
							for (int i = 0; i < selectedRows.length; i++) {
								int rowIndex = selectedRows[i];
								String maPhong = tblDSPH.getValueAt(rowIndex, 0).toString();
								String tenPhong = tblDSPH.getValueAt(rowIndex, 1).toString();
								String maLoai = tblDSPH.getValueAt(rowIndex, 2).toString();
								Double gia = Double.parseDouble(tblDSPH.getValueAt(rowIndex, 3).toString());
								String trangThai = tblDSPH.getValueAt(rowIndex, 4).toString();
								PhongHat ph = new PhongHat(maPhong, tenPhong, new LoaiPhong(maLoai), trangThai);

								if (ph_dao.editPhongHat(ph)) {
									SwingUtilities.invokeLater(() -> {
										tblDSPH.setValueAt(tenPhong, rowIndex, 1);
										tblDSPH.setValueAt(maLoai, rowIndex, 2);
										tblDSPH.setValueAt(gia, rowIndex, 3);
										tblDSPH.setValueAt(trangThai, rowIndex, 4);
										JOptionPane.showMessageDialog(null, "Sửa thành công");
									});
								} else {
									SwingUtilities.invokeLater(() -> {
										JOptionPane.showMessageDialog(null, "Sửa thất bại");
									});
								}
							}

							SwingUtilities.invokeLater(() -> {
								clearJTable();
								DocDuLieu();
							});
						});

						editThread.start();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Chọn dòng cần sửa!");
				}
			}

			@Override
			public void xoa(int row) {
				ph_dao = new PhongHatClient();
				if (tblDSPH.getSelectedRowCount() > 0) {
					if (JOptionPane.showConfirmDialog(null, "Xác nhận xóa phòng hát đã chọn?", "Warning",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						int[] selectedRows = tblDSPH.getSelectedRows();

						Thread deleteThread = new Thread(() -> {
							for (int i = selectedRows.length - 1; i >= 0; i--) {
								List<PhongHat> phs = ph_dao.getAllPhongHat();
								PhongHat ph = phs.get(selectedRows[i]);
								String maPH = ph.getMaPhong();
								ph_dao.DeletePhongHat(maPH);
							}

							SwingUtilities.invokeLater(() -> {
								clearJTable();
								DocDuLieu();
								updateTotal();
								JOptionPane.showMessageDialog(null, "Xóa thành công");
							});
						});

						deleteThread.start();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Chọn dòng cần xóa!");
				}
			}
		};
		tblDSPH.getColumnModel().getColumn(5).setCellRenderer(new TableActionCellRenderPhongHat());
		tblDSPH.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditorPhongHat(event));

		dtmPhongHat = (DefaultTableModel) tblDSPH.getModel();
		PhongHatInter PH = new PhongHatClient();
		int tongPH = PH.getTongSoPhong();
		lblTong.setText(String.valueOf(tongPH));
		DocDuLieu();
	}

	public void clearJTable() {
		while (tblDSPH.getRowCount() > 0) {
			dtmPhongHat.removeRow(0);
		}
	}

	public void DocDuLieu() {

		List<LoaiPhong> ls = lp_dao.getalltbLoaiPhong();
		// Duyệt qua danh sách dữ liệu loại phòng
		for (LoaiPhong lp : ls) {

			Double gia = lp.getGia();

			List<PhongHat> list = ph_dao.getAllPhongHat();

			for (PhongHat ph : list) {
				if (ph.getLoaiPhong().getMaLoaiPhong().equals(lp.getMaLoaiPhong())) {
					dtmPhongHat.addRow(new Object[] { ph.getMaPhong(), ph.getTenPhong(),
							ph.getLoaiPhong().getMaLoaiPhong(), gia, ph.getTinhTrangPhong() });
				}
			}
		}
	}

	public void clearDataOnModel() {
		DefaultTableModel dtm = (DefaultTableModel) tblDSPH.getModel();
		dtm.getDataVector().removeAllElements();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		pnlPhongHat = new javax.swing.JPanel();
		pnlHeader = new javax.swing.JPanel();
		pnlTim = new javax.swing.JPanel();
		lblTim = new javax.swing.JLabel();
		txtTim = new javax.swing.JTextField();
		btnTim = new gui.swing.RadiusButton();
		btnRefesh = new gui.swing.RadiusButton();
		btnThem = new gui.swing.RadiusButton();
		lblDSPH = new javax.swing.JLabel();
		scr = new javax.swing.JScrollPane();
		tblDSPH = new javax.swing.JTable();
		lblTongPhong = new javax.swing.JLabel();
		lblTong = new javax.swing.JLabel();
		btnExcel = new gui.swing.RadiusButton();

		pnlPhongHat.setBackground(new java.awt.Color(235, 249, 249));

		pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
		pnlHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		pnlTim.setBackground(new java.awt.Color(255, 255, 255));

		lblTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		lblTim.setText("Tìm kiếm");

		btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifying-glass.png"))); // NOI18N
		btnTim.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTimActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlTimLayout = new javax.swing.GroupLayout(pnlTim);
		pnlTim.setLayout(pnlTimLayout);
		pnlTimLayout.setHorizontalGroup(pnlTimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlTimLayout.createSequentialGroup().addContainerGap().addComponent(lblTim).addGap(28, 28, 28)
						.addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 295,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(80, Short.MAX_VALUE)));
		pnlTimLayout.setVerticalGroup(pnlTimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlTimLayout.createSequentialGroup().addContainerGap(15, Short.MAX_VALUE)
						.addGroup(pnlTimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								pnlTimLayout.createSequentialGroup()
										.addGroup(pnlTimLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblTim).addComponent(txtTim,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(12, 12, 12))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										pnlTimLayout.createSequentialGroup()
												.addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap()))));

		btnRefesh.setBackground(new java.awt.Color(235, 249, 249));
		btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
		btnRefesh.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnRefeshActionPerformed(evt);
			}
		});

		btnThem.setBackground(new java.awt.Color(235, 249, 249));
		btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
		btnThem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThemActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
		pnlHeader.setLayout(pnlHeaderLayout);
		pnlHeaderLayout
				.setHorizontalGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlHeaderLayout.createSequentialGroup().addGap(40, 40, 40)
								.addComponent(pnlTim, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(27, 27, 27)
								.addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(27, 27, 27)));
		pnlHeaderLayout.setVerticalGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlHeaderLayout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(pnlTim, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(22, Short.MAX_VALUE)));

		lblDSPH.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
		lblDSPH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblDSPH.setText("DANH SÁCH PHÒNG HÁT");

		tblDSPH.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã phòng", "Tên phòng", "Mã loại phòng", "Giá", "Trạng thái", "Hành động" }));
		tblDSPH.setRowHeight(40);
		tblDSPH.setSelectionBackground(new java.awt.Color(0, 169, 183));
		scr.setViewportView(tblDSPH);

		lblTongPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		lblTongPhong.setText("Tổng số phòng");

		lblTong.setText("jLabel1");

		btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Excel32.png"))); // NOI18N
		btnExcel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExcelActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlPhongHatLayout = new javax.swing.GroupLayout(pnlPhongHat);
		pnlPhongHat.setLayout(pnlPhongHatLayout);
		pnlPhongHatLayout.setHorizontalGroup(pnlPhongHatLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(
						pnlPhongHatLayout.createSequentialGroup().addContainerGap().addComponent(scr).addContainerGap())
				.addGroup(pnlPhongHatLayout.createSequentialGroup().addGap(92, 92, 92).addComponent(lblTongPhong)
						.addGap(18, 18, 18).addComponent(lblTong)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(19, 19, 19))
				.addGroup(pnlPhongHatLayout.createSequentialGroup().addGap(371, 371, 371)
						.addComponent(lblDSPH, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
						.addGap(283, 283, 283)));
		pnlPhongHatLayout.setVerticalGroup(pnlPhongHatLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlPhongHatLayout.createSequentialGroup()
						.addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(pnlPhongHatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnlPhongHatLayout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lblDSPH)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(scr, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addGroup(pnlPhongHatLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblTongPhong).addComponent(lblTong))
										.addGap(29, 29, 29))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										pnlPhongHatLayout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap()))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlPhongHat,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pnlPhongHat,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	}// </editor-fold>//GEN-END:initComponents

	private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
		DL_ThemPhongHat themPH = new DL_ThemPhongHat(
				(java.awt.Frame) SwingUtilities.getWindowAncestor((Component) evt.getSource()), true);
		themPH.setLocationRelativeTo(Form_QuanLyPhongHat.this);
		themPH.setVisible(true);
		clearDataOnModel();
		DocDuLieu();
		updateTotal();
	}// GEN-LAST:event_btnThemActionPerformed

	private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRefeshActionPerformed
		clearDataOnModel();
		DocDuLieu();
		updateTotal();
	}// GEN-LAST:event_btnRefeshActionPerformed

	private void updateTotal() {
		int total = dtmPhongHat.getRowCount();
		lblTong.setText("" + total);
	}

	private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimActionPerformed
		String maP = txtTim.getText().trim();
		if (!(maP.length() > 0)) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập mã phòng hát");
		} else {
			String maTim = txtTim.getText();
			ArrayList<PhongHat> dsPhongTim = null;
			for (PhongHat ph : ph_dao.getAllPhongHat()) {
				if (ph.getMaPhong().equals(maTim)) {
					dsPhongTim = new ArrayList<PhongHat>();
					dsPhongTim.add(ph);
				}
			}

//			}
			if (dsPhongTim != null) {
				clearDataOnModel();
				for (PhongHat ph : dsPhongTim) {
					dtmPhongHat.addRow(new Object[] { ph.getMaPhong(), ph.getTenPhong(),
							ph.getLoaiPhong().getMaLoaiPhong(), ph.getLoaiPhong().getGia(), ph.getTinhTrangPhong() });

				}
			} else if (dsPhongTim == null) {
				JOptionPane.showMessageDialog(this, "Không tìm thấy");
			} else if (dsPhongTim == null) {
				JOptionPane.showMessageDialog(this, "Không tìm thấy");
			}

		}
	}// GEN-LAST:event_btnTimActionPerformed

	private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcelActionPerformed
		try {
			writeFileExcell();
			JOptionPane.showMessageDialog(null, "Xuất thành công!");
		} catch (Exception e2) {
//            JOptionPane.showMessageDialog(null, "Lỗi hệ thống");
			e2.printStackTrace();
		} // TODO add your handling code he
	}// GEN-LAST:event_btnExcelActionPerformed

	public void writeFileExcell() throws IOException {
		FileOutputStream file = new FileOutputStream("DSPhongHat.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("name");
		XSSFRow row;
		XSSFCell cellA; // 0
		XSSFCell cellB; // 1
		XSSFCell cellC; // 2
		XSSFCell cellD; // 3
		XSSFCell cellE; // 4
		int j = 0;
		List<PhongHat> list = new ArrayList<PhongHat>();
		list = ph_dao.getAllPhongHat();
		row = sheet.createRow(j++);
		String[] headers = { "Mã phòng", "Tên phòng", "Mã loại phòng", "Giá", "Trạng thái" };
		for (int i = 0; i <= 4; i++) {
			cellA = row.createCell(i);
			cellA.setCellValue(headers[i]);
		}
		for (PhongHat c : list) {
			row = sheet.createRow(j++);

			cellA = row.createCell(0);
			cellA.setCellValue(c.getMaPhong());

			cellB = row.createCell(1);
			cellB.setCellValue(c.getTenPhong());

			cellC = row.createCell(2);
			cellC.setCellValue(c.getLoaiPhong().getMaLoaiPhong());

			cellD = row.createCell(3);
			Double gia = c.getLoaiPhong().getGia();
			if (gia != null) {
				cellD.setCellValue(gia);
			} else {
				cellD.setCellValue("");
			}
//            cellD.setCellValue(c.getLoaiPhong().getGia());

			cellE = row.createCell(4);
			cellE.setCellValue(c.getTinhTrangPhong());

		}
		workbook.write(file);
		workbook.close();
		file.close();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private gui.swing.RadiusButton btnExcel;
	private gui.swing.RadiusButton btnRefesh;
	private gui.swing.RadiusButton btnThem;
	private gui.swing.RadiusButton btnTim;
	private javax.swing.JLabel lblDSPH;
	private javax.swing.JLabel lblTim;
	private javax.swing.JLabel lblTong;
	private javax.swing.JLabel lblTongPhong;
	private javax.swing.JPanel pnlHeader;
	private javax.swing.JPanel pnlPhongHat;
	private javax.swing.JPanel pnlTim;
	private javax.swing.JScrollPane scr;
	private javax.swing.JTable tblDSPH;
	private javax.swing.JTextField txtTim;
	// End of variables declaration//GEN-END:variables
}

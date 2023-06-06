package view;

import Model.HoatDong;
import Model.Quy;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static view.EditTruyenThong.vitri;

public class AddTruyenThong extends javax.swing.JDialog {

    private TrangChu home;
    ArrayList<HoatDong> dsHDTT = new ArrayList<HoatDong>();
    Quy z;
    HoatDong tt;

    public AddTruyenThong(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (TrangChu) parent;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ThemBtn = new javax.swing.JButton();
        HuyBobtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttenSK = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        txtdiaDiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmoTa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtchiPhi = new javax.swing.JTextField();
        txtthoiGian = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SỬA SỰ KIỆN _ TRUYỀN THÔNG");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM THÊM HOẠT ĐỘNG NHÂN SỰ _ NHẬT MINH");

        ThemBtn.setText("Thêm");
        ThemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBtnActionPerformed(evt);
            }
        });

        HuyBobtn.setText("Huỷ bỏ");
        HuyBobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyBobtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên sự kiện");

        jLabel6.setText("Số lượng thành viên");

        jLabel2.setText("tham gia :");

        jLabel8.setText("Địa điểm :");

        jLabel3.setText("Mô tả:");

        jLabel4.setText("Đánh giá");

        jLabel10.setText("Chi phí:");

        jLabel9.setText("Thời gian:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("THÊM SỰ KIỆN _ TRUYỀN THÔNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(ThemBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HuyBobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txttenSK, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addComponent(txtmoTa)
                        .addComponent(txtDG))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtSL))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtthoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addComponent(txtdiaDiem)
                                .addComponent(txtchiPhi))))
                    .addContainerGap()))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HuyBobtn, ThemBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemBtn)
                    .addComponent(HuyBobtn))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(txttenSK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(txtthoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtmoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtchiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtDG)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtdiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(81, 81, 81)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HuyBobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyBobtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_HuyBobtnActionPerformed

    private void ThemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBtnActionPerformed
        // Khi nhấn vào nút này thì cập nhật dữ liệu về nhân sự vào bảng Nhân sự ở Trang Chủ
//        String ten = txttenSK.getText();
//        int soluong = Integer.parseInt(txtSL.getText());
//        String diaDiem = txtdiaDiem.getText();
//        String thoiGian = txtthoiGian.getText();
//        double chiPhi = Double.parseDouble(txtchiPhi.getText());
//        String moTa = txtmoTa.getText();
//        String danhGia = txtDG.getText();
//        String maHD;
//        String loaiHD = "Hoat dong Truyen Thong";
//            if(dsHDTT.isEmpty()){
//                maHD = "HD1";
//            }
//            else{
//                maHD = "HD" + (dsHDTT.size() + 1);
//            }
//
//        boolean flag = true;
//        if (ten.trim().length() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
//            flag = false;
//        } else if (soluong == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
//            flag = false;
//        } else if (diaDiem.trim().length() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
//            flag = false;
//        } else if (thoiGian.trim().length() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
//            flag = false;
//        } else if (chiPhi == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
//            flag = false;
//        }
//        if(flag){
//            tt = new HoatDong(maHD, ten, loaiHD, thoiGian, soluong, chiPhi, diaDiem, moTa, danhGia);
//            home.addTT(tt);
//        }
        HoatDong x = new HoatDong();
        try {
            if(dsHDTT.isEmpty()){
                x.setMaHD("HD1");
            }
            else{
                String ma = "HD" + (dsHDTT.size() + 1);
                x.setMaHD(ma);
            }
            x.setTenHD(txttenSK.getText());
            x.setLoaiHD("Hoat dong dao tao");
            x.setDiaDiem(txtdiaDiem.getText());
            x.setThoiGian(txtthoiGian.getText());
            x.setMoTa(txtmoTa.getText());
            x.setSoThanhVien(Integer.parseInt(txtSL.getText()));
            x.setKinhPhi(Double.parseDouble(txtchiPhi.getText()));
            x.setDanhGia(txtDG.getText());
            //z.tongQuy -= Double.parseDouble(txtKinhPhi.getText());
            home.addHD(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_ThemBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AddTruyenThong dialog = new AddTruyenThong(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HuyBobtn;
    private javax.swing.JButton ThemBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDG;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtchiPhi;
    private javax.swing.JTextField txtdiaDiem;
    private javax.swing.JTextField txtmoTa;
    private javax.swing.JTextField txttenSK;
    private javax.swing.JTextField txtthoiGian;
    // End of variables declaration//GEN-END:variables
}

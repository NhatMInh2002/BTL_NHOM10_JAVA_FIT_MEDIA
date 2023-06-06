package view;

import Model.HoatDong;
import javax.swing.JOptionPane;

public class AddTruyenThong extends javax.swing.JDialog {

    private final TrangChu home;

    public AddTruyenThong(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (TrangChu) parent;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttenTV = new javax.swing.JTextField();
        txtmoTa = new javax.swing.JTextField();
        txtdanhGia = new javax.swing.JTextField();
        txtSLTV = new javax.swing.JTextField();
        txtdiaDiem = new javax.swing.JTextField();
        txtthoiGian = new javax.swing.JTextField();
        txtchiPhi = new javax.swing.JTextField();
        ThemBtn = new javax.swing.JButton();
        HuyBobtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("tham gia :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM THÊM");

        jLabel1.setText("Tên sự kiện:");

        jLabel3.setText("Mô tả:");

        jLabel4.setText("Đánh giá:");

        jLabel6.setText("Số lượng thành viên");

        jLabel8.setText("Địa điểm :");

        jLabel9.setText("Thời gian:");

        jLabel10.setText("Chi phí:");

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

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("THÊM MỚI SỰ KIỆN - TRUYỀN THÔNG");

        jLabel5.setText("tham gia :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttenTV, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtmoTa)
                            .addComponent(txtdanhGia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtSLTV, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HuyBobtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdiaDiem, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtthoiGian, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtchiPhi, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(ThemBtn)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSLTV, txtchiPhi, txtdiaDiem, txtthoiGian});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txttenTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSLTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(txtdiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtthoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtmoTa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdanhGia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtchiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemBtn)
                    .addComponent(HuyBobtn))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HuyBobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyBobtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_HuyBobtnActionPerformed

    private void ThemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBtnActionPerformed
        // Khi nhấn vào nút này thì cập nhật dữ liệu về nhân sự vào bảng Nhân sự ở Trang Chủ
        String ten = txtSLTV.getText();
        String soluong = txtSLTV.getText();
        String diaDiem = txtdiaDiem.getText();
        String thoiGian = txtthoiGian.getText();
        String chiPhi = txtchiPhi.getText();
        String moTa = txtmoTa.getText();
        String danhGia = txtdanhGia.getText();

        boolean flag = true;
        if (ten.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
            flag = false;
        } else if (soluong.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
            flag = false;
        } else if (diaDiem.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
            flag = false;
        } else if (thoiGian.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
            flag = false;
        } else if (chiPhi.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Phần này không được để trống");
            flag = false;
        }
        if (flag) {
//            HoatDong hd= new HoatDong(ma, ten, khoa, chuyenNghanh, ban, ngay, gioiTinh, gmail, sdt, chucDanh);
            
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtSLTV;
    private javax.swing.JTextField txtchiPhi;
    private javax.swing.JTextField txtdanhGia;
    private javax.swing.JTextField txtdiaDiem;
    private javax.swing.JTextField txtmoTa;
    private javax.swing.JTextField txttenTV;
    private javax.swing.JTextField txtthoiGian;
    // End of variables declaration//GEN-END:variables
}

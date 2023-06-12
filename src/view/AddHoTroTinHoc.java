package view;

import Model.HoatDong;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddHoTroTinHoc extends javax.swing.JDialog {

    private TrangChu home;

    public AddHoTroTinHoc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (TrangChu) parent;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenHoatDong = new javax.swing.JTextField();
        txtLoaiHoatDong = new javax.swing.JTextField();
        txtThoiGian = new javax.swing.JTextField();
        txtDiaDiem = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        txtSoLuongThanhVien = new javax.swing.JTextField();
        txtChiPhi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Tên hoạt động :");

        jLabel2.setText("Loại hoạt động:");

        jLabel3.setText("Thời gian:");

        jLabel4.setText("Địa điểm:");

        jLabel5.setText("Mô tả :");

        jLabel6.setText("Số lượng thành viên:");

        jLabel7.setText("Chí phí :");

        txtTenHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenHoatDongActionPerformed(evt);
            }
        });

        jButton1.setText("Hoàn tất ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Huỷ bỏ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLoaiHoatDong, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtTenHoatDong)
                            .addComponent(txtThoiGian)
                            .addComponent(txtDiaDiem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtSoLuongThanhVien)
                    .addComponent(txtChiPhi))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jButton2)
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtTenHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtLoaiHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<HoatDong> dsHoatDongHoTroTinHoc = new ArrayList<HoatDong>();
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTenHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenHoatDongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenHoatDongActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String thoigian;
        HoatDong x = new HoatDong();          
        try {
            String pattern = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
            String partern2 =".*[0-9].*"; 
            //int maxLength = 30;
            boolean isOk = true;
            if(dsHoatDongHoTroTinHoc.isEmpty()){
                x.setMaHD("HD1");
            }
            else{
                String ma = "HDTH" + (dsHoatDongHoTroTinHoc.size() + 1);
                x.setMaHD(ma);
            }
            
            if (txtTenHoatDong.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống tên hoạt động!");
            isOk = false;
            }
            else
            {
                x.setTenHD(txtTenHoatDong.getText());
            }
            
            if(isOk)
            if (txtLoaiHoatDong.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống loại hoạt động!");
            isOk = false;
            }
            else
            {
                 x.setLoaiHD(txtLoaiHoatDong.getText());
            }
            
            if(isOk)
            if (txtThoiGian.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống thời gian!");
            isOk = false;
            }
            else
                if(!txtThoiGian.getText().matches(pattern))
                {
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng ghi đúng thời gian!(vi du: 10/03/2022)");
                    isOk = false;
                }
            else
            {
                x.setThoiGian(txtThoiGian.getText());
            }
            
            if(isOk)
            if (txtDiaDiem.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống địa điểm!");
            isOk = false;
            }
            else
            {
                x.setDiaDiem(txtDiaDiem.getText());
            }
            
            if(isOk)
            if (txtMoTa.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống mô tả!");
            isOk = false;
            }
            else
            {
                x.setMoTa(txtMoTa.getText());
            }
            
            if(isOk)
            if (txtSoLuongThanhVien.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống số lượng thành viên!");
            isOk = false;
            }
            else
            if(!(txtSoLuongThanhVien.getText().matches(partern2))){
                JOptionPane.showMessageDialog(rootPane, "Số lượng thành viên phải là số!");
                isOk = false;
            }         
            
            if(isOk)
            {
                x.setSoThanhVien(Integer.parseInt(txtSoLuongThanhVien.getText()));
            }
            
            if(isOk)
            if (txtChiPhi.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống chi phí!");
            isOk = false;
            }
            else
            if(!(txtChiPhi.getText().matches(partern2))){
                JOptionPane.showMessageDialog(rootPane, "Chi phi phai la số!");
                isOk = false;
            }  
            else{
                x.setKinhPhi(Double.parseDouble(txtChiPhi.getText()));
            }
            //z.tongQuy -= Double.parseDouble(txtChiPhi.getText());
            if(isOk)
            {
                home.addHDHoTroTinHoc(x);
                JOptionPane.showMessageDialog(rootPane, "Them thanh cong!");
                //xoa thong tin sau khi them
                txtTenHoatDong.setText("");
                txtMoTa.setText("");
                txtLoaiHoatDong.setText("");
                txtSoLuongThanhVien.setText("");
                txtThoiGian.setText("");
                txtDiaDiem.setText("");
                txtChiPhi.setText("");
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddHoTroTinHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddHoTroTinHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddHoTroTinHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddHoTroTinHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddHoTroTinHoc dialog = new AddHoTroTinHoc(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtChiPhi;
    private javax.swing.JTextField txtDiaDiem;
    private javax.swing.JTextField txtLoaiHoatDong;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSoLuongThanhVien;
    private javax.swing.JTextField txtTenHoatDong;
    private javax.swing.JTextField txtThoiGian;
    // End of variables declaration//GEN-END:variables
}

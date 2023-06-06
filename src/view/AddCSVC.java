package view;

import Model.CoSoVC;
import Model.Quy;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddCSVC extends javax.swing.JDialog {
    
    private TrangChu home;
    
    ArrayList<CoSoVC> dsCSVC = new ArrayList<CoSoVC>();
    Quy z;

    public AddCSVC(java.awt.Frame parent, boolean modal) {
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
        txtMaThietBi = new javax.swing.JTextField();
        txtTenThietBi = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtChiPhi = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mã thiết bị:");

        jLabel2.setText("Tên thiết bị:");

        jLabel3.setText("Trạng thái :");

        jLabel4.setText("Số lượng:");

        jLabel5.setText("Chí phí:");

        btnAdd.setText("Hoàn tất");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnHuy.setText("Huỷ bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChiPhi, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtSoLuong)
                            .addComponent(txtTrangThai)
                            .addComponent(txtTenThietBi)
                            .addComponent(txtMaThietBi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnAdd)
                        .addGap(93, 93, 93)
                        .addComponent(btnHuy)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTenThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnHuy))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        CoSoVC x = new CoSoVC();          
        try {
            x.setMaCSVC(txtMaThietBi.getText());
            x.setTenCSVC(txtTenThietBi.getText());
            x.setTrangThai(txtTrangThai.getText());
            x.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
            x.setChiPhi(Double.parseDouble(txtChiPhi.getText()));
            //z.tongQuy -= Double.parseDouble(txtChiPhi.getText());
            home.addCSVC(x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
//        String ma = txtMaThietBi.getText();
//        String ten =txtTenThietBi.getText();
//        String trangThai = txtTrangThai.getText();
//        int so = Integer.parseInt(txtSoLuong.getText());
//        double gia = Double.parseDouble(txtChiPhi.getText());
//        boolean kiemtra=true;
//        // tự bắt lỗi tiếp các thuộc tính khác
//        if(ma.trim().length()==0){
//            JOptionPane.showMessageDialog(this, "Không được để trống mã");
//            kiemtra=false;
//        }
//        if(kiemtra){
//            CoSoVC csvc = new CoSoVC(ma, ten, trangThai, so, gia);
//            home.addCSVC(csvc);
//        }
    }//GEN-LAST:event_btnAddActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCSVC dialog = new AddCSVC(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtChiPhi;
    private javax.swing.JTextField txtMaThietBi;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenThietBi;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}

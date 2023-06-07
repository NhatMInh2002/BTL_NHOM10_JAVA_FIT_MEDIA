package view;

import Model.CoSoVC;
import Model.HoatDong;
import Model.ThanhVien;
import controller.ControllerImp;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends javax.swing.JFrame implements View {

    private List<ThanhVien> listTV;
    private List<CoSoVC> listCSVC;
    private List<HoatDong> listHD;
    private List<HoatDong> listHDTT;

    private controller.ControllerImp controller;
    private int indexThanhVien;

    private final DefaultTableModel modelTV;
    private final DefaultTableModel modelCSVC;
    private final DefaultTableModel modelHDDT;
    private final DefaultTableModel modelHDTT;

    private List<HoatDong> listHDHoTroTinHoc;
    private final DefaultTableModel modelHDHoTroTinHoc;
    
    public TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        listTV = new ArrayList<>();
        modelTV = (DefaultTableModel) tblThanhVien.getModel();
        this.setTitle("Trang chủ");
        loadDataFromFile("TV.txt");
        listCSVC = new ArrayList<>();
        listHD = new ArrayList<>();
        listHDTT = new ArrayList<>();
        listHDHoTroTinHoc= new ArrayList<>();
        modelCSVC = (DefaultTableModel) tblCSVC.getModel();
        modelHDDT = (DefaultTableModel) tblHDDT.getModel();
        modelHDTT = (DefaultTableModel) tblTT.getModel();
        modelHDHoTroTinHoc= (DefaultTableModel) tblHoTroTinHoc.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThanhVien = new javax.swing.JTable();
        btnThemTV = new javax.swing.JButton();
        btnSuaThanhVien = new javax.swing.JButton();
        btnXoaThanhVien = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTongThanhVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCSVC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        themCSVC = new javax.swing.JButton();
        suaCSVC = new javax.swing.JButton();
        xoaCSVC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHDDT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtThanhVienHDDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtChiPhiHDDT = new javax.swing.JTextField();
        themDT = new javax.swing.JButton();
        suaDT = new javax.swing.JButton();
        xoaDT = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblHoTroTinHoc = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        addHDHTTH = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTongThanhVienTT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTongChiPhiTT = new javax.swing.JTextField();
        themTT = new javax.swing.JButton();
        suaTT = new javax.swing.JButton();
        xoaTT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        tblThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã TV", "Tên TV", "Khoá", "Chuyên Nghành", "Ban", "Ngày sinh", "Giới tính", "Email", "SĐT", "Chức vụ"
            }
        ));
        jScrollPane2.setViewportView(tblThanhVien);

        btnThemTV.setText("Thêm");
        btnThemTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTVActionPerformed(evt);
            }
        });

        btnSuaThanhVien.setText("Sửa");
        btnSuaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThanhVienActionPerformed(evt);
            }
        });

        btnXoaThanhVien.setText("Xoá");
        btnXoaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThanhVienActionPerformed(evt);
            }
        });

        jLabel18.setText("Tổng số lượng thành viên :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("QUẢN LÍ THÀNH VIÊN CLB FIT-MEDIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(btnThemTV)
                                .addGap(119, 119, 119)
                                .addComponent(btnSuaThanhVien)
                                .addGap(166, 166, 166)
                                .addComponent(btnXoaThanhVien))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel10)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTV)
                    .addComponent(btnXoaThanhVien)
                    .addComponent(btnSuaThanhVien))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Thành Viên", jPanel1);

        tblCSVC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thiết bị", "Tên thiết bị", "Trạng thái", "Số lượng", "Chi Phí CSVC"
            }
        ));
        jScrollPane5.setViewportView(tblCSVC);

        jLabel5.setText("Tổng số lượng thiết bị:");

        jLabel6.setText("Tổng chi phí:");

        themCSVC.setText("Thêm");
        themCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themCSVCActionPerformed(evt);
            }
        });

        suaCSVC.setText("Sửa");
        suaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaCSVCActionPerformed(evt);
            }
        });

        xoaCSVC.setText("Xoá");
        xoaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaCSVCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(290, 290, 290)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(themCSVC)
                                .addGap(116, 116, 116)
                                .addComponent(suaCSVC)
                                .addGap(149, 149, 149)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xoaCSVC)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themCSVC)
                    .addComponent(suaCSVC)
                    .addComponent(xoaCSVC))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Cơ Sở Vật Chất", jPanel2);

        tblHDDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hoạt động", "Thời gian", "Địa điểm", "Mô tả ", "Số lượng thành viên", "Kinh Phí"
            }
        ));
        jScrollPane4.setViewportView(tblHDDT);

        jLabel3.setText("Tổng số lượng thành viên :");

        txtThanhVienHDDT.setText("jTextField3");

        jLabel4.setText("Tổng chi phí:");

        txtChiPhiHDDT.setText("jTextField4");

        themDT.setText("Thêm");
        themDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themDTActionPerformed(evt);
            }
        });

        suaDT.setText("Sửa");
        suaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaDTActionPerformed(evt);
            }
        });

        xoaDT.setText("Xoá");
        xoaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(themDT)
                        .addGap(108, 108, 108)
                        .addComponent(suaDT)
                        .addGap(134, 134, 134)
                        .addComponent(xoaDT))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(30, 30, 30)
                .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themDT)
                    .addComponent(suaDT)
                    .addComponent(xoaDT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Đào Tạo", jPanel3);

        tblHoTroTinHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hoạt động", "Loại hoạt động", "Thời gian", "Địa điểm", "Mô tả", "Số lượng TV", "Chi phí"
            }
        ));
        jScrollPane6.setViewportView(tblHoTroTinHoc);

        jLabel7.setText("Tổng số thành viên :");

        jLabel9.setText("Tổng chi phí:");

        addHDHTTH.setText("Thêm");
        addHDHTTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHDHTTHActionPerformed(evt);
            }
        });

        jButton18.setText("Sửa ");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Xoá");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(addHDHTTH)
                        .addGap(102, 102, 102)
                        .addComponent(jButton18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton19))
                .addGap(136, 136, 136))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHDHTTH)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Hỗ Trợ Tin Học", jPanel4);

        tblTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sự kiện", "Đánh giá", "Mô tả", "Số lượng thành viên", "Địa điểm", "Thời gian ", "Chi Phí"
            }
        ));
        jScrollPane3.setViewportView(tblTT);

        jLabel1.setText("Tổng thành viên :");

        jLabel2.setText("Tổng chi phí :");

        themTT.setText("Thêm");
        themTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themTTActionPerformed(evt);
            }
        });

        suaTT.setText("Sửa");
        suaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaTTActionPerformed(evt);
            }
        });

        xoaTT.setText("Xoá");
        xoaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongChiPhiTT, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(themTT)
                .addGap(128, 128, 128)
                .addComponent(suaTT)
                .addGap(132, 132, 132)
                .addComponent(xoaTT)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTongChiPhiTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themTT)
                    .addComponent(xoaTT)
                    .addComponent(suaTT))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Truyền Thông", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themCSVCActionPerformed
        // TODO add your handling code here:
        new AddCSVC(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themCSVCActionPerformed

    private void btnThemTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTVActionPerformed
        // TODO add your handling code here:

        new AddThanhVien(this, rootPaneCheckingEnabled).setVisible(true);

    }//GEN-LAST:event_btnThemTVActionPerformed

    private void themDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themDTActionPerformed
        // TODO add your handling code here:
        new AddDaoTao(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themDTActionPerformed

    private void addHDHTTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHDHTTHActionPerformed
        // TODO add your handling code here:
        new AddHoTroTinHoc(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_addHDHTTHActionPerformed

    private void themTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themTTActionPerformed
        // TODO add your handling code here:
        new AddTruyenThong(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themTTActionPerformed

    private void btnSuaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThanhVienActionPerformed
        // TODO add your handling code here:
        indexThanhVien = tblThanhVien.getSelectedRow();
        if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy nhập thêm thành viên");
        } else if (indexThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy chọn thành viên rồi chỉnh sửa !");
        } else {
            EditThanhVien editTV = new EditThanhVien(this, rootPaneCheckingEnabled);
            editTV.setEditData(listTV.get(indexThanhVien));
            editTV.setVisible(true);
        }

    }//GEN-LAST:event_btnSuaThanhVienActionPerformed

    private void suaCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        new EditCSVC(this, rootPaneCheckingEnabled, vitri).setVisible(true);
    }//GEN-LAST:event_suaCSVCActionPerformed

    private void suaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        new EditDaoTao(this, rootPaneCheckingEnabled, vitri).setVisible(true);
    }//GEN-LAST:event_suaDTActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        int vitri = tblHoTroTinHoc.getSelectedRow();
        new EditHoTroTinHoc(this, rootPaneCheckingEnabled,vitri).setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void suaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        if (listHDTT.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm sự kiện");
        } else if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 hàng rồi chỉnh sửa !");
        } else {
            new EditTruyenThong(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
    }//GEN-LAST:event_suaTTActionPerformed

    private void btnXoaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThanhVienActionPerformed
        // TODO add your handling code here:
        int removeThanhVien = tblThanhVien.getSelectedRow();
        if (removeThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
        } else {
            listTV.remove(removeThanhVien);
            controller.writeDataToFile(listTV, "TV.txt");
            showDataThanhVien();
        }
    }//GEN-LAST:event_btnXoaThanhVienActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if (jTabbedPane1.getSelectedIndex() == 1) {
            layFileCSVC();
            showDataCSVC(listCSVC, modelCSVC);
        }
        if (jTabbedPane1.getSelectedIndex() == 2) {
            layFileHD();
            showDataHDDT(listHD, modelHDDT);
        }
        if (jTabbedPane1.getSelectedIndex() == 4) {
            LayFileTT();
            showDataTruyenThong(listHDTT, modelHDTT);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void xoaCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        listCSVC.remove(vitri);
        showDataCSVC(listCSVC, modelCSVC);
        luuFile(listCSVC);
    }//GEN-LAST:event_xoaCSVCActionPerformed

    private void xoaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        listHD.remove(vitri);
        showDataHDDT(listHD, modelHDDT);
        luuFileHD(listHD);
    }//GEN-LAST:event_xoaDTActionPerformed

    private void xoaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        listHDTT.remove(vitri);
        showDataTruyenThong(listHDTT, modelHDTT);
        luuFileHDTT(listHDTT);
    }//GEN-LAST:event_xoaTTActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        int vitri = tblHoTroTinHoc.getSelectedRow();
        listHDHoTroTinHoc.remove(vitri);
        showDataHDHT(listHDHoTroTinHoc, modelHDHoTroTinHoc);
        luuFile(listHDHoTroTinHoc);
    }//GEN-LAST:event_jButton19ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHDHTTH;
    private javax.swing.JButton btnSuaThanhVien;
    private javax.swing.JButton btnThemTV;
    private javax.swing.JButton btnXoaThanhVien;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton suaCSVC;
    private javax.swing.JButton suaDT;
    private javax.swing.JButton suaTT;
    private javax.swing.JTable tblCSVC;
    private javax.swing.JTable tblHDDT;
    private javax.swing.JTable tblHoTroTinHoc;
    private javax.swing.JTable tblTT;
    private javax.swing.JTable tblThanhVien;
    private javax.swing.JButton themCSVC;
    private javax.swing.JButton themDT;
    private javax.swing.JButton themTT;
    private javax.swing.JTextField txtChiPhiHDDT;
    private javax.swing.JTextField txtThanhVienHDDT;
    private javax.swing.JTextField txtTongChiPhiTT;
    private javax.swing.JTextField txtTongThanhVien;
    private javax.swing.JTextField txtTongThanhVienTT;
    private javax.swing.JButton xoaCSVC;
    private javax.swing.JButton xoaDT;
    private javax.swing.JButton xoaTT;
    // End of variables declaration//GEN-END:variables

    //luong
    public void addHDHoTroTinHoc(HoatDong hd){
        layFileHDHT();
        listHDHoTroTinHoc.add(hd);
        showDataHDHT(listHDHoTroTinHoc, modelHDHoTroTinHoc);
        luuFileHDHT(listHDHoTroTinHoc);
    }
    public void editHDHoTroTinHoc(HoatDong hd, int vt){
        listHDHoTroTinHoc.set(vt, hd);
        showDataHDHT(listHDHoTroTinHoc, modelHDHoTroTinHoc);
        luuFileHDHT(listHDHoTroTinHoc);
    }
    
    
    private void showDataThanhVien() {
        modelTV.setRowCount(0);
        for (ThanhVien tv : listTV) {
            modelTV.addRow(new Object[]{
                tv.getMaTV(), tv.getTenTV(), tv.getKhoa(), tv.getChuyenNghanh(), tv.getBan(),
                tv.getNgaySinh(), tv.getGioiTinh(), tv.getEmail(), tv.getSdt(), tv.getChucDanh()
            });
        }
    }

    public void addThanhVien(ThanhVien t) {
        listTV.add(t);
        controller.writeDataToFile(listTV, "TV.txt");
        showDataThanhVien();
    }

    public void addCSVC(CoSoVC cs) {
        layFileCSVC();
        listCSVC.add(cs);
        showDataCSVC(listCSVC, modelCSVC);
        luuFile(listCSVC);
    }

    public void addHD(HoatDong a) {
        layFileHD();
        listHD.add(a);
        showDataHDDT(listHD, modelHDDT);
        luuFileHD(listHD);
    }

    public void addTT(HoatDong tt) {
        LayFileTT();
        listHDTT.add(tt);
        luuFileHDTT(listHDTT);
        showDataTruyenThong(listHDTT, modelHDTT);
    }

    void updateThanhVien(ThanhVien tv) {
        listTV.remove(indexThanhVien);
        this.addThanhVien(tv);
    }

    public void editCSVC(CoSoVC cs, int vt) {
        listCSVC.set(vt, cs);
        showDataCSVC(listCSVC, modelCSVC);
        luuFile(listCSVC);
    }

    public void editHD(HoatDong a, int vt) {
        listHD.set(vt, a);
        showDataHDDT(listHD, modelHDDT);
        luuFileHD(listHD);
    }

    public void editHDTT(HoatDong tt, int vt) {
        listHDTT.set(vt, tt);
        showDataTruyenThong(listHDTT, modelHDTT);
        luuFileHDTT(listHDTT);
    }

    private void loadDataFromFile(String fileName) {
        controller = new ControllerImp();
        listTV = controller.readDataFromFile(fileName);
        showDataThanhVien();
    }

    //luong
    public void layFileHDHT(){
        FileInputStream fi;
        ObjectInputStream in;
        try{
            fi = new FileInputStream("hotrotinhoc.txt");
            in = new ObjectInputStream(fi);
            listHDHoTroTinHoc = (ArrayList<HoatDong>)in.readObject();
            fi.close();
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void luuFileHDHT(List l){
        FileOutputStream fo;
        ObjectOutputStream out;
        try{
            fo = new FileOutputStream("hotrotinhoc.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(l);
            out.close();
            fo.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void layFileCSVC() {
        FileInputStream fi;
        ObjectInputStream in;
        try {
            fi = new FileInputStream("csvc.txt");
            in = new ObjectInputStream(fi);
            listCSVC = (ArrayList<CoSoVC>) in.readObject();
            fi.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void layFileHD() {
        FileInputStream fi;
        ObjectInputStream in;
        try {
            fi = new FileInputStream("hd.txt");
            in = new ObjectInputStream(fi);
            listHD = (ArrayList<HoatDong>) in.readObject();
            fi.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void LayFileTT() {
        FileInputStream fi;
        ObjectInputStream in;
        try {
            fi = new FileInputStream("hdTruyenThong.txt");
            in = new ObjectInputStream(fi);
            listHDTT = (ArrayList<HoatDong>) in.readObject();
            fi.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void luuFile(List l) {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("csvc.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(l);
            out.close();
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void luuFileHD(List l) {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("hd.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(l);
            out.close();
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void luuFileHDTT(List tt) {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("hdTruyenThong.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(tt);
            out.close();
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public <T> void showDataThanhVien(List<T> list, DefaultTableModel model) {

    }

    @Override
    public <T> void showDataCSVC(List<T> list, DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (T t : list) {
            if (t instanceof CoSoVC) {
                CoSoVC cs = (CoSoVC) t;
                model.addRow(new Object[]{
                    cs.getMaCSVC(), cs.getTenCSVC(), cs.getTrangThai(), cs.getSoLuong(), cs.getChiPhi()
                });
            }
        }
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listCSVC) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + TongChiPhi);
    }

    @Override
    public <T> void showDataHDDT(List<T> list, DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (T t : list) {
            if (t instanceof HoatDong) {
                HoatDong z = (HoatDong) t;
                if (z.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                    model.addRow(new Object[]{
                        z.getTenHD(), z.getThoiGian(), z.getDiaDiem(), z.getMoTa(), z.getSoThanhVien(), z.getKinhPhi()
                    });
                }
            }
        }
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHD) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + TongChiPhi);
    }

    @Override
    public <T> void showDataTruyenThong(List<T> list, DefaultTableModel model) {
        model.setRowCount(0); // Xóa tất cả các dòng trong mô hình
        model.fireTableDataChanged();
        for (T t : list) {
            if (t instanceof HoatDong) {
                HoatDong a = (HoatDong) t;
                if (a.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                    model.addRow(new Object[]{
                        a.getTenHD(), a.getDanhGia(), a.getMoTa(), a.getSoThanhVien(), a.getDiaDiem(), a.getThoiGian(), a.getKinhPhi()
                    });
                }
            }
        }
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHDTT) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtTongThanhVienTT.setText(String.valueOf(SoThanhVien));
        txtTongChiPhiTT.setText(String.valueOf(TongChiPhi));
    }

    //luong
    @Override
    public <T> void showDataHDHT(List<T> list, DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (T t : list) {
            if (t instanceof HoatDong) {
                HoatDong hd = (HoatDong) t;
                model.addRow(new Object[]{
                    hd.getTenHD(), hd.getLoaiHD(), hd.getThoiGian(), hd.getDiaDiem(), hd.getMoTa(),hd.getSoThanhVien(),hd.getKinhPhi()
                });
            }
        }
        int SoLuonghd = 0;
        double TongChiPhi = 0;
        for(var x : listHDHoTroTinHoc){
            SoLuonghd += x.getSoThanhVien();
            TongChiPhi += x.getKinhPhi();
        }
        jTextField7.setText("" + SoLuonghd);
        jTextField8.setText("" + TongChiPhi);
    }
    
}

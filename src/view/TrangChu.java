package view;

import Model.CoSoVC;
import Model.HoatDong;
import java.util.ArrayList;
import java.io.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends javax.swing.JFrame implements View {

    private List<CoSoVC> listCSVC;
    private List<HoatDong> listHD;
    private DefaultTableModel modelCSVC;
    private DefaultTableModel modelHDDT;

    public TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        listCSVC = new ArrayList<>();
        listHD = new ArrayList<>();
        modelCSVC = (DefaultTableModel) tblCSVC.getModel();
        modelHDDT = (DefaultTableModel) tblHDDT.getModel();
    }
    public void addCSVC(CoSoVC cs){
        layFileCSVC();
        listCSVC.add(cs);
        showDataCSVC(listCSVC, modelCSVC);
        luuFile(listCSVC);
    }
    public void editCSVC(CoSoVC cs, int vt){
        listCSVC.set(vt, cs);
        showDataCSVC(listCSVC, modelCSVC);
        luuFile(listCSVC);
    }
    public void addHD(HoatDong a){
        layFileHD();
        listHD.add(a);
        showDataHDDT(listHD, modelHDDT);
        luuFileHD(listHD);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnThemTV = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCSVC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        btnThemCSVC = new javax.swing.JButton();
        editCSVC = new javax.swing.JButton();
        btnxoaCSVC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHDDT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtThanhVienHDDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtChiPhiHDDT = new javax.swing.JTextField();
        btnThemHDDT = new javax.swing.JButton();
        btnSuaHDDT = new javax.swing.JButton();
        btnXoaHDDT = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã TV", "Tên TV", "Khoá", "Chuyên Nghành", "Ngày Sinh", "Gmail", "SĐT", "Giới Tính", "Chức Danh", "Ban"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnThemTV.setText("Thêm");
        btnThemTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTVActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xoá");

        jLabel18.setText("Tổng số lượng thành viên :");

        jTextField24.setText("jTextField24");

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
                                .addComponent(jButton2)
                                .addGap(166, 166, 166)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)))
                        .addGap(0, 350, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTV)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
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

        jTextField5.setText("jTextField5");

        jLabel6.setText("Tổng chi phí:");

        jTextField6.setText("jTextField6");

        btnThemCSVC.setText("Thêm");
        btnThemCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCSVCActionPerformed(evt);
            }
        });

        editCSVC.setText("Sửa");
        editCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCSVCActionPerformed(evt);
            }
        });

        btnxoaCSVC.setText("Xoá");
        btnxoaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaCSVCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThemCSVC)
                        .addGap(116, 116, 116)
                        .addComponent(editCSVC)
                        .addGap(149, 149, 149)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnxoaCSVC)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCSVC)
                    .addComponent(editCSVC)
                    .addComponent(btnxoaCSVC))
                .addGap(52, 52, 52))
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

        jLabel4.setText("Tổng chi phí:");

        btnThemHDDT.setText("Thêm");
        btnThemHDDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHDDTActionPerformed(evt);
            }
        });

        btnSuaHDDT.setText("Sửa");
        btnSuaHDDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaHDDTActionPerformed(evt);
            }
        });

        btnXoaHDDT.setText("Xoá");
        btnXoaHDDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHDDTActionPerformed(evt);
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
                        .addComponent(btnThemHDDT)
                        .addGap(108, 108, 108)
                        .addComponent(btnSuaHDDT)
                        .addGap(134, 134, 134)
                        .addComponent(btnXoaHDDT))
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
                    .addComponent(btnThemHDDT)
                    .addComponent(btnSuaHDDT)
                    .addComponent(btnXoaHDDT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Đào Tạo", jPanel3);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên sự kiện", "Số thành viên tham gia", "Địa điểm", "Thời gian sự kiện", "Chi phí", "Mô tả ", "Đánh giá"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setText("Tổng thành viên :");

        jTextField1.setText("jTextField1");

        jLabel2.setText("Tổng chi phí :");

        jTextField2.setText("jTextField2");

        jButton4.setText("Thêm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sửa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Xoá");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jButton4)
                .addGap(128, 128, 128)
                .addComponent(jButton5)
                .addGap(132, 132, 132)
                .addComponent(jButton6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Nhân Sự", jPanel5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên hoạt động", "Loại hoạt động", "Thời gian", "Địa điểm", "Mô tả", "Số lượng TV", "Chi phí"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jLabel7.setText("Tổng số thành viên :");

        jTextField7.setText("jTextField7");

        jLabel9.setText("Tổng chi phí:");

        jTextField8.setText("jTextField8");

        jButton17.setText("Thêm");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Sửa ");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Xoá");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton17)
                        .addGap(102, 102, 102)
                        .addComponent(jButton18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton19))
                .addGap(136, 136, 136))
            .addComponent(jScrollPane6)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Quản Lý HĐ Hỗ Trợ Tin Học", jPanel4);

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnThemCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCSVCActionPerformed
        new AddCSVC(this, rootPaneCheckingEnabled).setVisible(true);

    }//GEN-LAST:event_btnThemCSVCActionPerformed

    private void btnThemTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTVActionPerformed
        new AddThanhVien(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnThemTVActionPerformed

    private void btnThemHDDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHDDTActionPerformed
        new AddDaoTao(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnThemHDDTActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        new AddHoTroTinHoc(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new AddTruyenThong(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new EditThanhVien(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        new EditCSVC(this, rootPaneCheckingEnabled, vitri).setVisible(true);
    }//GEN-LAST:event_editCSVCActionPerformed

    private void btnSuaHDDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaHDDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        new EditDaoTao(this, rootPaneCheckingEnabled, vitri).setVisible(true);
    }//GEN-LAST:event_btnSuaHDDTActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        new EditHoTroTinHoc(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new EditNhanSu(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnxoaCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        listCSVC.remove(vitri);
        showDataCSVC(listCSVC, modelCSVC);
        luuFile(listCSVC);
    }//GEN-LAST:event_btnxoaCSVCActionPerformed

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if(jTabbedPane1.getSelectedIndex() == 1){
            layFileCSVC();
            showDataCSVC(listCSVC, modelCSVC);
        }
        if(jTabbedPane1.getSelectedIndex() == 2){
            layFileHD();
            showDataHDDT(listHD, modelHDDT);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btnXoaHDDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHDDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        listHD.remove(vitri);
        showDataHDDT(listHD, modelHDDT);
        luuFileHD(listHD);
    }//GEN-LAST:event_btnXoaHDDTActionPerformed

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
            @Override
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    public void luuFile(List l){
        FileOutputStream fo;
        ObjectOutputStream out;
        try{
            fo = new FileOutputStream("csvc.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(l);
            out.close();
            fo.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void luuFileHD(List l){
        FileOutputStream fo;
        ObjectOutputStream out;
        try{
            fo = new FileOutputStream("hd.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(l);
            out.close();
            fo.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void layFileCSVC(){
        FileInputStream fi;
        ObjectInputStream in;
        try{
            fi = new FileInputStream("csvc.txt");
            in = new ObjectInputStream(fi);
            listCSVC = (ArrayList<CoSoVC>)in.readObject();
            fi.close();
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void layFileHD(){
        FileInputStream fi;
        ObjectInputStream in;
        try{
            fi = new FileInputStream("hd.txt");
            in = new ObjectInputStream(fi);
            listHD = (ArrayList<HoatDong>)in.readObject();
            fi.close();
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaHDDT;
    private javax.swing.JButton btnThemCSVC;
    private javax.swing.JButton btnThemHDDT;
    private javax.swing.JButton btnThemTV;
    private javax.swing.JButton btnXoaHDDT;
    private javax.swing.JButton btnxoaCSVC;
    private javax.swing.JButton editCSVC;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tblCSVC;
    private javax.swing.JTable tblHDDT;
    private javax.swing.JTextField txtChiPhiHDDT;
    private javax.swing.JTextField txtThanhVienHDDT;
    // End of variables declaration//GEN-END:variables

    @Override
    public <T> void showData(List<T> list, DefaultTableModel model) {
        
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
        for(var x : listCSVC){
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
                HoatDong a = (HoatDong) t;
                if(a.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")){
                    model.addRow(new Object[]{
                        a.getTenHD(), a.getThoiGian(), a.getDiaDiem(), a.getMoTa(), a.getSoThanhVien(), a.getKinhPhi()
                    });
                }
            }
        }
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for(var x : listHD){
            if(x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")){
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + TongChiPhi);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public interface View {
    <T> void showDataThanhVien(List<T> list , DefaultTableModel model);
    <T> void showDataCSVC(List<T> list , DefaultTableModel model);
    <T> void showDataHDDT(List<T> list , DefaultTableModel model);
//    <T> void showDataTinHoc(List<T> list , DefaultTableModel model);
    <T> void showDataTruyenThong(List<T> list , DefaultTableModel model);
    <T> void showDataHDHT(List<T> list, DefaultTableModel model); 
}

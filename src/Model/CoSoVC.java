/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class CoSoVC implements Serializable{
    private String maCSVC;
    private String tenCSVC;
    private String trangThai;
    private int soLuong;
    private double ChiPhi;

    public CoSoVC() {
    }

    public CoSoVC(String maCSVC, String tenCSVC, String trangThai, int soLuong, double ChiPhi) {
        this.maCSVC = maCSVC;
        this.tenCSVC = tenCSVC;
        this.trangThai = trangThai;
        this.soLuong = soLuong;
        this.ChiPhi = ChiPhi;
    }

    public String getMaCSVC() {
        return maCSVC;
    }

    public String getTenCSVC() {
        return tenCSVC;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getChiPhi() {
        return ChiPhi;
    }

    public void setMaCSVC(String maCSVC) throws Exception {
        if(maCSVC.trim().length() == 0) throw new Exception("Ma CSVC khong duoc de trong");
        this.maCSVC = maCSVC;
    }

    public void setTenCSVC(String tenCSVC) throws Exception{
        if(tenCSVC.trim().length() == 0) throw new Exception("Ten CSVC khong duoc de trong");
        this.tenCSVC = tenCSVC;
    }

    public void setTrangThai(String trangThai){
        this.trangThai = trangThai;
    }

    public void setSoLuong(int soLuong) throws Exception {
        if(soLuong <= 0) throw new Exception("So luong phai lon hon 0");
        this.soLuong = soLuong;
    }

    public void setChiPhi(double ChiPhi) {
        this.ChiPhi = ChiPhi;
    }
}

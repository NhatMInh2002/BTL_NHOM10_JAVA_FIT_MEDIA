/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Bravo 15
 */
public class HoatDong implements Serializable{
    private String maHD;
    private String tenHD;
    private String loaiHD;
    private String thoiGian;
    private int soThanhVien;
    private double kinhPhi;
    private String diaDiem;
    private String moTa;

    public HoatDong() {
    }

    public HoatDong(String maHD, String tenHD, String loaiHD, String thoiGian, int soThanhVien, double kinhPhi, String diaDiem, String moTa) {
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.loaiHD = loaiHD;
        this.thoiGian = thoiGian;
        this.soThanhVien = soThanhVien;
        this.kinhPhi = kinhPhi;
        this.diaDiem = diaDiem;
        this.moTa = moTa;
    }
    

    public String getMaHD(){
        return maHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public double getKinhPhi() {
        return kinhPhi;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMaHD(String maHD){
        this.maHD = maHD;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setTenHD(String tenHD) throws Exception{
        if(tenHD.trim().length() == 0) throw new Exception("Ten hoat dong khong duoc de trong");
        this.tenHD = tenHD;
    }

    public void setLoaiHD(String loaiHD) {
        this.loaiHD = loaiHD;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public void setKinhPhi(double kinhPhi) {
        this.kinhPhi = kinhPhi;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ThanhVien;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ControllerImp implements Controller {

    @Override
    public List<ThanhVien> readDataFromFile(String fileName) {
        List<ThanhVien> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");

                if (fields.length == 10) {
                    String maTV = fields[0];
                    String tenTV = fields[1];
                    String khoa = fields[2];
                    String chuyenNghanh = fields[3];
                    String ban = fields[4];
                    String ngaySinh = fields[5];
                    String gioiTinh = fields[6];
                    String email = fields[7];
                    String sdt = fields[8];
                    String chucDanh = fields[9];

                    ThanhVien student = new ThanhVien(maTV, tenTV, khoa, chuyenNghanh, ban, ngaySinh, gioiTinh, email, sdt, chucDanh);
                    students.add(student);
                } else {
                    System.out.println("Invalid data: " + line);
                }
            }

            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return students;
    }

    @Override

    public void writeDataToFile(List<ThanhVien> students, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);

            for (ThanhVien student : students) {
                String line = String.join(",", student.getMaTV(), student.getTenTV(), student.getKhoa(), student.getChuyenNghanh(),
                        student.getBan(), student.getNgaySinh(), student.getGioiTinh(), student.getEmail(), student.getSdt(),
                        student.getChucDanh());
                writer.write(line + "\n");
            }

            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

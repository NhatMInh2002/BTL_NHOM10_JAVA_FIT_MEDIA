/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.ThanhVien;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
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
    public <T> List<T> sortByName(List<T> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if (file.length() > 0) {
            try {
                file.createNewFile();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    T item = (T) line;
                    list.add(item);
                }
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public <T> void wirteToFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            for (T item : list) {
                writer.write(item.toString() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
//    public static void ghíTV(ArrayList<ThanhVien> list){
//        try(PrintWriter pw = new PrintWriter(new File("TV.TXT"))){
//            for(ThanhVien s: list){
//                pw.println(s.getMaTV());
//                pw.println(s.getTenTV());
//                pw.println(s.getKhoa());
//                pw.println(s.getChuyenNghanh());
//                pw.println(s.getBan());
//                pw.println(s.getNgaySinh());
//                pw.println(s.getGioiTinh());
//                pw.println(s.getEmail());
//                pw.println(s.getSdt());
//                pw.println(s.getChucDanh());
//            }
//        }catch(Exception e){
//            System.out.println("got an exception");
//        }
//    }
//    public static ArrayList docTV(){
//        ArrayList<ThanhVien> list = new ArrayList<>();
//        try(Scanner sc = new Scanner(new File("TV.TXT"))){
//            while(sc.hasNext()){
//                ThanhVien tv = new ThanhVien();
//                tv.setMaTV(sc.nextLine());
//                tv.setTenTV(sc.nextLine());
//                tv.setKhoa(sc.nextLine());
//                tv.setChuyenNghanh(sc.nextLine());
//                tv.setBan(sc.nextLine());
//                tv.setNgaySinh(sc.nextLine());
//                tv.setGioiTinh(sc.nextLine());
//                tv.setEmail(sc.nextLine());
//                tv.setSdt(sc.nextLine());
//                tv.setChucDanh(sc.nextLine());
//                
//                list.add(tv);
//            }
//
//        }catch(Exception e){
//            System.out.println("got an exception");
//        }
//        return list;
//    }
//    @Override
//    public <T> void wirteToFile(List<T> list, String fileName) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public <T> List<T> readDataFromFile(String fileName) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public <T> void wirteToFile(List<T> list, String fileName) {
//        File file = new File(fileName);
//        try {
//            file.createNewFile();
//            FileOutputStream fos = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(list);
//            oos.close();
//            fos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public <T> List<T> readDataFromFile(String fileName) {
//        List<T> list = new ArrayList<>();
//        File file = new File(fileName);
//        if (file.length() > 0) {
//            try {
//                FileInputStream fos = new FileInputStream(file);
//                ObjectInputStream oos = new ObjectInputStream(fos);
//                Object o = oos.readObject();
//                list = (List<T>) o;
//                oos.close();
//                fos.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return list;
//    }
}

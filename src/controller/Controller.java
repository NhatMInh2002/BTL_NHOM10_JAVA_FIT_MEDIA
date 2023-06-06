/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import Model.ThanhVien;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface Controller {
    List<ThanhVien> readDataFromFile(String fileName);
    void writeDataToFile(List<ThanhVien> students, String fileName);
}

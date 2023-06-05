/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface Controller {
    //ghi file
     <T> void wirteToFile (List<T> list , String fileName);
     // đọc file
     <T> List<T>  readDataFromFile(String fileName);
    // sắp xếp các danh sách theo tên
    <T> List<T> sortByName(List<T> list);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample_Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NTC
 */
public class List {

    public static ArrayList<XeHoi> arrXH;
    XeHoi sh = new XeHoi() {
    };
    static Scanner sc = new Scanner(System.in);

//    1- Thêm 1 xe vào danh sách
    public void themXH() {
        System.out.print("Nhập vào tổng số Xe Hoi: ");
        int tongXH = sc.nextInt();
        System.out.println("====================\n");
        for (int i = 0; i < tongXH; i++) {
            XeHoi xh = new XeHoi() {
            };
            System.out.println("Nhập vào Xe Hoi thứ " + (i + 1) + ": ");
            xh.nhap();
            arrXH.add(xh);
            System.out.println("====================\n");
        }
    }

    //2- Xoá 1 xe khỏi danh sách theo vị trí
    public void xoaXH() {
        System.out.print("Nhập vào vị trí Xe Hơi cần xóa: ");
        int vtTk = sc.nextInt();
        if (arrXH.isEmpty()) {
            System.out.println("Danh sách Xe Hơi đang trống. ");
        } else {
            for (int i = 0; i < arrXH.size(); i++) {
                if (vtTk == arrXH.get(i).getMaXe()) {
                    System.out.println("Đã xóa Xe Hơi: ");
                    arrXH.remove(i);
                    break;
                } else if (i == arrXH.size() - 1) {
                    System.out.println("Không tìm thấy Xe Hơi.");
                }
            }
            System.out.println("====================\n");
        }
    }

    //3-Tìm xe có giá tiền cao nhất
    public void timXHmaxMoney() {
        int max = 0;
        for (int i = 1; i < arrXH.size(); i++) {
            if (arrXH.get(max).getGiaXe() < arrXH.get(i).getGiaXe()) {
                max = i;
            }
        }
//        System.out.println("Hiển thị xe có giá tiền cao nhất.\n");
        System.out.println("Ten Hang: " + arrXH.get(max).getHangXe()
                + "\nGia Xe: " + arrXH.get(max).getGiaXe());

    }

    //4-Hiển thị các xe cùng hãng với tên hãng được nhập vào bàn phím
    public void timXecungHang(String hangXeTk) {
        if (arrXH.isEmpty()) {
            System.out.println("Danh sách xe hơi đang trống. ");
        } else {
            for (int i = 0; i < arrXH.size(); i++) {
                if (hangXeTk.equals(arrXH.get(i).getHangXe())) {
                    System.out.println("Đã tìm thấy hãng xe: ");
                    arrXH.get(i).xuat();
//                    break;
                } else if (i == arrXH.size() - 1) {
                    System.out.println("không tìm thấy hãng xe.");
                }
            }
        }
        System.out.println("====================\n");
    }

    //xep theo nam sx
    public void bangXephang() {
        for (int i = 0; i < arrXH.size() - 1; i++) {
            for (int j = i + 1; j < arrXH.size(); j++) {
                if (arrXH.get(i).getNamSX() < arrXH.get(j).getNamSX()) {
                    XeHoi sv = arrXH.get(i);
                    arrXH.set(i, arrXH.get(j));
                    arrXH.set(j, sv);
                }
            }
        }
    }

    //5-Sắp xếp xe theo thứ tự giảm dần của năm sản xuất
    public void sxXeHoi() {
        this.bangXephang();
        System.out.println("STT  \tTen  \tNam");
        for (int i = 0; i < arrXH.size(); i++) {
            System.out.printf(" %s \t %s \t %s \n",
                    (i + 1),
                    arrXH.get(i).getHangXe(), arrXH.get(i).getNamSX());
        }
        System.out.println("====================\n");
    }
}

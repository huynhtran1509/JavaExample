/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample_Bai2;

import java.util.ArrayList;

/**
 *
 * @author NTC
 */
public class Main {

    static ArrayList<SinhVienCNTT> arrSV;

    public static void main(String[] args) {
        arrSV = new ArrayList<>();
        Main m = new Main();

        m.themDsSv();
        m.hienThiDs();
//        System.out.println(arrSV.toString() + "");
    }

    public void themDsSv() {
        for (int i = 0; i < 2; i++) {
            SinhVienCNTT svCNTT = new SinhVienCNTT();
            System.out.println("Nhap vao SV thu " + (i + 1));
            svCNTT.nhap();
            arrSV.add(svCNTT);
            System.out.println("====================");
        }
    }

    //Hiển thị danh sách nhân viên
    public void hienThiDs() {
        System.out.println("====================================================");
        System.out.println("Hien thi danh sach: \n");
        for (int i = 0; i < arrSV.size(); i++) {
            arrSV.get(i).getTenSV();
            arrSV.get(i).tinhDTB();
            arrSV.get(i).hocBong();
            System.out.println("====================");
        }
    }

}

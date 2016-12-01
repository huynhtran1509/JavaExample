/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample_Bai1;

import java.util.ArrayList;

/**
 *
 * @author NTC
 */
public class Main {

    public static ArrayList<CD> arrCD;

    public static void main(String[] args) {
        arrCD = new ArrayList<>();
        Main m = new Main();
        m.themDsSv();
        m.hienThiCD();
        m.cdMax();
    }

    public void themDsSv() {
        for (int i = 0; i < 2; i++) {
            CD cd = new CD();
            System.out.println("Nhap vao SP thu " + (i + 1));
            cd.nhap();
            arrCD.add(cd);
            System.out.println("====================");
        }
    }

    //Hiển thị danh sách nhân viên
    public void sapXepCDTangDan() {
        for (int i = 0; i < arrCD.size() - 1; i++) {
            for (int j = i + 1; j < arrCD.size(); j++) {
                if (arrCD.get(i).getDonGia() > arrCD.get(j).getDonGia()) {
                    CD cd = arrCD.get(i);
                    arrCD.set(i, arrCD.get(j));
                    arrCD.set(j, cd);
                }
            }
        }
//        int maxIndex = 0;
//        for (int i = 1; i < arrCD.size(); i++) {
//            if (arrCD.get(maxIndex).getDonGia() < arrCD.get(i).getDonGia()) {
//                maxIndex = i;
//                
//                CD cd = arrCD.get(maxIndex);
//                arrCD.set(maxIndex, arrCD.get(i));
//                arrCD.set(i, cd);
//            }
//        }
    }
//    Hiển thị danh sách CD theo thứ tự tăng dần về đơn giá

    public void hienThiCD() {
        this.sapXepCDTangDan();
        System.out.println("STT \tTen SP \tDon Gia \tSo Luong");
        for (int i = 0; i < arrCD.size(); i++) {
            System.out.printf(" %s \t %s \t %.1f \t %s\n", (i + 1),
                    arrCD.get(i).getTieuDe(), arrCD.get(i).getDonGia(),
                    arrCD.get(i).getSoLuong());
        }
        System.out.println("====================\n");
    }

    public void cdMax() {
        int max = 0;
        for (int i = 1; i < arrCD.size(); i++) {
            if (arrCD.get(max).getSoLuong() < arrCD.get(i).getSoLuong()) {
                max = i;
            }
        }
        System.out.println("Hiển thị CD có số lượng lớn nhất.\n");
        System.out.println("Ten SP: " + arrCD.get(max).getTieuDe()
                + "\nSo Luong: " + arrCD.get(max).getSoLuong());

    }
}

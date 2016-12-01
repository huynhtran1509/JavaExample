/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample_Bai2;

import java.util.Scanner;

/**
 *
 * @author NTC
 */
public abstract class SinhVien {

    String maSV;
    String tenSV;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma SV: ");
        setMaSV(sc.nextLine());
        System.out.println("Nhap vao ten SV: ");
        setTenSV(sc.nextLine());

    }

    public void xuat() {
        System.out.println("Ma SV la: " + getMaSV());
        System.out.println("Ten SV la: " + getTenSV());
    }

    public abstract double tinhDTB();

    public boolean hocBong() {
        return tinhDTB() > 8;
    }

   

}

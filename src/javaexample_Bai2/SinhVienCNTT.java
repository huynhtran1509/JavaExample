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
public class SinhVienCNTT extends SinhVien {

    double diemJava;
    double diemHTML;
    double diemSQL;

    public SinhVienCNTT() {
    }

    public SinhVienCNTT(double diemJava, double diemHTML, double diemSQL, String maSV, String tenSV) {
        super(maSV, tenSV);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemSQL = diemSQL;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemSQL() {
        return diemSQL;
    }

    public void setDiemSQL(double diemSQL) {
        this.diemSQL = diemSQL;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao diemJava: ");
        setDiemJava(sc.nextDouble());
        System.out.println("Nhap vao diemHTML: ");
        setDiemHTML(sc.nextDouble());
        System.out.println("Nhap vao diemSQL: ");
        setDiemSQL(sc.nextDouble());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("diemJava la: " + getDiemJava());
        System.out.println("diemHTML la: " + getDiemHTML());
        System.out.println("diemSQL la: " + getDiemSQL());
        System.out.println("Diem trung binh la: " + tinhDTB());
        System.out.println("Hoc bong: " + xethocBong());
    }

    public String xethocBong() {
        if (hocBong() == true) {
            return "Co hoc bong!!";
        } else {
            return "Khong co hoc bong!!";
        }
    }

    @Override
    public double tinhDTB() {
        return (diemHTML + diemJava + diemSQL) / 3;
    }

    @Override
    public String toString() {
        return maSV + '=' + tenSV + "=" + diemJava + "=" + diemHTML + "=" + diemSQL;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample_Bai3;

import java.util.Scanner;

/**
 *
 * @author NTC
 */
public class XeHoi {

    int maXe;
    String hangXe;
    String mauSac;
    int namSX;
    double giaXe;

    public XeHoi() {
    }

    public XeHoi(int maXe, String hangXe, String mauSac, int namSX, double giaXe) {
        this.maXe = maXe;
        this.hangXe = hangXe;
        this.mauSac = mauSac;
        this.namSX = namSX;
        this.giaXe = giaXe;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public void nhap() {//hangXe, mauSac, namSX , giaXe
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma Xe: ");
        setMaXe(sc.nextInt());
        System.out.println("Nhap vao Hang Xe: ");
        setHangXe(sc.nextLine());
        setHangXe(sc.nextLine());
        System.out.println("Nhap vao Mau Sac: ");
        setMauSac(sc.nextLine());
        System.out.println("Nhap vao Nam SX: ");
        setNamSX(sc.nextInt());
        System.out.println("Nhap vao Gia Xe: ");
        setGiaXe(sc.nextDouble());
    }

    public void xuat() {
        System.out.println("Ma Xe la: " + getMaXe());
        System.out.println("Hang Xe la: " + getHangXe());
        System.out.println("Mau Sac la: " + getMauSac());
        System.out.println("Nam SX la: " + getNamSX());
        System.out.println("Gia Xe la: " + getGiaXe());
    }
}

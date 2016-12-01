/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample_Bai1;

import java.util.Scanner;

/**
 *
 * @author NTC
 */
public class SanPham {

    String maSP;
    String tieuDe;
    double donGia;
    int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tieuDe, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tieuDe = tieuDe;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma SP: ");
        setMaSP(sc.nextLine());
        System.out.println("Nhap vao ten SP: ");
        setTieuDe(sc.nextLine());
        System.out.println("Nhap vao Don Gia: ");
        setDonGia(sc.nextDouble());
        System.out.println("Nhap vao So Luong: ");
        setSoLuong(sc.nextInt());

    }

    public void xuat() {
        System.out.println("Ma SP la: " + getMaSP());
        System.out.println("Ten SP la: " + getTieuDe());
        System.out.println("Don Gia la: " + getDonGia());
        System.out.println("So Luong la: " + getSoLuong());
    }
}

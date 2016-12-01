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
public class CD extends SanPham {

    String hangPhatHanh;

    public CD() {

    }

    public CD(String hangPhatHanh, String maSP, String tieuDe, double donGia, int soLuong) {
        super(maSP, tieuDe, donGia, soLuong);
        this.hangPhatHanh = hangPhatHanh;
    }

    public String getHangPhatHanh() {
        return hangPhatHanh;
    }

    public void setHangPhatHanh(String hangPhatHanh) {
        this.hangPhatHanh = hangPhatHanh;
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao Hang Phat Hanh: ");
        setHangPhatHanh(sc.nextLine());
    }

}

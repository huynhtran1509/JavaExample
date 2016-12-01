/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample_Bai3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NTC
 */
public class Main {

    public static void menu() throws IOException {
        List xe = new List();
        Scanner sc = new Scanner(System.in);
        System.out.println("QUẢN LÝ XE HƠI \n");
        System.out.println("1. Thêm 1 xe vào danh sách.");
        System.out.println("2. Xoá 1 xe khỏi danh sách theo vị trí.");
        System.out.println("3. Tìm xe có giá tiền cao nhất.");
        System.out.println("4. Hiển thị các xe cùng hãng với tên hãng được nhập vào bàn phím.");
        System.out.println("5. Sắp xếp xe theo thứ tự giảm dần của năm sản xuất.");
        System.out.println("====================\n");
        System.out.print("Nhập vào một số: ");
        int chon = sc.nextInt();
        switch (chon) {
            default:
                System.out.println("Kết thúc chương trình.");
                break;
            case 1:
                System.out.println("1. Thêm 1 xe vào danh sách.");
                xe.themXH();
                menu();
                break;
            case 2:
                System.out.println("2. Xoá 1 xe khỏi danh sách theo vị trí.");
                xe.xoaXH();
                menu();
                break;
            case 3:
                System.out.println("3. Tìm xe có giá tiền cao nhất.");
                xe.timXHmaxMoney();
                menu();
                break;
            case 4:
                System.out.println("4. Hiển thị các xe cùng hãng với tên hãng được nhập vào bàn phím.");
                System.out.print("Nhập vào hãng xe cần tìm: ");
                String hangXeTk = sc.nextLine();
                hangXeTk = sc.nextLine();
                xe.timXecungHang(hangXeTk);
                menu();
                break;
            case 5:
                System.out.println("5. Sắp xếp xe theo thứ tự giảm dần của năm sản xuất.");
                xe.sxXeHoi();
                menu();
                break;

        }
    }

    public static void main(String[] args) throws IOException {
        List.arrXH = new ArrayList<>();
        menu();

    }
}

package main;

import view.DangNhapView;
import view.Menu;

public class Main {

    public static void main(String[] args) {

        DangNhapView dangNhapView = new DangNhapView();

        if (dangNhapView.hienThiDangNhap()) {

            Menu menu = new Menu();
            menu.hienThiMenu();

        } else {

            System.out.println("Chuong trinh ket thuc.");

        }

    }
}
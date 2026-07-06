package main;

import view.DangNhapView;
import view.Menu;

public class Main {

    public static void main(String[] args) {

        while (true) {

            DangNhapView dangNhapView = new DangNhapView();

            if (dangNhapView.hienThiDangNhap()) {

                Menu menu = new Menu();
                menu.hienThiMenu();

            } else {

                System.out.println("Dang nhap that bai.");
            }

        }

    }

}
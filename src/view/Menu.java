package view;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    private SinhVienView sinhVienView;
    private MonHocView monHocView;
    private DiemView diemView;

    public Menu() {
        scanner = new Scanner(System.in);

        sinhVienView = new SinhVienView();
        monHocView = new MonHocView();
        diemView = new DiemView();
    }

    public void hienThiMenu() {

        int luaChon = -1;

        do {

            System.out.println("\n====================================");
            System.out.println(" HE THONG QUAN LY SINH VIEN ");
            System.out.println("====================================");
            System.out.println("1. Quan ly sinh vien");
            System.out.println("2. Quan ly mon hoc");
            System.out.println("3. Quan ly diem");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            try {
                luaChon = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
                continue;
            }

            switch (luaChon) {

                case 1:
                    sinhVienView.menuSinhVien();
                    break;

                case 2:
                    monHocView.menuMonHoc();
                    break;

                case 3:
                    diemView.menuDiem();
                    break;

                case 0:

                    if (xacNhanThoat()) {

                        System.out.println("Cam on ban da su dung chuong trinh!");

                    } else {

                        luaChon = -1;

                    }

                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (luaChon != 0);
    }

    private boolean xacNhanThoat() {

        while (true) {

            System.out.print("Ban co muon thoat chuong trinh? (YES/NO): ");

            String chon = scanner.nextLine().trim().toUpperCase();

            if (chon.equals("YES")) {
                return true;
            }

            if (chon.equals("NO")) {
                return false;
            }

            System.out.println("Chi duoc nhap YES  hoac NO.");

        }

    }

}
package view;

import java.util.Scanner;
import model.Diem;
import service.DiemService;
import util.Validation;

public class DiemView {

    private Scanner scanner;
    private DiemService service;

    public DiemView() {
        scanner = new Scanner(System.in);
        service = new DiemService();
    }

    public void menuDiem() {

        int luaChon = -1;

        do {

            System.out.println("\n========== QUAN LY DIEM ==========");
            System.out.println("1. Them diem");
            System.out.println("2. Hien thi danh sach diem");
            System.out.println("3. Tim diem");
            System.out.println("4. Sua diem");
            System.out.println("5. Xoa diem");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");

            try {
                luaChon = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
                continue;
            }

            switch (luaChon) {

                case 1:
                    themDiem();
                    break;

                case 2:
                    hienThiDanhSach();
                    break;

                case 3:
                    timDiem();
                    break;

                case 4:
                    suaDiem();
                    break;

                case 5:
                    xoaDiem();
                    break;

                case 0:
                    System.out.println("Quay lai menu chinh...");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");

            }

        } while (luaChon != 0);

    }

    private void themDiem() {

        System.out.print("Ma sinh vien: ");
        String maSV = scanner.nextLine();

        System.out.print("Ma mon: ");
        String maMon = scanner.nextLine();

        System.out.print("Diem giua ky: ");
        double giuaKy = Double.parseDouble(scanner.nextLine());

        if (!Validation.kiemTraDiem(giuaKy)) {
            System.out.println("Diem giua ky phai tu 0 den 10.");
            return;
        }

        System.out.print("Diem cuoi ky: ");
        double cuoiKy = Double.parseDouble(scanner.nextLine());

        if (!Validation.kiemTraDiem(cuoiKy)) {
            System.out.println("Diem cuoi ky phai tu 0 den 10.");
            return;
        }

        service.themDiem(new Diem(maSV, maMon, giuaKy, cuoiKy));

        System.out.println("Them diem thanh cong.");

    }

    private void hienThiDanhSach() {

        if (service.layDanhSachDiem().isEmpty()) {

            System.out.println("Danh sach diem trong.");

            return;

        }

        for (Diem diem : service.layDanhSachDiem()) {

            System.out.println(diem);

        }

    }

    private void timDiem() {

        System.out.print("Nhap ma sinh vien: ");

        String ma = scanner.nextLine();

        Diem diem = service.timTheoMaSV(ma);

        if (diem == null) {

            System.out.println("Khong tim thay diem.");

        } else {

            System.out.println(diem);

        }

    }

    private void suaDiem() {

        System.out.print("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();

        if (service.timTheoMaSV(maSV) == null) {

            System.out.println("Khong tim thay sinh vien.");

            return;

        }

        System.out.print("Ma mon moi: ");
        String maMon = scanner.nextLine();

        System.out.print("Diem giua ky moi: ");
        double giuaKy = Double.parseDouble(scanner.nextLine());

        if (!Validation.kiemTraDiem(giuaKy)) {
            System.out.println("Diem giua ky phai tu 0 den 10.");
            return;
        }

        System.out.print("Diem cuoi ky moi: ");
        double cuoiKy = Double.parseDouble(scanner.nextLine());

        if (!Validation.kiemTraDiem(cuoiKy)) {
            System.out.println("Diem cuoi ky phai tu 0 den 10.");
            return;
        }

        Diem diem = new Diem(maSV, maMon, giuaKy, cuoiKy);

        if (service.suaDiem(diem)) {

            System.out.println("Sua diem thanh cong.");

        } else {

            System.out.println("Sua diem that bai.");

        }

    }

    private void xoaDiem() {

        System.out.print("Nhap ma sinh vien: ");

        String ma = scanner.nextLine();

        if (service.xoaDiem(ma)) {

            System.out.println("Xoa diem thanh cong.");

        } else {

            System.out.println("Khong tim thay.");

        }

    }

}
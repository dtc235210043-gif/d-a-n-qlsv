package view;

import java.util.Scanner;
import model.SinhVien;
import service.SinhVienService;
import util.Validation;

public class SinhVienView {

    private Scanner scanner;
    private SinhVienService service;

    public SinhVienView() {
        scanner = new Scanner(System.in);
        service = new SinhVienService();
    }

    public void menuSinhVien() {

        int luaChon;

        do {

            System.out.println("\n========== QUAN LY SINH VIEN ==========");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sinh vien");
            System.out.println("4. Sua sinh vien");
            System.out.println("5. Xoa sinh vien");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");

            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {

                case 1:
                    themSinhVien();
                    break;

                case 2:
                    hienThiDanhSach();
                    break;

                case 3:
                    timSinhVien();
                    break;

                case 4:
                    suaSinhVien();
                    break;

                case 5:
                    xoaSinhVien();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (luaChon != 0);

    }

    private void themSinhVien() {

        System.out.print("Ma sinh vien: ");
        String ma = scanner.nextLine();

        if (!Validation.kiemTraMaSV(ma)) {
            System.out.println("Ma sinh vien khong hop le.");
            return;
        }

        System.out.print("Ho ten: ");
        String ten = scanner.nextLine();

        if (!Validation.kiemTraHoTen(ten)) {
            System.out.println("Ho ten khong hop le.");
            return;
        }

        System.out.print("Lop: ");
        String lop = scanner.nextLine();

        if (!Validation.kiemTraLop(lop)) {
            System.out.println("Lop khong hop le.");
            return;
        }

        System.out.print("Email: ");
        String email = scanner.nextLine();

        if (!Validation.kiemTraEmail(email)) {
            System.out.println("Email khong hop le.");
            return;
        }

        System.out.print("Diem: ");
        double diem = Double.parseDouble(scanner.nextLine());

        if (!Validation.kiemTraDiem(diem)) {
            System.out.println("Diem phai tu 0 den 10.");
            return;
        }

        SinhVien sv = new SinhVien(ma, ten, lop, email, diem);

        service.themSinhVien(sv);

        System.out.println("Them sinh vien thanh cong.");

    }

    private void hienThiDanhSach() {

        if (service.layDanhSachSinhVien().isEmpty()) {

            System.out.println("Danh sach sinh vien trong.");

            return;
        }

        for (SinhVien sv : service.layDanhSachSinhVien()) {

            System.out.println(sv);

        }

    }

    private void timSinhVien() {

        System.out.print("Nhap ma sinh vien: ");

        String ma = scanner.nextLine();

        SinhVien sv = service.timTheoMa(ma);

        if (sv == null) {

            System.out.println("Khong tim thay.");

        } else {

            System.out.println(sv);

        }

    }

    private void suaSinhVien() {

        System.out.print("Nhap ma sinh vien: ");

        String ma = scanner.nextLine();

        SinhVien cu = service.timTheoMa(ma);

        if (cu == null) {

            System.out.println("Khong tim thay.");

            return;

        }

        System.out.print("Ho ten moi: ");
        String ten = scanner.nextLine();

        System.out.print("Lop moi: ");
        String lop = scanner.nextLine();

        System.out.print("Email moi: ");
        String email = scanner.nextLine();

        System.out.print("Diem moi: ");
        double diem = Double.parseDouble(scanner.nextLine());

        SinhVien sv = new SinhVien(ma, ten, lop, email, diem);

        if (service.suaSinhVien(sv)) {

            System.out.println("Sua thanh cong.");

        }

    }

    private void xoaSinhVien() {

        System.out.print("Nhap ma sinh vien: ");

        String ma = scanner.nextLine();

        if (service.xoaSinhVien(ma)) {

            System.out.println("Xoa thanh cong.");

        } else {

            System.out.println("Khong tim thay.");

        }

    }

}
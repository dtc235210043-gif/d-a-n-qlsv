package view;

import java.util.Scanner;
import service.DangNhapService;

public class DangNhapView {

    private Scanner scanner;
    private DangNhapService service;

    public DangNhapView() {
        scanner = new Scanner(System.in);
        service = new DangNhapService();
    }

    public boolean hienThiDangNhap() {

        int soLanThu = 3;

        while (soLanThu > 0) {

            System.out.println("\n=================================");
            System.out.println("        HE THONG ĐANG NHAP");
            System.out.println("=================================");

            System.out.print("Ten dang nhap: ");
            String tenDangNhap = scanner.nextLine().trim();

            System.out.print("Mat khau: ");
            String matKhau = scanner.nextLine().trim();

            if (tenDangNhap.isEmpty() || matKhau.isEmpty()) {
                System.out.println("Ten dang nhap va mat khau khong duoc de trong!");
                continue;
            }

            if (service.dangNhap(tenDangNhap, matKhau)) {
                System.out.println("\nDang nhap thanh cong!");
                return true;
            }

            soLanThu--;

            if (soLanThu > 0) {
                System.out.println("\nSai ten dang nhap hoặc mat khau!");
                System.out.println("BBan con " + soLanThu + " lan thu.");
            } else {
                System.out.println("\nBan đa nhap sai qua 3 lan!");
                System.out.println("Chuong trinh ket thuc.");
            }
        }

        return false;
    }
}
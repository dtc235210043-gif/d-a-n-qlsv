// removed package declaration to match project source layout

package view;
import java.util.Scanner;

import model.MonHoc;
import service.MonHocService;

public class MonHocView {

    private Scanner scanner;
    private MonHocService service;

    public MonHocView() {
        scanner = new Scanner(System.in);
        service = new MonHocService();
    }

    public void menuMonHoc() {

        int luaChon;

        do {

            System.out.println("\n========== QUAN LY MON HOC ==========");
            System.out.println("1. Them mon hoc");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim mon hoc");
            System.out.println("4. Sua mon hoc");
            System.out.println("5. Xoa mon hoc");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");

            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {

                case 1:
                    themMonHoc();
                    break;

                case 2:
                    hienThiDanhSach();
                    break;

                case 3:
                    timMonHoc();
                    break;

                case 4:
                    suaMonHoc();
                    break;

                case 5:
                    xoaMonHoc();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");

            }

        } while (luaChon != 0);

    }

    private void themMonHoc() {

        System.out.print("Nhap ma mon: ");
        String maMon = scanner.nextLine();

        System.out.print("Nhap ten mon: ");
        String tenMon = scanner.nextLine();

        MonHoc monHoc = new MonHoc(maMon, tenMon);

        service.themMonHoc(monHoc);

        System.out.println("Them mon hoc thanh cong.");

    }

    private void hienThiDanhSach() {

        if (service.layDanhSachMonHoc().isEmpty()) {

            System.out.println("Danh sach mon hoc trong.");

            return;

        }

        for (MonHoc mh : service.layDanhSachMonHoc()) {

            System.out.println(mh);

        }

    }

    private void timMonHoc() {

        System.out.print("Nhap ma mon: ");

        String maMon = scanner.nextLine();

        MonHoc mh = service.timTheoMa(maMon);

        if (mh == null) {

            System.out.println("Khong tim thay mon hoc.");

        } else {

            System.out.println(mh);

        }

    }

    private void suaMonHoc() {

        System.out.print("Nhap ma mon can sua: ");

        String maMon = scanner.nextLine();

        MonHoc mh = service.timTheoMa(maMon);

        if (mh == null) {

            System.out.println("Khong tim thay mon hoc.");

            return;

        }

        System.out.print("Nhap ten mon moi: ");

        String tenMon = scanner.nextLine();

        MonHoc monHoc = new MonHoc(maMon, tenMon);

        if (service.suaMonHoc(monHoc)) {

            System.out.println("Sua thanh cong.");

        } else {

            System.out.println("Sua that bai.");

        }

    }

    private void xoaMonHoc() {

        System.out.print("Nhap ma mon can xoa: ");

        String maMon = scanner.nextLine();

        if (service.xoaMonHoc(maMon)) {

            System.out.println("Xoa thanh cong.");

        } else {

            System.out.println("Khong tim thay mon hoc.");

        }

    }

}
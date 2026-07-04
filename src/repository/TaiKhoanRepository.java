package repository;

import java.util.ArrayList;

import model.TaiKhoan;
import util.FileUtil;

public class TaiKhoanRepository {

    private static final String FILE_NAME = "TaiKhoan.dat";

    private ArrayList<TaiKhoan> danhSachTaiKhoan;

    public TaiKhoanRepository() {

        danhSachTaiKhoan = FileUtil.docFile(FILE_NAME);

        if (danhSachTaiKhoan.isEmpty()) {

            danhSachTaiKhoan.add(new TaiKhoan("admin", "123456"));
            danhSachTaiKhoan.add(new TaiKhoan("user", "123"));

            FileUtil.ghiFile(FILE_NAME, danhSachTaiKhoan);

        }

    }

    public boolean kiemTraDangNhap(String tenDangNhap, String matKhau) {

        for (TaiKhoan tk : danhSachTaiKhoan) {

            if (tk.getTenDangNhap().equals(tenDangNhap)
                    && tk.getMatKhau().equals(matKhau)) {

                return true;

            }

        }

        return false;

    }

    public ArrayList<TaiKhoan> getDanhSachTaiKhoan() {

        return danhSachTaiKhoan;

    }

}
package repository;

import java.util.ArrayList;
import model.SinhVien;
import util.FileUtil;

public class SinhVienRepository {

    private final String FILE_NAME = "SinhVien.dat";

    private ArrayList<SinhVien> danhSachSinhVien;

    public SinhVienRepository() {

        danhSachSinhVien = FileUtil.docFile(FILE_NAME);

    }

    public ArrayList<SinhVien> getDanhSachSinhVien() {

        return danhSachSinhVien;

    }

    public void themSinhVien(SinhVien sinhVien) {

        danhSachSinhVien.add(sinhVien);

        FileUtil.ghiFile(FILE_NAME, danhSachSinhVien);

    }

    public SinhVien timTheoMa(String maSV) {

        for (SinhVien sv : danhSachSinhVien) {

            if (sv.getMaSV().equalsIgnoreCase(maSV)) {

                return sv;

            }

        }

        return null;

    }

    public boolean suaSinhVien(SinhVien sinhVien) {

        SinhVien sv = timTheoMa(sinhVien.getMaSV());

        if (sv != null) {

            sv.setHoTen(sinhVien.getHoTen());
            sv.setLop(sinhVien.getLop());
            sv.setEmail(sinhVien.getEmail());
            sv.setDiem(sinhVien.getDiem());

            FileUtil.ghiFile(FILE_NAME, danhSachSinhVien);

            return true;

        }

        return false;

    }

    public boolean xoaSinhVien(String maSV) {

        SinhVien sv = timTheoMa(maSV);

        if (sv != null) {

            danhSachSinhVien.remove(sv);

            FileUtil.ghiFile(FILE_NAME, danhSachSinhVien);

            return true;

        }

        return false;

    }

}
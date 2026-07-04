package repository;

import java.util.ArrayList;

import model.Diem;
import util.FileUtil;

public class DiemRepository {

    private static final String FILE_NAME = "Diem.dat";

    private ArrayList<Diem> danhSachDiem;

    public DiemRepository() {
        danhSachDiem = FileUtil.docFile(FILE_NAME);
    }

    public ArrayList<Diem> getDanhSachDiem() {
        return danhSachDiem;
    }

    public void themDiem(Diem diem) {
        danhSachDiem.add(diem);
        FileUtil.ghiFile(FILE_NAME, danhSachDiem);
    }

    public Diem timTheoMaSV(String maSV) {

        for (Diem d : danhSachDiem) {

            if (d.getMaSV().equalsIgnoreCase(maSV)) {
                return d;
            }

        }

        return null;
    }

    public boolean suaDiem(Diem diemMoi) {

        Diem d = timTheoMaSV(diemMoi.getMaSV());

        if (d != null) {

            d.setMaMon(diemMoi.getMaMon());
            d.setDiemGiuaKy(diemMoi.getDiemGiuaKy());
            d.setDiemCuoiKy(diemMoi.getDiemCuoiKy());

            FileUtil.ghiFile(FILE_NAME, danhSachDiem);

            return true;
        }

        return false;
    }

    public boolean xoaDiem(String maSV) {

        Diem d = timTheoMaSV(maSV);

        if (d != null) {

            danhSachDiem.remove(d);

            FileUtil.ghiFile(FILE_NAME, danhSachDiem);

            return true;
        }

        return false;
    }

}
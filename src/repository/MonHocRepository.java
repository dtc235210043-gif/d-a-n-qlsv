package repository;

import java.util.ArrayList;

import model.MonHoc;
import util.FileUtil;

public class MonHocRepository {

    private static final String FILE_NAME = "MonHoc.dat";

    private ArrayList<MonHoc> danhSachMonHoc;

    public MonHocRepository() {
        danhSachMonHoc = FileUtil.docFile(FILE_NAME);
    }

    public ArrayList<MonHoc> getDanhSachMonHoc() {
        return danhSachMonHoc;
    }

    public void themMonHoc(MonHoc monHoc) {
        danhSachMonHoc.add(monHoc);
        FileUtil.ghiFile(FILE_NAME, danhSachMonHoc);
    }

    public MonHoc timTheoMa(String maMon) {

        for (MonHoc mh : danhSachMonHoc) {

            if (mh.getMaMon().equalsIgnoreCase(maMon)) {
                return mh;
            }

        }

        return null;
    }

    public boolean suaMonHoc(MonHoc monHocMoi) {

        MonHoc mh = timTheoMa(monHocMoi.getMaMon());

        if (mh != null) {

            mh.setTenMon(monHocMoi.getTenMon());

            FileUtil.ghiFile(FILE_NAME, danhSachMonHoc);

            return true;
        }

        return false;
    }

    public boolean xoaMonHoc(String maMon) {

        MonHoc mh = timTheoMa(maMon);

        if (mh != null) {

            danhSachMonHoc.remove(mh);

            FileUtil.ghiFile(FILE_NAME, danhSachMonHoc);

            return true;
        }

        return false;
    }

}
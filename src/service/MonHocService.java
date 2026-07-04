package service;

import java.util.ArrayList;
import model.MonHoc;
import repository.MonHocRepository;

public class MonHocService {

    private MonHocRepository repository;

    public MonHocService() {
        repository = new MonHocRepository();
    }

    public void themMonHoc(MonHoc monHoc) {
        repository.themMonHoc(monHoc);
    }

    public ArrayList<MonHoc> layDanhSachMonHoc() {
        return repository.getDanhSachMonHoc();
    }

    public MonHoc timTheoMa(String maMon) {
        return repository.timTheoMa(maMon);
    }

    public boolean suaMonHoc(MonHoc monHoc) {
        return repository.suaMonHoc(monHoc);
    }

    public boolean xoaMonHoc(String maMon) {
        return repository.xoaMonHoc(maMon);
    }

}

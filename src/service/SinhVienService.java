package service;

import java.util.ArrayList;
import model.SinhVien;
import repository.SinhVienRepository;

public class SinhVienService {

    private SinhVienRepository repository;

    public SinhVienService() {
        repository = new SinhVienRepository();
    }

    public void themSinhVien(SinhVien sinhVien) {
        repository.themSinhVien(sinhVien);
    }

    public ArrayList<SinhVien> layDanhSachSinhVien() {
        return repository.getDanhSachSinhVien();
    }

    public SinhVien timTheoMa(String maSV) {
        return repository.timTheoMa(maSV);
    }

    public boolean suaSinhVien(SinhVien sinhVien) {
        return repository.suaSinhVien(sinhVien);
    }

    public boolean xoaSinhVien(String maSV) {
        return repository.xoaSinhVien(maSV);
    }

}
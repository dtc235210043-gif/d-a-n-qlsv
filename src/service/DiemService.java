package service;

import java.util.ArrayList;
import model.Diem;
import repository.DiemRepository;

public class DiemService {

    private DiemRepository repository;

    public DiemService() {
        repository = new DiemRepository();
    }

    public void themDiem(Diem diem) {
        repository.themDiem(diem);
    }

    public ArrayList<Diem> layDanhSachDiem() {
        return repository.getDanhSachDiem();
    }

    public Diem timTheoMaSV(String maSV) {
        return repository.timTheoMaSV(maSV);
    }

    public boolean suaDiem(Diem diem) {
        return repository.suaDiem(diem);
    }

    public boolean xoaDiem(String maSV) {
        return repository.xoaDiem(maSV);
    }

}
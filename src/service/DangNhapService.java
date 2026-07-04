package service;

import repository.TaiKhoanRepository;

public class DangNhapService {

    private TaiKhoanRepository repository;

    public DangNhapService() {
        repository = new TaiKhoanRepository();
    }

    public boolean dangNhap(String tenDangNhap, String matKhau) {
        return repository.kiemTraDangNhap(tenDangNhap, matKhau);
    }

}
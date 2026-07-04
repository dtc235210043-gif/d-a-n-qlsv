package model;

import java.io.Serializable;

public class SinhVien implements Serializable {

    private static final long serialVersionUID = 1L;

    private String maSV;
    private String hoTen;
    private String lop;
    private String email;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String lop, String email, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Ma SV: " + maSV +
               ", Ho ten: " + hoTen +
               ", Lop: " + lop +
               ", Email: " + email +
               ", Diem: " + diem;
    }
}
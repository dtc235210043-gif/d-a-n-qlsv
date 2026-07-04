package model;

import java.io.Serializable;

public class Diem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String maSV;
    private String maMon;
    private double diemGiuaKy;
    private double diemCuoiKy;

    public Diem() {
    }

    public Diem(String maSV, String maMon, double diemGiuaKy, double diemCuoiKy) {
        this.maSV = maSV;
        this.maMon = maMon;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(double diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(double diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }

    public double tinhDiemTrungBinh() {
        return diemGiuaKy * 0.4 + diemCuoiKy * 0.6;
    }

    @Override
    public String toString() {
        return "Ma SV: " + maSV
                + ", Ma Mon: " + maMon
                + ", Giua Ky: " + diemGiuaKy
                + ", Cuoi Ky: " + diemCuoiKy
                + ", TB: " + String.format("%.2f", tinhDiemTrungBinh());
    }

}
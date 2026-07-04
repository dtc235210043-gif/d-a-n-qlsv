package model;

import java.io.Serializable;

public class MonHoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String maMon;
    private String tenMon;

    // Constructor khong tham so
    public MonHoc() {
    }

    // Constructor co tham so
    public MonHoc(String maMon, String tenMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;
    }

    // Getter va Setter
    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    @Override
    public String toString() {
        return "Ma mon: " + maMon +
               ", Ten mon: " + tenMon;
    }
}
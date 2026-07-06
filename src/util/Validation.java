package util;

public class Validation {

    // Mã sinh viên: chỉ cho phép chữ và số
    public static boolean kiemTraMaSV(String maSV) {

        if (maSV == null || maSV.trim().isEmpty()) {
            return false;
        }

        return maSV.matches("^[a-zA-Z0-9]+$");
    }

    // Họ tên: chỉ cho phép chữ và khoảng trắng (hỗ trợ tiếng Việt)
    public static boolean kiemTraHoTen(String hoTen) {

        if (hoTen == null || hoTen.trim().isEmpty()) {
            return false;
        }

        return hoTen.matches("^[\\p{L} ]+$");
    }

    // Lớp: chỉ cho phép chữ và số
    public static boolean kiemTraLop(String lop) {

        if (lop == null || lop.trim().isEmpty()) {
            return false;
        }

        return lop.matches("^[a-zA-Z0-9]+$");
    }

    // Email
    public static boolean kiemTraEmail(String email) {

        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    // Điểm
    public static boolean kiemTraDiem(double diem) {

        return diem >= 0 && diem <= 10;
    }

}
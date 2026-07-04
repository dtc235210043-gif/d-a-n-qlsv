package util;

public class Validation {

    public static boolean kiemTraMaSV(String maSV) {
        return maSV != null && !maSV.trim().isEmpty();
    }

    public static boolean kiemTraHoTen(String hoTen) {
        return hoTen != null && !hoTen.trim().isEmpty();
    }

    public static boolean kiemTraLop(String lop) {
        return lop != null && !lop.trim().isEmpty();
    }

    public static boolean kiemTraEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public static boolean kiemTraDiem(double diem) {
        return diem >= 0 && diem <= 10;
    }

}
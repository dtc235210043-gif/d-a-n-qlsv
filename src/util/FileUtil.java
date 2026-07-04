package util;

import java.io.*;
import java.util.ArrayList;

public class FileUtil {

    @SuppressWarnings("unchecked")
    public static <T> ArrayList<T> docFile(String tenFile) {

        File file = new File(tenFile);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            return (ArrayList<T>) ois.readObject();

        } catch (Exception e) {

            return new ArrayList<>();

        }

    }

    public static <T> void ghiFile(String tenFile, ArrayList<T> danhSach) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tenFile))) {

            oos.writeObject(danhSach);

        } catch (Exception e) {

            System.out.println("Loi ghi file!");

        }

    }

}

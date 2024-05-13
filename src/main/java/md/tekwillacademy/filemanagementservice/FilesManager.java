package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FilesManager {

    public static boolean createTheFileIfDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file exists");
        } else {
            System.out.println("The file does not exist");
        }
    }

    public static void printTheFileName(File file) {
        System.out.println(file.getName());
    }

    public static void printTheAbsolutePath(File fileInput) {
        System.out.println(fileInput.getAbsolutePath());
    }

    public static void printIfTheFileIsADirectory(File file) {
        System.out.println("The file is directory:" + file.isDirectory());
    }

    public static void deleteTheFileIfExists(File file) {
        if (file.delete()) {
            System.out.println("Fisierul a fost sters");
        } else System.out.println("Fisierul nu a fost sters");
    }
}

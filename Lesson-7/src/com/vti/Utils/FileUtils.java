package com.vti.Utils;

import com.vti.entity.Account;

import java.io.*;
import java.util.Scanner;

public class FileUtils {
    public static boolean checkFileExists(String pathFile) {
        // Tạo 1 phiên làm việc với file
        File file = new File(pathFile);
        // Kiểm tra tồn tại của file
        if (file.exists()) {
            System.out.println("File có tồn tại!");
            return true;
        } else {
            System.out.println("File không tồn tại!");
            return false;
        }
    }

    // name có dạng : 123.txt
    // pathFile: Đường dẫn lưu file ( nên để đường dẫn tương đối )
    public static void createFile(String name) {
        String pathFile = "Lesson-7/file/" + name;
        File file = new File(pathFile);
        try {
            if (file.createNewFile()) {
                System.out.println("Tạo file thành công!");
            } else {
                System.out.println("Tạo file thất bại!");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println(file.delete() ? "Xoá thành công!" : "Xoá thất bại!");
        } else {
            System.out.println("File ko tồn tại!");
        }
    }

    public static void renameFile(String oldName, String newName) {
        // File (or directory) with old name
        File file = new File(oldName);
        // File (or directory) with new name
        File file2 = new File(newName);
        if (file2.exists()) {
            System.out.println("ko đc đặt tên file đã tồn tại!");
        }
        // Rename file (or directory)
        boolean success = file.renameTo(file2);
        System.out.println(success ? "Thay đổi tên thành công" : "Thay đổi tên thất bại");
    }

    public static void checkFileOrFolder(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("path is Folder");
        } else {
            System.out.println(file.exists() ? "path is file" : "path is not exists");
        }
    }

    public static void getAllFile(String folderPath) {
        File file = new File(folderPath);
        if (file.isDirectory()) {
            for (String fileName : file.list()) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Đường dẫn ko hợp lệ!");
        }
    }

    //________________________________ Đọc File _______________________________________
    public static void readFile(String path) throws IOException {
        if (checkFileExists(path)){
            FileInputStream fileInputStream = new FileInputStream(path);
            //read 1kb
            byte[] b = new byte[1024];
            // convert kb to length of string
            int length = fileInputStream.read(b);
            while (length > -1){
                String content = new String(b, 0, length);
                System.out.println(content);
                System.out.println("________________________________");
                length = fileInputStream.read(b);
            }
            fileInputStream.close();
        }
    }

    //________________________________ Viết File _______________________________________
    public static void writeFile(String path) throws IOException {
        if (checkFileExists(path)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mọi b nhập nội dung");
            String content = scanner.nextLine();
            FileOutputStream fileOutputStream = new FileOutputStream(path, true);
            // Xuống dòng
            fileOutputStream.write(System.getProperty("line.separator").getBytes());
            fileOutputStream.write(content.getBytes());
            fileOutputStream.close();
            }
        }
}

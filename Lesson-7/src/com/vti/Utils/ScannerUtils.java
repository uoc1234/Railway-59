package com.vti.Utils;

import java.util.Scanner;

public class ScannerUtils {
    static Scanner scanner = new Scanner(System.in);
    // Nhập vào 1 số có giá trị min, max = giá trị mình truyền vào menu
    public static int choseMenu(int min, int max){
        System.out.println("Mời bạn nhập vào số từ " + min + " tới " + max);
        int kq = 0;
        while (true){
            kq = Integer.valueOf(scanner.nextLine());
            if (kq < min || kq > max){
                System.out.println("Giá trị không hợp lệ, mời nhập lại: ");
                continue;
            } else {
                break;
            }
        }
        return kq;
    }

    // Nhập vào user Name: độ dài < 6

    // Nhập pass.....

}

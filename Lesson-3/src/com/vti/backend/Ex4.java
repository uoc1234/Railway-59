package com.vti.backend;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        ex4.ques13();
    }

    public void ques1(){
        // Nhập ký tự từ màn hình
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập vào 1 chuỗi: ");
        String rs = sc.nextLine();

        System.out.println("Số lượng từ có trong chuỗi là ( tính cả khoảng trắng): " + rs.length());

        System.out.println("Số lượng từ có trong chuỗi là ( ko tính cả khoảng trắng): " + rs.replace(" ", "").length());

        System.out.println("Ký tự ở vị trí thứ 2 là: " + rs.charAt(2));

    }

    public void ques2(){
        String s1 = "123456";
        String s2 = "24";
        System.out.println(s1.concat(s2));
    }

    public void ques3(){

        String s1 = "abcncbacd amva ";
        String s2 = "ABC";
//        System.out.println(s1.toUpperCase());

        // bỏ khoảng trắng ở đầu chuỗi: dùng hàm .trim()
        String chu_cai_dau_viet_hoa = String.valueOf(s1.trim().charAt(0)).toUpperCase();
        String kq = chu_cai_dau_viet_hoa + s1.substring(1,s1.length());
        System.out.println(kq);
    }

    public void ques13(){
        String input = "1abc";
        boolean check = true;
        for (int i = 0; i < input.length(); i++) {
            if (!input.substring(i, i+1).getClass().equals(String.class)) {
                check = false;
            }
        }
        System.out.println(check);
    }
}

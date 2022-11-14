package com.vti.backend;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.ques1();

        int a = 4;

        Integer.valueOf(a);
    }

    public void ques1(){
        float luong_1 = 5240.5f;
        float luong_2 = 10870.055f;

        int lam_trong_l1 = (int) luong_1;
        System.out.println("Làm tròn lương 1 là: " + lam_trong_l1);

        int lam_trong_l2 = (int) luong_2;
        System.out.println("Làm tròn lương 2 là: " + lam_trong_l2);
    }

    public void ques2(){
        Random random = new Random();
        // Sẽ random từ 0 đến maxValue - 1
        int x = random.nextInt(99999);
        System.out.println("Số x random ra là: " + x);
        if (x < 10){
            System.out.println("0000" + x);
        } else if (x < 100) {
            System.out.println("000" + x);
        }
    }
}

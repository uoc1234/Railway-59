package com.vti.backend;

public class Debug {
    public static void main(String[] args) throws Exception {
        Debug debug = new Debug();

            debug.vd2();

    }

    public void vd1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Số i là : " + i);
            if (i % 2 == 0) {
                System.out.println("chỉ lấy số chẵn: " + i);
                continue;
            }
            System.out.println("Số lẻ thì xuống đây " + i);
            if (i == 7) {
                System.out.println("i = 7 thì dừng vòng lặp hiện tại");
                break;
            }
        }
    }

    public void vd2() throws Exception {
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println(100 / (i - 3));
            } catch (Exception id) {
                throw new Exception("ko thể chia cho 0");
            }

        }
    }

    public void vd3() {
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(1);
        System.out.println(2 / 0);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);

    }

    public void vd4() {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[4]);
    }

}

package dataType;

public class Primitive {
    public static void main(String[] args) {
        // Số nguyên
        char char_1 = '!'; // (2 byte)
        byte number_1 = 'y'; // -128 -> 127 (1 byte)
        short number_2; // -32 768 -> 32 767 (2 byte)
        int number_3; // -2^31 -> (2^31 - 1) (4 byte)
        long number_4; // -2^62 -> (2^63 - 1) (8 byte)

        // Số thực
        float number_5; // tối đa 7 chữ số thập phân
        double number_6 = 1.6; // tối đa 16 chữ số thập phân

        // logic
        boolean logic; // true or false

        System.out.println(number_1);
    }
}

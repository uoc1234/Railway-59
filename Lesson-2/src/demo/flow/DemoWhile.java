package demo.flow;

public class DemoWhile {
    public static void main(String[] args) {

        // Kiểm tra điều kiện trước -> hành động
        System.out.println("Demo while");
        int i = 6;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do - while: Thực hiện hành động trong do trước -> kiểm tra điều kiện
        System.out.println("Demo do while");
        int abc = 0;
        do {
            abc ++;
            System.out.println(i);
        } while (i < 5);

    }
}

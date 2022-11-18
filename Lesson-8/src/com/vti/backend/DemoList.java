package com.vti.backend;

import java.util.*;

public class DemoList {
//    - ArrayList và LinkedList sử dụng khá giống nhau. Điểm khác nhau thật sự nằm ở sự triển khai và hoạt động phía bên trong của chúng

//    - Vector gần giống với ArrayList. điểm khác biệt là Vector được synchronize. Vì vậy, nó sẽ tốn tài nguyên hơn so với ArrayList.
//    Thông thường, hầu hết mọi người sẽ sử dụng ArrayList thay vì Vector, họ sẽ tự điều khiển việc synchronize theo cách của họ.

//    - Sự khác biệt về hiệu suất của chúng là điều dễ nhận thấy. LinkedList nhanh hơn trong quá trình add và remove,
//    nhưng chậm hơn trong get. Dựa trên bảng độ phức tạp thuật toán ở trên và kết quả test, chúng ta có thể biết
//    được khi nào nên dùng cái gì. Nói ngắn gọn , LinkedList nên được sử dụng nếu :
//    * Không có một lượng lớn truy cập ngẫu nhiên đến các phần tử
//    * Có một lượng lớn quá trình add/remove
    public static void main(String[] args) {
        DemoList demo = new DemoList();
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
    }
    public void demoArrayList(){
        List<Integer> integers = new ArrayList<>();
        // Thêm dữ liệu
        integers.add(1);
        integers.add(2);

        // Số lượng phần tử trong list
        int size = integers.size();
        System.out.println("Size: " + size);

        // Lấy 1 phần từ theo index
        Integer kq = integers.get(0);
        System.out.println("Phần từ có index 0: " + kq);

        System.out.println(integers);

        // Xoá phần tử trong list
        integers.remove(0);
        System.out.println(integers);
    }

    public void demoLinkedList(){
        List<Integer> integers = new LinkedList<>();
        // Thêm dữ liệu
        integers.add(2);
        integers.add(3);
        integers.add(2);
        integers.add(1);

        // Số lượng phần tử trong list
        int size = integers.size();
        System.out.println("Size: " + size);

        // Lấy 1 phần từ theo index
        Integer kq = integers.get(0);
        System.out.println("Phần từ có index 0: " + kq);

        System.out.println(integers);

        // Xoá phần tử trong list
        integers.remove(0);
        System.out.println(integers);
    }

}


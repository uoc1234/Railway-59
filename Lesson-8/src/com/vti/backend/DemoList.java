package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
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
    }
}

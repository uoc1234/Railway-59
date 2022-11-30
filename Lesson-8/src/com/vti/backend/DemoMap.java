package com.vti.backend;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        DemoMap demoMap = new DemoMap();
        demoMap.demoHashMap();
    }

    // Các key được lưu trữ dưới dạng HashTable
    // Không biết trước được thứ tự của các phần tử
    public void demoHashMap(){
        Map<String, String > map = new HashMap<>();
        map.put("key 3", "giá trị 3");
        map.put("key 1", "giá trị 1");
        map.put("key 2", "giá trị 2");
        System.out.println(map);
    }

    public void demoHashTable(){
        Map<String, String > map = new Hashtable<>();
        map.put("key 3", "giá trị 3");
        map.put("key 1", "giá trị 1");
        map.put("key 2", "giá trị 2");
        System.out.println(map);
        System.out.println(map.get("key 1"));
    }
}

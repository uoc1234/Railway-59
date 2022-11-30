package com.vti.backend;

import com.vti.entity.Role;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        DemoSet demoSet = new DemoSet();
        demoSet.demoHashSet();
    }

    public void demoHashSet(){
        Set<String> setA = new HashSet<>();
        setA.add("B");
        setA.add("A");
        setA.add("A");
        setA.add("C");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa A không? " + setA.contains("A"));
        System.out.println("setA có chứa D không? " + setA.contains("D"));
    }

    public void demoLinkedHashSet(){
        Set<String> setA = new LinkedHashSet<>();
        setA.add("B");
        setA.add("A");
        setA.add("A");
        setA.add("C");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa A không? " + setA.contains("A"));
        System.out.println("setA có chứa D không? " + setA.contains("D"));
    }

    public void demoSortedSet(){
        SortedSet<String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");
        // Displaying the TreeSet
        System.out.println(ts);
        ts.stream().unordered();
        // Removing items from TreeSet
        // using remove()
        ts.remove("A");
        System.out.println("Set after removing "
                + "Australia:" + ts);

        for (String t : ts) System.out.println(t);
    }

    //Duyệt các phần của một Set trong Java
    public void demoIterator(){
        Set<String> setA = new HashSet<>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: ");
        Iterator<String> iterator = setA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void demoEnumSet(){
        Set<Role> setA = EnumSet.of(Role.ADMIN, Role.EMPLOYEE, Role.EMPLOYEE);
        setA.add(Role.ADMIN);
        System.out.println(setA);
        setA.remove(1);
    }
}

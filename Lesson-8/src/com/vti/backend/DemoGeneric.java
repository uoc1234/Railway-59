package com.vti.backend;

import java.time.LocalDate;
import java.util.Date;

public class DemoGeneric {
    public static void main(String[] args) {
        DemoGeneric demoGeneric = new DemoGeneric();
        demoGeneric.print(1,"5");
        Test<Integer> test = new Test(1,"name");
        test.setId(1);
        test.setName("Nguyễn Văn A");
        System.out.println(test);
        Date date = new Date(1999,11,11);

        InnerClass.Test b = new InnerClass().new Test();
        LocalDate localDate = LocalDate.of(2022,07,22);
    }

    public <T> void print(T a, T b){
        System.out.println(a);
        System.out.println(b);
    }
}

class Test<T>{
    private T id;
    private String name;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Deprecated
        public Test(T id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class A{
    int id;

    static class B{
        String name;
    }
}
package com.vti.demo.oop;

import com.vti.entity.Answer;

public class Con extends Cha{


    public Con() {
    }

    public static void main(String[] args) {
        Con con = new Con();
        con.id = 3;
    }

    public void abc(){
        System.out.println("Từ con");
    }



}

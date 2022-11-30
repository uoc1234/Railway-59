package com.vti.demo.oop;

import com.vti.entity.Answer;

public abstract class AbtractClassA {
    int id;

    Answer answer;

    protected void abc() {
        System.out.println("Từ cha");
    }

    abstract void abc2();

    public AbtractClassA(){
    }



    // 1) Khả năng truy cập: - I: public, ab class: all;
    // 2) ab class: Có thể tạo method đầy đủ, I: thì ko.
    // 3) I: chỉ có hằng số, ko thay đổi đc giá trị
    // 4) abtr class: có contructor.....
}

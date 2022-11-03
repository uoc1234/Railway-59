package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float mark;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.mark = 0;
    }

    public Student() {

    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void congDiem(float diemCong){
        this.mark = this.mark + diemCong;
    }

    public void inThongTin(){
        System.out.println("Tên là: " + this.name);
        if (this.mark < 4){
            System.out.println("Học lực yếu!");
        } else if (this.mark > 4 && this.mark < 6) {
            System.out.println("Học lực trung bình!");
        } else if (this.mark > 6 && this.mark < 8) {
            System.out.println("Học lực khá!");
        } else {
            System.out.println("Học lực giỏi!");
        }
        System.out.println(this.mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

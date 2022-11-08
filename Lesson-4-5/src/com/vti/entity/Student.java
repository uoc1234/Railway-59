package com.vti.entity;

public abstract class Student extends Person{
    int id;

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }
}

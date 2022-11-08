package com.vti.entity;

public class HighSchoolStudent extends Student{

    String clazz;

    String desiredUniversity;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(id, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

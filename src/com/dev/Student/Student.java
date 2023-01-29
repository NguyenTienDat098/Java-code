package com.dev.Student;

public class Student {
    private String name;
    private int age;
    private float point;
    private String classes;


    public Student(String name, int age, float point, String classes) {
        this.name = name;
        this.age = age;
        this.point = point;
        this.classes = classes;
    }

    public void getInfo() {
        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Lop: " + this.classes);
        System.out.println("Diem: " + this.point);
    }

    public void setInfo(String name, int age, float point, String classes) {
        this.name = name;
        this.age = age;
        this.point = point;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getAge() {
        return this.age;
    }

    public float getPoint() {
        return this.point;
    }

    public String getClasses() {
        return this.classes;
    }

    public String getName() {
        return this.name;
    }
}

package com.neha;

class Student0 {

    private String name;
    private int age;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SimpleEnapsulation {

    public static void main(String[] args) {
        Student0 obj = new Student0();
        obj.setName("Neha");
        obj.setAge(19);
        System.out.println("Name: " + obj.getName() + " Age: " + obj.getAge());
    }
}

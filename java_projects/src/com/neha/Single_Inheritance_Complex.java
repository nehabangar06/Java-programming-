package com.neha;

class Person {
	String name;
	int age;
	
	public void displayDetails() {
		System.out.println("Name" + " " + name);
		System.out.println("Age" + " " + age);
	}
}

class Student extends Person {
	String studentID;
	
	public void displayStudentInfo() {
		displayDetails();
		
		System.out.println("Student ID" +" " + studentID);
		
	}
}

public class Single_Inheritance_Complex {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "Yuvraj";
		obj.age = 20;
		obj.studentID = "123410";
		obj.displayStudentInfo();
	}
}

package com.neha;

class Animal1{
	public void sound() {
		System.out.println("Animal makes sound");
	}

}

class Cats extends Animal1{
	public void sound() {
		System.out.println("Meow");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		Animal1 obj=new Cats();
		obj.sound();
		
	}

}

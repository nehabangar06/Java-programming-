package com.neha;

class Animal{
	public void Eat() {
		System.out.println("Animal can Eat");
	}
}

class Cat extends Animal{
	public void Meow() {
		System.out.println("Meowwwwwww");
	}
}

class Kitten extends Cat{
	public void Jump() {
		System.out.println("Jump Like Rabbit");
	}
}


public class Multi_Level_Inheritance {
	public static void main(String[] args) {
		Kitten k = new Kitten();
		k.Eat();
		k.Meow();
		k.Jump();
	}
}

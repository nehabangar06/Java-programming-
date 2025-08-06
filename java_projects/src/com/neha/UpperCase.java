package com.neha;

public class UpperCase {
	
	String name="neha";
	String sentence="how are you?";
	
	public void print() {
		System.out.println(name.toUpperCase());
		System.out.println(sentence);
		System.out.println(sentence.length());
	}
	
	public static void main(String[] args) {
		UpperCase obj = new UpperCase();
		obj.print();
	}
			
			

}

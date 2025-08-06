package com.neha;

public class ImmutableString {
	
	String name = "Yuvraj";
	public void print() {
		System.out.println(name);
		System.out.println(name.concat(" " + "Shinde"));
	}
	public static void main(String[] args) {
		
		ImmutableString obj = new ImmutableString();
		obj.print();
		

	}

}

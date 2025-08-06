package com.neha;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			 System.out.print("Enter the first number: ");
	            int num1 = sc.nextInt();

	            System.out.print("Enter the second number: ");
	            int num2 = sc.nextInt();
	            sc.close();
	            
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	            
		} catch (Exception e) {
			System.out.println("Sorry! Cannot Divide by zero.");
			
			} finally {
				System.out.println("Thank You for Using Our Calculator");
				
			}
		}
	}

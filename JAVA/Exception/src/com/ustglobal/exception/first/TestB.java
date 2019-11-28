package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int a=10;
		int b=0;
		try {
			b=10/0;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Happy Deepavli");
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Number divide by zero");
		}
		System.out.println(b);
		
		System.out.println("Main method ended");
	}
}

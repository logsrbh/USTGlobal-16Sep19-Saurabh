package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main Started");

		int[] a = {0,2,30};
		int b=10;

		try {
			System.out.println(a[2]);
			System.out.println(b/0);

		}catch(ArithmeticException ae) {
			System.out.println("Number divided byb zero");
		
		}catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("array inex not present");
		}
		
		System.out.println("Main Ended");
	}

}

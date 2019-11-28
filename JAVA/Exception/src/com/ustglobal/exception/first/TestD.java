package com.ustglobal.exception.first;

public class TestD {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		String s=null; 
		int[] a = {0,2,30};
		int b=10;

		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[3]);
			System.out.println(b/0);

		}catch(NullPointerException npe) {
			System.out.println("Dont play with null");
			
		}catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index not present");
		
		}catch(ArithmeticException ae) {
			System.out.println("Number divided by zero");
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Main Ended");
	}

}

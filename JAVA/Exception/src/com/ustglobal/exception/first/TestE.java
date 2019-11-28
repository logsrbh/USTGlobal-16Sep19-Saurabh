package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		String s="hello"; 
		int[] a = {0,2,30};
		int b=10;

		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Ocured");
		}
		System.out.println("Main Ended");
	}

}

package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a; // boxing or auto boxing
		System.out.println("i is "+i);
		
		Integer x =10;
		System.out.println("x ix "+x);
		
		int y =x;	//  unboxing auto un boxing0
		System.out.println("y is "+y);
		
		
		int value = Integer.parseInt("123");
		System.out.println("Value is "+value);
		
		boolean result = Boolean.parseBoolean("123true");
		System.out.println("Value is "+result);
	}

}

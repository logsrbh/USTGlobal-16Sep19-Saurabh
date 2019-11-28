package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		MyString ms = new MyString(12, "Renu");
		System.out.println(ms.getName());
		System.out.println(ms.getRoll());
		System.out.println(ms);
		
		MyString ms1 = ms.changeContent(20,"Pooja");
		System.out.println(ms.getName());
		System.out.println(ms.getRoll());
		System.out.println(ms);
		System.out.println("=====================");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRoll());
		System.out.println(ms1);
		
	}
}

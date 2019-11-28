package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s = new Student(10, "Ranga", 98.23);
		
		System.out.println(s.hashCode());
		System.out.println(s.toString());
	}
}

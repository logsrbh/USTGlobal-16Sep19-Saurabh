package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestE {
	
	public static void main(String[] args) {
		
		Supplier<Student> s =()-> new Student(27, "Vijay", 63.3);
		
		Student s1 =s.get();
		System.out.println();
		System.out.println("Id is "+s1.id);
		System.out.println("Name is "+s1.name);
		System.out.println("Percentage is "+s1.percentage);
		
		
		Supplier<Integer> i = ()->20;
		
		Integer i1 =i.get();
		System.out.println("Integer value is "+i1);
		
		Supplier<String> sp = ()-> "Good Evevning";
		System.out.println("String value is "+sp.get());
		
		
		
	}

}

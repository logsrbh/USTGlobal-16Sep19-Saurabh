package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Hritik",96.3);
		Consumer<Integer> c = s -> System.out.println(s*s);
		
		
		c.accept(20);
		
		
		
		Consumer<Student> c1 = s->{
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		};
		
		c1.accept(s1);
	}

}

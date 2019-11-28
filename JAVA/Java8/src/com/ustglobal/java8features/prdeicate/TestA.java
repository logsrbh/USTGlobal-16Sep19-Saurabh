package com.ustglobal.java8features.prdeicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Amit", 25000.60);
		Employee e2 = new Employee(102, "Arya", 65040.50);
		Employee e3 = new Employee(103, "Atul", 25406.20);
		Employee e4 = new Employee(104, "Akki", 15600.30);

		
		Predicate<Employee> p = e->{
			if(e.sal > 15000) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(p.test(e1));
		
		
	}

}

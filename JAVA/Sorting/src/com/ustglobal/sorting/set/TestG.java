package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(12,"Sweety",45000.0);
		Employee e2 = new Employee(15,"Teju",50000.0);
		Employee e3 = new Employee(11,"Giri",25000.0);
		Employee e4 = new Employee(5,"Sheela",15000.0);
		Employee e5 = new Employee(5,"Sheela",15000.0);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);

		System.out.println("***********Using Iterator************ ");

		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is  "+e.id);
			System.out.println("Name is  "+e.name);
			System.out.println("Sal is  "+e.salry);
			System.out.println("=======================================");
		}
				
	}
}

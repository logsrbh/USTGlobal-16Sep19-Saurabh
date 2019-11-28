package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "AMit", 265423.23);
		Employee e2 = new Employee(30, "Dinga", 35678.23);
		Employee e3 = new Employee(45, "Amrit", 56897.69);
		Employee e4 = new Employee(96, "Rajesh", 12598.36);
		Employee e5 = new Employee(12, "Kriti", 18975.36);
		Employee e6 = new Employee(18, "Himanish", 78246.56);
		Employee e7 = new Employee(26, "Divya", 85634.26);
		Employee e8 = new Employee(32, "Nusrat", 98715.36);
		Employee e9 = new Employee(89, "Anand", 16347.56);
		
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		ArrayList<Employee> al3 = new ArrayList<Employee>();
		
		al3.add(e7);
		al3.add(e8);
		al3.add(e9);
		
		HashMap<String, ArrayList<Employee>> hs = new HashMap<String, ArrayList<Employee>>();
		hs.put("Manager1", al1);
		hs.put("Manager2", al2);
		hs.put("Manager3", al3);
		
		ArrayList<Employee> first = hs.get("Manager3");
		
		Iterator<Employee> it =  first.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Percentage is " + s.sal);
			System.out.println("=======================================");
		}
		
		
		
		
	}

}

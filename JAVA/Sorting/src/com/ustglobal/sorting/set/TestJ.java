package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		CustSortByName sc = new CustSortByName();
		CustById sid = new CustById();
		CustSortBySal ss = new CustSortBySal();
		
		TreeSet<Customer> ts = new TreeSet<Customer>(ss);
		Customer c1 = new Customer("Amit", 10, 50000);
		Customer c2 = new Customer("Neha", 56, 35460);
		Customer c3 = new Customer("Divya", 32, 78952);
		Customer c4 = new Customer("Rohit", 48, 51249);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("***********Using Iterator************ ");

		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer b = it.next();
			System.out.println("Id is  "+b.id);
			System.out.println("Name is  "+b.name);
			System.out.println("Salary "+b.sal);
			System.out.println("=======================================");
		}
		
	}
}

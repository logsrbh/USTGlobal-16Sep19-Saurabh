package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	
	public static void main(String[] args) {
		
	
	LinkedList<Laptop> l = new LinkedList<Laptop>();
	
	Laptop lp1 = new Laptop(20500.59, 12, "ThinkPad");
	Laptop lp2 = new Laptop(18790.50, 8, "Dell");
	Laptop lp3 = new Laptop(35698.02, 4, "MAC");
	Laptop lp4 = new Laptop(78963.80, 32, "Asus");
	
	l.add(lp1);
	l.add(lp2);
	l.add(lp3);
	l.add(lp4);
	
	l.add(new Laptop(52301.50, 16, "Vostro"));
	
	
	System.out.println("-----------------------------");
	System.out.println("Before Sorting ----->");
	System.out.println("-----------------------------");
	displayLaptopDetails(l);
	System.out.println("-----------------------------");
	Collections.sort(l);
	System.out.println("After Sorting ------>");
	System.out.println("-----------------------------");
	displayLaptopDetails(l);
	System.out.println("-----------------------------");
	
	}

	
	static void displayLaptopDetails(LinkedList<Laptop> l){
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop a = it.next();
			System.out.println("Brand is "+a.name);
			System.out.println("Price is "+a.price);
			System.out.println("Ram is "+a.ram);
		}
	}
}

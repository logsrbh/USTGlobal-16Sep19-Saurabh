package com.ustglobal.sorting.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen {

	public static void main(String[] args) {
		
		ArrayList<Pen> al = new ArrayList<Pen>();
		
		Pen p1 = new Pen(10, "cello");
		Pen p2 = new Pen(25, "Rotomac");
		Pen p3 = new Pen(96, "Montex");
		Pen p4 = new Pen(45, "Pilot");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("Before Sorting ------>");
		displayPenDetails(al);
		Collections.sort(al);
		System.out.println("After SOrting--------->");
		displayPenDetails(al);
		
	}
	
	
	static void displayPenDetails(ArrayList<Pen> al) {
		Iterator<Pen> it = al.iterator();
		while(it.hasNext()) {
			Pen d =it.next();
			System.out.println("Price is "+d.price);
			System.out.println("Brand is "+d.brand);
			System.out.println("----------------------------------");
		}
	}
}

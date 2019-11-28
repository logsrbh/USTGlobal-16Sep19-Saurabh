package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		
		Marker m1 = new Marker(20.50, "Red");
		Marker m2 = new Marker(56.35, "BLack");
		Marker m3 = new Marker(60.85, "Yellow");
		Marker m4 = new Marker(57.36, "Green");
		
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		
		System.out.println("Before Sorting---------->");
		display(al);
		//SortByPrice sb = new SortByPrice();
		SortByColor sc = new SortByColor();
		//Collections.sort(al, sb);
		Collections.sort(al, sc);
		System.out.println("After SOrting ----------->");
		display(al);
		
		
	}
	static void display(ArrayList<Marker>a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price is "+m.price);
			System.out.println("Color is "+m.color);
			System.out.println("============================");
		}
	}

}

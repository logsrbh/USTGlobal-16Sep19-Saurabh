package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(20.50);
		al.add("Chinu");
		al.add(true);
		 	
		ListIterator li =al.listIterator();
		System.out.println("--------------->Forward");
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		
		System.out.println("<---------------Bakward");
		
		while(li.hasPrevious()) {
		 		Object o =li.previous();
		 		System.out.println(o);
		 	}
	}
}

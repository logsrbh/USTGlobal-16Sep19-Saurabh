package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		
		Vector li = new Vector();
		li.add(12);
		li.add(25.50);
		li.add("more");
		li.add("more");
		li.add("Shreya");
		li.add(null);
		
		
		System.out.println("==================Using For-Loop============");
		
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		
		
		
		System.out.println("===========Using Iterator===============");
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("===========Using List Iterator===============");
		
		ListIterator lit = li.listIterator();
		while(lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);
		}

		
		
		
		System.out.println("===========For Each Loop===============");
		for (Object o : li) {
			System.out.println(o);
		}
		
	}
}

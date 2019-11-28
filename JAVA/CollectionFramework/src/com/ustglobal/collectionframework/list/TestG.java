package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
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
		
//		System.out.println("==============Using has previous=======================");
//		
//		while(lit.hasPrevious()) {
//			Object o = lit.hasPrevious();
//			System.out.println(o);
//		}
//		
		
		
		
		System.out.println("===========For Each Loop===============");
		for (Object o : li) {
			System.out.println(o);
		}
		
	}
}

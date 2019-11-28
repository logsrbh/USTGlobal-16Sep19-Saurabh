package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("Hii");
		al.add("Anupama");
		al.add("Upama");
		al.add("Sabitha");
		
		String name = al.get(0);
		
		System.out.println(name.toUpperCase());
		
		
		
		System.out.println("====================Using Iterator================");
		Iterator<String> li = al.iterator();
		
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		
		
		System.out.println("=============Using List-Iterator================");
		
		ListIterator<String> li1 = al.listIterator();
		
		while(li1.hasNext()) {
			String s = li1.next();
			System.out.println(s);
		}
		
		
		System.out.println("===================Using For-Each Loop===============");
	
	
		for(String s : al) {
				System.out.println(s);
		}
	
	}
}

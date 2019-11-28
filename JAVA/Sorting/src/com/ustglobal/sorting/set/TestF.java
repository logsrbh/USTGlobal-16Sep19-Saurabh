package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Roopa");
		ts.add("Sheela");
		ts.add("Jaya");
		ts.add("Sushma");
		ts.add("Sushma");
		ts.add("Munni");
		
		
		System.out.println("***********Using For Each************ ");

		for(String s :ts) {
			System.out.println(s);
		}

		System.out.println("***********Using Iterator************ ");

		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}

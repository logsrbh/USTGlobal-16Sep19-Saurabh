package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> li = new LinkedHashSet<Double>();
		li.add(25.63);
		li.add(85.68);
		li.add(83.65);
		li.add(95.24);
		li.add(25.36);
		
		System.out.println("***********Using For Each************ ");

		for(Double d :li) {
			System.out.println(d);
		}

		System.out.println("***********Using Iterator************ ");

		Iterator<Double> it = li.iterator();
		while(it.hasNext()) {
			Double d = it.next();
			System.out.println(d);
		}


	}
}

package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(12);
		hs.add(45);
		hs.add("Nikitha");
		hs.add(56.7);
		hs.add(56.7);
		hs.add(null);
		hs.add(null);

		System.out.println("***********Using For Each************ ");

		for(Object o :hs) {
			System.out.println(o);
		}

		System.out.println("***********Using Iterator************ ");

		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}




	}

}

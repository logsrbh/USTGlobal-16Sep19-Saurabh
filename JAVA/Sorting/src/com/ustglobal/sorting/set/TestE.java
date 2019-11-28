
package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(14);
		ts.add(15);
		ts.add(63);
		ts.add(63);
		ts.add(42);
		ts.add(98);
	//	ts.add("deepika"); class cast Exception beause tresseset always accept generics
	//	ts.add(null); null is not allowed
		
		System.out.println("***********Using For Each************ ");

		for(Object o :ts) {
			System.out.println(o);
		}

		System.out.println("***********Using Iterator************ ");

		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		
	}
}

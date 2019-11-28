package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(20.50);
		al.add("Chinu");
		al.add(true);
		System.out.println(al.get(2));
		
		Iterator it = al.iterator();
		Object o =it.next();
		System.out.println(o);
		
		Object o1 =it.next();
		System.out.println(o1);
		
		Object o2 =it.next();
		System.out.println(o2);
		
		Object o3 =it.next();
		System.out.println(o3);
		
		boolean b = it.hasNext();
		System.out.println(b);
		
		
		
		
		System.out.println("==================Using For-loop================");
		for(int i=0; i<al.size();i++) {
			Object ol =al.get(i);
			System.out.println(ol);
		}
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(233.344);
		al1.add("momo");
		al1.add(false);
		
		System.out.println("=================Using Iterator=======================");
		
		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
			Object obj = it1.next();
			System.out.println(obj);
		}
		
	}
}

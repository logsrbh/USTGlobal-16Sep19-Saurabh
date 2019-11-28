package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(20.50);
		al.add("Chinu");
		al.add(true);
		al.add(null);
		al.add(true);
		al.add('A');
		System.out.println(al.get(2));
		
		for(Object o: al) {
			System.out.println(o);
		}
		
	}
}

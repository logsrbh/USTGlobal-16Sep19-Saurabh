package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("String");
		
		Object o = al.get(0);
		String s = (String)o;
		
		al.get(0);
		
		System.out.println(s.toUpperCase());
	}
}

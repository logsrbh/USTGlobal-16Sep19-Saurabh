package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(12);
		s.add(23);
		s.add(45);
		System.out.println();
		
		System.out.println("Using get() ----------");
		for(int i =0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println("SUing Pop() ----------");
		int j =s.size();
		for(int i = 0; i<j; i++) {
			System.out.println(s.pop());
		}
		
		System.out.println(s);
	}

}

package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(502);
		l.add(809);
		l.add(407);
		l.add(305);
		l.add(230);
		
		
		System.out.println("Before sort "+l);
		
		Collections.sort(l);
		
		System.out.println("After Sort "+l);
		
		Collections.reverse(l);
		System.out.println("After Reverse "+l);
		
		Collections.shuffle(l);
		System.out.println("After Shuffle "+l);
		
		
		
	}

}

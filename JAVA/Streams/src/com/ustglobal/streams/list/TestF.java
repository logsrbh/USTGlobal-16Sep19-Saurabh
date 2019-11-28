package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(25);
		marks.add(35);
		marks.add(30);
		marks.add(90);
		marks.add(45);
		
		
		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
		Integer i=it.next();
		System.out.println(i);
		}
		
		
		
		
	}

}

package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(45);
		al.add(35);
		al.add(89);
		al.add(78);
		al.add(47);
		al.add(12);
		al.add(20);
		al.add(45);
		
		
		List <Integer> l = al.stream().map(i->i+50).collect(Collectors.toList());
		
		for(Integer i : l) {
			System.out.println(i);
		}
		
		BiPredicate<Integer, Integer> b1 = (a,b) -> a+b>5;
		b1.test(10, 20);
		
		
		
		Set<Integer> s = al.stream().map(i-> i*i).collect(Collectors.toSet());
		
		for(Integer i : s) {
			System.out.println("Set values "+i);
		}
		
		
	}
}

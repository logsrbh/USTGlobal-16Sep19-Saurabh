package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String , Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Banglore", 560068);
		lh.put("Haryana", 134203);
		lh.put("Patna",800001);
		
		System.out.println("LinkedHashMap Data = "+lh);
		System.out.println("===============================");
		
		Set<String> s = lh.keySet();
		
		for(String key : s) {
			System.out.println(key);
		}
		System.out.println("===============================");
		System.out.println("Keyset = "+s);
		
		System.out.println("===============================");
		Collection<Integer> c =lh.values();
		
		for(Integer value : c) {
			System.out.println("Value is "+value);
		}
		System.out.println("===============================");
		System.out.println("Value "+c);
		System.out.println("===============================");
	}
}

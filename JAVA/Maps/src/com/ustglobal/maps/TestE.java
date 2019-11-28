package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		
		TreeMap<String , Integer> lh = new TreeMap<String, Integer>();
		lh.put("Patna",800001);
		lh.put("Banglore", 560068);
		lh.put("Haryana", 134203);
		lh.put("Patna",800001); // Duplicates not allowed
		//lh.put(null, 123456); // Null Pointer Exception (null is not allowed)
		//lh.put(null,null); //  Null Pointer Exception (null is not allowed)
		
		
		System.out.println("TreeMap Data ="+lh);
		System.out.println("=======================================");
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			
			System.out.println("Key is "+key+" -- "+"Value is "+value);
			System.out.println("=======================================");
		}
		
	}

}

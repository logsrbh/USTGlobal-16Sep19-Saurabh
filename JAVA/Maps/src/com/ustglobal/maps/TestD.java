package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		LinkedHashMap<String , Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Banglore", 560068);
		lh.put("Haryana", 134203);
		lh.put("Patna",800001);
		
			
	    System.out.println(lh.entrySet());
	    
	    for(Map.Entry<String, Integer> m : lh.entrySet()) {
	    	String key = m.getKey();
	    	Integer value = m.getValue();
	    	System.out.println("Key is "+key+"-------"+" Value is "+value);
	    }
	}
}

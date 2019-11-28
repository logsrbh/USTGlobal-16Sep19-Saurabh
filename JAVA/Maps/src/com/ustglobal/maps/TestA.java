package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		hm.put("Kuku", 998104);
		hm.put("Mala", 678914);
		hm.put("Sheela",788789);
		hm.put(null, 123456); // it allows null
		hm.put(null, 12568); // it will replace the previous null values.
	
		System.out.println("Data " +hm);
		
		hm.put("Mala",789899); // it will replace the previous value of Mala Key Cannot be duplicate. 
		
		System.out.println("After Modify "+hm);
		
		hm.put("dimple",789899); // it will  create a new entry for dimple value can be duplicate.
		
		System.out.println("After Dimple "+hm);
		
		System.out.println("Value of key (Sheela) if present = "+hm.get("Sheela"));
		
		System.out.println("=========================");
		
		System.out.println("Value of Key (Ramesh) if present = " +hm.get("Ramesh"));
		System.out.println("==========================");
		
		Object value = hm.remove("Kuku");
		System.out.println("After removing key (kuku) Value " +value );
		
	}

}

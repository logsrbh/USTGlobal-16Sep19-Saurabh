package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Kuku", 998104);
		hm.put("Mala", 678914);
		hm.put("Sheela",788789);
		
		
		HashMap hm1 = new HashMap();
		hm1.put("Deepu",78909);
		hm1.put("Riya",678900);
		hm1.put("Kriti",467882);
		
		
		boolean hasKey = hm.containsKey("Mala");
		System.out.println("Has Key "+hasKey);
		
		System.out.println("===========================");
		
		boolean hasValue = hm.containsValue(788789);
		System.out.println("Has Value "+hasValue);
		
		hm.putAll(hm1);
		
		System.out.println("===========================");
		
		System.out.println("After putAll "+hm);
		
		System.out.println("===========================");
		
		System.out.println("Size is = "+ hm.size());
		
		System.out.println("===========================");
		
		System.out.println("isEmpty = " +hm.isEmpty());
		
		System.out.println("===========================");
		
		hm.clear();
		
		System.out.println("After Clear "+hm);
	}

}

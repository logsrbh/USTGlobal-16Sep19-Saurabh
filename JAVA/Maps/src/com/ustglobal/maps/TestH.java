package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
		
		hs.put(500, "Vijay");
		hs.put(156, "Sohail");
		hs.put(422, "Divya");
		hs.put(301, "ShriRam");
		hs.put(842, "ShriRam");
	//	hs.put(108, null);// we cannot add null
	//	hs.put(null, "Divas");// we cannot add null
		

		System.out.println("Data "+hs);
	}
}

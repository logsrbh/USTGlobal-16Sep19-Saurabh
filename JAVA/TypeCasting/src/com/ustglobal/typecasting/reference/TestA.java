package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Marker();
		System.out.println(p.cost);
		p.write();
//		System.out.println(p.size); 	Not possible 
//		p.color();						Not possible
		
		Marker m = (Marker) p; // downcasting
		System.out.println(m.size);
		m.color();
	
	}
}

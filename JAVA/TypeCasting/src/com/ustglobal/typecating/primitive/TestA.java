package com.ustglobal.typecating.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a =10;
		int b = a; //Implicit
		
		System.out.println("b is " +b);
		
		int p= 20;
		double q = p;
		System.out.println("q is "+q);
	
		double u =20.35;
		int v = (int) u; //Explicit
		byte w = (byte) v;
		char c =(char) v;
		System.out.println("v is "+v);
		System.out.println("W is "+w);
		System.out.println("C is "+c);
		
	}
}

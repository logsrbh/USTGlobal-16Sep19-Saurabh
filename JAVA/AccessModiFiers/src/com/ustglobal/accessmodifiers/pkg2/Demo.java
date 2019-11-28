package com.ustglobal.accessmodifiers.pkg2;

public class Demo {
	private int a= 10;
	long b = 700l;
	protected double c = 76.89;
	public String d ="Anu";
	
	private void add() {
		System.out.println("private demo add() method");
	}
	
	void sub() {
		System.out.println("default demo sub() method");
	}
	
	protected void mul() {
		System.out.println("protected demo mul() method");
	}
	
	public void div() {
		System.out.println("public  demo div() method");
	}
	
	
	
}

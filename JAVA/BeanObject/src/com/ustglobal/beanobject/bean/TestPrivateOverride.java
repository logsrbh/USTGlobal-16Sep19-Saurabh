package com.ustglobal.beanobject.bean;

public class TestPrivateOverride {
	
	
	private void m1() {
		System.out.println("First m1");
	}
}

class Abc extends TestPrivateOverride{
	
	
	private void m1() {
	 System.out.println("Second m1");	

	}
	
	
}

class Main{
	
	public static void main(String[] args) {
		
		Abc a = new Abc();
		//a.m1(); it will throw error method is not visible because of the private Access Modifier.
		
	}
}

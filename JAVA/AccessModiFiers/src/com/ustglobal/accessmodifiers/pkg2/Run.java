package com.ustglobal.accessmodifiers.pkg2;

public class Run {
public static void main(String[] args) {
	Demo d = new Demo();
//	System.out.println(d.a);  Not Possible private
//	d.add();				Not possible private
//	
	System.out.println(d.b);   // protected
	d.sub();					//protected
	System.out.println(d.c);	//default
	d.mul();					//default
	System.out.println(d.d);	//public
	d.div();					//public
}
}

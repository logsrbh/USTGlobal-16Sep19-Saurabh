package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
public static void main(String[] args) {
	Demo d = new Demo();
	
//	System.out.println(d.a);  Not Possible private
//	d.add();				Not possible private
//	
//	System.out.println(d.b);   // default
//	d.sub();					//default
	
	// We have to create an object of child to access the protected data members from parent class
	Sample s = new Sample();
	System.out.println(s.c);	//protected
	s.mul();					//protected
	System.out.println(d.d);	//public
	d.div();					//public
}

}

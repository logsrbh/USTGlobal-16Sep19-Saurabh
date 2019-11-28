package com.ustglobal.exception.first;

public class Paytm {
	void book() {
		System.out.println("Paytm Started");
		
		Irctc  ic = new Irctc();
		ic.confirm();
		
		
		
		
		System.out.println("Paytm ended");
		
		
	}

}

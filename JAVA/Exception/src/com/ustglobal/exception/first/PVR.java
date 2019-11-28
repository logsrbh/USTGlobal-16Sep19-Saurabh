package com.ustglobal.exception.first;

public class PVR {

	void book() {
		System.out.println("Booking Started");
		try {
			System.out.println(10/0);
			
			System.out.println("Booking Logic");
			
			System.out.println("Booking Successful ");
		
		}catch(ArithmeticException ae) {
		
			System.out.println("Booking Failed");
			
			throw ae;
		}
		
	}
}

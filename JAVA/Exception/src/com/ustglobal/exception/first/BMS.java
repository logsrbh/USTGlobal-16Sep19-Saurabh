package com.ustglobal.exception.first;

public class BMS {
	public static void main(String[] args) {
		System.out.println("BMS started");
		
		PVR p = new PVR();
		try {
			p.book();
			System.out.println("Booking Confirmed");
		}
		catch(ArithmeticException ae) {
			System.out.println("Booking Falied");
		}
		System.out.println("BMS Ended");
	}
}

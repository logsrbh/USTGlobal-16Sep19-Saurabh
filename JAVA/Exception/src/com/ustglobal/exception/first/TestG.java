package com.ustglobal.exception.first;

import javax.crypto.AEADBadTagException;

public class TestG {
public static void main(String[] args) {
	System.out.println("Main Started");
	Paytm p = new Paytm();
	
	try {
		p.book();
	}catch (ArithmeticException ae) {
		System.out.println("Execution caught in main");
	}
	finally {
		System.out.println("Eecuting finallly block");
	}
	System.out.println("MAin Ended");
	
}
}

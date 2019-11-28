package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread m1 = new MyIdThread();
		System.out.println("MyIdThread = "+m1.getId());
		
		System.out.println("Priority "+Thread.currentThread().getPriority());
		
	//	Thread.currentThread().setPriority(16); java.lang.IllegalArgumentException
		
		
		System.out.println("Main Ended");
	}
}

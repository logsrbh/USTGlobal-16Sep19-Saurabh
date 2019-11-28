package com.ustglobal.com.thread.defining;

public class TestThread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		MyThread ti = new MyThread();
		
		/*
		 * Don`t call run() method, it behaves like normal program
		 * All code will be executed inside main thread only
		 */	
		// ti.run();
		
		
		ti.start();
  //	ti.start();  java.lang.IllegalThreadStateException
		
		for(int i = 1; i<10 ; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
		
		
	}
}

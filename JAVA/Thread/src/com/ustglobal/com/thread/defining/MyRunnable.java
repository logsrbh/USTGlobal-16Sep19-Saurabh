package com.ustglobal.com.thread.defining;

public class MyRunnable extends Thread implements Runnable {
	
	@Override
	public void run() {

		for(int  i = 1 ; i<10 ; i++ ) {
			System.out.println("Child Thread");
		}
	}
	
     
	
}

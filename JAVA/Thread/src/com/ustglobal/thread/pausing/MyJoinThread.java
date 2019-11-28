package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread {
	
	
	public void run() {
		for(int i =0 ; i<10 ; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}
			System.out.println("Child Thread");
		}
	}

}

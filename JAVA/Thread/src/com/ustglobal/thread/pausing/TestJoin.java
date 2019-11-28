package com.ustglobal.thread.pausing;

public class TestJoin {

	public static void main(String[] args) {
		
		System.out.println("MAin Started");
		
		MyJoinThread t = new MyJoinThread();
		t.start();
		try {
			t.join(10000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int  i = 0 ; i<10 ; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
		
	}
}

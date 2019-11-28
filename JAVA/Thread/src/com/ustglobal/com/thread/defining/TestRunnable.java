package com.ustglobal.com.thread.defining;

public class TestRunnable {

	public static void main(String[] args) {

		System.out.println("Main Started");
		MyRunnable mr = new MyRunnable();

		/*
		 * mr.start; start() is undefined in MyRunnable
		 */
		Thread tr = new Thread(mr);

		tr.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		System.out.println("Main Ended");
	}
}

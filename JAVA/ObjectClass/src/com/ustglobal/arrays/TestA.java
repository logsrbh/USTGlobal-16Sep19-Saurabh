package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] num = new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		for(int i=0 ; i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		for(int j :num) {
			System.out.println(j);
		}
		
		System.out.println("=============================");
		char[] ch = {'a','b','c','d','e','f'};
		for(char c :ch) {
			System.out.println(c);
		}
		
		System.out.println("=============================");
		byte[] bt = {1,2,3,4,5};
		for(byte b : bt) {
			System.out.println(b);
		}
		System.out.println("==============================");
		
		for(int k=0 ; k<bt.length;k++) {
			System.out.println(k);
		}
		System.out.println("==============================");
		
		double[] db = {10.20,30.40,50.6,58.6,98.3};
		for(double d : db) {
			System.out.println(d);
		}
		System.out.println("=============================");
		
		for(int l=0 ; l<db.length;l++) {
			System.out.println(l);
		}
		System.out.println("==============================");
		
  
		String [] st = {"apple","orange","banana"};
		for(int i =0 ; i<st.length;i++) {
			System.out.println(st[i]);
			
		}
		System.out.println("================================");
		
		for(String s :st) {
			System.out.println(s);
		}
	
	}

}

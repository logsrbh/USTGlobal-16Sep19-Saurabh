package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {

		int[] num= {10,20,30,40,50};
		String [] st = {"apple","orange","banana"};

		//System.out.println(num[10]);// ArrayIndexoutofBondException
		receive(num);
		int[] values =getAraay();
		for(int val : values) {
			System.out.println(val);
		}
		resString(st);
		
		String[] str =getStrArray();
		for(String sti : str) {
			System.out.println(sti);
		}

	}




	static void receive(int[] numbers) {
		for(int nums : numbers) {
			System.out.println(nums);
		}
	}

	static int[] getAraay() {
		int[] values = {10,20,30,40,50};
		return values;
	}

	static void resString(String[] st) {
		for(String s : st) {
			System.out.println(s);
			
		}
	}
		static String[] getStrArray() {
			String [] st = {"apple","orange","banana"};
			return st;
		}










	}

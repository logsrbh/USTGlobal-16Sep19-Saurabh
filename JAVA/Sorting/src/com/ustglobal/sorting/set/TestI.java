package com.ustglobal.sorting.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		
		SortbyName sb = new SortbyName(); 
		SortByPincode sp = new SortByPincode();
		SortByMicr sm = new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		Bank b1 = new Bank("HDFC",560000,671236);
		Bank b2= new Bank("SBI",560073,6783256);
		Bank b3 = new Bank("CITI",560350,6775666);
		Bank b4= new Bank("CANANRA",560879,6784326);
		
		
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		
		System.out.println("***********Using Iterator************ ");

		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Id is  "+b.pincode);
			System.out.println("Pincode is  "+b.name);
			System.out.println("MICR "+b.micr);
			System.out.println("=======================================");
		}
		
		
				
	}

	

}

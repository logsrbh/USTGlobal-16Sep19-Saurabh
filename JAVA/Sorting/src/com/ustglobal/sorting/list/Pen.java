package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	@Override
	public int compareTo(Pen o) {
	
		Double s = this.price;
		Double d = o.price;
		
		return s.compareTo(d);
	}
	

}

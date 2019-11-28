package com.ustglobal.objectclass;

public class TestE {

	public static void main(String[] args) {
		
		Car c1 = new Car(2500000, "Audi", "White");
		
		Car c2 = new Car(3500000, "BMW", "Green");
		
		Car c3 = new Car(4500000, "BENZ", "Black");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c1);
		
		System.out.println(c2.hashCode());
		System.out.println(c2);
		
		System.out.println(c3.hashCode());
		System.out.println(c3);
		
	}
}

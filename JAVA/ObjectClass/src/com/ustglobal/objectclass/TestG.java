package com.ustglobal.objectclass;

public class TestG {
public static void main(String[] args) {
	Employee e1 = new Employee(10, "Dinga", 2500060.30);
	
	Employee e2 = new Employee(20, "Dingi", 1500036.82);
	
	Employee e3 = new Employee(10, "Dinga", 2500060.30);
	
	Employee e4 = e3;
	
	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
	System.out.println(e4.equals(e3));

	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println(e4);
	


}

}

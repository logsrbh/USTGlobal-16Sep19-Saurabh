package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Cow c1 = new Cow(10,"Gowri",25060.52);
		
		Cow c2 = new Cow(20,"Ganga", 44560.30);
		
		Cow c3 = new Cow(10,"Gowri",25060.52);
		
		Cow c4 = c3;
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(c4.equals(c3));
	}

}

package com.ustglobal.lambdaexpresssion;

public class TestSqure {
public static void main(String[] args) {
	SqureInterface sq = x->x*x;
	int value =sq.squre(2);
	System.out.println("Squre is "+value);
}
}

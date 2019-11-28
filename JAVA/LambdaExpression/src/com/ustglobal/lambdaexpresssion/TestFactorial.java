package com.ustglobal.lambdaexpresssion;

public class TestFactorial {
	public static void main(String[] args) {
		
		FactorialInterface fi =(n)->{
		int fact =1;
		for(int i=2; i<=n;i++) {
			fact = fact*1;
			
		}
		return fact;
		
		};
		
		int factorial =fi.factorial(5);
		System.out.println("Factorail of "+factorial);
	}

}

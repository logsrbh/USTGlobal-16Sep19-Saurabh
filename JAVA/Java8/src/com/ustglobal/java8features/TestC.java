package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {

	public static void main(String[] args) {
		
		
		Function<Integer, Integer> f = i->i*i;
		
		 Integer result = f.apply(10);
		 System.out.println("Result is "+result);
		
		
	}
}

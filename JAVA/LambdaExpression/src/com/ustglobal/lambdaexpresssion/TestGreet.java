package com.ustglobal.lambdaexpresssion;

public class TestGreet {
public static void main(String[] args) {
	
	Greet gr =(message)->{
		System.out.println("Hello");
		System.out.println(message);
		return message;
	};
	String ot =gr.greet("There");
	
}
}


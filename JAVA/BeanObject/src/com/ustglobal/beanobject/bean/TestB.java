package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scanner class");
		System.out.println("Enter age");  
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		
		System.out.println("Enter Words with space I will show you only one word ");
		String g = sc.next();
		System.out.println("I told you you word without space is "+g);
		
		System.out.println("Enter Words ");
		
		String sg = sc.nextLine();
		System.out.println("Your words are "+sg);
		
		  		
		
	}

}

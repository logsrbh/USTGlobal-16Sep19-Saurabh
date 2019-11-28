package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		try(Scanner sc = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in)){
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Age is "+age);
				System.out.println(age/0);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();;
			
		}finally {
			System.out.println("Finally Executed");
		}
		
		System.out.println("========================");
		
		
	}
}

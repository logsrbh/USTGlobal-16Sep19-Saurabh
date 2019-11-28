package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestS {

	public static void main(String[] args) {
		
	
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student(5, "Vikram",30.0));
	al.add(new Student(8, "Yadava",87.5));
	al.add(new Student(9, "Yaash",45.6));
	al.add(new Student(1, "Akshay",68.4));
	al.add(new Student(4, "Riktesh",75.4));
	
	
	
	
	
	 
	  Helper h = new Helper();
	  h.display(al);
	  System.out.println("Failed Students ");
	  h.displayFailedStudent(al);
	  System.out.println("Passes Students");
	  h.displayPassStudent(al);
	  h.dispTopper(al);
	  
	  
	
	
	
	
	}
}

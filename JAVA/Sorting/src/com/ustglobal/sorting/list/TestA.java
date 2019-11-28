package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(70, "Dimple", 63.3);
		Student s2 = new Student(28, "Sweety", 35.6);
		Student s3 = new Student(34, "Jimmy", 68.9);
		Student s4 = new Student(15, "Tummy", 76.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("----------------------------------");
		System.out.println("Before Sorting------>");
		System.out.println("----------------------------------");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After Sorting------->");
		System.out.println("----------------------------------");
		displayStudentDetails(al);
		
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s =it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("----------------------------------");
		}
	}
	
}

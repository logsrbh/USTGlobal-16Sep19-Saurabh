package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		
		Student s1 = new Student(21, "Divya", 67.39);
		Student s2 = new Student(38, "Pratibha", 77.45);
		Student s3 = new Student(10, "Bargahavi", 36.35);
		Student s4 = new Student(33, "Shruti", 78.90);
		Student s5 = new Student(17, "Neha", 83.62);
		Student s6 = new Student(23, "Priya", 98.35);
		Student s7 = new Student(45, "Disha", 21.03);
		Student s8 = new Student(22, "Kriti", 85.24);
		Student s9 = new Student(15, "Dimple", 12.35);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student> al3 = new ArrayList<Student>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		HashMap<String , ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("first",al1);
		hm.put("second",al2);
		hm.put("third",al3);
		
		
		ArrayList<Student> first = hm.get("third");
		
		Iterator<Student> it =  first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("=======================================");
		}
		
		
		
		
		
		
	}
}

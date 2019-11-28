package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestN {

	public static void main(String[] args) {

		Comparator<Employe> comp = (e1,e2)->{
			String s1 =e1.name;
			String s2 = e2.name;
			return s1.compareTo(s2);
		};
		
		
		
		
		TreeSet<Employe> ts = new TreeSet<Employe>(comp);
		
		Employe e1 = new Employe(4, "nikki",5.6);
		Employe e2 = new Employe(1, "baskar",5.2);
		Employe e3 = new Employe(5, "suresh",5.1);
		Employe e4 = new Employe(2, "dinesh",4.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		

		System.out.println("************ Using Iterator ************");
		
		Iterator<Employe> it = ts.iterator();
		while(it.hasNext()) {
			Employe e =it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("====================================");
		}

	}
}

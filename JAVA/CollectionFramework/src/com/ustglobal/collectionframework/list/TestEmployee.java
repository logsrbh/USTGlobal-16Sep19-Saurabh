package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestEmployee {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e1 = new Employee(10,"Karan","TestYAntra");
		Employee e2 = new Employee(20, "Abhlesh", "TestYantra");
		Employee e3 = new Employee(30, "Rajesh","TestYantra");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		
		System.out.println("==========================Using for-loop========================");
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("==========================Using for-Each-loop========================");
		for(Employee e : al) {
			System.out.println(e);
		}
		
		System.out.println("==========================Using Iterator========================");
		Iterator<Employee> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("==========================Using List-Iterator========================");
		
		ListIterator<Employee> li =al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
	}
}

package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {
	public static void main(String[] args) {
		
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee e1 = new Employee(101, "vijay");
		Employee e2 = new Employee(102, "yuvi");
		Employee e3 = new Employee(103, "dhoni");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		

		
		Comparator<Employee> cmp = (m1,m2) -> {
			return m1.name.compareTo(m2.name);
			};
			
		
		List<Employee> li= al.stream().sorted(cmp).collect(Collectors.toList());
		
		             Iterator<Employee> it   = li.iterator();
		             while(it.hasNext()) {
		            	Employee e = it.next();
		            	System.out.println("Name is "+e.name);
		            	System.out.println("Id is "+e.id);
		            	System.out.println("========================");
		            	
		             }
             
		
		
	}

}

package com.ustglobal.beanobject.bean;

public class Database {
	void receive(Student s) {
		System.out.println("Id id "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Roll NO is "+s.getRollNo());
	}
	
	void data(Employee e) {
		System.out.println("ID id "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSal());
		System.out.println("Dept Type "+e.getDept());
		System.out.println("Designation is "+e.getDesig());
	}




}

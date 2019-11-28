package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(10);
		s.setName("Shivgami");
		s.setRollNo(134);
	
		
		Employee e = new Employee();
		e.setId(10);
		e.setName("Dinga");
		e.setSal(350000);
		e.setDept("Technical");
		e.setDesig("Developer");
		
		
		
		Database db = new Database();
		db.receive(s);
		db.data(e);
	
		
		
		
	}
}

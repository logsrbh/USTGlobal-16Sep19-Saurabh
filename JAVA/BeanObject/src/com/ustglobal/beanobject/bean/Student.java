package com.ustglobal.beanobject.bean;

public class Student {

	private int id;
	private String name;
	private int rollNo;
	
	public Student() {
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
						
	}
	public String getName() {
		return name;
		
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
}


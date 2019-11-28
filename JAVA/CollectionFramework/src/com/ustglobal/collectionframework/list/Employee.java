package com.ustglobal.collectionframework.list;

public class Employee {
	
	int id;
	String name;
	String comp;
	public Employee(int id, String name, String comp) {
		super();
		this.id = id;
		this.name = name;
		this.comp = comp;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", comp=" + comp + "]";
	}
	
	

}

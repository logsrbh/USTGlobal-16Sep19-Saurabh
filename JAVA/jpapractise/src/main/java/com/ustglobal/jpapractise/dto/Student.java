package com.ustglobal.jpapractise.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Column
	private int age ;
	
	
	public int getId() {
		return sid;
	}
	public void setId(int id) {
		this.sid = id;
	}
	public String getName() {
		return sname;
	}
	public void setName(String name) {
		this.sname = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}

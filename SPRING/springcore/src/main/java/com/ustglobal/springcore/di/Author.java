package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Author {
	
	
	private String name;
	
	private String petName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	

}

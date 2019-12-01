package com.ustglobal.empwebapp.dto;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
public class EmployeeInfo {

	private int id;
	private String name;
	private String email;
	@Exclude
	private String password;
	
	
	
	
}

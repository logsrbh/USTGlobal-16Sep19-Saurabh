package com.ustglobal.empapp.util;

import com.ustglobal.dao.EmployeeDAO;
import com.ustglobal.dao.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}

}

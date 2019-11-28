package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.dao.EmployeeDAO;
import com.ustglobal.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		while (true) {
			System.out.println("---------------------------------");
			System.out.println("Press 1 to get all employee data");
			System.out.println("Press 2 to insert employee data");
			System.out.println("Press 3 to update employee data");
			System.out.println("Press 4 to delete employee data");
			System.out.println("Press 5 to search employee data");
			System.out.println("---------------------------------");

			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				EmployeeDAO daol = EmployeeManager.getEmployeeDAO();
				List<EmployeeBean> result = daol.getAllEmployeeData();

				for (EmployeeBean bean : result) {

					System.out.println("ID : " + bean.getId());
					System.out.println("Name : " + bean.getName());
					System.out.println("Salary : " + bean.getSal());
					System.out.println("Gender : " + bean.getGender());
				}

				break;

			case 2:

				break;
				
				
				
			case 3:
				break;
				
			case 4:
				break;
			
			case 5: EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO(); 
				System.out.println("Enter the Employee Id ...");
				int id = sc.nextInt();		
				EmployeeBean bean = dao5.searchEmployeeData(id);
				if(bean !=null) {
					System.out.println("ID : " + bean.getId());
					System.out.println("Name : " + bean.getName());
					System.out.println("Salary : " + bean.getSal());
					System.out.println("Gender : " + bean.getGender());
				}else {
					System.err.println("No Data Found");
				}
				
				break;
			}

		}
	}
}

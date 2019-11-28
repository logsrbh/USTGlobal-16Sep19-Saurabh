package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;


public class ExecuteUpdateQuery {

	public static void main(String[] args) {
		
		Connection conn =null;
		Statement stmt = null;

		try {
			//Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			// Get the connection
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn =DriverManager.getConnection(url);
			
			//Issue Sql Query
			
			String sql= " update employee_info set name='ABC', sal =50, gender ='O' where id =6 ";
			
			 stmt= conn.createStatement();
			 int count = stmt.executeUpdate(sql);
			 
			 System.out.println(count + " row(s) affected.");
			 
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					conn.close();
				}	
			}catch(SQLException e) {
				e.printStackTrace();	
			}
			 
			
		}
		
		
		
	}
}

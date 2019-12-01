package com.ustglobal.jdbcapp;

import java.sql.*;

public class ExecuteDeleteQuery {

	public static void main(String[] args) {

		// Load the driver

		Connection conn = null;
		Statement stmt = null;

		try {
			//Get the connection
			Driver driver = new com.mysql.jdbc.Driver();
			 DriverManager.registerDriver(driver);
			
			
			// Issue Sql Query
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			conn = DriverManager.getConnection(url);
			
			
			String sql =" delete from employee_info where id=6";
			
			stmt = conn.createStatement();

			int count = stmt.executeUpdate(sql);
			System.out.println(count +" row(s) affected");
			
			
		}catch (Exception e) {
			e.printStackTrace();			
			
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}



	}

}

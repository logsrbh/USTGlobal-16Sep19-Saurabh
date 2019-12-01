package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;


public class ExecuteInsertQuery {
	public static void main(String[] args) {


		Connection conn = null;
		Statement stmt = null;

		try {
			//Step 1. Load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2. Get the connection

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3. Issue SQL Query

			String sql = " insert into employee_info "
					+ " values(6,'Giridhara',10000,'M') ";

			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4. Read the result
			
			System.out.println(count + " Row(s) Inserted");
			
			}catch(SQLException e) {
				e.printStackTrace();
			
			//Step 5. Close all JDBC Objects
			}finally {
				try {
					if(conn!= null) {
						conn.close();
					}
					if(stmt!=null) {
						stmt.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
					
					
				}
			}



	}// end of main()

}// end of executeInsertQuery

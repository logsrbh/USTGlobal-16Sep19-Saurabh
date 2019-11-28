package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {

	public static void main(String[] args) {

		Connection conn =null;
		PreparedStatement pstmt =null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			

		}catch (Exception e) {
			e.printStackTrace();
		}



	}
}

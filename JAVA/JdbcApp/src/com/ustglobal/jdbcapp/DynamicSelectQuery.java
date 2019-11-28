package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;


public class DynamicSelectQuery {

	public static void main(String[] args) {

		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String sql = " Select * from employee_info where id = ?";

			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			int id = Integer.parseInt(args[0]);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				int empid = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");

				System.out.println("ID : "+empid);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+sal);
				System.out.println("Gender : "+gender);

			}


		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();			}
		}

	}
}

package com.ustglobal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeData() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info ";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			while (rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));

				result.add(bean);

			}
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		} finally {

			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

		} // end of try-catch-finally

	}// end of getAllEmployeeData

	public EmployeeBean searchEmployeeData(int id) {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));

				return bean;

			}else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		finally {

			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

		}

	}// end of SearchEmployeeData

}// end of EmployeeDAOImpl

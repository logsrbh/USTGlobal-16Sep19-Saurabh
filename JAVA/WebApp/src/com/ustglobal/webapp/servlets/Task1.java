package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Task1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String search = req.getParameter("search");

		int num = Integer.parseInt(search);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String sql = " Select * from employee_info where id = ?";

			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				int empid = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");

				PrintWriter out = resp.getWriter();
				
//				out.println("<html>");
//				out.println("<body>");
//				out.println("<table>");
//				out.println("<tr>");
//				out.println("<th>Id</th>");
//				out.println("<th>Name</th>");
//				out.println("<th>Salary</th>");
//				out.println("<th>Gender</th>");
//				out.println("</tr>");
//				out.println("<tr>");
//				out.println("<td>");
//				out.println(empid);
//				out.println("</td>");
//				out.println("<td>");
//				out.println(name);
//				out.println("</td>");
//				out.println("<td>");
//				out.println(sal);
//				out.println("</td>");
//				out.println("<td>");
//				out.println(gender);
//				out.println("</td>");
//				out.println("</tr>");
//				out.println("</table>");
//				out.println("</body>");
//				out.println("</html>");
//				
				
				
				
				out.println("ID : " + empid);
				out.println("Name : " + name);
				out.println("Salary : "+ sal);
				out.println("Gender : "+ gender);

			} else {
				System.out.println("No Data Found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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

	}

}

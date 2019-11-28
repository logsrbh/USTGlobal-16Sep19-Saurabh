package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");

		
		String empname  = req.getParameter("empname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1  style ='color : Red'>");
		out.print("Name is : "+empname);
		out.println("</h1>");
		
		
		out.println("<h2 style ='color : Red'>");
		out.println("Email is : "+email);
		out.println("</h2>");
		
		out.println("<h2 style ='color : Red' >");
		out.println("Password is : "+password);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		
		out.println("</body>");
		out.println("</html>");
		
	}// end of doGet()
	
}// end of FormServlet

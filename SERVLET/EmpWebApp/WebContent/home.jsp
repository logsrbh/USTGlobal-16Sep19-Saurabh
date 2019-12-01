<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<<jsp:useBean id="info"
	class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a style="float: right;" href='./logout'>Logout</a>
	<h1>
		Welcome
		<%=info.getName() %></h1>
	<a href='./search.html'>Search</a>
	<a href='./changePassword.jsp'>Change Password</a>
</body>
</html>
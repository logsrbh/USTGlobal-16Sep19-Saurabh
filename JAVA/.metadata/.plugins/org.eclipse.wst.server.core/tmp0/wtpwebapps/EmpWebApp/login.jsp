<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page session="false" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"/>

<%
	String id = "";
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>


<body>
	<form action='./login' method='post'>
	 <h4><%=msg %> </h4>
		<table align='center'>
			<tr>
				<td>Id:</td>
				<td><input type='number' name='id' value=' <%=id%>'></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password'></td>
			</tr>
			<tr>
				<td><input type='checkbox' name='rememberMe' value='checked'></td>
				<td>Remember me</td>
			</tr>
			<tr>
				<td><input type='reset' name='Reset'></td>
				<td><input type='submit' name='Login'></td>
			</tr>
			<tr>
				<td></td>
				<td><a href='./register.html'>Register</a></td>
			</tr>
		</table>
	</form>

</body>
</html>
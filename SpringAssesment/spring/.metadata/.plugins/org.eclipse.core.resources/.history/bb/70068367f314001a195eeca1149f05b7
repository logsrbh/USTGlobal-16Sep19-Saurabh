<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ustglobal.rms.bean.OrderProduct"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">home</a>
<a href="./logout">Logout</a>

<table>
 <tr>
 <th>Name</th>
 <th>Price</th>
 <th>total price</th>
 </tr>
 <% List<OrderProduct> products=(List<OrderProduct>)request.getAttribute("orders"); %>
 <%for(OrderProduct op:products) {%>
 <tr>
 <td><%=op.getPname() %></td>
 <td><%=op.getPrice() %></td>
 <td><%=op.getTotal() %></td>
 </tr>
 <%} %>
</table>
</body>
</html>
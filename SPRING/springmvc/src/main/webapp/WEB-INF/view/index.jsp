<html>
<body>
	<%
		String s = (String) request.getAttribute("msg");
	%>


	<h2 style="color: red;">${msg}</h2>
	<h2 style="color: blue;"><%=s%></h2>
	<h3 style="color: blue;">${name}</h3>
	<h3 style="color: blue;">${id}</h3>
	
	
	
</body>
</html>

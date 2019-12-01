<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Data Insertion Form</title>
</head>
<body>

	<form action="./form" method="post">
		<table>
			<tr>
				<td>Id :</td>
				<td><input type="number" name="id"></td>
			</tr>

			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><input type="radio" name="gender" value="male">Male</td>

			</tr>
			<tr>
				<td><input type="radio" name="gender" value="female">Female</td>
				<td><input type="radio" name="gender" value="other">Other</td>

			</tr>
			<tr>
				<td>DOJ :</td>
				<td><input type="date" name="doj"></td>

			</tr>
			<tr>
				<td><input type="reset" ></td>
				<td><input type="submit" ></td>

			</tr>
			


		</table>


	</form>


</body>
</html>
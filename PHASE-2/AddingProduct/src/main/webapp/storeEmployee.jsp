<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Store Employee</h2>
<form action="EmployeeController" method="post">
	<label>Name</label>
	<input type="text" name="name"><br/>
	<label>Salary</label>
	<input type="number" name="salary"><br/>
	<input type="submit" value="Store Employee">
</form>
</body>
</html>
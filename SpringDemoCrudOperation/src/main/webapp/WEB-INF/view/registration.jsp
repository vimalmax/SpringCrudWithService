<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registration.aspx" method="post">
<input type="hidden" name="eid" value="${result.id}">
User Name<input type="text" name="emp_name" value="${result.name}">
Email<input type="email" name="email" value="${result.email}">
<input type="submit" value="ADD">
</form>
</body>
</html>
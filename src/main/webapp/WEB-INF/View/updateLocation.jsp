<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Location</title>
</head>
<body>
<h2>Update Location</h2>
<form action="updateData" method="post">
Id <input type="number" name="id" value="${location.id}">
Name <input type="text" name="name" value="${location.name}">
Code <input type="text" name="code" value="${location.code}">
Type: Urban<input type="radio" value="Urban" name="type"> Rural<input type="radio" value="Rural" name="type">
<input type="submit" value="Update">
</form>
</body>
</html>
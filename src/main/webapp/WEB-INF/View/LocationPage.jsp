<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App | Location</title>
</head>
<body>
<h2>Location App</h2>
<form action="saveLocationPage" method="post">
Id <input type="number" name="id">
Name <input type="text" name="name">
Code <input type="text" name="code">
Type: Urban<input type="radio" value="Urban" name="type"> Rural<input type="radio" value="Rural" name="type">
<input type="submit" value="submit">
</form>
<p>${msg}</p>
</body>
</html>
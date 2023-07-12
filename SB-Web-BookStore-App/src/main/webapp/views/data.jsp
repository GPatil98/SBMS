<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Ganesh Patil Book</title>
</head>
<body>
	<a href="book"> Add new Book</a>
	
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Author Name</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach  items="${books}" var="book">
				<tr>
					<td>${Book.name}</td>
					<td>${Book.price}</td>
					<td>${Book.author}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
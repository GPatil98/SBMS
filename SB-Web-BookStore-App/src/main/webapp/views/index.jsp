<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jay Shree Ram</title>
</head>
<body>
	<font color="green">${success}</font>
	<font color="red">${failure}</font>
	<form:form action="saveBook" modelAttribute="book" method="POST">
		<table>
			<tr>
				<td>Book Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Book price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Book Author</td>
				<td><form:input path="author" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
		<a href=" viewBooks"> View All Book</a>
	</form:form>
</body>
</html>
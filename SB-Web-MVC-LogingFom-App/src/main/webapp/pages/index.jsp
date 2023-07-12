<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${msg}
	<form:form action="CheckLogin" modelAttribute="LoginForm" method="POST">

		<table>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="pswd" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="login" /> :</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
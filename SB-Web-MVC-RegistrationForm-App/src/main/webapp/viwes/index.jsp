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
	<form:form action="saveStudent" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td>name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>name :</td>
				<td><form:radiobutton path="gender" value="male" /> male <form:radiobutton
						path="gender" value="fe-male" />fe-male</td>
			</tr>

			<tr>
				<td>Course :</td>
				<td><form:select path="course">
						<form:option value="">select</form:option>
						<form:option value="java">java</form:option>
						<form:option value="python">Python</form:option>
						<form:option value="devops">DevOps</form:option>

					</form:select></td>
			</tr>
			<tr>
				<td>timing :</td>
				<td><form:checkbox path="timing" value= "morning" />Morning 
				<form:checkbox path="timing" value="evening" /> Evening</td>
			</tr>
			<tr>
				<td> <input type="submit" value="Register"></td>
				
			</tr>
		</table>


	</form:form>

</body>
</html>
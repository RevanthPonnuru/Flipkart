<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

			String Firstname = request.getParameter("firstname");
			String Lastname = request.getParameter("lastname");
			String Password = request.getParameter("password");
			String Confirmpassword = request.getParameter("confirmpassword");
			String Registrationemail = request.getParameter("registrationemail");
			String Useranswer = request.getParameter("answer");
			%>
			<table id ="nat">
<tr>
	<td>First Name</td>
	<td><%= Firstname %></td>
</tr>
<tr>
	<td>Last Name</td>
	<td><%= Lastname %></td>
</tr>
<tr>
	<td>Registration email</td>
	<td><%= Registrationemail %></td>
</tr>

<tr>
	<td>User answer</td>
	<td><%= Useranswer %></td>
</tr>

</table>
</body>
</html>
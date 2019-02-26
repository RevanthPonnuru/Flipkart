<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello to the New World of JSP</h1>
<%
int i,j,k;
for(i=0;i<=5;i++){
	out.println("i");
	j=4;
	k=i+j;
	out.println("k");
}
%>
</body>
</html>
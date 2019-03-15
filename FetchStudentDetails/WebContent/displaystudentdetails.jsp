<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1>${HeaderMessage}</h1>
<h3> congratulations </h3>
<h2>Details submitted by you</h2>
<table>
<tr>
<td>Student FirstName :</td>
<td>${student.StudentFirstName}</td>
</tr>
<tr>
<td>Student LastName :</td>
<td>${student.StudentLastName}</td>
</tr>
<tr>
<td>Student Age :</td>
<td>${student.StudentFirstName}</td>
</tr>
<tr>
<td>Student Age :</td>
<td>${student.StudentAge}</td>
</tr>
<tr>
<td>Student College :</td>
<td>${student.StudentCollege}</td>
</tr>
<tr>
<td>Student Degree :</td>
<td>${student.StudentDegree}</td>
</tr>
<tr>
<td>Student Skills :</td>
<td>${student.StudentSkills}</td>
</tr>

<tr>
<td>StudentAddress :</td>
<td>${student.StudentAddress}</td>
</tr>

</table>
</body>
</html>
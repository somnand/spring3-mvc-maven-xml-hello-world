<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${header}</title>
</head>
<body>
<h3>Details of admission</h3>
<table>
<tr><td>Student</td></tr>
<tr>
<td>Student Name:</td>
<td>${advancedStudent.studentName }</td>
</tr>
<tr>
<td>Student Hobby:</td>
<td>${advancedStudent.studentHobby }</td>
</tr>
<tr><td>Employee</td></tr>
<tr>
<td>Employee Name:</td>
<td>${advancedEmployee.empName }</td>
</tr>
<tr>
<td>Department:</td>
<td>${advancedEmployee.department }</td>
</tr>
<td>Date of Birth:</td>
<td>${advancedEmployee.dob }</td>
</tr>
<td>Skills of Employee:</td>
<td>${advancedEmployee.skills }</td>
</tr>
</table>
</body>
</html>
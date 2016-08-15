<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
<h3>This is the main admission form for student</h3>
<form action="submitAdmissionForm" method="post">
<p>
Student Name : <input type="text" name="studentName"/>
</p>
<p>
Student Hobby : <input type="text" name="studentHobby"/>
</p>
<input type="submit" value="Submit the form >"/>
</form>



</body>
</html>
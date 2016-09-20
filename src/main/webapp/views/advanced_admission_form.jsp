<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Advanced Admission form</title>
</head>
<body>
	<form action="submitAdvancedAdmissionForm" method="post">
	Student :
		<table>
			<tr>
				<td>Student Name :</td>
				<td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td>Student Hobby :</td>
				<td><input type="text" name="studentHobby" /></td>
			</tr>
			<!-- <tr>
				<td><input type="submit" value="Submit the form >" /></td>
			</tr> -->
		</table>
	Employee :
		<table>
			<tr>
				<td>Employee Name :</td>
				<td><input type="text" name="empName" /></td>
			</tr>
			<tr>
				<td>Department :</td>
				<td><input type="text" name="department" /></td>
			</tr>
			<tr>
				<td>Date of Birth :</td>
				<td><input type="text" name="dob" /></td>
			</tr>
			<tr>
				<td>Skills :</td>
				<td><select name="skills" multiple="multiple">
					<option value="Java Core">Java Core</option>
					<option value="Spring Core">Spring Core</option>
					<option value="Spring Rest">Spring Rest</option>
				</select></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit the form >" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
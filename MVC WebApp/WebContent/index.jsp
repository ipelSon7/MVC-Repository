<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Registration</title>
	
	<!-- Import External Style Sheet -->
	<link rel="stylesheet" type="text/css" href="PageStyle.css" />

</head>
<body>

	<div class="registrationDiv">
		<div class="registrationHeaderDiv">
			<label>New Student Registration</label>
		</div>
		
		<div class="formDiv">
			<form action="register" method="POST">
				<table>
					<tr>
						<td><label>ID</label></td>
						<td><input type="text" name="studentIDField" class="textField" /></td>
					</tr>
					<tr>
						<td><label>First name</label></td>
						<td><input type="text" name="studentFirstNameField" class="textField" /></td>
					</tr>
					<tr>
						<td><label>Last name</label></td>
						<td><input type="text" name="studentLastNameField" class="textField" /></td>
					</tr>
					<tr>
						<td><label>User name</label></td>
						<td><input type="text" name="studentUserNameField" class="textField" /></td>
					</tr>
					<tr>
						<td><label>Address</label></td>
						<td><input type="text" name="studentAddressField" class="textField" /></td>
					</tr>
					<tr>
						<td><label>Phone number</label></td>
						<td><input type="tel" name="studentPhoneField" class="textField" /></td>
					</tr>
					<tr>
						<td><label>Email</label></td>
						<td><input type="text" name="studentEmailField" class="textField" /></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><input type="password" name="studentPasswordField" class="textField" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Create account" style="margin-left:140px; margin-top:20px;"/></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	
</body>
</html>
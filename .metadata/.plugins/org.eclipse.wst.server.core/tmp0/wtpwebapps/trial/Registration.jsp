<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h3 align="center">Welcome to BridgeLabz Registration</h3><br>
	<form action="Register" method="post">
	Enter Name: <input type="text" name="name"><h6 style="color: red">${nameErrorMessage}</h6>
	Enter UserName: <input type="text" name="uname"><h6 style="color: red">${usernameErrorMessage}</h6>
	Enter Password: <input type="text" name="pass"><h6 style="color: red">${passwordErrorMessage}</h6>
	ReEnter Password: <input type="password" name="repass"><br>
	<input type="reset" value="Reset"/><br><br>
	<button name="Register">Register</button>
	<h6 style="color: red">${rePasswordErrorMessage}</h6> 
	</form> 
</body>
</html>
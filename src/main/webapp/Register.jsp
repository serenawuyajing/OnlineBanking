<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action = "CreateServlet" method = "post">
		Name: <input type ="text" name = "username"/><br/>
		Password:<input type = "password" name = "password" /><br/>
		Repassword:<input type = "password" name = "repassword" /><br/>
		Amount:<input type = "text" name = "amount" /><br/>
		Address:<input type = "text" name = "address" /><br/>
		Phone:<input type = "text" name = "phone" /><br/>
		<input type="submit" value="register" />
	</form>
</body>
</html>
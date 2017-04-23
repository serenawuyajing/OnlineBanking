<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<title>Balance Page</title>
</head>
<body>
<% String amount= "";
   String username = request.getParameter("username");
   String password = request.getParameter("password");
%>

<p>Login as <%=username%>: </br></br>
Your current balance is : <%= request.getAttribute("amount") %>
</p>
 
 <form method="post" action="withDrawServlet">
 		<input type="hidden" name="username" value =<%=username%> />
 		<input type="hidden" name="password" value =<%=password%> />
        <input name="amount" value="<%=amount%>" />
        <input type='submit' value = "withdraw" />
 </form>
 
  <form method="post" action="depositServlet">
 		<input type="hidden" name="username" value =<%=username%> />
 		<input type="hidden" name="password" value =<%=password%> />
        <input name="amount" value="<%=amount%>" />
        <input type='submit' value = "deposit" />
 </form>
 
  <form method="post" action="LoginOutServlet">
        <input type='submit' value = "login out" />
 </form>
 
</body>
</html>
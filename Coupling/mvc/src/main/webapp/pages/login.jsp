<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login </h1>

<p><font color="red">${errorMessage}</font></p>

<form action="/login" method="post">  
Email:<input type="text" name="emailFilled"/><br/><br/>  
Password:<input type="password" name="pass"/><br/><br/>  
<input type="submit" value="login"/> 
</form>  

</body>
</html>


 
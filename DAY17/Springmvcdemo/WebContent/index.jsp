<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello world</h2>
	<form  method="post" action="hi">
		
		<input type="text" name="username" /> 
		<input type="password" name="password" /> 
	 <input type="submit">
	</form>
	<%
String msg=(String)request.getAttribute("msg");
out.println(msg);

%>

</body>
</html>
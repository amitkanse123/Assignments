<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SPRING BOOT MVC APPLICATION</h1>

<%

String msg=(String)request.getAttribute("msg");
out.println(msg);

%>
</body>
</html>
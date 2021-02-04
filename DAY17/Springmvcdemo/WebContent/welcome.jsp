<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
String msg=(String)request.getAttribute("msg");
out.println(msg);

//out.println(request.getParameter("username"));
out.println("welcome jsp");


String add=(String)request.getAttribute("add");
out.println(add);
%>
</body>
</html>
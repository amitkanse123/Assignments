<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method=post action="calculator">
 <input type=text name=number1 >
 <select name=operator >
  <option >+</option>
  <option>-</option>
  <option>*</option>
  <option>/</option>
 </select>
 <input type=text name=number2 >
 <br>
 <input type=submit value="=" >
</form>
</body>
</html>
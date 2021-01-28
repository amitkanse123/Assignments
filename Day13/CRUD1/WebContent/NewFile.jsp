<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method=post action="dothis">
 <input type=text name=eid >
  <input type=string name=ename>
  <input type=text name=salary>
 <select name=operator >
  <option >ADD</option>
  <option>UPDATE</option>
  <option>DELETE</option>s
  <option>SHOW</option>
 </select>

 <br>
 <input type=submit value="RESULT" >
</form>
</body>
</html>
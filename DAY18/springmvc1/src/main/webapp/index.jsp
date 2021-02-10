<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h2>Employee Details</h2><br/>
	<form action="addemp">
		<input type="text" name="eid"/><br/>
		<input type="text" name="ename"/><br/>
		<input type="text" name="salary"/><br/>
		<select name="choice">
  <option value="add">add</option>
  <option value="getall" selected>getall</option>
  <option value="third">Third Value</option>
</select>
<input type="submit"/>
	</form>
</body>
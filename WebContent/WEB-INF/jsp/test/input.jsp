<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Input Form:</h3>
<hr>
<form:form action="result" commandName="user" method="post">
<form:input type="text" path="username"/><br>
<form:input type="password" path="password"/>
<input type="submit" value="提交">
</form:form>
</body>
</html>
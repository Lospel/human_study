<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 결과</title>
</head>
<body>
<h1>구구단: ${Dan }단</h1>
<% int Dan = Integer.parseInt(request.getParameter("Dan")); %>

<%
	for (int i=1; i<10; i++){
		out.println(Dan+"X"+i+"="+Dan*i + "\n");
%><br>
<%
}
%>
</body>
</html>
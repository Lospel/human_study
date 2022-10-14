<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>
아이디:${Lodinid }<br>
비번: ${passcode }<br>
실명: ${name }<br>
모바일: ${mobile }<br>
<form action="loginForm">
<button type="submit" name="OK">OK</button>
<button type="button" name="FAIL" onClick="location.href='signon'">FAIL</button>
</form>
</body>
</html>
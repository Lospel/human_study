<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>
<body>
<form action="/DoLogin">
아이디: <input type="text" name="Loginid1" required><br>
비밀번호: <input type="password" name="passcode1" required><br>
<button type="submit" name="doLogin">로그인</button>
<button type="reset" name="clear">비우기</button><br>
<button type="button" name="signon" onclick="location.href='/signon'">회원가입</button>
</form>
</body>
</html>
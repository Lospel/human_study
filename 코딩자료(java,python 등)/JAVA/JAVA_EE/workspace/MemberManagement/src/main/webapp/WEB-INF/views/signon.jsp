<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signon</title>
</head>
<body>
<form action="Dosignon" method="post">
아이디: <input type="text" name="Loginid" required value="${Lodinid }"><br>
비밀번호: <input type="password" name="passcode" required value="${passcode }"><br>
비밀번호확인: <input type="password" name="passcodeCheck" ><br>
실명: <input type="text" name="name" value="${name }"><br>
모바일: <input type="text" name="mobile" value="${mobile }"><br>
<button type="submit" value="등록" >등록</button>
<button type="button" value="취소" onClick="location.href='/'">취소</button>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<form method='get' action='/result' id=frmGugu>
Dan: <input type=number name=Dan id=Dan><br>
<input type=submit value='Show' name=btnShow id=btnShow>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('submit','#frmGugu',function(){
	document.location='/result/'+$("#Dan").val();
	return false;
})
</script>
</html>
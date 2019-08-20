<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "${cp}/jsp/sumResult.jsp" method = "get">
		( ★ 첫번째 숫자  &lt; 두번째 숫자 )<br>
		첫번째 숫자 입력 > <input type = "text" name = "number1" value = "1"/><br>
		두번째 숫자 입력 > <input type = "text" name = "number2" value = "10"/><br>
		<input type = "submit" value = "+ 실행"/>
	</form>
</body>
</html>
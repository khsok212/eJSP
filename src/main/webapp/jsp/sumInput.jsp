<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "<%=request.getContextPath() %>/SumCalculation" method = "post">
		( ★ 첫번째 숫자  &lt; 두번째 숫자 )<br><br>
		첫번째 숫자 입력 > <input type = "text" name = "start" value = "1"/><br><br>
		두번째 숫자 입력 > <input type = "text" name = "end" value = "10"/><br><br>
		<input type = "submit" value = "계산하기"/>
	</form>
</body>
</html>
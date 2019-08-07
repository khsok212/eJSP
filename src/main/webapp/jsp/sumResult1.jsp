<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	startNum = <%=session.getAttribute("start") %><br>
	endNum = <%=session.getAttribute("end") %><br>
	sum = <%=session.getAttribute("sumResult") %><br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		width: 740px;
		height: 400px;
		align: center;
		padding: 5px;
		border-color: red;
	}
	td{
		padding: 5px;	
	}
</style>
</head>
<body>
	<table border = "">
	<c:forEach begin = "1" end = "9" var = "i">
		<tr>
			<c:forEach begin = "2" end = "9" var = "j">
				<td> ${j } * ${i } = ${i*j } </td>
			</c:forEach>
		</tr>
	</c:forEach>
	</table>
	
	times tables(jstl)
</body>
</html>
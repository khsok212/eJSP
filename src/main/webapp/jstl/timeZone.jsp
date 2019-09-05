<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>before setTimeZone(kor) : <fmt:formatDate value="${dt }" pattern="yyyy-MM-dd HH:mm:ss"/></h2>

	<fmt:setTimeZone value="America/Aruba"/>
	
	<h2>America/Aruba setTime : <fmt:formatDate value="${dt }" pattern="yyyy-MM-dd HH:mm:ss"/></h2>
	
	<fmt:setTimeZone value="Africa/Sao_Tome"/>
	
	<h2>Africa/Sao_Tome setTime : <fmt:formatDate value="${dt }" pattern="yyyy-MM-dd HH:mm:ss"/></h2>
	
	<table border="">
		<thead>
			<tr>
				<th>timeZone Id</th>
			</tr>
		</thead>
		<tbody>
		<%-- timeZoneList : String[]   , time : String --%>
		<c:forEach items="${timeZoneList }" var = "time">
			<tr>
				<td>${time}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>
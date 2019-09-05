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

<!-- jquery를 사용하려면 선언해줘야한다. -->
<script src="${cp }/js/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function(){
		
		$("#locale").change(function(){
			$("#frm").submit();
		})
	})
</script>
<body>
	<%-- <h2>실습1</h2>
	<form id = "frm" action = "${cp }/selectLocale" method="get">
		<select name = "locale">
			<c:choose>
				<c:when test="${locale == 'ko' }">
					<option value = "ko" <c:if test = "${locale == 'ko'}" selected </c:if>>한국어</option>
					<option value = "en">English</option>
					<option value = "zh">中國語</option>
				</c:when>
			</c:choose>
			
			<c:choose>
				<c:when test="${locale == 'en' }">
					<option value = "ko">한국어</option>
					<option value = "en" selected="selected">English</option>
					<option value = "zh">中國語</option>
				</c:when>
			</c:choose>
			
			<c:choose>
				<c:when test="${locale == 'zh' }">
					<option value = "ko">한국어</option>
					<option value = "zh" selected="selected">中國語</option>
					<option value = "zh">中國語</option>
				</c:when>
			</c:choose>
		</select>
		<input type = "submit" value = "전송"/>
	</form> --%>
	
	<h2>실습2</h2>
	<form id = "frm" action = "${cp }/selectLocale" method="get">
		<select name = "locale" id = "locale">
			<c:choose>
				<c:when test="${locale == 'zh' }">
					<option value = "ko">한국어</option>
					<option value = "en">English</option>
					<option value = "zh" selected="selected">中國語</option>
				</c:when>
				<c:when test="${locale == 'en' }">
					<option value = "ko">한국어</option>
					<option value = "en" selected="selected">English</option>
					<option value = "zh">中國語</option>
				</c:when>
				<c:otherwise>
					<option value = "ko" selected="selected">한국어</option>
					<option value = "en">English</option>
					<option value = "zh">中國語</option>
				</c:otherwise>
			</c:choose>
		</select>
	</form>
	
	<fmt:setLocale value="${locale}"/>
	<fmt:setBundle basename="kr.or.ddit.msg.message" var ="msg"/>
	<fmt:message key="GREETING" bundle="${msg}"/><br>
</body>
</html>
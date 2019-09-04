<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>jstl fmt</h2>
	<c:set var="userId" value="brown"/>
	
	<%--
		<fmt:bundle> 	: 출력할 메시지를 담고있는 리소스 번들 지정
						<fmt:message>태그가 bundle태그 안에 기술
						
		<fmt:message> 	: 출력하고자 하는 code지정
		<fmt:param> 	: message에 파라미터가 있는 경우 전달
			
	 --%>
	
	<fmt:bundle basename="kr.or.ddit.msg.message">	<%-- message_국가_언어.properties => message만 --%>
		기본 GREETING : <fmt:message key="GREETING"/><br>
		기본 VISITOR : <fmt:message key="VISITOR">
				  	<fmt:param value="${userId }"/>
				  </fmt:message>
	</fmt:bundle><br><br>
	
	<fmt:setLocale value="en"/>
	<fmt:bundle basename="kr.or.ddit.msg.message">	<%-- message_국가_언어.properties => message만 --%>
		en GREETING : <fmt:message key="GREETING"/><br>
		en VISITOR : <fmt:message key="VISITOR">
				  	<fmt:param value="${userId }"/>
				  </fmt:message>
	</fmt:bundle><br><br>
	
	<fmt:setLocale value="zh"/>
	<fmt:bundle basename="kr.or.ddit.msg.message">	<%-- message_국가_언어.properties => message만 --%>
		zh GREETING : <fmt:message key="GREETING"/><br>
		zh VISITOR : <fmt:message key="VISITOR">
				  	<fmt:param value="${userId }"/>
				  </fmt:message>
	</fmt:bundle>
	
	<h2>fmt setBundle</h2>
	<fmt:setLocale value="ko"/>
	<fmt:setBundle basename="kr.or.ddit.msg.message" var = "msg"/>
		GREETING : <fmt:message key="GREETING" bundle="${msg }"/><br>
		VISITOR : <fmt:message key="VISITOR" bundle="${msg }">
				  	<fmt:param value="${userId }"/>
				  </fmt:message><br>
	
	
	<h2>fmt number</h2>
	<c:set var="num" value="1000000.100"/>
	<fmt:setLocale value="ko"/>
	ko : <fmt:formatNumber value="${num}" /><br>
	
	<fmt:setLocale value="de"/>
	de : <fmt:formatNumber value="${num} " var="deNum"/>${deNum }<br>
	
	<h2>fmt parseNumber</h2>
	<fmt:setLocale value="ko"/>
	
	<%-- 문자열을 숫자로 반환  --%>
	<fmt:parseNumber value="1,000,000" pattern="0,000,000" var = "koNum"/>
	parseNumber : ${koNum } <br>
	
	<%-- 문자열을 숫자로 반환  --%>
	<fmt:parseNumber value="1,000,000" var = "koNum"/>
	noPattern parseNumber : ${koNum } <br>
	
	<h2>fmt formatDate</h2>
	<%-- Date객체를 포매팅된 문자열로 반환 --%>
	formatDate : <fmt:formatDate value="${dt }" pattern="yyyy-MM-dd HH:mm:ss:SS" var="date"/>
	${date } <br>
	
	formatDate : <fmt:formatDate value="${dt }" pattern="yyyy/MM/dd"/> <br>
	
	
	
	
</body>
</html>
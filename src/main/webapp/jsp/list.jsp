<%@page import="kr.or.ddit.user.service.IUserService"%>
<%@page import="kr.or.ddit.user.service.UserService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.or.ddit.user.model.User"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.repository.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!IUserService service = new UserService();
    	List<User> userList = service.getUserList();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-color: red;
		background: yellow;
	}
</style>
</head>
<body>
<%-- 1. userDao선언 
	 2. getUserList() 호출
	 3. 호출 결과(List<UserVo>)를 for loop를 통해 tr태그를 반복 생성
--%>
	<table border ="">
		<tr>
			<th>이름</th>
		</tr>
		<%-- 향상된 for문  --%>
		<%
			for(User userVo : userList) {
		%>
			<tr>
				<td><%= userVo.getUserNm() %></td>
			</tr>
		<% } %>
		
		<%-- 일반 for문 --%>
		<% for(int i = 0; i < userList.size(); i++){ %>
		<tr>
			<td><%= userList.get(i).getUserNm() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>
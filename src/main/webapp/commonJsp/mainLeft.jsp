<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<ul class="nav nav-sidebar">
		<li class="active"><a href="${cp}/main.jsp">메인 <span class="sr-only">(current)</span></a></li>
		<li class="active"><a href="${cp}/boardList">게시판 생성<span class="sr-only">(current)</span></a></li>
		
		<c:forEach items = "${boardList }" var = "board">
			<li class="active"><a href="${cp}/postList?boardNo=${board.boardNo }&page=1&pagesize=10">${board.boardName }<span class="sr-only">(current)</span></a></li>
		</c:forEach>
	</ul>
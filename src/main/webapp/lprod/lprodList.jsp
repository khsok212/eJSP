<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp-basicLib</title>
<%@ include file = "/commonJsp/basicLib.jsp" %>

</head>

<body>
	
	<!-- header -->
	<%@ include file="/commonJsp/header.jsp"%>

	<div class="container-fluid">
		<div class="row">

			<div class="col-sm-3 col-md-2 sidebar">
				
				<!-- left -->
				<%@ include file="/commonJsp/mainLeft.jsp"%>

			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">제품그룹 리스트</h2>
						<div class="table-responsive">
							<table class="table table-striped">
								<tr>
									<th>제품번호</th>
									<th>제품코드</th>
									<th>제품명</th>
								</tr>

								<c:forEach items="${lprodList}" var="lprod">
									<tr>
										<td>${lprod.lprod_id }</td>
										<td>${lprod.lprod_gu }</td>
										<td>${lprod.lprod_nm }</td>
									</tr>
								</c:forEach>

							</table>
						</div>

						<a class="btn btn-default pull-right">버튼</a>

						<div class="text-center">
							<ul class="pagination">
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

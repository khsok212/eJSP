<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<% for(int i = 1; i < 10; i++){ %>
		<tr>
			<% for(int j = 2; j < 10; j++){ %>
				<td> <%=j %> * <%=i %> = <%=(i*j)%></td>
			<% } %>
		</tr>
	<%}%>
	</table>
	
	times tables
</body>
</html>
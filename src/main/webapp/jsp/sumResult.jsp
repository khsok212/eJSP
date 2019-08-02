<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <%
      int sum = 0;
      request.setCharacterEncoding("utf-8");
      int number1 = Integer.parseInt(request.getParameter("number1"));
      int number2 = Integer.parseInt(request.getParameter("number2"));
  
      for(int i = number1; i <= number2; i++){
         sum += i;
      }
   %>
      
      number1 : <%=number1 %><br>
      number2 : <%=number2 %><br>
      
      sumResult : <%=number1 %> + <%=number2 %> = <%=sum %>
</body>
</html>
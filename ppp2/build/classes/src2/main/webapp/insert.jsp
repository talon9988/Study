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
  request.setCharacterEncoding("UTF-8");
  
  String id = request.getParameter("id");
  String password = request.getParameter("password");
  String file = request.getParameter("file");
  String authorId = request.getParameter("authorId");
  
  out.println("<span> id :"+ id + "</span><br>");
  out.println("<span> password: "+ password + "</span><br>");
  out.println("<span> file :"+ file + "</span><br>");
  out.println("<span> authorId:"+ authorId + "</span><br>");
  
  %>

</body>

<script>
alert("자바와 자바스크립트는 인도와 인도네시아의 사이와 같다.");
</script>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quick Order Result</title>

</head>
<body>

<%
// 한글등(UTF8)을 위한 코드
request.setCharacterEncoding("UTF-8");

// form의 action 에 대응한 처리
String name = request.getParameter("name");  // form 태그의 input 태그 name 값이 "name"

out.println("name=" + name);



%>


</body>
</html>
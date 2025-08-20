<%@ page contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="org.json.JSONObject" %>

<%
  // JSON 데이터 읽기
  BufferedReader reader = request.getReader();
  StringBuilder sb = new StringBuilder();
  String line;
  while ((line = reader.readLine()) != null) {
    sb.append(line);
  }
  String jsonData = sb.toString();

  JSONObject jsonObject = new JSONObject(jsonData);
  String email = jsonObject.getString("email");
  String password = jsonObject.getString("password");

  System.out.println("Received JSON email: " + email);
  System.out.println("Received JSON password: " + password);

  JSONObject result = new JSONObject();

  // 실제 데이터베이스 연동 및 인증 로직이 들어가야 하는 부분입니다.
  // 여기서는 간단한 비교만 수행합니다.
  if ("hgd@korea.com".equals(email) && "1234".equals(password)) {
    result.put("result", "success");
  } else {
    result.put("result", "fail");
  }

  out.print(result.toString()); // JSON 응답 보내기
%>
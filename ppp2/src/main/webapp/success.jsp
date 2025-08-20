<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 성공</title>
<style>
  body { font-family: sans-serif; }
  .success-message {
    font-size: 1.5em;
    color: green;
    margin-bottom: 20px;
  }
</style>
<script>
  setTimeout(function() {
    window.location.href = 'login.jsp'; // **반드시 실제 이동할 메인 페이지 URL로 변경하세요**
  }, 3000); // 3000 milliseconds = 3 seconds
</script>
</head>
<body>
  <div class="success-message">
    <h1>로그인 성공!</h1>
    <p>잠시 후 메인 페이지로 이동합니다...</p>
  </div>
</body>
</html>
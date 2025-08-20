<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">

<title>AJAX Login</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
  $(document).ready(function (){
    const form = $('#login-form'); // jQuery 객체로 변경
    const emailInput = $('#email');
    const passwordInput = $('#password');
    const messageDiv = $('#message');

    form.on('submit', function(e) { // 이벤트 핸들러에서 function 키워드 사용
      console.log('submit 이벤트 잡음...');
      e.preventDefault();

      const email = emailInput.val();
      const password = passwordInput.val();

      if (email.trim() !== '' && password.trim() !== '') {
        $.ajax({
          url: 'loginCheck.jsp',
          type: 'POST',
          contentType: 'application/json',
          data: JSON.stringify({ email: email, password: password }),
          dataType: 'json',
          success: function(response) {
            if (response.result === 'success') {
              messageDiv.text('로그인 성공! 잠시 후 페이지로 이동합니다...').css('color', 'green');
              setTimeout(function() {
                window.location.href = 'success.jsp';
              }, 3000); // 3초 후 success.jsp로 이동
              
            } else if (response.result === 'fail') {
              messageDiv.text('로그인 실패. 아이디 또는 비밀번호를 확인해주세요.').css('color', 'red');
            } else {
              messageDiv.text('알 수 없는 응답입니다.').css('color', 'orange');
            }
          },
          error: function(xhr, status, error) {
            console.error('AJAX Error:', error);
            messageDiv.text('로그인 요청 중 오류가 발생했습니다.').css('color', 'red');
          }
        });
      } else {
        messageDiv.text('아이디와 비밀번호를 모두 입력해주세요.').css('color', 'red');
      }
    });

    // 페이지 로드 시 메시지 영역 초기화 (선택 사항)
    messageDiv.text('');
  });//ready
</script>

</head>
<body>
  <div id="container">
    <div id="wrapper">
      <div id="content">
        <div id="user">

          <form id="login-form" name="login-form" method="post" action="">
            <label class="block-label" for="email">이메일</label>
            <input id="email" name="email" type="text" value="" />

            <label class="block-label" for="password">비밀번호</label>
            <input id="password" name="password" type="password" value="" />

            <input type="submit" value="로그인">
          </form>
          <div id="message"></div>
        </div></div></div></div></body>
</html>
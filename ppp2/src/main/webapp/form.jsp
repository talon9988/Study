<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>Quick Order Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      padding: 20px;
    }
    .form-container {
      max-width: 600px;
      margin: auto;
      border: 1px solid #ccc;
      border-radius: 10px;
      padding: 20px;
      background-color: #f9f9f9;
    }
    .form-group {
      margin-bottom: 15px;
      text-align: center;
    }
    fieldset {
      margin-bottom: 15px;
      border-radius: 10px;
      padding: 10px;
    }
    #message {
      margin-top: 10px;
      font-weight: bold;
    }
  </style>
</head>
<body>

<div class="form-container">
  <h2>Quick Order Form</h2>
  
  <form id="order-form">
    
    <!-- 1. 개인정보 입력 -->
    <div class="form-group">
      <label for="name">이름</label>
      <input type="text" id="name" name="name">
    </div>

    <div class="form-group">
      <label for="userId">아이디</label>
      <input type="text" id="userId" name="userId">
    </div>

    <div class="form-group">
      <label for="email">이메일</label>
      <input type="text" id="email" name="email">
    </div>

    <div class="form-group">
      <label for="phone">연락처</label>
      <input type="text" id="phone" name="phone">
    </div>

    <div class="form-group">
      <label for="password">비밀번호</label>
      <input type="password" id="password" name="password">
      <button type="button" id="togglePassword">👁️</button>
    </div>

    <div class="form-group">
      <label for="passwordConfirm">비밀번호 확인</label>
      <input type="password" id="passwordConfirm" name="passwordConfirm">
    </div>

    <!-- 2. 제품 선택 -->
    <fieldset>
      <legend>제품 선택</legend>
      <label><input type="radio" name="product" value="Starter"> Starter</label><br>
      <label><input type="radio" name="product" value="Professional"> Professional</label><br>
      <label><input type="radio" name="product" value="Enterprise"> Enterprise</label><br>
      <label><input type="radio" name="product" value="Student"> Student</label>
    </fieldset>

    <!-- 3. 수량 선택 -->
    <fieldset>
      <legend>수량 선택</legend>
      <div>
        <label for="quantitySelect">10개 미만:</label>
        <select id="quantitySelect" name="quantitySelect">
          <option value="">선택하세요</option>
          <option value="1">1개</option>
          <option value="2">2개</option>
          <option value="3">3개</option>
          <option value="4">4개</option>
          <option value="5">5개</option>
          <option value="6">6개</option>
          <option value="7">7개</option>
          <option value="8">8개</option>
          <option value="9">9개</option>
        </select>
      </div>
      <div>
        <label for="quantityDirect">10개 이상:</label>
        <input type="text" id="quantityDirect" name="quantityDirect" placeholder="상세숫자 입력">
      </div>
      <small>10개 이상 주문시 직접 수량을 입력해주시면, 영업팀이 빠르게 연락드립니다.</small>
    </fieldset>

    <!-- 4. 약관 동의 -->
    <fieldset>
      <legend>약관 동의</legend>
      <div>
        <input type="checkbox" id="terms1" name="terms">
        <label for="terms1"><a href="https://google.com" target="_blank">서비스 이용약관 동의 (필수)</a></label>
      </div>
      <div>
        <input type="checkbox" id="terms2" name="terms">
        <label for="terms2"><a href="https://google.com" target="_blank">개인정보 수집 및 이용 동의 (필수)</a></label>
      </div>
      <div>
        <input type="checkbox" id="terms3" name="terms">
        <label for="terms3"><a href="https://google.com" target="_blank">이메일 광고성 정보 수신 동의 (선택)</a></label>
      </div>
    </fieldset>

    <!-- 5. 버튼 -->
    <div class="form-group">
      <button type="button" id="editionInfo">에디션 상세</button>
      <button type="submit" id="submitBtn">신청하기</button>
    </div>

    <!-- 메시지 출력 -->
    <div id="message"></div>

  </form>
</div>

<script>
document.addEventListener('DOMContentLoaded', function() {

  // 미리 필요한 요소 가져오기
  const form = document.getElementById('order-form');
  const nameInput = document.getElementById('name');
  const userIdInput = document.getElementById('userId');
  const emailInput = document.getElementById('email');
  const phoneInput = document.getElementById('phone');
  const passwordInput = document.getElementById('password');
  const passwordConfirmInput = document.getElementById('passwordConfirm');
  const quantitySelect = document.getElementById('quantitySelect');
  const quantityDirect = document.getElementById('quantityDirect');
  const editionRadios = document.getElementsByName('product');
  const terms1 = document.getElementById('terms1');
  const terms2 = document.getElementById('terms2');
  const messageDiv = document.getElementById('message');
  const togglePassword = document.getElementById('togglePassword');
  const editionInfo = document.getElementById('editionInfo');

  const userIds = ["user123", "sfcampus", "admin123", "hatecodey"]; // 중복 체크용

  // 정규표현식 패턴
  const namePattern = /^[가-힣]{2,}$/;
  const idPattern = /^[A-Za-z0-9]{4,12}$/;
  const emailPattern = /^[A-Za-z0-9._-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,3}$/;
  const phonePattern = /^\d{10,11}$/;

  // 공통 유효성 체크 함수
  function validate(regex, field, message) {
    if (!field.value.trim()) {
      alert(message);
      field.focus();
      return false;
    }
    if (!regex.test(field.value.trim())) {
      alert(message);
      field.focus();
      return false;
    }
    return true;
  }

  // 제품 선택 확인
  function checkProduct() {
    for (let radio of editionRadios) {
      if (radio.checked) return true;
    }
    alert('제품을 선택해주세요.');
    return false;
  }

  // 수량 선택 확인
  function checkQuantity() {
    if (!quantitySelect.value && !quantityDirect.value.trim()) {
      alert('수량을 입력해주세요.');
      return false;
    }
    return true;
  }

  // 약관 동의 확인
  function checkTerms() {
    if (!terms1.checked || !terms2.checked) {
      alert('필수 약관에 동의해주세요.');
      return false;
    }
    return true;
  }

  // 신청하기 submit 이벤트
  form.addEventListener('submit', function(e) {
    e.preventDefault(); // 기본 제출 막기

    // 이름 검사
    if (!validate(namePattern, nameInput, "이름을 2글자 이상 입력해주세요.")) return;

    // 아이디 검사
    if (!validate(idPattern, userIdInput, "아이디는 4~12자의 영문 대소문자와 숫자만 가능합니다.")) return;

    // 아이디 중복 검사
    if (userIds.includes(userIdInput.value.trim())) {
      alert('다른 사용자가 사용 중인 아이디입니다.');
      userIdInput.focus();
      return;
    }

    // 이메일 검사
    if (!validate(emailPattern, emailInput, "유효하지 않은 이메일 형식입니다.")) return;

    // 연락처 검사
    if (!validate(phonePattern, phoneInput, "연락처는 - 없이 숫자만 10~11자 입력해주세요.")) return;

    // 비밀번호 검사
    if (!validate(idPattern, passwordInput, "비밀번호는 4~12자의 영문 대소문자와 숫자만 가능합니다.")) return;

    // 비밀번호 확인 검사
    if (passwordInput.value !== passwordConfirmInput.value) {
      alert('비밀번호가 일치하지 않습니다.');
      passwordConfirmInput.focus();
      return;
    }

    // 제품 선택 확인
    if (!checkProduct()) return;

    // 수량 선택 확인
    if (!checkQuantity()) return;

    // 약관 동의 확인
    if (!checkTerms()) return;

    // 최종 확인창
    const confirmMsg = `
[입력 내용 확인]
이름: ${nameInput.value}
아이디: ${userIdInput.value}
이메일: ${emailInput.value}
연락처: ${phoneInput.value}
주문 수량: ${quantitySelect.value || quantityDirect.value}개
    `;
    if (!confirm(confirmMsg)) {
      alert('정보를 다시 확인해주세요.');
      return;
    }

    // 정상 신청 완료
    alert('정상적으로 신청되었습니다.');
    window.location.href = "https://sfcampus.co.kr"; // SFCampus로 이동
  });

  // 비밀번호 토글 기능
  togglePassword.addEventListener('click', function() {
    if (passwordInput.type === "password") {
      passwordInput.type = "text";
      passwordConfirmInput.type = "text";
    } else {
      passwordInput.type = "password";
      passwordConfirmInput.type = "password";
    }
  });

  // 에디션 상세 버튼
  editionInfo.addEventListener('click', function() {
    window.open('https://google.com', '_blank');
  });

});
</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quick Order Form</title>

<style>
*    { margin:0; padding:0 }
body { 
  font-family: '맑은 고딕' 돋움; 
  font-size:14px; 
  color:#333 }

.container {
  font-family: arial;
  font-size: 16px;
  margin: 25px;
  width: 400px;
  height: 580px;
  outline: solid 1px black;
  /* 설정 */
  position: relative;
  border-radius: 20px;
}

.child {
  width: 280px;
  height: 50px;
  
  /* 상하좌우 정중앙 정렬하기 */
  position: absolute;
  top: 10%;
  left: 20%;
  margin: -25px 0 0 -25px; /* 자식 요소 전체를 중앙 정렬하기 위해, 상단 및 왼쪽 margin을 마이너스 값으로 적용하기 */
}

.field { 
  font-size:14px;
  text-align: center;
}



</style>

</head>
<body>
<div class="container">
  <div class="child">
    <form>
      <label for="name">이름</label><br>
      <input id="name" name="name" type="text" value="" />
      <br>
      <label for="id">아이디</label><br>
      <input id="id" name="id" type="text" value="" />
      <br>
      <label for="email">이메일</label><br>
      <input id="email" name="email" type="text" value="" />
      <br>
      <label for="hp">연락처</label><br>
      <input id="hp" name="hp" type="text" value="" />
      <br>
      <label for="password1">패스워드</label><br>
      <input id="password1" name="password1" type="password" value="" />
      <br>
      <label for="password2">패스워드확인</label><br>
      <input id="password2" name="password2" type="password" value="" />
      <br><br>
      <fieldset>
        <legend>제품 타입</legend>
        <div>
           <label for="html">Starter</label>
           <input type="radio" id="type" name="type">
           <label for="css">Professional</label>
           <input type="radio" id="type" name="type">
        </div>
       
        <div>
           <label for="js">Enterprise</label>
           <input type="radio" id="type" name="type">
           <label for="js">Student</label>
           <input type="radio" id="type" name="type">
        </div>
        
    </fieldset>
    
    <br>
      <fieldset>
        <legend>주문 수량</legend>
        <div class="field">
           <select>
            <option>선택</option>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
            <option>6</option>
            <option>7</option>
            <option>8</option>
            <option>9</option>
           </select>
           <input type="text" size="10" placeholder="콜라 1리터">
        </div>
        <div class="field">10개 이상 주문 시 직접 수량을 입력 후 제출해주시면,
영업팀이 빠른 시일 내에 연락 드리겠습니다.</div>
    </fieldset>
    
    <br>
    <fieldset>
      <legend>약관 동의</legend>
      <div>
         <input type="checkbox" id="pagree" name="pagree">
         <label for="html">개인정보 수집 및 이용 동의(필수) </label><br>
         <input type="checkbox" id="sagree" name="sagree">
         <label for="html">서비스 이용 약관 동의(필수) </label><br>
         <input type="checkbox" id="ragree" name="ragree">
         <label for="html">E-mail 광고성 정보 수신 동의(선택) </label><br>
      </div>
    </fieldset>
    <br>
    <div class="field">
      <button>에디션 상세</button>
      <button type="submit">신청 하기</button>
    </div>
  </form>
  </div>
</div>


</body>
</html>
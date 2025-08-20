<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quick Order Form</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
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
  height: 560px;
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
  top: 5%;
  left: 20%;
  margin: -25px 0 0 -25px; /* 자식 요소 전체를 중앙 정렬하기 위해, 상단 및 왼쪽 margin을 마이너스 값으로 적용하기 */
}

.field { 
  font-size:14px;
  text-align: center;
}

div.password{
  position: relative;
}

div.password i{
  position: absolute;
  left: 90%;
  top: 5%;
  color: gray;
}

</style>
<script>
  function isValidKorean(text) {
    return /^[가-힣]{2,}$/.test(text);
  }
  
  function isValidId(text) {
    return /^[A-Za-z0-9]{4,12}$/.test(text);
  }
  
  function isValidHp(text) {
    return /^\d{10,11}$/.test(text);
  }
  
  function isValidEmail(email) {
    if (!email) {
      return false; // 빈 문자열인 경우 유효하지 않음
    }

    // 중간에 @와 .이 무조건 등장하는지 검증
    if (!email.includes('@') || !email.includes('.')) {
      return false;
    }

    // @ 기준으로 메일 아이디와 도메인 주소 분리
    const [localPart, domainPart] = email.split('@');

    if (!localPart || !domainPart) {
      return false; // @가 없거나 앞/뒤로 내용이 없는 경우 유효하지 않음
    }

    // 메일 아이디 유효성 검증
    const localPartRegex = /^[a-zA-Z0-9-_.]+$/;
    if (!localPartRegex.test(localPart)) {
      return false; // 영문, 숫자, -, ., _ 외 다른 문자 포함
    }

    // 도메인 주소 유효성 검증
    const domainRegex = /^[a-zA-Z0-9-_.]+$/;
    if (!domainRegex.test(domainPart)) {
      return false; // 영문, 숫자, -, ., _ 외 다른 문자 포함
    }

    // 도메인 주소 마지막 두세 글자 검증 (.net, .kr, .com 등)
    const topLevelDomainRegex = /\.(net|kr|com|org|gov|mil|edu|[a-zA-Z]{2})$/;
    if (!topLevelDomainRegex.test(domainPart)) {
      return false; // 마지막이 지정된 형태가 아님
    }

    return true; // 모든 조건을 만족하면 유효한 이메일
  }

  $(document).ready(function (){
    const form = $('#orderform'); // jQuery 객체로 변경
    
    form.on('submit', function(e) { // 이벤트 핸들러에서 function 키워드 사용
      console.log('submit 이벤트 잡음...');
      
      var name = orderform.name;
      var userId = orderform.userId;
      var email = orderform.email;
      var hp = orderform.hp;
      var password1 = orderform.password1;
      var password2 = orderform.password2;
      
      var type = orderform.type;
      var orderSelectAmount = orderform.orderSelectAmount;
      var orderInputAmount = orderform.orderInputAmount;
      var pagree = orderform.pagree;
      var sagree = orderform.sagree;
      
      const messageName = $('#messageName');
      const messageUserId = $('#messageUserId');
      const messageEmail = $('#messageEmail');
      const messageHp = $('#messageHp');
      const messagePassword1 = $('#messagePassword1');
      const messagePassword2 = $('#messagePassword2');
      
      const userIds = ["user123", "sfcampus", "admin123", "hatecodey"];
      
      // console.log("name.value.length("+ name.value.length + ")");
      // console.log("userId.value.length("+ userId.value.length + ")");
      
      // 이름
      if (name.value.trim() === '' ) {
        messageName.text('이름을 입력해주세요').css('color', 'red');
        setTimeout(function() {
          messageName.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      if(!isValidKorean(name.value)){
        messageName.text('한글 2글자 이상 입력').css('color', 'red');
        setTimeout(function() {
          messageName.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      // 아이디
      if( userId.value == "" ) {
        userId.focus();
        messageUserId.text('아이디를 입력해주세요').css('color', 'red');
        setTimeout(function() {
          messageUserId.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      if(!isValidId(userId.value)){
        messageUserId.text('영문 대문자 또는 소문자로 시작하는 아이디, 길이는 4 ~ 20자').css('color', 'red');
        setTimeout(function() {
          messageUserId.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      // 아이디 중복검사
      // for (var i=0; i<userIds.length; i++ ){ }
      
      // 이메일
      if( email.value == "" ) {
        email.focus();
        messageEmail.text('이메일을 입력해주세요').css('color', 'red');
        setTimeout(function() {
          messageEmail.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      if(!isValidEmail(email.value)){
        messageEmail.text('정확한 이메일 주소를 입력 바랍니다').css('color', 'red');
        setTimeout(function() {
          messageEmail.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      // 휴대폰 번호
      if( hp.value == ""){
        hp.focus();
        messageHp.text('휴대폰 번호를 입력해주세요').css('color', 'red');
        setTimeout(function() {
          messageHp.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      if(!isValidHp(hp.value)){
        messageHp.text('연락처는 – 기호 제외하고 작성해주세요').css('color', 'red');
        setTimeout(function() {
          messageHp.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      // 비밀번호1
      if( password1.value == ""){
        password1.focus();
        messagePassword1.text('비밀번호를 입력해주세요').css('color', 'red');
        setTimeout(function() {
          messagePassword1.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      if(!isValidId(password1.value)){
        password1.focus();
        messagePassword1.text('영문 대소문자, 길이는 4 ~ 20자').css('color', 'red');
        setTimeout(function() {
          messagePassword1.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      // 비밀번호2
      if( password2.value == ""){
        password2.focus();
        messagePassword2.text('비밀번호를 입력해주세요').css('color', 'red');
        setTimeout(function() {
          messagePassword2.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      if(!isValidId(password2.value)){
        password2.focus();
        messagePassword2.text('영문 대소문자, 길이는 4 ~ 20자').css('color', 'red');
        setTimeout(function() {
          messagePassword2.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      if(password1.value != password2.value){
        password2.focus();
        messagePassword2.text('비밀번호가 일치하지 않습니다').css('color', 'red');
        setTimeout(function() {
          messagePassword2.text('');
        }, 3000); // 3초 후 메세지 삭제
        return false;
      }
      
      // 제품 타입
      if( !type[0].checked && 
          !type[1].checked &&
          !type[2].checked &&
          !type[3].checked){
        alert("제품을 선택해주세요");
        return false;
      }
      
      // 주문 수량
      if( orderSelectAmount.value == "선택" && 
          orderInputAmount.value == ""){
        alert("수량을 입력해주세요 "); 
        return false;
      }
      
      // 약관 동의
      if( !pagree.checked || 
          !sagree.checked ){
        alert("필수 약관에 동의해주세요");
        return false;
      }
      
      alert("입력 데이터 검증 성공!!!!");
      
    }); // form.submit(e)    
    
    
    $('.password i').on('click',function(){
      $('input').toggleClass('active');
      if($('input').hasClass('active')){
        $(this).attr('class',"fa fa-eye-slash fa-lg")
                .prev('input').attr('type',"text");
      }else{
        $(this).attr('class',"fa fa-eye fa-lg")
                .prev('input').attr('type','password');
      }
    });
    
    $('.field#detail').on('click', function(){
      location.href = "http://google.com";
    });
    
  });//ready
</script>
</head>
<body>
<div class="container">
  <div class="child">
    <form id="orderform" method="post" action="result.jsp">
      <label for="name">이름</label><br>
      <input id="name" name="name" type="text" size="35" value="" />
      <span id="messageName"></span>
      <br>
      <label for="userId">아이디</label><br>
      <input id="userId" name="userId" type="text" size="35" value="" />
      <span id="messageUserId"></span>
      <br>
      <label for="email">이메일</label><br>
      <input id="email" name="email" type="text" size="35" value="" />
      <span id="messageEmail"></span>
      <br>
      <label for="hp">연락처</label><br>
      <input id="hp" name="hp" type="text" size="35" value="" />
      <span id="messageHp"></span>
      <br>
      <label for="password1">패스워드</label><br>
      <div class="password">
        <input type="password" id="password1" name="password1" placeholder="비밀번호를 입력하세요" size="35">
        <i class="fa fa-eye fa-lg"></i>
      <span id="messagePassword1"></span>
      </div>
      <label for="password2">패스워드확인</label><br>
      <div class="password">
        <input type="password" id="password2" name="password2" placeholder="비밀번호를 입력하세요" size="35">
        <i class="fa fa-eye fa-lg"></i>
      <span id="messagePassword2"></span>
      </div>
      <br>
      <br>
      <fieldset>
        <legend>제품 타입</legend>
        <div class="field">
           <label for="html">Starter</label>
           <input type="radio" name="type">&nbsp;&nbsp;
           <label for="css">Professional</label>
           <input type="radio" name="type">
        </div>
       
        <div class="field">
           <label for="js">Enterprise</label>
           <input type="radio" name="type">&nbsp;&nbsp;&nbsp;&nbsp;
           <label for="js">Student</label>
           <input type="radio" name="type">
        </div>
        
    </fieldset>
    
    <br>
      <fieldset>
        <legend>주문 수량</legend>
        <div class="field">
           <select id="orderSelectAmount">
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
           <input id="orderInputAmount" type="text" size="10" placeholder="직접 작성">
        </div>
        <div class="field" id="messageCustomOrder">10개 이상 주문 시 직접 수량을 입력 후 제출해주시면,
영업팀이 빠른 시일 내에 연락 드리겠습니다.</div>
    </fieldset>
    
    <br>
    <fieldset>
      <legend>약관 동의</legend>
      <div>
         <input type="checkbox" id="pagree" name="pagree">
         <label for="html"><a href="http://google.com"> 개인정보 수집 및 이용 동의(필수) </a> </label><br>
         <input type="checkbox" id="sagree" name="sagree">
         <label for="html"><a href="http://google.com"> 서비스 이용 약관 동의(필수) </a> </label><br>
         <input type="checkbox" id="ragree" name="ragree">
         <label for="html"><a href="http://google.com"> E-mail 광고성 정보 수신 동의(선택) </a> </label><br>
      </div>
    </fieldset>
    <br>
    <div class="field">
      <button id="detail">에디션 상세</button>
      <button type="submit">신청 하기</button>
    </div>
  </form>
  </div>
</div>


</body>
</html>
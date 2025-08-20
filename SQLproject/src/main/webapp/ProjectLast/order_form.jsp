<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quick Order Form</title>
    <style>
        /* Reset and Base Styles */
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
            background-color: #f4f6f8; /* 밝은 회색 배경 */
            color: #333;
            line-height: 1.6;
            display: flex;
            justify-content: center;
            align-items: flex-start; /* 상단 정렬을 위해 */
            min-height: 100vh;
            padding: 30px 15px;
        }

        .container {
            background-color: #ffffff;
            width: 100%;
            max-width: 650px; /* 최대 너비 조정 */
            padding: 35px 40px; /* 패딩 조정 */
            border-radius: 12px;
            box-shadow: 0 6px 25px rgba(0, 0, 0, 0.1); /* 그림자 강화 */
        }

        h1 {
            text-align: center;
            color: #2c3e50; /* 제목 색상 */
            margin-bottom: 35px;
            font-size: 1.8em; /* 제목 크기 */
            font-weight: 600;
        }

        /* Form Group Styling */
        .form-group {
            margin-bottom: 22px;
        }

        .form-group label.group-label { /* 각 섹션의 메인 라벨 (예: "이름:", "제품 타입:") */
            display: block;
            font-size: 0.95em;
            font-weight: 600;
            color: #495057; /* 라벨 색상 */
            margin-bottom: 8px;
        }

        /* Input Fields Styling */
        .form-control {
            width: 100%;
            padding: 12px 15px; /* 패딩 조정 */
            font-size: 1em;
            border: 1px solid #ced4da; /* 테두리 색상 */
            border-radius: 6px;
            transition: border-color 0.2s ease, box-shadow 0.2s ease;
        }

        .form-control:focus {
            border-color: #3498db; /* 포커스 시 파란색 계열 */
            box-shadow: 0 0 0 0.2rem rgba(52, 152, 219, 0.25); /* 포커스 시 그림자 */
            outline: none;
        }

        /* Password Field Specifics */
        .password-wrapper {
            position: relative;
            display: flex; /* 아이콘 정렬을 위해 */
            align-items: center;
        }

        .password-wrapper .form-control {
             padding-right: 45px; /* 아이콘 공간 확보 */
        }

        .password-wrapper .toggle-password {
            position: absolute;
            right: 15px;
            top: 50%;
            transform: translateY(-50%);
            cursor: pointer;
            color: #6c757d; /* 아이콘 색상 */
            font-size: 1.2em;
            user-select: none; /* 드래그 방지 */
        }

        /* Radio Button Group (제품 타입) */
        .radio-group .radio-option {
            display: flex;
            align-items: center;
            margin-bottom: 12px; /* 옵션 간 간격 */
            padding: 8px;
            border-radius: 6px;
            transition: background-color 0.2s;
        }
        .radio-group .radio-option:last-child {
            margin-bottom: 0;
        }
        .radio-group .radio-option:hover {
            background-color: #f8f9fa; /* 호버 시 배경색 */
        }
        .radio-group .radio-option input[type="radio"] {
            margin-right: 10px;
            width: 18px; /* 라디오 버튼 크기 */
            height: 18px;
            accent-color: #3498db; /* 라디오 버튼 선택 시 색상 */
        }
        .radio-group .radio-option label {
            font-weight: normal;
            color: #495057;
            cursor: pointer;
            margin-bottom: 0; /* group-label과의 충돌 방지 */
        }

        /* Order Quantity Section */
        .quantity-section .note {
            font-size: 0.85em;
            color: #6c757d;
            margin-top: 10px;
            padding: 8px 10px;
            background-color: #e9ecef;
            border-left: 3px solid #3498db;
            border-radius: 4px;
        }
        .quantity-controls {
            display: flex;
            align-items: center;
            gap: 10px; /* 요소 사이 간격 */
            margin-bottom: 8px;
        }
        .quantity-controls .form-control { /* select 태그 */
            flex-grow: 1;
        }
        .quantity-controls .btn-direct-input {
            padding: 10px 15px;
            font-size: 0.9em;
            color: #3498db;
            background-color: #fff;
            border: 1px solid #3498db;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.2s, color 0.2s;
            white-space: nowrap; /* 줄바꿈 방지 */
        }
        .quantity-controls .btn-direct-input:hover {
            background-color: #3498db;
            color: #fff;
        }
        #order_quantity_direct_input {
            margin-top: 8px; /* 직접 입력 필드 상단 간격 */
        }


        /* Terms and Conditions Box (약관 동의) */
        .terms-box {
            border: 1px solid #e0e0e0;
            padding: 20px;
            margin-top: 8px;
            border-radius: 8px;
            background-color: #fdfdfd;
        }
        .terms-box .checkbox-option {
            display: flex;
            align-items: flex-start; /* 긴 텍스트의 경우 상단 정렬 */
            margin-bottom: 12px;
        }
        .terms-box .checkbox-option:last-child {
            margin-bottom: 0;
        }
        .terms-box .checkbox-option input[type="checkbox"] {
            margin-right: 10px;
            margin-top: 4px; /* 텍스트와의 정렬 미세 조정 */
            width: 17px; /* 체크박스 크기 */
            height: 17px;
            accent-color: #3498db; /* 체크박스 선택 시 색상 */
            flex-shrink: 0; /* 줄어들지 않도록 */
        }
        .terms-box .checkbox-option label {
            font-weight: normal;
            color: #495057;
            cursor: pointer;
            line-height: 1.5;
            margin-bottom: 0;
        }

        /* Submit Button */
        .submit-button {
            width: 100%;
            padding: 12px 20px;
            font-size: 1.1em;
            font-weight: 500;
            color: #fff;
            background-color: #3498db; /* 파란색 계열 버튼 */
            border: none;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.2s, transform 0.1s;
            letter-spacing: 0.5px;
        }
        .submit-button:hover {
            background-color: #2980b9; /* 호버 시 약간 어둡게 */
        }
        .submit-button:active {
            background-color: #2471a3;
            transform: translateY(1px); /* 클릭 효과 */
        }

        /* Error Messages */
        .error-message {
            color: #e74c3c; /* 빨간색 에러 메시지 */
            font-size: 0.875em;
            margin-top: 5px;
            display: block; /* 항상 보이도록 */
            min-height: 1.2em; /* 공간 확보 */
        }

        /* Link to Order List */
        .order-list-link-container {
            text-align: center;
            margin-top: 25px;
        }
        .order-list-link {
            color: #3498db;
            text-decoration: none;
            font-weight: 500;
        }
        .order-list-link:hover {
            text-decoration: underline;
            color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>간편 주문 신청</h1>
        <form id="orderForm" action="insert_order.jsp" method="post" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="fullName" class="group-label">이름:</label>
                <input type="text" id="fullName" name="fullName" class="form-control" required>
                <div class="error-message" id="fullNameError"></div>
            </div>

            <div class="form-group">
                <label for="userId" class="group-label">아이디:</label>
                <input type="text" id="userId" name="userId" class="form-control" required>
                <div class="error-message" id="userIdError"></div>
            </div>

            <div class="form-group">
                <label for="email" class="group-label">이메일:</label>
                <input type="email" id="email" name="email" class="form-control" required>
                <div class="error-message" id="emailError"></div>
            </div>

            <div class="form-group">
                <label for="contact" class="group-label">연락처:</label>
                <input type="tel" id="contact" name="contact" class="form-control" placeholder="예: 010-1234-5678">
                <div class="error-message" id="contactError"></div>
            </div>

            <div class="form-group">
                <label for="password" class="group-label">패스워드:</label>
                <div class="password-wrapper">
                    <input type="password" id="password" name="password" class="form-control" placeholder="비밀번호를 입력하세요" required>
                    <span class="toggle-password" onclick="togglePasswordVisibility('password', this)">👁️</span>
                </div>
                <div class="error-message" id="passwordError"></div>
            </div>

            <div class="form-group">
                <label for="passwordConfirm" class="group-label">패스워드 확인:</label>
                <div class="password-wrapper">
                    <input type="password" id="passwordConfirm" name="passwordConfirm" class="form-control" placeholder="비밀번호를 다시 입력하세요" required>
                     <span class="toggle-password" onclick="togglePasswordVisibility('passwordConfirm', this)">👁️</span>
                </div>
                <div class="error-message" id="passwordConfirmError"></div>
            </div>

            <div class="form-group">
                <label class="group-label">제품 타입:</label>
                <div class="radio-group">
                    <div class="radio-option">
                        <input type="radio" id="typeStarter" name="productType" value="Starter" checked>
                        <label for="typeStarter">Starter</label>
                    </div>
                    <div class="radio-option">
                        <input type="radio" id="typeProfessional" name="productType" value="Professional">
                        <label for="typeProfessional">Professional</label>
                    </div>
                    <div class="radio-option">
                        <input type="radio" id="typeEnterprise" name="productType" value="Enterprise">
                        <label for="typeEnterprise">Enterprise</label>
                    </div>
                    <div class="radio-option">
                        <input type="radio" id="typeStudent" name="productType" value="Student">
                        <label for="typeStudent">Student</label>
                    </div>
                </div>
                <div class="error-message" id="productTypeError"></div>
            </div>

            <div class="form-group quantity-section">
                <label class="group-label">주문 수량:</label>
                <div class="quantity-controls">
                    <select id="order_quantity_select" class="form-control">
                        <option value="">수량 선택</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                    </select>
                    <button type="button" id="switchToDirectInputBtn" class="btn-direct-input">직접 작성</button>
                </div>
                <input type="number" id="order_quantity_direct_input" class="form-control" min="10" placeholder="10개 이상 수량 입력" style="display:none;">
                <input type="hidden" name="order_quantity" id="order_quantity_hidden" required>
                <div class="note">10개 이상 주문 시 "직접 작성"을 눌러 수량을 입력해 주세요.</div>
                <div class="error-message" id="quantityError"></div>
            </div>


            <div class="form-group">
                <label class="group-label">약관 동의:</label>
                <div class="terms-box">
                    <div class="checkbox-option">
                        <input type="checkbox" id="agreePersonalInfo" name="agree_personal_info" value="Y">
                        <label for="agreePersonalInfo">개인 정보 수집 및 이용 동의 (필수)</label>
                    </div>
                    <div class="checkbox-option">
                        <input type="checkbox" id="agreeServiceTerms" name="agree_service_terms" value="Y">
                        <label for="agreeServiceTerms">서비스 이용 약관 동의 (필수)</label>
                    </div>
                    <div class="checkbox-option">
                        <input type="checkbox" id="agreeEmailAds" name="agree_email_ads" value="Y">
                        <label for="agreeEmailAds">E-mail 광고성 정보 수신 동의 (선택)</label>
                    </div>
                </div>
                 <div class="error-message" id="termsError"></div>
            </div>

            <button type="submit" class="submit-button">신청 하기</button>
        </form>

        <div class="order-list-link-container">
            <a href="order_list.jsp" class="order-list-link">주문 목록 보기</a>
        </div>
    </div>

    <script>
        function togglePasswordVisibility(fieldId, toggleElement) {
            const passwordField = document.getElementById(fieldId);
            if (passwordField.type === "password") {
                passwordField.type = "text";
                toggleElement.textContent = "🙈";
            } else {
                passwordField.type = "password";
                toggleElement.textContent = "👁️";
            }
        }

        const quantitySelect = document.getElementById('order_quantity_select');
        const quantityDirectInput = document.getElementById('order_quantity_direct_input');
        const quantityHiddenInput = document.getElementById('order_quantity_hidden');
        const switchToDirectBtn = document.getElementById('switchToDirectInputBtn');
        const quantityErrorDiv = document.getElementById('quantityError');

        quantitySelect.addEventListener('change', function() {
            if (this.value && this.value !== "") {
                quantityHiddenInput.value = this.value;
                quantityDirectInput.style.display = 'none';
                quantityDirectInput.value = ''; // Clear direct input
                quantityErrorDiv.textContent = ''; // Clear error
            } else {
                 quantityHiddenInput.value = ''; // Clear if "수량 선택"
            }
        });
        
        switchToDirectBtn.addEventListener('click', function() {
            quantityDirectInput.style.display = 'block';
            quantitySelect.value = ''; // Reset select
            quantityHiddenInput.value = ''; // Clear hidden value
            quantityDirectInput.focus();
            quantityErrorDiv.textContent = ''; // Clear error
        });

        quantityDirectInput.addEventListener('input', function() {
            if (this.value) {
                 quantityHiddenInput.value = this.value;
                 quantitySelect.value = ''; // Ensure select is not considered
                 if (parseInt(this.value) < 10 && this.style.display !== 'none') {
                     quantityErrorDiv.textContent = '직접 입력 시 최소 10개 이상 주문해야 합니다.';
                 } else {
                     quantityErrorDiv.textContent = '';
                 }
            } else {
                 quantityHiddenInput.value = '';
                 if (this.style.display !== 'none') { // Only show error if direct input is visible and empty
                    quantityErrorDiv.textContent = '수량을 입력해주세요.';
                 }
            }
        });

        function validateForm() {
            let isValid = true;
            // Clear previous errors
            document.querySelectorAll('.error-message').forEach(el => el.textContent = '');

            // Helper function to display errors
            function showError(fieldId, message) {
                document.getElementById(fieldId + 'Error').textContent = message;
                isValid = false;
            }

            // Name
            if (!document.getElementById('fullName').value.trim()) {
                showError('fullName', '이름을 입력해주세요.');
            }
            // User ID
            if (!document.getElementById('userId').value.trim()) {
                showError('userId', '아이디를 입력해주세요.');
            }
            // Email
            const emailValue = document.getElementById('email').value.trim();
            if (!emailValue) {
                showError('email', '이메일을 입력해주세요.');
            } else if (!/^\S+@\S+\.\S+$/.test(emailValue)) { // Basic email format check
                showError('email', '유효한 이메일 주소를 입력해주세요.');
            }

            // Password
            const password = document.getElementById('password').value;
            const passwordConfirm = document.getElementById('passwordConfirm').value;
            if (password.length < 6) {
                showError('password', '패스워드는 최소 6자 이상이어야 합니다.');
            }
            if (password !== passwordConfirm) {
                showError('passwordConfirm', '패스워드가 일치하지 않습니다.');
            }
            
            // Product Type - already has a default selection, but can validate if needed
            const productTypeSelected = document.querySelector('input[name="productType"]:checked');
            if (!productTypeSelected) {
                showError('productType', '제품 타입을 선택해주세요.'); // Should not happen with default checked
            }


            // Quantity
            const finalQuantity = quantityHiddenInput.value;
            if (!finalQuantity || isNaN(finalQuantity) || parseInt(finalQuantity) < 1) {
                 showError('quantity', '유효한 주문 수량을 입력하거나 선택해주세요.');
            } else if (quantityDirectInput.style.display !== 'none' && parseInt(finalQuantity) < 10) {
                 // This error is already handled by direct input's event listener, but good for submit time check too.
                 showError('quantity', '직접 입력 시 최소 10개 이상 주문해야 합니다.');
            }


            // Terms
            if (!document.getElementById('agreePersonalInfo').checked) {
                showError('terms', '개인 정보 수집 및 이용 동의는 필수입니다.');
            } else if (!document.getElementById('agreeServiceTerms').checked) { // Separate else if for distinct message display
                showError('terms', (document.getElementById('termsError').textContent ? document.getElementById('termsError').textContent + ' ' : '') + '서비스 이용 약관 동의는 필수입니다.');
            }
            
            return isValid;
        }
    </script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.QuickOrderDao" %>
<%@ page import="com.javaex.vo.QuickOrderVo" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%
    // 1. Set character encoding for request parameters
    request.setCharacterEncoding("UTF-8");
    // 2. Retrieve parameters from the form
    String fullName = request.getParameter("fullName");
    String userId = request.getParameter("userId");
    String email = request.getParameter("email");
    String contact = request.getParameter("contact");
    String password = request.getParameter("password"); // Remember: store hashed passwords in production
    String productType = request.getParameter("productType");
    
    String orderQuantityStr = request.getParameter("order_quantity");
    int orderQuantity = 0;
    if (orderQuantityStr != null && !orderQuantityStr.isEmpty()) {
        try {
            orderQuantity = Integer.parseInt(orderQuantityStr);
        } catch (NumberFormatException e) {
            // Handle error - e.g., redirect back to form with an error message
            System.err.println("Invalid order quantity format: " + orderQuantityStr);
            // For simplicity, we'll proceed, but in a real app, validation is key
            // response.sendRedirect("order_form.jsp?error=invalid_quantity");
            // return;
        }
    }
    // For checkboxes, if not checked, parameter is null. Default to "N".
    String agreePersonalInfo = request.getParameter("agree_personal_info") != null ? "Y" : "N";
    String agreeServiceTerms = request.getParameter("agree_service_terms") != null ? "Y" : "N";
    String agreeEmailAds = request.getParameter("agree_email_ads") != null ? "Y" : "N";
    // Basic server-side validation (more robust validation should be done)
    boolean hasError = false;
    if (fullName == null || fullName.trim().isEmpty() ||
        userId == null || userId.trim().isEmpty() ||
        email == null || email.trim().isEmpty() ||
        password == null || password.trim().isEmpty() ||
        productType == null || productType.trim().isEmpty() ||
        orderQuantity <= 0) {
        hasError = true;    
    }
    // Required terms
    if (!"Y".equals(agreePersonalInfo) || !"Y".equals(agreeServiceTerms)) {
        hasError = true;
    }
    if (hasError) {
        // Redirect back to form with an error message
        // For a better user experience, pass specific error messages
        System.out.println("Validation error on server side. Redirecting to form.");
        // You might want to include an error parameter in the redirect URL
        // response.sendRedirect("order_form.jsp?error=validationFailed");
        // For now, let's just print to console and proceed to list for demo if DAO is called.
        // A robust application would not proceed.
        
        // Let's actually redirect if there's an error
        response.sendRedirect("order_form.jsp?error=true"); // Generic error
        return; // Stop further processing
    }
    // 3. Create a VO object
    QuickOrderVo vo = new QuickOrderVo();
    vo.setFullName(fullName);
    vo.setUserId(userId);
    vo.setEmail(email);
    vo.setContact(contact);
    vo.setPassword(password); // Again, hashing is important
    vo.setProductType(productType);
    vo.setOrderQuantity(orderQuantity);
    vo.setAgreePersonalInfo(agreePersonalInfo);
    vo.setAgreeServiceTerms(agreeServiceTerms);
    vo.setAgreeEmailAds(agreeEmailAds);
    // order_date will be set by SYSDATE in the database
    // 4. Create a DAO object and call the insert method
    QuickOrderDao dao = new QuickOrderDao();
    int result = dao.insert(vo);
    // 5. Redirect to the list page (or a success page)
    if (result > 0) {
        System.out.println("Order inserted successfully for user: " + userId);
        response.sendRedirect("order_list.jsp");
    } else {
        System.err.println("Failed to insert order for user: " + userId);
        // Redirect to an error page or back to the form with an error message
        response.sendRedirect("order_form.jsp?error=db_insert_failed");
    }
%>

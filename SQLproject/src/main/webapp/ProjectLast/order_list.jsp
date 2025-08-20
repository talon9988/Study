<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.QuickOrderDao" %>
<%@ page import="com.javaex.vo.QuickOrderVo" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
    QuickOrderDao dao = new QuickOrderDao();
    List<QuickOrderVo> orderList = dao.getList();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order List</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; background-color: #f9f9f9; }
        .container { background-color: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }
        h1 { text-align: center; color: #333; }
        table { width: 100%; border-collapse: collapse; margin-top: 20px; }
        th, td { border: 1px solid #ddd; padding: 10px; text-align: left; }
        th { background-color: #f0f0f0; color: #333; }
        tr:nth-child(even) { background-color: #f9f9f9; }
        tr:hover { background-color: #f1f1f1; }
        .action-links a { margin-right: 10px; text-decoration: none; color: #007bff; }
        .action-links a:hover { text-decoration: underline; }
        .no-orders { text-align: center; color: #777; margin-top: 20px; }
        .add-link { display: block; text-align: center; margin-top: 20px; padding:10px; background-color:#007bff; color:white; text-decoration:none; border-radius:4px; max-width:200px; margin-left:auto; margin-right:auto;}
        .add-link:hover{ background-color:#0056b3; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Submitted Orders</h1>
        <% if (orderList.isEmpty()) { %>
            <p class="no-orders">아직 등록된 주문이 없습니다.</p>
        <% } else { %>
            <table>
                <thead>
                    <tr>
                        <th>주문번호</th>
                        <th>이름</th>
                        <th>아이디</th>
                        <th>이메일</th>
                        <th>연락처</th>
                        <th>제품타입</th>
                        <th>수량</th>
                        <th>개인정보동의</th>
                        <th>서비스약관동의</th>
                        <th>광고메일동의</th>
                        <th>주문일시</th>
                        </tr>
                </thead>
                <tbody>
                    <% for (QuickOrderVo vo : orderList) { %>
                        <tr>
                            <td><%= vo.getOrderNo() %></td>
                            <td><%= vo.getFullName() %></td>
                            <td><%= vo.getUserId() %></td>
                            <td><%= vo.getEmail() %></td>
                            <td><%= (vo.getContact() != null ? vo.getContact() : "-") %></td>
                            <td><%= vo.getProductType() %></td>
                            <td><%= vo.getOrderQuantity() %></td>
                            <td><%= vo.getAgreePersonalInfo() %></td>
                            <td><%= vo.getAgreeServiceTerms() %></td>
                            <td><%= vo.getAgreeEmailAds() %></td>
                            <td><%= (vo.getOrderDate() != null ? sdf.format(vo.getOrderDate()) : "-") %></td>
                            <%-- <td class="action-links">
                                <a href="delete_order.jsp?orderNo=<%= vo.getOrderNo() %>" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
                            </td> --%>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } %>
        <a href="order_form.jsp" class="add-link">새 주문 등록하기</a>
    </div>
</body>
</html>

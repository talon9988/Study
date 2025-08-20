<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<%! 
  Connection conn = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  
  String url = "jdbc:oracle:thin:@localhost:1521/xe";
  String user = "hr";
  String pass = "hr";
  
             // 사번, 이름, 입사일, 근무부서, 매니저, 급여
  String sql = " SELECT e.EMPLOYEE_ID EMPLOYEE_ID,                      "
             + "        e.FIRST_NAME FIRST_NAME ,                       "
             + "        TO_CHAR(e.HIRE_DATE, 'YYYY.MM.DD') HIRE_DATE ,  "
             + "        d.DEPARTMENT_NAME DEPARTMENT_NAME,              "
             + "        m.FIRST_NAME MANAGER_NAME,                      "
             + "        e.SALARY SALARY                                 "
             + "  FROM EMPLOYEES e , DEPARTMENTS d , EMPLOYEES m        "
             + "  WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID(+)            "
             + "  AND e.MANAGER_ID = m.EMPLOYEE_ID(+)                   "
             + "  ORDER BY 1                                            ";
%>






<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원정보</title>
<style type="text/css" media="screen">
*           { margin:0; padding:0 }
body { 
  font-family: '맑은 고딕' 돋움; 
  font-size:0.75em; 
  color:#333 }
  
h1 { 
  text-align:center; 
}

.tbl-ex { 
  margin:10px auto; 
  border:1px solid #333; 
  border-collapse:collapse;
}

.tbl-ex th  { 
  border:1px solid #333; 
  padding:8px;
  text-align: center;
}

.tbl-ex td  { 
  border:1px solid #333; 
  padding:8px;
  text-align: left;
} 

.tbl-ex th        { background-color:#800080; font-size:1.1em; color:#fff; }

.tbl-ex tr.even     { background-color:#E8ECF6  }

.tbl-ex td:hover,
.tbl-ex td.even:hover   { background-color:	#98FF98; cursor:pointer }

</style>
</head>
<body>

<table width=800 class=tbl-ex>
  <tr>
    <th>사번</th>
    <th>이름</th>
    <th>입사일</th>
    <th>근무부서</th>
    <th>매니저</th>
    <th>급여</th>
  </tr>
  
  <%
  try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    conn = DriverManager.getConnection(url, user, pass);
    pstmt = conn.prepareStatement(sql);
    rs = pstmt.executeQuery();
    
    while(rs.next()){
      out.println("<tr>");
      out.println("<td>" + rs.getInt("EMPLOYEE_ID") + "</td>");
      out.println("<td>" + rs.getString("FIRST_NAME") + "</td>");
      out.println("<td>" + rs.getString("HIRE_DATE") + "</td>");
      out.println("<td>" + rs.getString("DEPARTMENT_NAME") + "</td>");
      out.println("<td>" + rs.getString("MANAGER_NAME") + "</td>");
      out.println("<td>" + rs.getString("SALARY") + "</td>");
      out.println("</tr>");
    }
  }catch(Exception e){
    e.printStackTrace();
  }finally{
    try{
      if(rs != null) rs.close();
      if(pstmt != null) pstmt.close();
      if(conn != null) conn.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  
  %>
 </table> 
</body>
</html>
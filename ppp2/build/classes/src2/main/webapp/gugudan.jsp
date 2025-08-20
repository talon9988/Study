<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 JSP</title>
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

.tbl-ex th        { background-color:#90ee90; font-size:1.9em; color:#fff; }

.tbl-ex tr.even     { background-color:#E8ECF6  }

.tbl-ex td:hover,
.tbl-ex td.even:hover   { background-color:#fc6; cursor:pointer }

</style>
</head>
<body>

<% 
  out.println("<div><h1>구구단 표</h1></div>");
  out.println("<table class='tbl-ex'>");
  out.println("<tr>");

  for(int i=2; i<10; i++){
    out.println("<th>" + i + "단</th>" );
  }
  out.println("</tr>");

  out.println("<tr>");
  for(int i=2; i<10; i++){
    out.println("<td>" );
    for(int j=1; j<10; j++){
      out.println(i + " * " + j + " = " + i*j + "<br>"); 
    }
    out.println("</td>" );
  }
  out.println("</tr>");
  out.println("</table>");
%> 
</body>
</html>
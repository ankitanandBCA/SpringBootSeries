<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>About page</h1>

<%
   String name=(String)request.getAttribute("name");
Integer Rollnumber=(Integer)request.getAttribute("roll");
  LocalDateTime time =(LocalDateTime)request.getAttribute("time");

%>


<h1>name: <%=name %></h1>
<h1>Rollnumber: <%=Rollnumber %></h1>
<h1>Date ANd Time: <%=time %></h1>
</body>
</html>
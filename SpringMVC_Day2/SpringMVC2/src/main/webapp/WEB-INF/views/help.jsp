<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
    <h1>Help</h1>
    
    <h2>Name : ${name}</h2>
    <h2>Roll : ${id}</h2>
    
    <hr>
    <h2>Marks :</h2>
    
    <c:forEach var="item" items="${marks}">
        <h3>${item}</h3>
    </c:forEach>
</body>
</html>

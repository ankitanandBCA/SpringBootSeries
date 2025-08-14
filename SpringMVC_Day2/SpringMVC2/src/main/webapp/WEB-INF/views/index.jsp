<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
  <h1>Hello Home Page</h1>
  <h2>Called by Home Controller</h2>
  
  <%
      String name = (String) request.getAttribute("name");
      Integer id = (Integer) request.getAttribute("id");
      List<String> friend = (List<String>) request.getAttribute("f");
  %>

  <h1>Name is : <%= name %> </h1>
  <h1>Id: <%= id %></h1>

  <h1>Friends:</h1>
  <ul>
      <%
          if (friend != null) {
              for (String e : friend) {
      %>
                  <li><%= e %></li>
      <%
              }
          } else {
      %>
              <li>No friends found</li>
      <%
          }
      %>
  </ul>
</body>
</html>

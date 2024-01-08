<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link rel="stylesheet" type="text/css" href="welcome.css" />
</head>
<body>
	   <%
       
        HttpSession session1 = request.getSession(false);       
        if (session1 != null && session1.getAttribute("username") != null) {
            String username = (String) session1.getAttribute("username");
    %>
    
	<div class="container">
		<h2>Welcome,<%= username %>!</h2>
		<br>
		<a href="logout.jsp">Logout Here</a> 
	</div>
	   <%
        } else {
            response.sendRedirect("login.jsp");
        }
    %>
	
</body>
</html>
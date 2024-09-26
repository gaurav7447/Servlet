package com.loginsendRedirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
username: <input type="text" name="username"><br>
Password: <input type="password" name="password"><br>
 <input type="submit" name="Login">
</form>

</body>
</html>
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String pass=request.getParameter("password");
		if(username.equalsIgnoreCase("Admin") && pass.equals(("admin@123"))) {
			response.sendRedirect("https://www.youtube.com/");
		}
		else {
			response.sendRedirect("Login.html");
		}
	}

}

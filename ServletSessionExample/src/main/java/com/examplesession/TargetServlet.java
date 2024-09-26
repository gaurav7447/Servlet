package com.examplesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			Cookie cookies[]=request.getCookies();
		    for(int i=0;i<cookies.length;i++) {
		     System.out.println(cookies[i].getName());
		     System.out.println(cookies[i].getValue());
		     

		    }
		    HttpSession session =request.getSession();
			String username=(String)session.getAttribute("user");
			response.setContentType("text/html");	
			PrintWriter out=response.getWriter();
			out.println("<h2>Welcome "+username+"</hr>");
			out.println("<br><hr><br>");
			out.println("CHIN TAPAK DAMDAM");
			out.println("<a href='rajya'>click here</a>");
		
	
	
	}

}

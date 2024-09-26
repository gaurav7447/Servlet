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


public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("username");
	
		 
		 Cookie cookies[]=request.getCookies();
		    for(int i=0;i<cookies.length;i++) {
		     System.out.println(cookies[i].getName());
		     System.out.println(cookies[i].getValue());
		     

		    }
		  // response.addCookie(new Cookie("England","1234"));
		    
		
	    
			HttpSession session= request.getSession();
	   
	    session.setAttribute("user", uname);
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    out.println("<a href='target' >Click here to go ahead</a>");
	    
	    
		
		
		
		
	}

}

package com.loginsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
		String newuser=(String) session.getAttribute("user");
	    String newpass=(String) session.getAttribute("pass");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println(newuser+" "+newpass);
		
	}

}

package com.loginsendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>servlet</title>");
		out.println("<head>");
		out.println("<body>");	
		out.println("<h2> welcome to the world of servlets</h2>");
		out.println("</body>");	
		out.println("</html>");	
		
	}

}

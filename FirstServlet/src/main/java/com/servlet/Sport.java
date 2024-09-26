package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Sport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		String team=request.getParameter("team");
		String player=request.getParameter("player");
		
		PrintWriter out=response.getWriter();
		out.println("Team :"+team);
		out.println("player :"+player);
		out.println("sports :"+name);
		
	}

}

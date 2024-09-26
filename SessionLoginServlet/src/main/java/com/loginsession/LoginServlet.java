package com.loginsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        HttpSession session=request.getSession();
       
        
        response.setContentType("text/html");
       
        if(username != null && pass != null) {
        	
            if(username.equalsIgnoreCase("Admin") && pass.equals("admin123")) {
            	
            	
            	session.setAttribute("user", username);
                session.setAttribute("pass", pass);
                response.sendRedirect("welcome");

            } else {
            	
            
            	 response.sendRedirect("Login.html");
            	PrintWriter out=response.getWriter();
            	out.println("Invlalid Credential");
            	
               
            }
        } else {
        	PrintWriter out=response.getWriter();
        	out.println("Invalid credential");
          // response.sendRedirect("Login.html");
        }
    }
}

package com.SendRedirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSendRedirect extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        
        if(username != null && pass != null) {
            if(username.equalsIgnoreCase("Admin") && pass.equals("admin123")) {
                //response.sendRedirect("Welcome");
                response.sendRedirect("https://www.netflix.com/in/");
            } else {
                response.sendRedirect("Login.html");
            }
        } else {
            response.sendRedirect("Login.html");
        }
    }
}

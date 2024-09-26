package com.SendRedirect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Connection con;

    public void init(ServletConfig config) throws ServletException {
        ServletContext context = config.getServletContext();
        String url = context.getInitParameter("dburl");
        String username = context.getInitParameter("dbname");
        String password = context.getInitParameter("dbpass");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new ServletException("JDBC Driver not found", e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Unable to establish database connection", e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        if (con == null) {
            throw new ServletException("Database connection is not initialized.");
        }

        try {
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("INSERT INTO loginred  VALUES ('" + fname + "', '" + lname + "', '" + email + "', '" + pass + "')");
            System.out.println(result + " Register Successful");

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            if (result > 0) {
                response.sendRedirect("Login.html");
            } else {
                out.println("<h2 style='color:red'> Error to Register </h2>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Database operation failed", e);
        }
    }

    public void destroy() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

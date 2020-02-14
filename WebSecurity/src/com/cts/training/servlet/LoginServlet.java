package com.cts.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public class LoginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		RequestDispatcher rd=null;
		if(user.equalsIgnoreCase("admin") && pass.equals("admin@123")) {
			rd=request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
		}else {
			out.println("<h2 style='color:red;'>Something went Wrong... Please try again</h2>");
			rd=request.getRequestDispatcher("loginpage.jsp");
			rd.include(request, response);
		}
		
		
	}
}

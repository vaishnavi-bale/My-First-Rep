package com.cts.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		out.println("Hello To Servlet");
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		String Id=request.getParameter("id");
//		String fullName=request.getParameter("fullName");
//		String username=request.getParameter("user");
//		String password=request.getParameter("pass");
//		out.println("UserName: "+username);
//		out.println("Password: "+password);
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	PrintWriter out = response.getWriter();
    	String Id=request.getParameter("id");
 		String fullName=request.getParameter("fullName");
//		String[] Gender=request.getParameterValues();
// 		String Course=request.getParameter("course");
     	String userName=request.getParameter("user");
    	String passWord=request.getParameter("pass");
    	
    	out.println("Id: "+Id);
    	out.println("fullName: "+fullName);
//    	out.println("Gender: "+Gender);
//    	out.println("Course: "+Course);
		out.println("UserName: "+userName);
		out.println("Password: "+passWord);

	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="admin";
		Connection conn=  DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesfull");
		
		String query="insert into Practice values (?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1, Id);
		ps.setString(2, fullName);
		ps.setString(3, userName);
		ps.setString(4, passWord);
		
		int result=ps.executeUpdate();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	RequestDispatcher rd=request.getRequestDispatcher("login.html");
	
	
}
}


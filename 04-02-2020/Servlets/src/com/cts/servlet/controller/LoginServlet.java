package com.cts.servlet.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public boolean isValidUser(String userName, String passWord) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/cts";
		String username = "root";
		String password = "admin";
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Succesfull");

		String query = "select * from Practice where username=? and password=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, userName);
		ps.setString(2, passWord);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return true;
		} else
			return false;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("user");
		String passWord = request.getParameter("pass");

		RequestDispatcher rd;
		try {
			if (isValidUser(userName, passWord)) {
				rd = request.getRequestDispatcher("welcome.html");
				rd.forward(request, response);
			} else {
				rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

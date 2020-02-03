package com.cts.project.controller;

import com.cts.project.dao.UserDAO;
import com.cts.project.daoimpl.UserDAOImpl;

public class UserController {
public static void main(String[] args) {
	UserDAO userDAO=new UserDAOImpl();
	boolean status=userDAO.isValidUser("cs", "csd");
			if(status) {
				System.out.println("Valid User");
			}else {
				System.out.println("Invalid User");
			}
}
}

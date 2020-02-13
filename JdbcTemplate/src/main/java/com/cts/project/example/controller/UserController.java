package com.cts.project.example.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.project.example.dao.UserDemoDAO;
import com.cts.project.example.model.UserDemo;

public class UserController {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("./applicationContext.xml");
		UserDemoDAO userDemoDAO=(UserDemoDAO) applicationContext.getBean("userDemoDAOImpl");
		
//		UserDemo user=new UserDemo(1,"vaishu","vaish");
//		System.out.println(userDemoDAO.saveUser(user));
//		System.out.println(user);
//		
	   UserDemo user1=userDemoDAO.getUserById(1);
	   user1.setUserName("vaishnavi");
	   System.out.println(userDemoDAO.updateUser(user1));
//	   System.out.println(user);
		
		
		
		

	}

}

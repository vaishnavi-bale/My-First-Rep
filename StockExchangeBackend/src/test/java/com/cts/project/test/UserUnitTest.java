package com.cts.project.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.dao.UserDAO;
import com.cts.project.daoimpl.UserDAOImpl;
import com.cts.project.model.User;

public class UserUnitTest {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private static User user;
	
	@BeforeClass
	public static void init() {
		context= new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
		user=(User) context.getBean("user");
		userDAO=(UserDAO) context.getBean("userDAO");
	}
	
	//@Test
	public void testGetAllUsers() {
		List<User> users = userDAO.getAllUsers();
		assertEquals(1, users.size());
	}
	
//	@Test
//	public void test_save_user_success() {
//		User u=new User(23,"guru","guru@gmail.com",5656543355L,"guru","guruuu");
//		assertEquals(true,userDAO.saveUser(u));
//	}
	
	//@Test
	public void test_update_user_success() {
		User u = userDAO.getUserById(0);
		u.setEmail("vaishu@gmail.com");
		
		assertEquals(true, userDAO.updateUser(u));
	}
	
//	@Test
//	public void test_delete_user_success() {
//		User u=userDAO.getUserById(101);
//		assertEquals(true, userDAO.deleteUser(u));
//	}

	@Test
	public void test_isvalid_user_sucess() {
		assertEquals(true, userDAO.isValidUser("guru", "guruuu"));
	}

}

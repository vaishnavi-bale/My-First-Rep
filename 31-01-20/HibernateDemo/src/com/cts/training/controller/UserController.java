package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		User user = new User(103, "test", "test@123", "test@cts.com", 556846598789L, false);
//		
//		session.save(user);
		User getUser=session.get(User.class, 103);
//		getUser.setEnabled(true);
//		getUser.setPassword("hello@123");
//		session.update(getUser);
//		session.delete(getUser);
		List<User> users = session.createQuery("from User").list();
		users.forEach(System.out::println);
		transaction.commit();
		session.close();

	}

}

package com.cts.middleware.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.middleware.model.UserCollectionEntity;
import com.cts.middleware.model.UserEntity;

public class UserAnnotationController {
	public static void main(String[] args) {
		/*
		 * AnnotationConfigApplicationContext context=new
		 * AnnotationConfigApplicationContext(); context.scan("com.cts.middleware");
		 * context.refresh();
		 * 
		 * UserEntity userEntity = (UserEntity)context.getBean("userEntity");
		 * 
		 * userEntity.setEmail("admin@gmail.com");
		 * System.out.println(userEntity.getEmail());
		 */
		
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//        context.scan("com.cts.middleware");
//        context.refresh();
//        
//        UserCollectionEntity userCollectionEntity = (UserCollectionEntity)context.getBean("userCollectionEntity");
//        List<String> emails=new ArrayList<String>(Arrays.asList("vaish@gmail.com","snk@gmail.com"));
//        userCollectionEntity.setEmail(emails);
//        System.out.println(userCollectionEntity.getEmail());
	}
}

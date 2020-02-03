package com.cts.training.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Developer;
import com.cts.training.model.Technology;

public class DeveloperController {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction tx= session.beginTransaction();
	
	Developer d1=new Developer();
	d1.setName("vaish");
	
	Developer d2=new Developer();
	d2.setName("vidya");
	
	Developer d3=new Developer();
	d3.setName("pranay");
	
	Technology t1=new Technology();
	t1.setLanguage("java");
	t1.setExpertise("expert");
	
	Technology t2=new Technology();
	t2.setLanguage("Big Data");
	t2.setExpertise("intermediate");
	
	Set<Technology> technologies= new HashSet<Technology>();
	technologies.add(t1);
	technologies.add(t2);
	d1.setTechnology(technologies);
	d2.setTechnology(technologies);
	d3.setTechnology(technologies);
	

	session.save(d1);
	session.save(d2);
	session.save(d3);
	tx.commit();

	
}
}

package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;

public class CompanyController {
 public static void main(String ar[]) {
	 Configuration cfg=new Configuration();
	 cfg.configure();
	 SessionFactory sessionFactory=cfg.buildSessionFactory();
	 Session session=sessionFactory.openSession();
	 Transaction transaction=session.beginTransaction();
	 
	 //save
//	 Company company=new Company(101,"CTS","digital Transformation","Brian Humphires",58842442.253625);
//	 session.save(company);
	 StockExchange stockExchange=new StockExchange(101,"vaish","golnaka");
	 session.save(stockExchange);
	 transaction.commit();
	 session.close();
 }
}

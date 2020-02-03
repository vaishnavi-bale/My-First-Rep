package com.cts.training.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;

public class EmployeeController {
public static void main(String ar[]) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sessionFactory= cfg.buildSessionFactory();
	Session session= sessionFactory.openSession();
	Transaction t=session.beginTransaction();
	Employee employee=new Employee();
	employee.setName("VAISH");
//	Map<String,String> emails=new LinkedHashMap<>();
//	emails.put("Gmail_Email","abc@gmail.com");
//	emails.put("Gmail_Email","xyz@gmail.com");
//	employee.setEmails(emails);
	
	PermanentEmployee pe=new PermanentEmployee();
	pe.setSalary(35465365);
	pe.setBonus(5366F);
	
	ContractualEmployee ce=new ContractualEmployee();
	ce.setPayPerHour(54656);
	ce.setContractPeriod(54354F);
	
	session.save(employee);
	session.save(pe);
	session.save(ce);
	t.commit();
	session.close();
}
}

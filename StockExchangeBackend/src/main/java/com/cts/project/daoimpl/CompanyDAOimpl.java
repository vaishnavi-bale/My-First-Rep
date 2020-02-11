package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.dao.CompanyDAO;
import com.cts.project.model.Company;
import com.cts.project.model.StockPrice;

@Transactional
@Repository(value="companyDAO")
public class CompanyDAOimpl implements CompanyDAO{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean saveCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().save(company);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().update(company);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().delete(company);;
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Company getCompanyById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Company.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Company> getAllCompany() {
		try {
			List<Company> companies = sessionFactory.getCurrentSession().createQuery("from Company").list();
			return companies;

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}

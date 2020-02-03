package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.project.dao.StockExchangeDAO;
import com.cts.project.hibernate.HibernateUtil;
import com.cts.project.model.StockPrice;
import com.cts.project.model.User;

public class StockPriceDAOImpl implements StockExchangeDAO{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public boolean saveStockPrice(StockPrice stockPrice) {
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(stockPrice);
			transaction.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStockPrice(StockPrice stockPrice) {
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.update(stockPrice);
			transaction.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteStockPrice(StockPrice stockPrice) {
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(stockPrice);
			transaction.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public StockPrice getStockPriceByCode(int companyCode) {
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			StockPrice stockPrice=session.get(StockPrice.class, companyCode);
			transaction.commit();
			session.close();
			return stockPrice;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<StockPrice> getAllStockPrice() {
		try {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			List<StockPrice> stockPrices=session.createQuery("from StockPrice").list();
			transaction.commit();
			session.close();
			return stockPrices;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}

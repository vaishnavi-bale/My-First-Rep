package com.cts.project.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.project.dao.StockExchangeDAO;
import com.cts.project.model.StockPrice;


@Transactional
@Repository(value="stockpriceDAO")
public class StockPriceDAOImpl implements StockExchangeDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().save(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().update(stockPrice);;
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().delete(stockPrice);;
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public StockPrice getStockPriceByCode(int companyCode) {
		try {
			return sessionFactory.getCurrentSession().get(StockPrice.class,companyCode);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<StockPrice> getAllStockPrice() {
		try {
			List<StockPrice> stockPrices = sessionFactory.getCurrentSession().createQuery("from StockPrice").list();
			return stockPrices;

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}

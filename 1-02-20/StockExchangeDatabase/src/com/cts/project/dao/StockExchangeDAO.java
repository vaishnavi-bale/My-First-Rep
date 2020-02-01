package com.cts.project.dao;

import java.util.List;

import com.cts.project.bean.StockPrice;
import com.cts.project.bean.User;

public interface StockExchangeDAO {
	public boolean saveStockPrice(StockPrice stockPrice);

	public boolean updateStockPrice(StockPrice stockPrice);

	public boolean deleteStockPrice(StockPrice stockPrice);

	public StockPrice getStockPriceByCode(int companyCode);

	public List<StockPrice> getAllStockPrice();
}

package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.StockPrice;
import com.cts.project.model.User;

public interface StockExchangeDAO {
	public boolean saveStockPrice(StockPrice stockPrice);

	public boolean updateStockPrice(StockPrice stockPrice);

	public boolean deleteStockPrice(StockPrice stockPrice);

	public StockPrice getStockPriceByCode(int companyCode);

	public List<StockPrice> getAllStockPrice();
}

package com.cts.project.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.dao.StockExchangeDAO;

import com.cts.project.model.StockPrice;




public class StockPriceUnitTest {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static StockExchangeDAO stockpriceDAO;
	private static StockPrice stockprice;
	@BeforeClass
	public static void init() {
		context= new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
		stockprice=(StockPrice) context.getBean("stockPrice");
		stockpriceDAO=(StockExchangeDAO) context.getBean("stockpriceDAO");
	}
	
    @Test
	public void testGetAllStockPrices() {
		List<StockPrice> stocks = stockpriceDAO.getAllStockPrice();
		assertEquals(1, stocks.size());
	}
	
//	@Test
//	public void test_save_user_success() {
//		User u=new User(23,"guru","guru@gmail.com",5656543355L,"guru","guruuu");
//		assertEquals(true,userDAO.saveUser(u));
//	}
	
//	//@Test
//	public void test_update_stockprice_success() {
//	    StockPrice s = stockpriceDAO.getStockPriceByCode(200);
//		s.setStockExchange("jnkijk");;
//		
//		assertEquals(true, stockpriceDAO.updateStockPrice(s));
//	}
//	
//	@Test
//	public void test_delete_user_success() {
//		User u=userDAO.getUserById(101);
//		assertEquals(true, userDAO.deleteUser(u));
//	}


}

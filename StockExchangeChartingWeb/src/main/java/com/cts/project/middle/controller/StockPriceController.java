package com.cts.project.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.dao.StockPriceDAO;
import com.cts.project.model.StockPrice;
import com.cts.project.model.User;

@Controller
public class StockPriceController {

	@Autowired
	StockPriceDAO stockPriceDAO;
	@GetMapping("/stock-home")
	public String stockpricePage(Model model) {
		List<StockPrice> stocks = stockPriceDAO.getAllStockPrice();
		model.addAttribute("list", stocks);
		model.addAttribute("stockprice", new StockPrice()); //user will work as model attribute in form.
		return "stockprices";
	}
	@PostMapping("/stockprice/save-stockprice")  //anyone can be written postmapping or requestmapping.
	public String addStockPrice(@ModelAttribute("stockprice") StockPrice stockPrice) {
		stockPriceDAO.saveStockPrice(stockPrice);
		return "redirect:/stock-home";
	}
//	@GetMapping("/remove/{id}") //{}-path varaiable
//	public String deleteUser(@PathVariable("id") int id) {
//		User user=stockPriceDAO.getUserById(id);
//		stockPriceDAO.deleteUser(user);
//		return "redirect:/user-home";
//		
//	}
}

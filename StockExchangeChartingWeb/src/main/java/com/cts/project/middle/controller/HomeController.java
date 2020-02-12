package com.cts.project.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.project.dao.CompanyDAO;
import com.cts.project.dao.StockPriceDAO;
import com.cts.project.dao.UserDAO;
import com.cts.project.model.Company;
import com.cts.project.model.StockPrice;
import com.cts.project.model.User;

@Controller
public class HomeController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private StockPriceDAO stockpriceDAO;
	@Autowired
	private CompanyDAO companyDAO;

//    @GetMapping("/")-->in spring 4.3 version and above, we can use getmapping or request mapping for mapping index page
	@RequestMapping("/")
	public String headerPage(Model model) {
		return "header";
	}
	
	@RequestMapping("/index")
	public String indexPage(Model model) {
		model.addAttribute("message", "Welcome to spring MVC");
//        List<String> names= new ArrayList<String>();
//        addNames(names);
//      model.addAttribute("list", names);
//    	List<User>  users=userDAO.getAllUsers();
//    	model.addAttribute("list", users);

		return "index";
	}

	@RequestMapping("/user")
	public String userPage(Model model) {
		List<User> users = userDAO.getAllUsers();
		model.addAttribute("list", users);

		return "user";
	}

	@RequestMapping("/stockprice")
	public String stockPricePage(Model model) {
		model.addAttribute("message", "Welcome to stock Price Page");
		List<StockPrice> stocks = stockpriceDAO.getAllStockPrice();
		model.addAttribute("list", stocks);
		return "stockprice";
	}

	@RequestMapping("/company")
	public String companyPage(Model model) {
		model.addAttribute("message", "Welcome To Company Page");
		List<Company> company = companyDAO.getAllCompany();
		model.addAttribute("list", company);
		return "company";
	}
//	@GetMapping("/company-data")
//	public String companyPages(Model model) {
//		List<Company>  company=companyDAO.getAllCompany();
//    	model.addAttribute("list", company);
//		return "company";
//	}
//	private void addNames(List<String> names) {
//		names.add("vaish");
//		names.add("vidya");
//		names.add("guru");
//		names.add("prudvi");
//
//	}
}

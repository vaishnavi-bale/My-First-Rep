package com.cts.project.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.dao.CompanyDAO;
import com.cts.project.model.Company;
import com.cts.project.model.User;

@Controller
public class CompanyController {
    @Autowired
	CompanyDAO companyDAO;
	
	@GetMapping("/company-data")
	public String companyPage(Model model) {
		List<Company>  company=companyDAO.getAllCompany();
    	model.addAttribute("list", company);
    	model.addAttribute("company", new Company());
		return "companies";
	}
	
	@PostMapping("/company/save-company")
//	@RequestMapping(value="/users/save",method=RequestMethod.POST)  //anyone can be written postmapping or requestmapping.
	public String addCompany(@ModelAttribute("company") Company company) {
		companyDAO.saveCompany(company);
		return "redirect:/company-home";
	}

}

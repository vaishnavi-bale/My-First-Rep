package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.Company;

public interface CompanyDAO {
	public boolean saveCompany(Company company);

	public boolean updateCompany(Company company);

	public boolean deleteCompany(Company company);

	public Company getCompanyById(int id);

	public List<Company> getAllCompany();
}

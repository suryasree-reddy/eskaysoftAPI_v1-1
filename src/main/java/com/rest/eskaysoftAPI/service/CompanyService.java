package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.Company;

public interface CompanyService {

	Iterable<Company> listAllCompany();

	Company getCompanyById(Long id);

	boolean deleteCompany(Long id);

	Company save(Company company);

	Company create(Company company);

}

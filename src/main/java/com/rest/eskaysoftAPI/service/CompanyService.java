package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.model.CompanyDto;

public interface CompanyService {

	List<CompanyDto> listAllCompany();

	Company getCompanyById(Long id);

	boolean deleteCompany(Long id);

	Company save(Company company);

	Company create(Company company);

}

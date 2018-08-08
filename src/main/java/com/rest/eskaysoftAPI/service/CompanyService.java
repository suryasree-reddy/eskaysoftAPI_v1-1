package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.CompanyDto;

public interface CompanyService {

	List<CompanyDto> listAllCompany();

	CompanyDto getCompanyById(Long id);

	boolean deleteCompany(Long id);

	CompanyDto save(CompanyDto company);

	CompanyDto create(CompanyDto company);

}

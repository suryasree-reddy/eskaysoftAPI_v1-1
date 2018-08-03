package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.CompanyDao;
import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.CompanyDto;
import com.rest.eskaysoftAPI.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	private CompanyDao companyDao;

	@Autowired
	public void setAccountInformationDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	@Override
	public List<CompanyDto> listAllCompany() {
		List<CompanyDto> companyList = new ArrayList<>();
		companyDao.findAll().forEach(company ->{
			CompanyDto companyModel = new CompanyDto();	
			BeanUtils.copyProperties(company, companyModel);
			companyList.add(companyModel);
		});
		Collections.sort(companyList);
		return companyList;
	}


	@Override
	public Company save(Company company) {
		return companyDao.save(company);
	}

	@Override
	public Company create(Company company) {
		return companyDao.save(company);
	}

    @Override
	public boolean deleteCompany(Long id) {
		boolean status = false;
		Company company = getCompanyById(id);
		if (company != null) {
			status = true;
			companyDao.delete(company);
		}
		return status;
	}



	@Override
	public Company getCompanyById(Long id) {
		System.out.println("****************" + id);
		return companyDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("company %d not found", id)));
	}

}

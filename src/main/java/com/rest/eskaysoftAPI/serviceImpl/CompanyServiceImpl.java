package com.rest.eskaysoftAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.CompanyDao;
import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	private CompanyDao companyDao;

	@Autowired
	public void setAccountInformationDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	@Override
	public Iterable<Company> listAllCompany() {
		return companyDao.findAll();
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

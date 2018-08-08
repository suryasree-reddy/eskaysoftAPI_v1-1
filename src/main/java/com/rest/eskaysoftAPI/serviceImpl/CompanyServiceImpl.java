package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.CompanyGroupDao;
import com.rest.eskaysoftAPI.dao.CompanyDao;
import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.entity.CompanyGroup;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.CompanyDto;
import com.rest.eskaysoftAPI.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	@Autowired
	private CompanyGroupDao companygroupDao;

	@Override
	public List<CompanyDto> listAllCompany() {
		List<CompanyDto> companyList = new ArrayList<>();
		companyDao.findAll().forEach(company -> {

			CompanyDto companyModel = new CompanyDto();
			BeanUtils.copyProperties(company, companyModel);

			companyModel.setCompanyGroupId(company.getCompanyGroupId().getId());
			companyList.add(companyModel);
		});
		Collections.sort(companyList);
		return companyList;
	}

	@Override
	public CompanyDto getCompanyById(Long id) {
		Company company = companyDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("company %d not found", id)));
		if (company != null) {
			CompanyDto companyModel = new CompanyDto();
			BeanUtils.copyProperties(company, companyModel);
			companyModel.setCompanyGroupId(company.getCompanyGroupId().getId());
			companyModel.setId(company.getId());
			companyModel.setCompanyCode(company.getCompanyCode());
			companyModel.setCompanyName(company.getCompanyName());
			companyModel.setCompanyStatus(company.getCompanyStatus());
			companyModel.setCompanyType(company.getCompanyType());
			companyModel.setInvGenType(company.getInvGenType());
			companyModel.setInvPrefix(company.getInvPrefix());
			return companyModel;

		}
		return null;

	}

	@Override
	public CompanyDto save(CompanyDto companyModel) {
		CompanyGroup companygroup = companygroupDao.findById(companyModel.getCompanyGroupId())
				.orElseThrow(() -> new NotFoundException(
						String.format("CompanyGroup %d not found", companyModel.getCompanyGroupId())));
		Company company = new Company();
		BeanUtils.copyProperties(companyModel, company);
		company.setCompanyGroupId(companygroup);
		company = companyDao.save(company);
		return companyModel;
	}

	@Override
	public boolean deleteCompany(Long id) {
		boolean status = false;
		Company company = companyDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("company %d not found", id)));
		if (company != null) {
			companyDao.delete(company);
			status = true;
		}
		return status;
	}

	@Override
	public CompanyDto create(CompanyDto companyModel) {
		CompanyGroup companygroup = companygroupDao.findById(companyModel.getCompanyGroupId())
				.orElseThrow(() -> new NotFoundException(
						String.format("CompanyGroup %d not found", companyModel.getCompanyGroupId())));
		Company company = new Company();
		BeanUtils.copyProperties(companyModel, company);
		company.setCompanyGroupId(companygroup);
		company = companyDao.save(company);
		companyModel.setId(company.getId());
		return companyModel;
	}

}

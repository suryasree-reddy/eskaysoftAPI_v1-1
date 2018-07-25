package com.rest.eskaysoftAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.CompanyGroupDao;
import com.rest.eskaysoftAPI.entity.CompanyGroup;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.CompanyGroupService;

@Service
public class CompanyGroupServiceImpl implements CompanyGroupService {

	private CompanyGroupDao companygroupDao;

	@Autowired
	public void setAccountInformationDao(CompanyGroupDao companygroupDao) {
		this.companygroupDao = companygroupDao;
	}

	@Override
	public CompanyGroup getCompanygroupById(Long id) {
		System.out.println("****************" + id);
		return companygroupDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("companygroup %d not found", id)));
	}

	@Override
	public Iterable<CompanyGroup> listAllCompanygroup() {
		return companygroupDao.findAll();
	}

	@Override
	public CompanyGroup saveCompanygroup(CompanyGroup companygroup) {
		return companygroupDao.save(companygroup);
	}

	@Override
	public CompanyGroup deleteCompanygroup(Long id) {
		CompanyGroup companygroup = getCompanygroupById(id);
		if (companygroup != null) {
			companygroupDao.delete(companygroup);
		}
		return companygroup;
	}

	@Override
	public CompanyGroup create(CompanyGroup companygroup) {
		return companygroupDao.save(companygroup);
	}

}

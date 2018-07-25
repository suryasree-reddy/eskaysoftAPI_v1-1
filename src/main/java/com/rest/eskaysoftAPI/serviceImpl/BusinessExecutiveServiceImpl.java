package com.rest.eskaysoftAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.BusinessExecutiveDao;
import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.BusinessExecutiveService;

@Service
public class BusinessExecutiveServiceImpl implements BusinessExecutiveService {

	private BusinessExecutiveDao businessExecutiveDao;

	@Autowired
	public void setAccountInformationDao(BusinessExecutiveDao businessExecutiveDao) {
		this.businessExecutiveDao = businessExecutiveDao;
	}

	@Override
	public BusinessExecutive getBusinessExecutiveById(Long id) {
		System.out.println("****************" + id);
		return businessExecutiveDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("bankInfromation %d not found", id)));
	}

	@Override
	public Iterable<BusinessExecutive> listAllBusinessExecutive() {
		return businessExecutiveDao.findAll();
	}

	@Override
	public BusinessExecutive saveBusinessExecutive(BusinessExecutive businessExecutive) {
		return businessExecutiveDao.save(businessExecutive);
	}

	@Override
	public BusinessExecutive deleteBusinessExecutive(Long id) {
		BusinessExecutive businessExecutive = getBusinessExecutiveById(id);
		if (businessExecutive != null) {
			businessExecutiveDao.delete(businessExecutive);
		}
		return businessExecutive;
	}

	@Override
	public BusinessExecutive create(BusinessExecutive businessExecutive) {
		return businessExecutiveDao.save(businessExecutive);
	}

}

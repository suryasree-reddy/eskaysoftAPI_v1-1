package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.BusinessExecutiveDao;
import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.BusinessExecutiveDto;
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
	public List<BusinessExecutiveDto> listAllBusinessExecutive() {
		List<BusinessExecutiveDto> businessexecutiveList = new ArrayList<>();
		businessExecutiveDao.findAll().forEach(businessexecutive ->{
			BusinessExecutiveDto businessexecutiveModel = new BusinessExecutiveDto();	
			BeanUtils.copyProperties(businessexecutive, businessexecutiveModel);
			businessexecutiveList.add(businessexecutiveModel);
		});
		Collections.sort(businessexecutiveList);
		return businessexecutiveList;
	}
	@Override
	public BusinessExecutive saveBusinessExecutive(BusinessExecutive businessExecutive) {
		return businessExecutiveDao.save(businessExecutive);
	}

    @Override
	public boolean deleteBusinessExecutive(Long id) {
		boolean status = false;
		BusinessExecutive businessExecutive = getBusinessExecutiveById(id);
		if (businessExecutive != null) {
			status = true;
			businessExecutiveDao.delete(businessExecutive);
		}
		return status;
	}


	@Override
	public BusinessExecutive create(BusinessExecutive businessExecutive) {
		return businessExecutiveDao.save(businessExecutive);
	}

}

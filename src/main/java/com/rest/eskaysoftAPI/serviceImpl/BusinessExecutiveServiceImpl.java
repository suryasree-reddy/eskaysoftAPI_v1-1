package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.BusinessExecutiveDto;
import com.rest.eskaysoftAPI.repository.BusinessExecutiveRepository;
import com.rest.eskaysoftAPI.service.BusinessExecutiveService;

@Service
public class BusinessExecutiveServiceImpl implements BusinessExecutiveService {

	private BusinessExecutiveRepository busExrepo;

	@Autowired
	public void setAccountInformationDao(BusinessExecutiveRepository busExrepo) {
		this.busExrepo = busExrepo;
	}

	@Override
	public BusinessExecutive getBusinessExecutiveById(Long id) {
		System.out.println("****************" + id);
		return busExrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("bankInfromation %d not found", id)));
	}

	@Override
	public List<BusinessExecutiveDto> listAllBusinessExecutive() {
		List<BusinessExecutiveDto> businessexecutiveList = new ArrayList<>();
		busExrepo.findAllByOrderByNameAsc().forEach(businessexecutive -> {
			BusinessExecutiveDto businessexecutiveModel = new BusinessExecutiveDto();
			BeanUtils.copyProperties(businessexecutive, businessexecutiveModel);
			businessexecutiveList.add(businessexecutiveModel);
		});

		return businessexecutiveList;
	}

	@Override
	public BusinessExecutive saveBusinessExecutive(BusinessExecutive businessExecutive) {
		return busExrepo.save(businessExecutive);
	}

	@Override
	public boolean deleteBusinessExecutive(Long id) {
		boolean status = false;
		BusinessExecutive businessExecutive = getBusinessExecutiveById(id);
		if (businessExecutive != null) {
			status = true;
			busExrepo.delete(businessExecutive);
		}
		return status;
	}

	@Override
	public BusinessExecutive create(BusinessExecutive businessExecutive) {
		return busExrepo.save(businessExecutive);
	}

}

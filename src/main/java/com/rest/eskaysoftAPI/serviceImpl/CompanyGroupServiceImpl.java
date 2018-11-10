package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.CompanyGroup;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.CompanyGroupDto;
import com.rest.eskaysoftAPI.repository.CompanyGroupRepository;
import com.rest.eskaysoftAPI.service.CompanyGroupService;

@Service
public class CompanyGroupServiceImpl implements CompanyGroupService {

	@Autowired
	private CompanyGroupRepository compgrprepo;

	@Override
	public CompanyGroup getCompanygroupById(Long id) {
		System.out.println("****************" + id);
		return compgrprepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("companygroup %d not found", id)));
	}

	@Override
	public List<CompanyGroupDto> listAllCompanygroup() {
		List<CompanyGroupDto> companygroupList = new ArrayList<>();
		compgrprepo.getCompanyGroup().forEach(companygroup -> {
			CompanyGroupDto companygroupModel = new CompanyGroupDto();
			BeanUtils.copyProperties(companygroup, companygroupModel);
			companygroupList.add(companygroupModel);
		});

		return companygroupList;
	}

	@Override
	public CompanyGroup updateCompanygroup(CompanyGroup companygroup) {
		return compgrprepo.save(companygroup);
	}

	@Override
	public boolean deleteCompanygroup(Long id) {
		boolean status = false;
		CompanyGroup companygroup = getCompanygroupById(id);
		if (companygroup != null) {
			compgrprepo.delete(companygroup);
			status = true;
		}
		return status;
	}

	@Override
	public CompanyGroup create(CompanyGroup companygroup) {
		return compgrprepo.save(companygroup);
	}

}

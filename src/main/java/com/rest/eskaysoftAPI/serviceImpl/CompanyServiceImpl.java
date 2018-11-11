package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.entity.CompanyGroup;
import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.CompanyDto;
import com.rest.eskaysoftAPI.repository.CompanyGroupRepository;
import com.rest.eskaysoftAPI.repository.CompanyRepository;
import com.rest.eskaysoftAPI.repository.CustomerWiseDiscountsRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.service.CompanyService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository cpmprepo;

	@Autowired
	private CompanyGroupRepository compgrprepo;
	
	@Autowired
	private CustomerWiseDiscountsRepository cuswiserepo;
	
	@Autowired
	private ProductRepository prorepo;

	@Override
	public List<CompanyDto> listAllCompany() {
		List<CompanyDto> companyList = new ArrayList<>();
		cpmprepo.findAllByOrderByCompanyNameAsc().forEach(company -> {
			CompanyDto companyModel = new CompanyDto();
			BeanUtils.copyProperties(company, companyModel);
			companyModel.setDeleteFlag(true);
			List<Product> prodList = prorepo.findBycompanyIdId(company.getId());
			if(null != prodList && !prodList.isEmpty()) {
				companyModel.setDeleteFlag(false);
			}else {
				List<CustomerWiseDiscounts> cwdList = cuswiserepo.findByCompanyIdId(company.getId());
				if(null != cwdList && !cwdList.isEmpty()) {
					companyModel.setDeleteFlag(false);
				}
			}
			companyModel.setCompanyGroupName(company.getCompanyGroupId().getCompanyGroupName());
			companyModel.setCompanyGroupId(company.getCompanyGroupId().getId());
			companyModel.setTypeheadDisplay(company.getCompanyName() + EskaysoftConstants.SEPERATOR
					+ company.getCompanyGroupId().getCompanyGroupName());
			companyList.add(companyModel);
		});

		return companyList;
	}

	@Override
	public CompanyDto getCompanyById(Long id) {
		Company company = cpmprepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("company %d not found", id)));
		CompanyDto companyModel = new CompanyDto();
		BeanUtils.copyProperties(company, companyModel);
		companyModel.setCompanyGroupId(company.getCompanyGroupId().getId());
		companyModel.setCompanyGroupName(company.getCompanyGroupId().getCompanyGroupName());
		return companyModel;

	}

	@Override
	public CompanyDto updatecompany(CompanyDto companyModel) {
		CompanyGroup companygroup = compgrprepo.findById(companyModel.getCompanyGroupId())
				.orElseThrow(() -> new NotFoundException(
						String.format("CompanyGroup %d not found", companyModel.getCompanyGroupId())));
		Company company = new Company();
		BeanUtils.copyProperties(companyModel, company);		
		company.setCompanyGroupId(companygroup);
		company = cpmprepo.save(company);
		return companyModel;
	}

	@Override
	public boolean deleteCompany(Long id) {
		boolean status = false;
		Company company = cpmprepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("company %d not found", id)));
		if (company != null) {
			cpmprepo.delete(company);
			status = true;
		}
		return status;
	}

	@Override
	public CompanyDto create(CompanyDto companyModel) {
		CompanyGroup companygroup = compgrprepo.findById(companyModel.getCompanyGroupId())
				.orElseThrow(() -> new NotFoundException(
						String.format("CompanyGroup %d not found", companyModel.getCompanyGroupId())));
		Company company = new Company();
		BeanUtils.copyProperties(companyModel, company);		
		company.setCompanyGroupId(companygroup);
		company = cpmprepo.save(company);
		companyModel.setId(company.getId());
		return companyModel;
	}

}

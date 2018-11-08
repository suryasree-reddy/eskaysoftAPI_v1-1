package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.CustomerWiseDiscountsDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.CompanyRepository;
import com.rest.eskaysoftAPI.repository.CustomerWiseDiscountsRepository;
import com.rest.eskaysoftAPI.service.CustomerWiseDiscountsService;

@Service
public class CustomerWiseDiscountServiceImpl implements CustomerWiseDiscountsService {

	@Autowired
	private CustomerWiseDiscountsRepository cuswiserepo;

	@Autowired
	private AccountInformationRepository airepo;

	@Autowired
	private CompanyRepository comprepo;

	@Override
	public List<CustomerWiseDiscountsDto> listAllCustomerWiseDiscounts() {
		List<CustomerWiseDiscountsDto> cusList = new ArrayList<>();
		cuswiserepo.findAllByOrderByDiscAsc().forEach(customer -> {
			CustomerWiseDiscountsDto cusModel = new CustomerWiseDiscountsDto();
			BeanUtils.copyProperties(customer, cusModel);
			cusModel.setCompanyId(customer.getCompanyId().getId());
			cusModel.setCompanyName(customer.getCompanyId().getCompanyName());
			cusModel.setAccountInformationId(customer.getAccountInformationId().getId());
			cusModel.setAccountName(customer.getAccountInformationId().getAccountName());
			cusModel.setShortName(customer.getAccountInformationId().getShortName());
			cusList.add(cusModel);
		});

		return cusList;
	}
	
	@Override
	public List<CustomerWiseDiscountsDto> listAllCustomerWiseDiscountsByAccountId(Long id) {
		List<CustomerWiseDiscountsDto> cusList = new ArrayList<>();
		cuswiserepo.findByAccountInformationIdIdOrderByDiscAsc(id).forEach(customer -> {
			CustomerWiseDiscountsDto cusModel = new CustomerWiseDiscountsDto();
			BeanUtils.copyProperties(customer, cusModel);
			cusModel.setCompanyId(customer.getCompanyId().getId());
			cusModel.setCompanyName(customer.getCompanyId().getCompanyName());
			cusModel.setAccountInformationId(customer.getAccountInformationId().getId());
			cusModel.setAccountName(customer.getAccountInformationId().getAccountName());
			cusModel.setShortName(customer.getAccountInformationId().getShortName());
			cusList.add(cusModel);
		});

		return cusList;
	}

	@Override
	public CustomerWiseDiscountsDto getCustomerWiseDiscountsById(Long id) {
		CustomerWiseDiscounts customerwise = cuswiserepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("CustomerWiseDiscounts %d not found", id)));
		CustomerWiseDiscountsDto cwdmodel = new CustomerWiseDiscountsDto();
		BeanUtils.copyProperties(customerwise, cwdmodel);
		cwdmodel.setCompanyId(customerwise.getCompanyId().getId());
		cwdmodel.setCompanyName(customerwise.getCompanyId().getCompanyName());
		cwdmodel.setAccountInformationId(customerwise.getAccountInformationId().getId());
		cwdmodel.setAccountName(customerwise.getAccountInformationId().getAccountName());
		cwdmodel.setShortName(customerwise.getAccountInformationId().getShortName());
		return cwdmodel;
	}

	@Override
	public CustomerWiseDiscountsDto updatecwd(CustomerWiseDiscountsDto customerWiseDiscountsDto) {
		CustomerWiseDiscounts cwd = cuswiserepo.findById(customerWiseDiscountsDto.getId())
				.orElseThrow(() -> new NotFoundException(
						String.format("customerWiseDiscounts %d not found", customerWiseDiscountsDto.getId())));
		if (cwd != null) {
			cwd.setDisc(customerWiseDiscountsDto.getDisc());
			cwd = cuswiserepo.save(cwd);
			if (null != cwd) {
				return customerWiseDiscountsDto;
			}
		}

		return null;
	}

	@Override
	public boolean deleteCustomerWiseDiscounts(Long id) {
		boolean status = false;
		CustomerWiseDiscounts customerWiseDiscounts = cuswiserepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("cwd %d not found", id)));
		if (customerWiseDiscounts != null) {
			cuswiserepo.delete(customerWiseDiscounts);
			status = true;			
		}
		return status;
	}

	@Override
	public List<CustomerWiseDiscounts> create(CustomerWiseDiscountsDto cdmodel) {
		
		AccountInformation ai = airepo.findById(cdmodel.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", cdmodel.getAccountInformationId())));
		CustomerWiseDiscounts cwd = null;
		List<CustomerWiseDiscounts> cwdlist = new ArrayList<>();;
		if(cdmodel.getDiscountType()) {
			List<Company> companyList= comprepo.findAll();
			for (Company company : companyList) {				
				CustomerWiseDiscounts cwsDb = cuswiserepo.findByAccountInformationIdIdAndCompanyIdId(cdmodel.getAccountInformationId(), company.getId());
				
				if(cwsDb != null) {
					cwsDb.setDisc(cdmodel.getDisc());
					cwdlist.add(cwsDb);
				}else {
					cwd = new CustomerWiseDiscounts();
					BeanUtils.copyProperties(cdmodel, cwd);
					cwd.setCompanyId(company);
					cwd.setAccountInformationId(ai);
					cwdlist.add(cwd);
				}				
			}
		}else {
			Company com = comprepo.findById(cdmodel.getCompanyId()).orElseThrow(
					() -> new NotFoundException(String.format("Company %d not found", cdmodel.getCompanyId())));
			cwd = new CustomerWiseDiscounts();
			BeanUtils.copyProperties(cdmodel, cwd);
			cwd.setCompanyId(com);
			cwd.setAccountInformationId(ai);
			cwdlist.add(cwd);
		}		
		cwdlist = cuswiserepo.saveAll(cwdlist);
		return cwdlist;
	}

}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.CustomerWiseDiscountsDto;
import com.rest.eskaysoftAPI.repository.CompanyRepository;
import com.rest.eskaysoftAPI.repository.CustomerWiseDiscountsRepository;
import com.rest.eskaysoftAPI.service.CustomerWiseDiscountsService;

@Service
public class CustomerWiseDiscountServiceImpl implements CustomerWiseDiscountsService {

	@Autowired
	private CustomerWiseDiscountsRepository cuswiserepo;

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
		return cwdmodel;
	}

	@Override
	public CustomerWiseDiscountsDto save(CustomerWiseDiscountsDto customerWiseDiscountsDto) {
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

	/*
	 * @Override public CustomerWiseDiscounts save(CustomerWiseDiscounts cwd) {
	 * return cuswiserepo.save(cwd); }
	 */

	@Override
	public boolean deleteCustomerWiseDiscounts(Long id) {
		boolean status = false;
		CustomerWiseDiscounts customerWiseDiscounts = cuswiserepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("cwd %d not found", id)));
		if (customerWiseDiscounts != null) {
			cuswiserepo.delete(customerWiseDiscounts);
			status = true;
			List<CustomerWiseDiscounts> list = cuswiserepo
					.findByCompanyIdId(customerWiseDiscounts.getCompanyId().getId());
			if (null == list || list.isEmpty()) {
				Company cmp = customerWiseDiscounts.getCompanyId();
				cmp.setDeleteFlag(true);
				comprepo.save(cmp);

			}

		}
		return status;
	}

}

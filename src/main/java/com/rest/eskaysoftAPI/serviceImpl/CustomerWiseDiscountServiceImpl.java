package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.CustomerWiseDiscountsDao;
import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.CustomerWiseDiscountsDto;
import com.rest.eskaysoftAPI.service.CustomerWiseDiscountsService;

@Service
public class CustomerWiseDiscountServiceImpl implements CustomerWiseDiscountsService {

	private CustomerWiseDiscountsDao customerWiseDiscountsDao;

	@Autowired
	public void setcustomerWiseDiscountsDao(CustomerWiseDiscountsDao customerWiseDiscountsDao) {
		this.customerWiseDiscountsDao = customerWiseDiscountsDao;
	}

	@Override
	public List<CustomerWiseDiscountsDto> listAllCustomerWiseDiscounts() {
		List<CustomerWiseDiscountsDto> cusList = new ArrayList<>();
		customerWiseDiscountsDao.findAllByOrderByDiscAsc().forEach(cus -> {
			CustomerWiseDiscountsDto cusModel = new CustomerWiseDiscountsDto();
			BeanUtils.copyProperties(cus, cusModel);
			cusList.add(cusModel);
		});

		return cusList;
	}

	@Override
	public CustomerWiseDiscounts getCustomerWiseDiscountsById(Long id) {
		System.out.println("****************" + id);
		return customerWiseDiscountsDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("CustomerWiseDiscounts %d not found", id)));

	}

	@Override
	public CustomerWiseDiscounts saveCustomerWiseDiscounts(CustomerWiseDiscounts customerWiseDiscounts) {
		return customerWiseDiscountsDao.save(customerWiseDiscounts);
	}

	@Override
	public boolean deleteCustomerWiseDiscounts(Long id) {
		boolean status = false;
		CustomerWiseDiscounts customerWiseDiscounts = getCustomerWiseDiscountsById(id);
		if (customerWiseDiscounts != null) {
			status = true;
			customerWiseDiscountsDao.delete(customerWiseDiscounts);
		}
		return status;
	}

	@Override
	public CustomerWiseDiscounts create(CustomerWiseDiscounts customerWiseDiscounts) {

		return customerWiseDiscountsDao.save(customerWiseDiscounts);
	}

}

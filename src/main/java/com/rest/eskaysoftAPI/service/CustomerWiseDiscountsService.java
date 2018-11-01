package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.CustomerWiseDiscountsDto;

public interface CustomerWiseDiscountsService {

	List<CustomerWiseDiscountsDto> listAllCustomerWiseDiscounts();

	CustomerWiseDiscountsDto getCustomerWiseDiscountsById(Long id);

	CustomerWiseDiscountsDto updatecwd(CustomerWiseDiscountsDto customerWiseDiscounts);

	boolean deleteCustomerWiseDiscounts(Long id);

	CustomerWiseDiscountsDto create(CustomerWiseDiscountsDto customerWiseDiscounts);

}

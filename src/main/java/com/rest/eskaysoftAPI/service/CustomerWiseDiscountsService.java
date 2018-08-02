package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.model.CustomerWiseDiscountsDto;

public interface CustomerWiseDiscountsService {

    List<CustomerWiseDiscountsDto> listAllCustomerWiseDiscounts();

    CustomerWiseDiscounts getCustomerWiseDiscountsById(Long id);

    CustomerWiseDiscounts saveCustomerWiseDiscounts(CustomerWiseDiscounts customerWiseDiscounts);


    boolean deleteCustomerWiseDiscounts(Long id);
    CustomerWiseDiscounts create(CustomerWiseDiscounts customerWiseDiscounts);

}

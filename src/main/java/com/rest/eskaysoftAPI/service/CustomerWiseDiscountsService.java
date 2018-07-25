package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;

public interface CustomerWiseDiscountsService {

    Iterable<CustomerWiseDiscounts> listAllCustomerWiseDiscounts();

    CustomerWiseDiscounts getCustomerWiseDiscountsById(Long id);

    CustomerWiseDiscounts saveCustomerWiseDiscounts(CustomerWiseDiscounts customerWiseDiscounts);

    CustomerWiseDiscounts deleteCustomerWiseDiscounts(Long id);

    CustomerWiseDiscounts create(CustomerWiseDiscounts customerWiseDiscounts);

}

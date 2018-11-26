package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.SalesOrderDto;

public interface SalesOrderService {

	List<SalesOrderDto> listAllSalesOrder();

	SalesOrderDto getSalesOrderById(Long id);

	SalesOrderDto save(SalesOrderDto salesOrder);

	boolean delete(Long id);

	SalesOrderDto create(SalesOrderDto salesOrder);

}

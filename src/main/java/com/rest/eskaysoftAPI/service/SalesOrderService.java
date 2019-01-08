package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.SalesOrderDto;

public interface SalesOrderService {

	List<SalesOrderDto> listAllSalesOrder();

	SalesOrderDto getSalesOrderById(Long id);

	SalesOrderDto saveSalesOrder(SalesOrderDto salesOrder);

	boolean deleteSalesOrder(Long id);

	SalesOrderDto createSalesOrder(SalesOrderDto salesOrder);

	boolean deleteSaleseOrderByOrderNum(Integer id);

}

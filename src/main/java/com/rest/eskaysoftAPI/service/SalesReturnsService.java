package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.SalesReturnsDto;

public interface SalesReturnsService {

	List<SalesReturnsDto> listAllSalesReturns();

	SalesReturnsDto getSalesReturnsById(Long id);

	SalesReturnsDto saveSalesReturns(SalesReturnsDto salesReturns);

	boolean deleteSalesReturns(Long id);

	SalesReturnsDto createSalesReturns(SalesReturnsDto salesReturns);
	
	boolean deleteSalesReturnsBysalesReturnNo(Integer id);

}

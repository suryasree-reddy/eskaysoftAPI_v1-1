package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.SalesInvoiceDto;

public interface SalesInvoiceService {

	List<SalesInvoiceDto> listAllSalesInvoice();

	SalesInvoiceDto getSalesInvoiceById(Long id);

	SalesInvoiceDto save(SalesInvoiceDto salesinv);

	boolean delete(Long id);

	SalesInvoiceDto create(SalesInvoiceDto salesinv);

	boolean deleteSalesInvoiceByOrderNum(Integer id);

}

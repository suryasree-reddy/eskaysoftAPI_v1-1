package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.PurchaseReturnsDto;

public interface PurchaseReturnsService {

	List<PurchaseReturnsDto> listAllpurchaseReturns();

	PurchaseReturnsDto getpurchaseReturnsById(Long id);

	PurchaseReturnsDto savePurchaseReturns(PurchaseReturnsDto purchaseorder);

	boolean deletePurchaseReturns(Long id);

	PurchaseReturnsDto create(PurchaseReturnsDto purchaseReturns);

}

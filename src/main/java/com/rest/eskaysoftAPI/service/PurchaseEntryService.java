package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.PurchaseEntryDto;

public interface PurchaseEntryService {

	List<PurchaseEntryDto> listAllPurchaseEntry();

	PurchaseEntryDto getPurchaseEntryById(Long id);

	PurchaseEntryDto savePurchaseEntry(PurchaseEntryDto purchaseEntry);

	boolean deletePurchaseEntry(Long id);

	PurchaseEntryDto create(PurchaseEntryDto purchaseEntry);
}
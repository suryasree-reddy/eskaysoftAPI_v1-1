package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.PurchaseOrderDto;

public interface PurchaseOrderService {

	List<PurchaseOrderDto> listAllPurchaseOrder();

	PurchaseOrderDto getPurchaseOrderById(Long id);

	PurchaseOrderDto updatePurchaseOrder(PurchaseOrderDto purchaseorder);

	boolean deletePurchaseOrder(Long id);
	
	boolean deletePurchaseOrderByOrderNum(Integer id);

	PurchaseOrderDto create(PurchaseOrderDto purchaseorder);
}

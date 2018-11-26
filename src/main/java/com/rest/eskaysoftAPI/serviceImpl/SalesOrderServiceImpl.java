package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.SalesOrder;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.SalesOrderDto;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.SalesOrderRepository;
import com.rest.eskaysoftAPI.service.SalesOrderService;

public class SalesOrderServiceImpl implements SalesOrderService {

	@Autowired
	SalesOrderRepository salesOrderRepo;

	@Autowired
	private ProductRepository proRepo;

	@Override
	public List<SalesOrderDto> listAllSalesOrder() {
		List<SalesOrderDto> salesOrderList = new ArrayList<>();
		salesOrderRepo.findAllByOrderByOrderNumberAsc().forEach(salesOrder -> {
			SalesOrderDto salesOrderModel = new SalesOrderDto();
			BeanUtils.copyProperties(salesOrder, salesOrderModel);
			salesOrderModel.setProductId(salesOrder.getProductId().getId());
			salesOrderModel.setProductCode(salesOrder.getProductId().getProductcode());
			salesOrderModel.setProductName(salesOrder.getProductId().getName());
			salesOrderList.add(salesOrderModel);
		});
		return salesOrderList;
	}

	@Override
	public SalesOrderDto getSalesOrderById(Long id) {
		SalesOrderDto salesOrderModel = new SalesOrderDto();
		SalesOrder salesOrderList = salesOrderRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("SalesOrder %d not found", id)));
		BeanUtils.copyProperties(salesOrderList, salesOrderModel);
		salesOrderModel.setProductId(salesOrderList.getProductId().getId());
		salesOrderModel.setProductCode(salesOrderList.getProductId().getProductcode());
		salesOrderModel.setProductName(salesOrderList.getProductId().getName());

		return salesOrderModel;
	}

	@Override
	public SalesOrderDto save(SalesOrderDto salesOrderModel) {
		Product pro = proRepo.findById(salesOrderModel.getId()).orElseThrow(
				() -> new NotFoundException(String.format("SalesOrder %d not found", salesOrderModel.getId())));
		SalesOrder in = new SalesOrder();
		BeanUtils.copyProperties(salesOrderModel, in);
		in.setProductId(pro);
		in = salesOrderRepo.save(in);
		return salesOrderModel;
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		SalesOrder in = salesOrderRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("salesOrder %d not found", id)));
		if (in != null) {
			salesOrderRepo.delete(in);
			status = true;
		}
		return status;
	}

	@Override
	public SalesOrderDto create(SalesOrderDto salesOrderModel) {
		Product pro = proRepo.findById(salesOrderModel.getId()).orElseThrow(
				() -> new NotFoundException(String.format("SalesOrder %d not found", salesOrderModel.getId())));
		SalesOrder in = new SalesOrder();
		BeanUtils.copyProperties(salesOrderModel, in);
		in.setProductId(pro);
		in = salesOrderRepo.save(in);
		salesOrderModel.setId(in.getId());
		return salesOrderModel;
	}

}

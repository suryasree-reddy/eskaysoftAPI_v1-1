package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.SalesOrder;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.SalesOrderDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.SalesOrderRepository;
import com.rest.eskaysoftAPI.service.SalesOrderService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;


@Service
public class SalesOrderServiceImpl implements SalesOrderService {

	@Autowired
	SalesOrderRepository salesOrderRepo;

	@Autowired
	private AccountInformationRepository acreo;

	@Autowired
	private ProductRepository proRepo;

	@Override
	public List<SalesOrderDto> listAllSalesOrder() {
		List<SalesOrderDto> salesOrderList = new ArrayList<>();
		salesOrderRepo.findAllByOrderByOrderNumberAsc().forEach(salesOrder -> {
			SalesOrderDto salesOrderModel = new SalesOrderDto();
			BeanUtils.copyProperties(salesOrder, salesOrderModel);
			salesOrderModel.setProductId(salesOrder.getProductId().getId());
			salesOrderModel.setProductcode(salesOrder.getProductId().getProductcode());
			salesOrderModel.setProductName(salesOrder.getProductId().getName());
			salesOrderModel.setFree(salesOrder.getProductId().getFree());
			salesOrderModel.setPack(salesOrder.getProductId().getPacking());
			salesOrderModel.setNetRate(salesOrder.getProductId().getNetRate());
			salesOrderModel.setAccountInformationId(salesOrder.getAccountInformationId().getId());
			salesOrderModel.setTown(salesOrder.getAccountInformationId().getTown());
			salesOrderModel.setCustomer(salesOrder.getAccountInformationId().getAccountName());
			salesOrderModel.setTypeheadDisplay(
					salesOrder.getProductId().getName() + EskaysoftConstants.SEPERATOR + salesOrder.getProductId().getProductcode());
			salesOrderModel.setTypeheadDisplay(salesOrder.getAccountInformationId().getAccountName() + EskaysoftConstants.SEPERATOR +
					salesOrder.getAccountInformationId().getTown());
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
		salesOrderModel.setProductcode(salesOrderList.getProductId().getProductcode());
		salesOrderModel.setProductName(salesOrderList.getProductId().getName());
		salesOrderModel.setFree(salesOrderList.getProductId().getFree());
		salesOrderModel.setPack(salesOrderList.getProductId().getPacking());
		salesOrderModel.setNetRate(salesOrderList.getProductId().getNetRate());
		salesOrderModel.setAccountInformationId(salesOrderList.getAccountInformationId().getId());
		salesOrderModel.setTown(salesOrderList.getAccountInformationId().getTown());
		salesOrderModel.setCustomer(salesOrderList.getAccountInformationId().getAccountName());
		return salesOrderModel;
	}

	@Override
	public SalesOrderDto saveSalesOrder(SalesOrderDto salesOrderModel) {
		AccountInformation ai = acreo.findById(salesOrderModel.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", salesOrderModel.getAccountInformationId())));
		Product pro = proRepo.findById(salesOrderModel.getId()).orElseThrow(
				() -> new NotFoundException(String.format("SalesOrder %d not found", salesOrderModel.getId())));
		SalesOrder in = new SalesOrder();
		in.setAccountInformationId(ai);
		in.setProductId(pro);
		BeanUtils.copyProperties(salesOrderModel, in);
		in = salesOrderRepo.save(in);
		return salesOrderModel;
	}

	@Override
	public boolean deleteSalesOrder(Long id) {
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
	public SalesOrderDto createSalesOrder(SalesOrderDto salesOrderModel) {
		Product pro = proRepo.findById(salesOrderModel.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("SalesOrder %d not found", salesOrderModel.getProductId())));
		AccountInformation ai = acreo.findById(salesOrderModel.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", salesOrderModel.getAccountInformationId())));
		SalesOrder in = new SalesOrder();
		in.setProductId(pro);
		in.setAccountInformationId(ai);
		BeanUtils.copyProperties(salesOrderModel, in);
		in = salesOrderRepo.save(in);
		salesOrderModel.setId(in.getId());
		return salesOrderModel;
	}

}

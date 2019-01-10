package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.SalesInvoice;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.SalesInvoiceDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.SalesInvoiceRepository;
import com.rest.eskaysoftAPI.service.SalesInvoiceService;

@Service
public class SalesInvoiceServiceImpl implements SalesInvoiceService {

	@Autowired
	SalesInvoiceRepository salesInvoiceRepo;

	@Autowired
	private ProductRepository proRepo;

	@Autowired
	private AccountInformationRepository acreo;

	@Override
	public List<SalesInvoiceDto> listAllSalesInvoice() {
		List<SalesInvoiceDto> invList = new ArrayList<>();
		salesInvoiceRepo.findAllByOrderBySalesInvNoAsc().forEach(inv -> {
			SalesInvoiceDto invModel = new SalesInvoiceDto();
			BeanUtils.copyProperties(inv, invModel);
			invModel.setDeleteFlag(true);
			invModel.setProductId(inv.getProductId().getId());
			invModel.setProductcode(inv.getProductId().getProductcode());
			invModel.setProductName(inv.getProductId().getName());
			invModel.setFree(inv.getProductId().getFree());
			invModel.setAccountInformationId(inv.getAccountInformationId().getId());
			invModel.setCustomer(inv.getAccountInformationId().getAccountName());
			invModel.setGstIN(inv.getAccountInformationId().getGstIN());
			invList.add(invModel);
		});
		return invList;
	}

	@Override
	public SalesInvoiceDto getSalesInvoiceById(Long id) {
		SalesInvoiceDto invModel = new SalesInvoiceDto();
		SalesInvoice inv = salesInvoiceRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("invoice %d not found", id)));
		BeanUtils.copyProperties(inv, invModel);
		invModel.setProductId(inv.getProductId().getId());
		invModel.setProductcode(inv.getProductId().getProductcode());
		invModel.setProductName(inv.getProductId().getName());
		invModel.setFree(inv.getProductId().getFree());
		invModel.setAccountInformationId(inv.getAccountInformationId().getId());
		invModel.setCustomer(inv.getAccountInformationId().getAccountName());
		invModel.setGstIN(inv.getAccountInformationId().getGstIN());

		return invModel;
	}

	@Override
	public SalesInvoiceDto save(SalesInvoiceDto salesinv) {

		AccountInformation ai = acreo.findById(salesinv.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", salesinv.getAccountInformationId())));
		Product pro = proRepo.findById(salesinv.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("challan %d not found", salesinv.getProductId())));
		SalesInvoice salesinvList = new SalesInvoice();
		salesinvList.setProductId(pro);
		salesinvList.setAccountInformationId(ai);
		BeanUtils.copyProperties(salesinv, salesinvList);
		salesinvList = salesInvoiceRepo.save(salesinvList);
		return salesinv;
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		SalesInvoice in = salesInvoiceRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("challan %d not found", id)));
		if (in != null) {
			salesInvoiceRepo.delete(in);
			status = true;
		}
		return status;
	}

	@Override
	public boolean deleteSalesInvoiceByOrderNum(Integer id) {
		boolean status = false;
		List<SalesInvoice> poList = salesInvoiceRepo.findBySalesInvNo(id);
		if (poList != null && !poList.isEmpty()) {
			salesInvoiceRepo.deleteAll(poList);
			status = true;
		}
		return status;
	}

	@Override
	public SalesInvoiceDto create(SalesInvoiceDto salesinv) {
		AccountInformation ai = acreo.findById(salesinv.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", salesinv.getAccountInformationId())));
		Product pro = proRepo.findById(salesinv.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("Product %d not found", salesinv.getProductId())));
		SalesInvoice gst = new SalesInvoice();
		BeanUtils.copyProperties(salesinv, gst);
		gst.setProductId(pro);
		gst.setAccountInformationId(ai);

		gst = salesInvoiceRepo.save(gst);
		salesinv.setId(gst.getId());
		return salesinv;
	}

}

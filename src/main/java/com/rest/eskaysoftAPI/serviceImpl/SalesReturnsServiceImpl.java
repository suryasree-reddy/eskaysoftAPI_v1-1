package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.SalesReturns;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.SalesReturnsDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.SalesReturnsRepository;
import com.rest.eskaysoftAPI.service.SalesReturnsService;

@Service
public class SalesReturnsServiceImpl implements SalesReturnsService {

	@Autowired
	SalesReturnsRepository salesRetRepo;

	@Autowired
	private AccountInformationRepository acreo;

	@Autowired
	private ProductRepository proRepo;

	@Override
	public List<SalesReturnsDto> listAllSalesReturns() {
		List<SalesReturnsDto> salesReturnList = new ArrayList<>();
		salesRetRepo.findAllByOrderBySalesReturnNoAsc().forEach(salesReturn -> {
			SalesReturnsDto saleRetmodel = new SalesReturnsDto();
			BeanUtils.copyProperties(salesReturn, saleRetmodel);
			saleRetmodel.setDeleteFlag(true);
			saleRetmodel.setAccountInformationId(salesReturn.getAccountInformationId().getId());
			saleRetmodel.setCustomer(salesReturn.getAccountInformationId().getAccountName());
			saleRetmodel.setGstIN(salesReturn.getAccountInformationId().getGstIN());
			saleRetmodel.setProductId(salesReturn.getProductId().getId());
			saleRetmodel.setProductcode(salesReturn.getProductId().getProductcode());
			saleRetmodel.setProductName(salesReturn.getProductId().getName());
			saleRetmodel.setFree(salesReturn.getProductId().getFree());
			salesReturnList.add(saleRetmodel);
		});
		return salesReturnList;
	}

	@Override
	public SalesReturnsDto getSalesReturnsById(Long id) {

		SalesReturns salesReturn = salesRetRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("SalesReturns %d not found", id)));
		SalesReturnsDto saleRetmodel = new SalesReturnsDto();
		BeanUtils.copyProperties(salesReturn, saleRetmodel);
		saleRetmodel.setDeleteFlag(true);
		saleRetmodel.setAccountInformationId(salesReturn.getAccountInformationId().getId());
		saleRetmodel.setCustomer(salesReturn.getAccountInformationId().getAccountName());
		saleRetmodel.setGstIN(salesReturn.getAccountInformationId().getGstIN());
		saleRetmodel.setProductId(salesReturn.getProductId().getId());
		saleRetmodel.setProductcode(salesReturn.getProductId().getProductcode());
		saleRetmodel.setProductName(salesReturn.getProductId().getName());

		return saleRetmodel;
	}

	@Override
	public SalesReturnsDto saveSalesReturns(SalesReturnsDto salesReturnsModel) {
		AccountInformation ai = acreo.findById(salesReturnsModel.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", salesReturnsModel.getAccountInformationId())));
		Product pro = proRepo.findById(salesReturnsModel.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("Product %d not found", salesReturnsModel.getProductId())));
		SalesReturns salesReturn = new SalesReturns();
		salesReturn.setAccountInformationId(ai);
		salesReturn.setProductId(pro);
		BeanUtils.copyProperties(salesReturnsModel, salesReturn);
		salesReturn = salesRetRepo.save(salesReturn);
		return salesReturnsModel;

	}
	

	@Override
	public boolean deleteSalesReturns(Long id) {
		boolean status = false;
		SalesReturns salesReturn = salesRetRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("salesReturn %d not found", id)));
		if (salesReturn != null) {
			salesRetRepo.delete(salesReturn);
			status = true;
		}
		return status;
	}

	@Override
	public SalesReturnsDto createSalesReturns(SalesReturnsDto salesReturnsModel) {
		Product pro = proRepo.findById(salesReturnsModel.getProductId()).orElseThrow(() -> new NotFoundException(
				String.format("SalesOrder %d not found", salesReturnsModel.getProductId())));
		AccountInformation ai = acreo.findById(salesReturnsModel.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", salesReturnsModel.getAccountInformationId())));
		SalesReturns salesReturn = new SalesReturns();
		BeanUtils.copyProperties(salesReturnsModel, salesReturn);
		salesReturn.setAccountInformationId(ai);
		salesReturn.setProductId(pro);
		
		salesReturn = salesRetRepo.save(salesReturn);
		return salesReturnsModel;

	}
}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.PurchaseEntry;
import com.rest.eskaysoftAPI.entity.Tax;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.PurchaseEntryDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.PurchaseEntryRepository;
import com.rest.eskaysoftAPI.repository.TaxRepository;
import com.rest.eskaysoftAPI.service.PurchaseEntryService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;

@Service
public class PurchaseEntryServiceImpl implements PurchaseEntryService {

	@Autowired
	private PurchaseEntryRepository purchrepo;

	@Autowired
	private AccountInformationRepository acreo;

	@Autowired
	private ProductRepository prorepo;

	@Autowired
	private TaxRepository taxRepo;

	@Override
	public List<PurchaseEntryDto> listAllPurchaseEntry() {
		List<PurchaseEntryDto> polist = new ArrayList<>();
		purchrepo.findAllByOrderByPurchaseNumberAsc().forEach(pro -> {
			PurchaseEntryDto pomodel = new PurchaseEntryDto();
			BeanUtils.copyProperties(pro, pomodel);
			pomodel.setProductId(pro.getProductId().getId());
			pomodel.setProductcode(pro.getProductId().getProductcode());
			pomodel.setProductName(pro.getProductId().getName());
			pomodel.setFree(pro.getProductId().getFree());
			pomodel.setTaxId(pro.getTaxId().getTax());
			pomodel.setTax(pro.getTaxId().getTax());
			pomodel.setAccountInformationId(pro.getAccountInformationId().getId());
			pomodel.setSupplier(pro.getAccountInformationId().getAccountName());
			pomodel.setGstIN(pro.getAccountInformationId().getGstIN());
			pomodel.setHsn(pro.getAccountInformationId().getHsnCode());

			polist.add(pomodel);
			pomodel.setTypeheadDisplay(
					pro.getProductId().getName() + EskaysoftConstants.SEPERATOR + pro.getProductId().getProductcode());

			pomodel.setTypeheadDisplay(pro.getAccountInformationId().getAccountName() + EskaysoftConstants.SEPERATOR
					+ pro.getAccountInformationId().getTown());
		});
		return polist;
	}

	@Override
	public PurchaseEntryDto getPurchaseEntryById(Long id) {
		PurchaseEntry pro = purchrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("PurchaseEntry %d not found", id)));

		PurchaseEntryDto pomodel = new PurchaseEntryDto();
		BeanUtils.copyProperties(pro, pomodel);
		pomodel.setProductId(pro.getProductId().getId());
		pomodel.setProductcode(pro.getProductId().getProductcode());
		pomodel.setProductName(pro.getProductId().getName());
		pomodel.setFree(pro.getProductId().getFree());
		pomodel.setAccountInformationId(pro.getAccountInformationId().getId());
		pomodel.setSupplier(pro.getAccountInformationId().getAccountName());
		pomodel.setGstIN(pro.getAccountInformationId().getGstIN());
		pomodel.setHsn(pro.getAccountInformationId().getHsnCode());
		pomodel.setTaxId(pro.getTaxId().getTax());
		pomodel.setTax(pro.getTaxId().getTax());
		pomodel.setTypeheadDisplay(
				pro.getProductId().getName() + EskaysoftConstants.SEPERATOR + pro.getProductId().getProductcode());

		pomodel.setTypeheadDisplay(pro.getAccountInformationId().getAccountName() + EskaysoftConstants.SEPERATOR
				+ pro.getAccountInformationId().getTown());

		return pomodel;
	}

	@Override
	public PurchaseEntryDto savePurchaseEntry(PurchaseEntryDto purchaseEntry) {
		AccountInformation ai = acreo.findById(purchaseEntry.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", purchaseEntry.getAccountInformationId())));
		Product product = prorepo.findById(purchaseEntry.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("product %d not found", purchaseEntry.getProductId())));
		Tax tax = taxRepo.findById(purchaseEntry.getTaxId())
				.orElseThrow(() -> new NotFoundException(String.format("Tax %d not found", purchaseEntry.getTaxId())));
		PurchaseEntry po = new PurchaseEntry();
		po.setAccountInformationId(ai);
		po.setProductId(product);
		po.setTaxId(tax);
		BeanUtils.copyProperties(purchaseEntry, po);
		po = purchrepo.save(po);
		return purchaseEntry;
	}

	@Override
	public boolean deletePurchaseEntry(Long id) {
		boolean status = false;
		PurchaseEntry po = purchrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("PurchaseEntry %d not found", id)));

		if (po != null) {
			purchrepo.delete(po);
			status = true;
		}
		return status;
	}

	@Override
	public PurchaseEntryDto create(PurchaseEntryDto purchaseEntry) {
		PurchaseEntry po = new PurchaseEntry();
		AccountInformation ai = acreo.findById(purchaseEntry.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", purchaseEntry.getAccountInformationId())));
		Product product = prorepo.findById(purchaseEntry.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("Product %d not found", purchaseEntry.getProductId())));
		Tax tax = taxRepo.findById(purchaseEntry.getTaxId())
				.orElseThrow(() -> new NotFoundException(String.format("Tax %d not found", purchaseEntry.getTaxId())));
		po.setAccountInformationId(ai);
		po.setProductId(product);
		po.setTaxId(tax);
		BeanUtils.copyProperties(purchaseEntry, po);
		po = purchrepo.save(po);
		purchaseEntry.setId(po.getId());
		return purchaseEntry;

	}
}

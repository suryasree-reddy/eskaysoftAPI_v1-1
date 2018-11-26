package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.PurchaseReturns;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.PurchaseReturnsDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.PurchaseReturnsRepository;
import com.rest.eskaysoftAPI.service.PurchaseReturnsService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;

public class PurchaseReturnsServiceImpl implements PurchaseReturnsService {

	@Autowired
	private PurchaseReturnsRepository porepo;

	@Autowired
	private AccountInformationRepository acreo;

	@Autowired
	private ProductRepository prorepo;

	@Override
	public List<PurchaseReturnsDto> listAllpurchaseReturns() {
		List<PurchaseReturnsDto> prlist = new ArrayList<>();
		porepo.findAllByOrderByPurReturnNumberAsc().forEach(pr -> {
			PurchaseReturnsDto prmodel = new PurchaseReturnsDto();
			BeanUtils.copyProperties(pr, prmodel);
			prmodel.setProductId(pr.getProductId().getId());
			prmodel.setProductcode(pr.getProductId().getProductcode());
			prmodel.setProductName(pr.getProductId().getName());
			prmodel.setAccountInformationId(pr.getAccountInformationId().getId());
			prmodel.setSupplier(pr.getAccountInformationId().getAccountName());

			prmodel.setTypeheadDisplay(
					pr.getProductId().getName() + EskaysoftConstants.SEPERATOR + pr.getProductId().getProductcode());
			prlist.add(prmodel);
		});
		return prlist;
	}

	@Override
	public PurchaseReturnsDto getpurchaseReturnsById(Long id) {
		PurchaseReturns pr = porepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("PurchaseReturns %d not found", id)));

		PurchaseReturnsDto pomodel = new PurchaseReturnsDto();
		BeanUtils.copyProperties(pr, pomodel);
		pomodel.setProductId(pr.getProductId().getId());
		pomodel.setProductcode(pr.getProductId().getProductcode());
		pomodel.setProductName(pr.getProductId().getName());
		pomodel.setAccountInformationId(pr.getAccountInformationId().getId());
		pomodel.setSupplier(pr.getAccountInformationId().getAccountName());

		return pomodel;
	}

	@Override
	public PurchaseReturnsDto savePurchaseReturns(PurchaseReturnsDto pr) {

		AccountInformation ai = acreo.findById(pr.getAccountInformationId()).orElseThrow(
				() -> new NotFoundException(String.format("tax %d not found", pr.getAccountInformationId())));
		Product product = prorepo.findById(pr.getProductId())
				.orElseThrow(() -> new NotFoundException(String.format("tax %d not found", pr.getProductId())));

		PurchaseReturns po = new PurchaseReturns();
		po.setAccountInformationId(ai);
		po.setProductId(product);
		BeanUtils.copyProperties(pr, po);
		po = porepo.save(po);
		return pr;
	}

	@Override
	public boolean deletePurchaseReturns(Long id) {
		boolean status = false;
		PurchaseReturns pr = porepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("purchaseReturns %d not found", id)));

		if (pr != null) {
			porepo.delete(pr);
			status = true;
		}
		return status;
	}

	@Override
	public PurchaseReturnsDto create(PurchaseReturnsDto purchaseReturns) {
		PurchaseReturns po = new PurchaseReturns();
		AccountInformation ai = acreo.findById(purchaseReturns.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("tax %d not found", purchaseReturns.getAccountInformationId())));
		Product product = prorepo.findById(purchaseReturns.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("tax %d not found", purchaseReturns.getProductId())));
		po.setAccountInformationId(ai);
		po.setProductId(product);
		BeanUtils.copyProperties(purchaseReturns, po);
		po = porepo.save(po);
		purchaseReturns.setId(po.getId());
		return purchaseReturns;

	}

}

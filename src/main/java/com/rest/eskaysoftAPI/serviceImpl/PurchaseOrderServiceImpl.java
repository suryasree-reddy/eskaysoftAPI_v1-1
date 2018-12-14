package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.PurchaseOrder;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.PurchaseOrderDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.PurchaseOrderRepository;
import com.rest.eskaysoftAPI.service.PurchaseOrderService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

	@Autowired
	private PurchaseOrderRepository porepo;

	@Autowired
	private AccountInformationRepository acreo;

	@Autowired
	private ProductRepository prorepo;

	@Override
	public List<PurchaseOrderDto> listAllPurchaseOrder() {
		List<PurchaseOrderDto> polist = new ArrayList<>();
		porepo.findAllByOrderByOrderNumberAsc().forEach(pro -> {
			PurchaseOrderDto pomodel = new PurchaseOrderDto();
			BeanUtils.copyProperties(pro, pomodel);
			pomodel.setProductId(pro.getProductId().getId());
			pomodel.setProductcode(pro.getProductId().getProductcode());
			pomodel.setProductName(pro.getProductId().getName());
			pomodel.setAccountInformationId(pro.getAccountInformationId().getId());
			pomodel.setSupplier(pro.getAccountInformationId().getAccountName());
			pomodel.setFree(pro.getProductId().getFree());
			pomodel.setPack(pro.getProductId().getPacking());
			pomodel.setbQty(pro.getProductId().getBoxQty());
			pomodel.setNetRate(pro.getProductId().getNetRate());
			pomodel.setTown(pro.getAccountInformationId().getTown());
			pomodel.setTypeheadDisplay(
					pro.getProductId().getName() + EskaysoftConstants.SEPERATOR + pro.getProductId().getProductcode());
			pomodel.setTypeheadDisplay(pro.getAccountInformationId().getAccountName() + EskaysoftConstants.SEPERATOR +
					pro.getAccountInformationId().getTown());
			polist.add(pomodel);
		});
		return polist;
	}

	@Override
	public PurchaseOrderDto getPurchaseOrderById(Long id) {
		PurchaseOrder pro = porepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("purchaseOrder %d not found", id)));

		PurchaseOrderDto pomodel = new PurchaseOrderDto();
		BeanUtils.copyProperties(pro, pomodel);
		pomodel.setProductId(pro.getProductId().getId());
		pomodel.setProductcode(pro.getProductId().getProductcode());
		pomodel.setProductName(pro.getProductId().getName());
		pomodel.setAccountInformationId(pro.getAccountInformationId().getId());
		pomodel.setSupplier(pro.getAccountInformationId().getAccountName());
		pomodel.setFree(pro.getProductId().getFree());
		pomodel.setPack(pro.getProductId().getPacking());
		pomodel.setbQty(pro.getProductId().getBoxQty());
		pomodel.setNetRate(pro.getProductId().getNetRate());
		pomodel.setTown(pro.getAccountInformationId().getTown());
		return pomodel;
	}

	@Override
	public PurchaseOrderDto updatePurchaseOrder(PurchaseOrderDto purchaseorder) {

		AccountInformation ai = acreo.findById(purchaseorder.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("tax %d not found", purchaseorder.getAccountInformationId())));
		Product product = prorepo.findById(purchaseorder.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("tax %d not found", purchaseorder.getProductId())));

		PurchaseOrder po = new PurchaseOrder();
		po.setAccountInformationId(ai);
		po.setProductId(product);
		BeanUtils.copyProperties(purchaseorder, po);
		po = porepo.save(po);
		return purchaseorder;

	}

	@Override
	public boolean deletePurchaseOrder(Long id) {
		boolean status = false;
		PurchaseOrder po = porepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("PurchaseOrder %d not found", id)));

		if (po != null) {
			porepo.delete(po);
			status = true;
		}
		return status;
	}

	@Override
	public boolean deletePurchaseOrderByOrderNum(Integer id) {
		boolean status = false;
		List<PurchaseOrder> poList = porepo.findByOrderNumber(id);

		if (poList != null && !poList.isEmpty()) {
			porepo.deleteAll(poList);
			status = true;
		}
		return status;
	}

	@Override
	public PurchaseOrderDto create(PurchaseOrderDto purchaseorder) {
		PurchaseOrder po = new PurchaseOrder();
		AccountInformation ai = acreo.findById(purchaseorder.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", purchaseorder.getAccountInformationId())));
		Product product = prorepo.findById(purchaseorder.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("AccountInformation %d not found", purchaseorder.getProductId())));
		po.setAccountInformationId(ai);
		po.setProductId(product);
		BeanUtils.copyProperties(purchaseorder, po);
		po = porepo.save(po);
		purchaseorder.setId(po.getId());
		return purchaseorder;

	}

}

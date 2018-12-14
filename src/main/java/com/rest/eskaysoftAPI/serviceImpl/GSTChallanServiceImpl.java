package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.GSTChallanEntry;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.GSTChallanEntryDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.GSTChallanRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.service.GSTChallanService;

@Service
public class GSTChallanServiceImpl implements GSTChallanService {

	@Autowired
	GSTChallanRepository challanRepo;

	@Autowired
	private ProductRepository proRepo;

	@Autowired
	private AccountInformationRepository acreo;

	@Override
	public List<GSTChallanEntryDto> listAllGSTChallan() {
		List<GSTChallanEntryDto> challanList = new ArrayList<>();
		challanRepo.findAllByOrderByDcNoAsc().forEach(challan -> {
			GSTChallanEntryDto challanModel = new GSTChallanEntryDto();
			BeanUtils.copyProperties(challan, challanModel);
			challanModel.setDeleteFlag(true);
			challanModel.setProductId(challan.getProductId().getId());
			challanModel.setProductcode(challan.getProductId().getProductcode());
			challanModel.setProductName(challan.getProductId().getName());
			challanModel.setFree(challan.getProductId().getFree());
			challanModel.setAccountInformationId(challan.getAccountInformationId().getId());
			challanModel.setCustomer(challan.getAccountInformationId().getAccountName());
			challanModel.setGstIN(challan.getAccountInformationId().getGstIN());
			challanList.add(challanModel);
		});
		return challanList;
	}

	@Override
	public GSTChallanEntryDto getGSTChallanById(Long id) {
		GSTChallanEntryDto challanModel = new GSTChallanEntryDto();
		GSTChallanEntry challan = challanRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("challan %d not found", id)));
		BeanUtils.copyProperties(challan, challanModel);
		challanModel.setProductId(challan.getProductId().getId());
		challanModel.setProductcode(challan.getProductId().getProductcode());
		challanModel.setProductName(challan.getProductId().getName());
		challanModel.setFree(challan.getProductId().getFree());
		challanModel.setAccountInformationId(challan.getAccountInformationId().getId());
		challanModel.setCustomer(challan.getAccountInformationId().getAccountName());
		challanModel.setGstIN(challan.getAccountInformationId().getGstIN());

		return challanModel;
	}

	@Override
	public GSTChallanEntryDto save(GSTChallanEntryDto gstChallan) {

		AccountInformation ai = acreo.findById(gstChallan.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", gstChallan.getAccountInformationId())));
		Product pro = proRepo.findById(gstChallan.getId())
				.orElseThrow(() -> new NotFoundException(String.format("challan %d not found", gstChallan.getId())));
		GSTChallanEntry gstChallanEntryList = new GSTChallanEntry();
		gstChallanEntryList.setProductId(pro);
		gstChallanEntryList.setAccountInformationId(ai);
		BeanUtils.copyProperties(gstChallan, gstChallanEntryList);
		gstChallanEntryList = challanRepo.save(gstChallanEntryList);
		return gstChallan;
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		GSTChallanEntry in = challanRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("challan %d not found", id)));
		if (in != null) {
			challanRepo.delete(in);
			status = true;
		}
		return status;
	}

	@Override
	public GSTChallanEntryDto create(GSTChallanEntryDto gstChallanModel) {
		AccountInformation ai = acreo.findById(gstChallanModel.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", gstChallanModel.getAccountInformationId())));
		Product pro = proRepo.findById(gstChallanModel.getProductId()).orElseThrow(
				() -> new NotFoundException(String.format("challan %d not found", gstChallanModel.getProductId())));
		GSTChallanEntry gst = new GSTChallanEntry();
		gst.setProductId(pro);
		gst.setAccountInformationId(ai);
		BeanUtils.copyProperties(gstChallanModel, gst);
		gst = challanRepo.save(gst);
		gstChallanModel.setId(gst.getId());
		return gstChallanModel;
	}

}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.rest.eskaysoftAPI.entity.GSTChallanEntry;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.GSTChallanEntryDto;
import com.rest.eskaysoftAPI.repository.GSTChallanRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.service.GSTChallanService;


@Service
public class GSTChallanServiceImpl implements GSTChallanService {

	@Autowired
	GSTChallanRepository challanRepo;

	@Autowired
	private ProductRepository proRepo;

	@Override
	public List<GSTChallanEntryDto> listAllGSTChallan() {
		List<GSTChallanEntryDto> challanList = new ArrayList<>();
		challanRepo.findAllByOrderByDcNoAsc().forEach(challan -> {
			GSTChallanEntryDto challanModel = new GSTChallanEntryDto();
			BeanUtils.copyProperties(challan, challanModel);
			challanModel.setProductId(challan.getProductId().getId());
			challanModel.setProductcode(challan.getProductId().getProductcode());
			challanModel.setProductName(challan.getProductId().getName());
			challanList.add(challanModel);
		});
		return challanList;
	}

	@Override
	public GSTChallanEntryDto getGSTChallanById(Long id) {
		GSTChallanEntryDto challanList = new GSTChallanEntryDto();
		GSTChallanEntry gstChallanEntryList = challanRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("challan %d not found", id)));
		BeanUtils.copyProperties(gstChallanEntryList, challanList);
		challanList.setProductId(gstChallanEntryList.getProductId().getId());
		challanList.setProductcode(gstChallanEntryList.getProductId().getProductcode());
		challanList.setProductName(gstChallanEntryList.getProductId().getName());

		return challanList;
	}

	@Override
	public GSTChallanEntryDto save(GSTChallanEntryDto gstChallan) {
		Product pro = proRepo.findById(gstChallan.getId())
				.orElseThrow(() -> new NotFoundException(String.format("challan %d not found", gstChallan.getId())));
		GSTChallanEntry gstChallanEntryList = new GSTChallanEntry();
		BeanUtils.copyProperties(gstChallan, gstChallanEntryList);
		gstChallanEntryList.setProductId(pro);
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
		Product pro = proRepo.findById(gstChallanModel.getId()).orElseThrow(
				() -> new NotFoundException(String.format("challan %d not found", gstChallanModel.getId())));
		GSTChallanEntry in = new GSTChallanEntry();
		BeanUtils.copyProperties(gstChallanModel, in);
		in.setProductId(pro);
		in = challanRepo.save(in);
		gstChallanModel.setId(in.getId());
		return gstChallanModel;
	}

}

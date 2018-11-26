package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.rest.eskaysoftAPI.entity.InternalStockAdjustments;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.InternalStockAdjustmentsDto;
import com.rest.eskaysoftAPI.repository.InternalStockAdjustmentsRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.service.InternalStockAdjustmentsService;

public class InternalStockAdjustmentsServiceImpl implements InternalStockAdjustmentsService {

	@Autowired
	InternalStockAdjustmentsRepository inStockRepo;

	@Autowired
	private ProductRepository proRepo;

	@Override
	public List<InternalStockAdjustmentsDto> listAllInternalStockAdjustments() {
		List<InternalStockAdjustmentsDto> inStockListdto = new ArrayList<>();
		inStockRepo.findAllByOrderByNumberAsc().forEach(instocks -> {
			InternalStockAdjustmentsDto inStockModel = new InternalStockAdjustmentsDto();
			BeanUtils.copyProperties(instocks, inStockModel);
			inStockModel.setProductId(instocks.getProductId().getId());
			inStockModel.setProductcode(instocks.getProductId().getProductcode());
			inStockModel.setProductName(instocks.getProductId().getName());
			inStockListdto.add(inStockModel);
		});
		return inStockListdto;
	}

	@Override
	public InternalStockAdjustmentsDto getInternalStockAdjustmentsById(Long id) {
		InternalStockAdjustmentsDto inModel = new InternalStockAdjustmentsDto();
		InternalStockAdjustments inStockList = inStockRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("InternalStockAdjustments %d not found", id)));
		BeanUtils.copyProperties(inStockList, inModel);
		inModel.setProductId(inStockList.getProductId().getId());
		inModel.setProductcode(inStockList.getProductId().getProductcode());
		inModel.setProductName(inStockList.getProductId().getName());

		return inModel;
	}

	@Override
	public InternalStockAdjustmentsDto save(InternalStockAdjustmentsDto internalStockAdjustmentsModel) {
		Product pro = proRepo.findById(internalStockAdjustmentsModel.getId()).orElseThrow(() -> new NotFoundException(
				String.format("InternalStockAdjustments %d not found", internalStockAdjustmentsModel.getId())));
		InternalStockAdjustments in = new InternalStockAdjustments();
		BeanUtils.copyProperties(internalStockAdjustmentsModel, in);
		in.setProductId(pro);
		in = inStockRepo.save(in);
		return internalStockAdjustmentsModel;
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		InternalStockAdjustments in = inStockRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("InternalStockAdjustments %d not found", id)));
		if (in != null) {
			inStockRepo.delete(in);
			status = true;
		}
		return status;
	}

	@Override
	public InternalStockAdjustmentsDto create(InternalStockAdjustmentsDto internalStockAdjustmentsModel) {
		Product pro = proRepo.findById(internalStockAdjustmentsModel.getId()).orElseThrow(() -> new NotFoundException(
				String.format("InternalStockAdjustments %d not found", internalStockAdjustmentsModel.getId())));
		InternalStockAdjustments in = new InternalStockAdjustments();
		BeanUtils.copyProperties(internalStockAdjustmentsModel, in);
		in.setProductId(pro);
		in = inStockRepo.save(in);
		internalStockAdjustmentsModel.setId(in.getId());
		return internalStockAdjustmentsModel;
	}

}

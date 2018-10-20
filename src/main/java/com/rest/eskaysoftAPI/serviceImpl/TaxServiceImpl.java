package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.entity.Tax;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.TaxDto;
import com.rest.eskaysoftAPI.repository.TaxRepository;
import com.rest.eskaysoftAPI.service.TaxService;

@Service
public class TaxServiceImpl implements TaxService {

	private TaxRepository taxRepo;

	@Autowired
	public void setTaxDao(TaxRepository statesrepo) {
		this.taxRepo = taxRepo;
	}

	@Override
	public boolean deleteTax(Long id) {
		boolean status = false;
		Tax state = getTaxById(id);
		if (state != null) {
			taxRepo.delete(state);
			status = true;
		}
		return status;
	}

	@Override
	public List<TaxDto> listAllTaxs() {
		List<TaxDto> taxList = new ArrayList<>();
		taxRepo.findAllByOrderByTaxAsc().forEach(taxes -> {
			TaxDto taxModel = new TaxDto();
			BeanUtils.copyProperties(taxes, taxModel);
			taxList.add(taxModel);
		});

		return taxList;
	}

	@Override
	public Tax getTaxById(Long id) {
		return taxRepo.findById(id).orElseThrow(() -> new NotFoundException(String.format("tax %d not found", id)));
	}

	@Override
	public Tax saveTax(Tax tax) {
		return taxRepo.save(tax);
	}

	@Override
	public Tax create(Tax tax) {
		return taxRepo.save(tax);
	}

}

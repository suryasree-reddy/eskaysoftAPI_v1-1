package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.BankInformation;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.BankInformationDto;
import com.rest.eskaysoftAPI.repository.BankInformationRepository;
import com.rest.eskaysoftAPI.service.BankInformationService;

@Service
public class BankInformationServiceImpl implements BankInformationService {

	private BankInformationRepository bankinfrepo;

	@Autowired
	public void setAccountInformationDao(BankInformationRepository bankinfrepo) {
		this.bankinfrepo = bankinfrepo;
	}

	@Override
	public BankInformation getbankinformationById(Long id) {
		System.out.println("****************" + id);
		return bankinfrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("bankInfromation %d not found", id)));
	}

	@Override
	public List<BankInformationDto> listAllBankInformation() {
		List<BankInformationDto> bankinformationList = new ArrayList<>();
		bankinfrepo.findAllByOrderByNameAsc().forEach(bankinformation -> {
			BankInformationDto bankinformationModel = new BankInformationDto();
			BeanUtils.copyProperties(bankinformation, bankinformationModel);
			bankinformationList.add(bankinformationModel);
		});

		return bankinformationList;
	}

	@Override
	public BankInformation savebankinformation(BankInformation bankinformation) {
		return bankinfrepo.save(bankinformation);
	}

	@Override
	public boolean deletebankinformation(Long id) {
		boolean status = false;
		BankInformation bankinformation = getbankinformationById(id);
		if (bankinformation != null) {
			bankinfrepo.delete(bankinformation);
			status = true;
		}
		return status;
	}

	@Override
	public BankInformation create(BankInformation bankinformation) {
		return bankinfrepo.save(bankinformation);
	}

}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.BankInformationDao;
import com.rest.eskaysoftAPI.entity.BankInformation;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.BankInformationDto;
import com.rest.eskaysoftAPI.service.BankInformationService;

@Service
public class BankInformationServiceImpl implements BankInformationService {

	private BankInformationDao bankInformationDao;

	@Autowired
	public void setAccountInformationDao(BankInformationDao bankInformationDao) {
		this.bankInformationDao = bankInformationDao;
	}

	@Override
	public BankInformation getbankinformationById(Long id) {
		System.out.println("****************" + id);
		return bankInformationDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("bankInfromation %d not found", id)));
	}

	@Override
	public List<BankInformationDto> listAllBankInformation() {
		List<BankInformationDto> bankinformationList = new ArrayList<>();
		bankInformationDao.findAllByOrderByNameAsc().forEach(bankinformation -> {
			BankInformationDto bankinformationModel = new BankInformationDto();
			BeanUtils.copyProperties(bankinformation, bankinformationModel);
			bankinformationList.add(bankinformationModel);
		});

		return bankinformationList;
	}

	@Override
	public BankInformation savebankinformation(BankInformation bankinformation) {
		return bankInformationDao.save(bankinformation);
	}

	@Override
	public boolean deletebankinformation(Long id) {
		boolean status = false;
		BankInformation bankinformation = getbankinformationById(id);
		if (bankinformation != null) {
			bankInformationDao.delete(bankinformation);
			status = true;
		}
		return status;
	}

	@Override
	public BankInformation create(BankInformation bankinformation) {
		return bankInformationDao.save(bankinformation);
	}

}

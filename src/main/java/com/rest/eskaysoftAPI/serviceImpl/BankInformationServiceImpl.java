package com.rest.eskaysoftAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.BankInformationDao;
import com.rest.eskaysoftAPI.entity.BankInformation;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.BankInformationService;

@Service
public class BankInformationServiceImpl implements BankInformationService {

	private BankInformationDao bankInfromationDao;

	@Autowired
	public void setAccountInformationDao(BankInformationDao bankInfromationDao) {
		this.bankInfromationDao = bankInfromationDao;
	}

	@Override
	public BankInformation getbankinformationById(Long id) {
		System.out.println("****************" + id);
		return bankInfromationDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("bankInfromation %d not found", id)));
	}

	@Override
	public Iterable<BankInformation> listAllBankInformation() {
		return bankInfromationDao.findAll();
	}

	@Override
	public BankInformation savebankinformation(BankInformation bankinformation) {
		return bankInfromationDao.save(bankinformation);
	}

	@Override
	public BankInformation deletebankinformation(Long id) {
		BankInformation bankinformation = getbankinformationById(id);
		if (bankinformation != null) {
			bankInfromationDao.delete(bankinformation);
		}
		return bankinformation;
	}

	@Override
	public BankInformation create(BankInformation bankinformation) {
		return bankInfromationDao.save(bankinformation);
	}

}

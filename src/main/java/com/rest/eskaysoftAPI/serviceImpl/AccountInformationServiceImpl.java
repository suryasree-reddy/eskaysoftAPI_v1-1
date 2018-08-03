package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.AccountInformationDao;
import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AccountInformationDto;
import com.rest.eskaysoftAPI.service.AccountInformationService;

@Service
public class AccountInformationServiceImpl implements AccountInformationService {

	private AccountInformationDao accountInformationDao;

	@Autowired
	public void setAccountInformationDao(AccountInformationDao accountInformationDao) {
		this.accountInformationDao = accountInformationDao;
	}

	@Override
	public List<AccountInformationDto> listAllAccountInformation() {
		List<AccountInformationDto> accountinformationList = new ArrayList<>();
		accountInformationDao.findAll().forEach(accountinformation -> {
			AccountInformationDto accountinformationModel = new AccountInformationDto();
			BeanUtils.copyProperties(accountinformation, accountinformationModel);
			accountinformationList.add(accountinformationModel);
		});
		Collections.sort(accountinformationList);
		return accountinformationList;
	}

	@Override
	public AccountInformation getAccountInformationById(Long id) {
		return accountInformationDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("accountInformationDao %d not found", id)));
	}

	@Override
	public AccountInformation saveAccountInformation(AccountInformation accountInformation) {
		return accountInformationDao.save(accountInformation);
	}

	@Override
	public boolean deleteAccountInformation(Long id) {
		boolean status = false;
		AccountInformation accountInformation = getAccountInformationById(id);
		if (accountInformation != null) {
			accountInformationDao.delete(accountInformation);
			status = true;
		}
		return status;
	}

	@Override
	public AccountInformation create(AccountInformation accountInformation) {

		return accountInformationDao.save(accountInformation);
	}

}

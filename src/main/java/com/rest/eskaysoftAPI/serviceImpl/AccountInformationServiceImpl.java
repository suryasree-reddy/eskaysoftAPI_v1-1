package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AccountInformationDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.service.AccountInformationService;

@Service
public class AccountInformationServiceImpl implements AccountInformationService {

	private AccountInformationRepository acinfrRepo;

	@Autowired
	public void setAccountInformationDao(AccountInformationRepository acinfrRepo) {
		this.acinfrRepo = acinfrRepo;
	}

	@Override
	public List<AccountInformationDto> listAllAccountInformation() {
		List<AccountInformationDto> accountinformationList = new ArrayList<>();
		acinfrRepo.findAllByOrderByAccountNameAsc().forEach(accountinformation -> {
			AccountInformationDto accountinformationModel = new AccountInformationDto();
			BeanUtils.copyProperties(accountinformation, accountinformationModel);
			accountinformationList.add(accountinformationModel);
		});

		return accountinformationList;
	}

	@Override
	public AccountInformation getAccountInformationById(Long id) {
		return acinfrRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("accountInformationDao %d not found", id)));
	}

	@Override
	public AccountInformation saveAccountInformation(AccountInformation accountInformation) {
		return acinfrRepo.save(accountInformation);
	}

	@Override
	public boolean deleteAccountInformation(Long id) {
		boolean status = false;
		AccountInformation accountInformation = getAccountInformationById(id);
		if (accountInformation != null) {
			acinfrRepo.delete(accountInformation);
			status = true;
		}
		return status;
	}

	@Override
	public AccountInformation create(AccountInformation accountInformation) {

		return acinfrRepo.save(accountInformation);
	}

}

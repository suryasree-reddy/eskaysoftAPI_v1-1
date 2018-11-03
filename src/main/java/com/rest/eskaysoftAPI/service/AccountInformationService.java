package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.AccountInformationDto;

public interface AccountInformationService {
	List<AccountInformationDto> listAllAccountInformation();

	AccountInformationDto getAccountInformationById(Long id);

	AccountInformationDto updateai(AccountInformationDto accountInformation);

	boolean deleteAccountInformation(Long id);

	AccountInformationDto create(AccountInformationDto accountInformation);

}

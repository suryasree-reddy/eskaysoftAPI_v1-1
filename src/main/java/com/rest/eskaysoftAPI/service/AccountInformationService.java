package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.model.AccountInformationDto;

public interface AccountInformationService {

	List<AccountInformationDto> listAllAccountInformation();

	AccountInformation getAccountInformationById(Long id);

	AccountInformation saveAccountInformation(AccountInformation accountInformation);

	boolean deleteAccountInformation(Long id);

	AccountInformation create(AccountInformation accountInformation);

}

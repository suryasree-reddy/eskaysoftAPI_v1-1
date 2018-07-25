package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.AccountInformation;

public interface AccountInformationService {

    Iterable<AccountInformation> listAllAccountInformation();

    AccountInformation getAccountInformationById(Long id);

    AccountInformation saveAccountInformation(AccountInformation accountInformation);

    AccountInformation deleteAccountInformation(Long id);

    AccountInformation create(AccountInformation accountInformation);

}

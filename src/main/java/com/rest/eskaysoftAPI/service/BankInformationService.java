package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.BankInformation;

public interface BankInformationService {

    Iterable<BankInformation> listAllBankInformation();

    BankInformation getbankinformationById(Long id);

    BankInformation savebankinformation(BankInformation bankinformation);

    BankInformation deletebankinformation(Long id);

    BankInformation create(BankInformation bankinformation);

}

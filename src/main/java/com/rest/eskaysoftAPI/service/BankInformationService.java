package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.BankInformation;
import com.rest.eskaysoftAPI.model.BankInformationDto;

public interface BankInformationService {

    List<BankInformationDto> listAllBankInformation();

    BankInformation getbankinformationById(Long id);

    BankInformation savebankinformation(BankInformation bankinformation);

    boolean deletebankinformation(Long id);
    BankInformation create(BankInformation bankinformation);

}

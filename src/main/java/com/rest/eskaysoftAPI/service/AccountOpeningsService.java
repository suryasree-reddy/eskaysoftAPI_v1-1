package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.AccountOpenings;
import com.rest.eskaysoftAPI.model.AccountOpeningsDto;

public interface AccountOpeningsService {

    List<AccountOpeningsDto> listAllAccountOpenings();

    AccountOpenings getAccountOpeningsById(Long id);

    AccountOpenings saveAccountOpenings(AccountOpenings accountopenings);

    boolean deleteAccountOpenings(Long id);


    AccountOpenings create(AccountOpenings accountopenings);

}

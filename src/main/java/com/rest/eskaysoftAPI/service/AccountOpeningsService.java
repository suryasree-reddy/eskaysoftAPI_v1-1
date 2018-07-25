package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.AccountOpenings;

public interface AccountOpeningsService {

    Iterable<AccountOpenings> listAllAccountOpenings();

    AccountOpenings getAccountOpeningsById(Long id);

    AccountOpenings saveAccountOpenings(AccountOpenings accountopenings);

    AccountOpenings deleteAccountOpenings(Long id);

    AccountOpenings create(AccountOpenings accountopenings);

}

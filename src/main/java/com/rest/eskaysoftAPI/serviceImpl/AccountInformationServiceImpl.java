package com.rest.eskaysoftAPI.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.AccountInformationDao;
import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.AccountInformationService;

@Service
public class AccountInformationServiceImpl implements AccountInformationService {

    private AccountInformationDao accountInformationDao;

    @Autowired
    public void setAccountInformationDao(AccountInformationDao accountInformationDao) {
        this.accountInformationDao = accountInformationDao;
    }


    @Override
    public Iterable<AccountInformation> listAllAccountInformation() {
        return accountInformationDao.findAll();
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
    public AccountInformation deleteAccountInformation(Long id) {
        AccountInformation accountInformation = getAccountInformationById(id);
        if(accountInformation != null){
        	accountInformationDao.delete(accountInformation);
        }
        return accountInformation;
    }


    @Override
    public AccountInformation create(AccountInformation accountInformation) {

            return accountInformationDao.save(accountInformation);
        }


	



	



}

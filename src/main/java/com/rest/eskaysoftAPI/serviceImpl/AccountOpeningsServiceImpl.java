package com.rest.eskaysoftAPI.serviceImpl;

import com.rest.eskaysoftAPI.service.AccountOpeningsService;
import com.rest.eskaysoftAPI.exception.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.AccountOpeningsDao;
import com.rest.eskaysoftAPI.entity.AccountOpenings;

@Service
public class AccountOpeningsServiceImpl implements AccountOpeningsService {

    private AccountOpeningsDao accountOpeningsDao;

    @Autowired
    public void setdistrictsDao(AccountOpeningsDao accountOpeningsDao) {
        this.accountOpeningsDao = accountOpeningsDao;
    }


    @Override
    public Iterable<AccountOpenings> listAllAccountOpenings() {
        return accountOpeningsDao.findAll();
    }

    @Override
	public AccountOpenings getAccountOpeningsById(Long id) {
    	System.out.println("****************"+id);
    	return accountOpeningsDao.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("AccountOpenings %d not found", id)));

    }

    @Override
    public AccountOpenings saveAccountOpenings(AccountOpenings accountopenings) {
        return accountOpeningsDao.save(accountopenings);
    }

    @Override
    public boolean deleteAccountOpenings(Long id) {
    	boolean status = false;
    	AccountOpenings accountopenings = getAccountOpeningsById(id);
        if(accountopenings != null){
        	accountOpeningsDao.delete(accountopenings);
        	status = true;
        }
        return status;
    }


    @Override
    public AccountOpenings create(AccountOpenings accountopenings) {

            return accountOpeningsDao.save(accountopenings);
        }


}

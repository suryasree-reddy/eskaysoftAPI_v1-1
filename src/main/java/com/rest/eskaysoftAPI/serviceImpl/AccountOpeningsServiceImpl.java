package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountOpenings;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AccountOpeningsDto;
import com.rest.eskaysoftAPI.repository.AccountOpeningsRepository;
import com.rest.eskaysoftAPI.service.AccountOpeningsService;

@Service
public class AccountOpeningsServiceImpl implements AccountOpeningsService {

	private AccountOpeningsRepository acoprepo;

	@Autowired
	public void setdistrictsDao(AccountOpeningsRepository acoprepo) {
		this.acoprepo = acoprepo;
	}

	@Override
	public List<AccountOpeningsDto> listAllAccountOpenings() {
		List<AccountOpeningsDto> accountopeningList = new ArrayList<>();
		acoprepo.findAllByOrderByAccountNameAsc().forEach(accountopenings -> {
			AccountOpeningsDto accountopeningModel = new AccountOpeningsDto();
			BeanUtils.copyProperties(accountopenings, accountopeningModel);
			accountopeningList.add(accountopeningModel);
		});

		return accountopeningList;
	}

	@Override
	public AccountOpenings getAccountOpeningsById(Long id) {
		System.out.println("****************" + id);
		return acoprepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("AccountOpenings %d not found", id)));

	}

	@Override
	public AccountOpenings saveAccountOpenings(AccountOpenings accountopenings) {
		return acoprepo.save(accountopenings);
	}

	@Override
	public boolean deleteAccountOpenings(Long id) {
		boolean status = false;
		AccountOpenings accountopenings = getAccountOpeningsById(id);
		if (accountopenings != null) {
			acoprepo.delete(accountopenings);
			status = true;
		}
		return status;
	}

	@Override
	public AccountOpenings create(AccountOpenings accountopenings) {

		return acoprepo.save(accountopenings);
	}

}

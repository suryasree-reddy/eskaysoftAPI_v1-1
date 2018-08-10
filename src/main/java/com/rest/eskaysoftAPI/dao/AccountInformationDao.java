package com.rest.eskaysoftAPI.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.AccountOpenings;

@Repository ("accountInformationDao")
@Transactional
public interface AccountInformationDao extends JpaRepository<AccountInformation, Long> {
	public List<AccountInformation> findAllByOrderByAccountNameAsc();

}
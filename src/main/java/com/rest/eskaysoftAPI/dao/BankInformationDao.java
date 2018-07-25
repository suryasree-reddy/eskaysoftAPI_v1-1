package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.BankInformation;

@Repository ("bankinformationDao")
@Transactional
public interface BankInformationDao extends JpaRepository<BankInformation, Long> {

}
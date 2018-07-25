package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.AccountOpenings;

@Repository("accountOpeningsDao")
@Transactional
public interface AccountOpeningsDao extends JpaRepository<AccountOpenings, Long> {

}
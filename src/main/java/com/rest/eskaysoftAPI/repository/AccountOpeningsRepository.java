package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.AccountOpenings;

@Repository("accountOpeningsRepository")
@Transactional
public interface AccountOpeningsRepository extends JpaRepository<AccountOpenings, Long> {
	public List<AccountOpenings> findAllByOrderByAccountNameAsc();

}
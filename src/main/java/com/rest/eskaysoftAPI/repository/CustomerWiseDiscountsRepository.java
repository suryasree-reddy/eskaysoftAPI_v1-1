package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;

@Repository("customerwisediscountsRepository")
@Transactional
public interface CustomerWiseDiscountsRepository extends JpaRepository<CustomerWiseDiscounts, Long> {
	public List<CustomerWiseDiscounts> findAllByOrderByDiscAsc();

	public List<CustomerWiseDiscounts> findByCompanyIdId(Long id);
	
	public List<CustomerWiseDiscounts> findByAccountInformationIdIdOrderByDiscAsc(Long id);
	
	public CustomerWiseDiscounts findByAccountInformationIdIdAndCompanyIdId(Long AcctId, Long ComId);

}
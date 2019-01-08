package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.SalesReturns;

@Repository("salesReturnsRepository")
@Transactional
public interface SalesReturnsRepository extends JpaRepository<SalesReturns, Long> {

	public List<SalesReturns> findAllByOrderBySalesReturnNoAsc();
	
	public List<SalesReturns> findBySalesReturnNo(Integer id);
	
}
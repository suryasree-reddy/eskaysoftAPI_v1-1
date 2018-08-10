package com.rest.eskaysoftAPI.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.BusinessExecutive;

@Repository("businessExecutiveDao")
@Transactional
public interface BusinessExecutiveDao extends JpaRepository<BusinessExecutive, Long> {
	public List<BusinessExecutive> findAllByOrderByNameAsc();

}
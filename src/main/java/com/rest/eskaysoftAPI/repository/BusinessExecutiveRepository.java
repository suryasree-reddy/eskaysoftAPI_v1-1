package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.BusinessExecutive;

@Repository("businessExecutiveRepository")
@Transactional
public interface BusinessExecutiveRepository extends JpaRepository<BusinessExecutive, Long> {
	public List<BusinessExecutive> findAllByOrderByNameAsc();

}
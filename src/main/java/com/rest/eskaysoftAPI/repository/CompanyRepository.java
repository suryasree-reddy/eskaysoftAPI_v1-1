package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Company;

@Repository("companyRepository")
@Transactional
public interface CompanyRepository extends JpaRepository<Company, Long> {
	public List<Company> findAllByOrderByCompanyNameAsc();

}
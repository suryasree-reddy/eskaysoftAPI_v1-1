package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Company;

@Repository ("companyDao")
@Transactional
public interface CompanyDao extends JpaRepository<Company, Long> {

}
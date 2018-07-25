package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.CompanyGroup;

@Repository ("companygroupDao")
@Transactional
public interface CompanyGroupDao extends JpaRepository<CompanyGroup, Long> {

}
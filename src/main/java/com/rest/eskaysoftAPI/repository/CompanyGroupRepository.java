package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.CompanyGroup;

@Repository("companygroupRepository")
@Transactional
public interface CompanyGroupRepository extends JpaRepository<CompanyGroup, Long> {
	public List<CompanyGroup> findAllByOrderByCompanyGroupAsc();
}

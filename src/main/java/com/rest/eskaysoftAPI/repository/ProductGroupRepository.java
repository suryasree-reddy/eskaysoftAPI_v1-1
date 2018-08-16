package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.ProductGroup;

@Repository("productGroupRepository")
@Transactional
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
	public List<ProductGroup> findAllByOrderByProductGroupNameAsc();
}
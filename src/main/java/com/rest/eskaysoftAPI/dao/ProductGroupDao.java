package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.ProductGroup;

@Repository("ProductGroupDao")
@Transactional
public interface ProductGroupDao extends JpaRepository<ProductGroup, Long> {

}
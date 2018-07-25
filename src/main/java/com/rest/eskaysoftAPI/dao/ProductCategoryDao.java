package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.ProductCategory;


@Repository("ProductCategoryDao")
@Transactional
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Long> {

}
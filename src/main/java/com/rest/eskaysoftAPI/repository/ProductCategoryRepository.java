package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.ProductCategory;

@Repository("productCategoryRepository")
@Transactional
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	public List<ProductCategory> findAllByOrderByProductCategoryNameAsc();
}
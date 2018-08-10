package com.rest.eskaysoftAPI.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Product;

@Repository("productDao")
@Transactional
public interface ProductDao extends JpaRepository<Product, Long> {
	public List<Product> findAllByOrderByNameAsc();
}
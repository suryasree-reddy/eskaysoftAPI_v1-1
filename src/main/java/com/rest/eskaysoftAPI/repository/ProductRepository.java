package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Product;

@Repository("productRepository")
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findAllByOrderByNameAsc();

	public List<Product> findBytaxIdId(Long id);

	public List<Product> findBycompanyIdId(Long id);

	public List<Product> findByproductgroupIdId(Long id);

	public List<Product> findByProductcategoryIdId(Long id);

}
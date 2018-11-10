package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Productgroup;

@Repository("productGroupRepository")
@Transactional
public interface ProductGroupRepository extends JpaRepository<Productgroup, Long> {
	public List<Productgroup> findAllByOrderByProductGroupNameAsc();
	
	@Query(value = "SELECT pg.id, pg.product_group_name, " + 
			"  CASE WHEN pro.productgroup_id is NULL THEN 't' ELSE 'f' END AS delete_flag" + 
			"  FROM public.productgroup pg" + 
			"  LEFT OUTER JOIN (SELECT distinct productgroup_id" + 
			"  FROM public.products) pro" + 
			"  ON pg.id=pro.productgroup_id ORDER BY pg.product_group_name ASC ", nativeQuery = true)
	public List<Productgroup> getProductgroups();
}
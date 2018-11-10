package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.BusinessExecutive;

@Repository("businessExecutiveRepository")
@Transactional
public interface BusinessExecutiveRepository extends JpaRepository<BusinessExecutive, Long> {
	public List<BusinessExecutive> findAllByOrderByNameAsc();

	@Query(value = "SELECT be.id, address, be.mobile, be.name, be.town,"
			+ "  CASE WHEN ara.business_executive_id is NULL THEN 't' ELSE 'f' END AS delete_flag"
			+ "  FROM public.businessexecutive be" + "  LEFT OUTER JOIN (SELECT distinct business_executive_id"
			+ "  FROM public.area) ara"
			+ "  ON be.id=ara.business_executive_id ORDER BY be.name ASC ", nativeQuery = true)
	public List<BusinessExecutive> getBusinessExecutives();
}

package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.CompanyGroup;

@Repository("companygroupRepository")
@Transactional
public interface CompanyGroupRepository extends JpaRepository<CompanyGroup, Long> {
	public List<CompanyGroup> findAllByOrderByCompanyGroupNameAsc();
	
	/*@Query(value = "SELECT comp.id, comp.company_code, comp.company_name, comp.company_status, " + 
			"comp.company_type, comp.inv_gen_type, comp.inv_prefix, " + 
			"CASE WHEN prod.company_id is NULL THEN 't' ELSE 'f' END AS delete_flag " + 
			"FROM public.companies comp LEFT OUTER JOIN " + 
			"(SELECT distinct company_id from public.products  UNION " + 
			"SELECT distinct company_id from public.customer_wise_discounts) prod " + 
			"on comp.id = prod.company_id order by comp.company_name ASC", nativeQuery = true)
	public List<Company> getCompanies();
*/
	@Query(value = "SELECT cg.id, cg.company_group_name, "
			+ "  CASE WHEN com.company_group_id is NULL THEN 't' ELSE 'f' END AS delete_flag"
			+ "  FROM public.company_group cg" + "  LEFT OUTER JOIN (SELECT distinct company_group_id"
			+ "  FROM public.companies) com"
			+ "  ON cg.id=com.company_group_id ORDER BY cg.company_group_name ASC ", nativeQuery = true)
	public List<CompanyGroup> getCompanyGroup();
	
	
	
	
}

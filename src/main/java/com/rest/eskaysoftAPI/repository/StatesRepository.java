package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.States;

@Repository("statesRepository")
@Transactional
public interface StatesRepository extends JpaRepository<States, Long> {
	public List<States> findAllByOrderByStateNameAsc();
	
	@Query(value = "SELECT st.id, st.state_code, st.state_name, st.zone," + 
			"  CASE WHEN dis.state_id is NULL THEN 't' ELSE 'f' END AS delete_flag" + 
			"  FROM public.states st" + 
			"  LEFT OUTER JOIN (SELECT distinct state_id" + 
			"  FROM public.districts) dis" + 
			"  ON st.id=dis.state_id ORDER BY st.state_name ASC ", nativeQuery = true)
	public List<States> getStates();
	
}
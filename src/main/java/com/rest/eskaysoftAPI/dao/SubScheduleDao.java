
package com.rest.eskaysoftAPI.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.SubSchedule;

@Repository("subScheduleDao")
@Transactional
public interface SubScheduleDao extends JpaRepository<SubSchedule, Long> {
	public List<SubSchedule> findAllByOrderBySubScheduleNameAsc();

}
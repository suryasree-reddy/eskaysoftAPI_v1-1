
package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.SubSchedule;

@Repository("subscheduleRepository")
@Transactional
public interface SubScheduleRepository extends JpaRepository<SubSchedule, Long> {
	public List<SubSchedule> findAllByOrderBySubScheduleNameAsc();
	public List<SubSchedule> findAllByScheduleIdId(Long id);
	public List<SubSchedule> findByScheduleIdId(Long id);

}
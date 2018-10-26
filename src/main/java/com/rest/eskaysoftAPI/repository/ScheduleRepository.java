package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Schedule;

@Repository ("scheduleRepository")
@Transactional
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
	public List<Schedule> findAllByOrderByScheduleNameAsc();
	
	@Query(value = "SELECT sch.id, sch.schedule_index, sch.schedule_name, sch.schedule_type," + 
			"  CASE WHEN subSch.schedule_id is NULL THEN 't' ELSE 'f' END AS delete_flag" + 
			"  FROM public.schedules sch" + 
			"  LEFT OUTER JOIN (SELECT distinct schedule_id" + 
			"  FROM public.subschedules) subSch" + 
			"  ON sch.id=subSch.schedule_id ORDER BY sch.schedule_name ASC ", nativeQuery = true)
	public List<Schedule> getSchedules();
}
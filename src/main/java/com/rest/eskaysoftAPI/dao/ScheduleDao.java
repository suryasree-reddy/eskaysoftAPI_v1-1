package com.rest.eskaysoftAPI.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Schedule;

@Repository ("scheduleDao")
@Transactional
public interface ScheduleDao extends JpaRepository<Schedule, Long> {
	public List<Schedule> findAllByOrderByScheduleNameAsc();
}
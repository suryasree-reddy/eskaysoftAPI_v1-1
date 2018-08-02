package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.model.ScheduleDto;

public interface ScheduleService {

	List<ScheduleDto> listAllSchedules();

    Schedule getScheduleById(Long id);

    Schedule saveSchedule(Schedule schedule);


    boolean deleteSchedule(Long id);


    Schedule create(Schedule schedule);

}

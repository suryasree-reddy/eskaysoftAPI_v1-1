package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.Schedule;

public interface ScheduleService {

    Iterable<Schedule> listAllSchedules();

    Schedule getScheduleById(Long id);

    Schedule saveSchedule(Schedule schedule);


    boolean deleteSchedule(Long id);


    Schedule create(Schedule schedule);

}

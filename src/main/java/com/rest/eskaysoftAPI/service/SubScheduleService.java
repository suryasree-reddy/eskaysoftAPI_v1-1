package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.SubSchedule;

public interface SubScheduleService {

    Iterable<SubSchedule> listAllSubSchedules();

    SubSchedule getSubScheduleById(Long id);

    SubSchedule saveSubSchedule(SubSchedule subschedule);

    SubSchedule deleteSubSchedule(Long id);

    SubSchedule create(SubSchedule schedule);

}

package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.model.SubScheduleDto;

public interface SubScheduleService {

	List<SubScheduleDto> listAllSubSchedules();

	SubSchedule getSubScheduleById(Long id);

	SubSchedule saveSubSchedule(SubSchedule subschedule);

	boolean deleteSubSchedule(Long id);

	SubSchedule create(SubSchedule schedule);

}

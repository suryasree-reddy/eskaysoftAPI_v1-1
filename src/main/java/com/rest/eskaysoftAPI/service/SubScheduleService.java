package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.SubScheduleDto;

public interface SubScheduleService {

	List<SubScheduleDto> listAllSubSchedules();

	SubScheduleDto getSubScheduleById(Long id);

	SubScheduleDto saveSubSchedule(SubScheduleDto subschedule);

	boolean deleteSubSchedule(Long id);

	SubScheduleDto create(SubScheduleDto schedule);

}

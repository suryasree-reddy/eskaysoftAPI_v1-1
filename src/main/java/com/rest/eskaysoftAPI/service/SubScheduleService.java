package com.rest.eskaysoftAPI.service;

import java.util.Set;

import com.rest.eskaysoftAPI.dto.SubScheduleDto;
import com.rest.eskaysoftAPI.entity.SubSchedule;

public interface SubScheduleService {

	Set<SubScheduleDto> listAllSubSchedules();

	SubScheduleDto getSubScheduleById(Long id);

	SubSchedule saveSubSchedule(SubSchedule subschedule);

	boolean deleteSubSchedule(Long id);

	SubSchedule create(SubSchedule schedule);

	

}

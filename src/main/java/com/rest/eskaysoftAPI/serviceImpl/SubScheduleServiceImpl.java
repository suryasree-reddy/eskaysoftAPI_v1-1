package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ScheduleDao;
import com.rest.eskaysoftAPI.dao.SubScheduleDao;
import com.rest.eskaysoftAPI.dto.SceduleDto;
import com.rest.eskaysoftAPI.dto.SubScheduleDto;
import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.SubScheduleService;

@Service
public class SubScheduleServiceImpl implements SubScheduleService {

	private SubScheduleDao subscheduleDao;
	
	@Autowired
	private ScheduleDao scheduleDao;

	@Autowired
	public void setsubscheduleDao(SubScheduleDao subscheduleDao) {
		this.subscheduleDao = subscheduleDao;
	}
	

	@Override
	public Set<SubScheduleDto> listAllSubSchedules() {
		SubScheduleDto subSceduleDto = null;
		SceduleDto sceduleDto = null;
		Set<SubScheduleDto> subSchedules = new HashSet<>();
		Iterable<SubSchedule> subList = subscheduleDao.findAll();
		for (SubSchedule s : subList) {
			Schedule schedule = scheduleDao.findById(s.getScheduleId()) .orElseThrow(() -> new NotFoundException(String.format("Schedule %d not found")));
			sceduleDto = new SceduleDto();
			subSceduleDto = new SubScheduleDto();
			sceduleDto.setId(schedule.getId());
			sceduleDto.setScheduleName(schedule.getScheduleName());
			
			subSceduleDto.setSchedule(sceduleDto);
			subSceduleDto.setSubScheduleId(s.getScheduleId());
			subSceduleDto.setSubScheduleIndex(s.getSubScheduleId());
			subSceduleDto.setSubScheduleName(s.getSubScheduleName());
			subSchedules.add(subSceduleDto);
		}
		return subSchedules;
	}
	
	
	/*@Override
	public Set<SceduleDto> listAllSchedules() {
		List<Schedule> schedules = new ArrayList<>(scheduleDao.findAll());
		Set<SceduleDto> scheduleList = null;
		if (schedules != null) {
			scheduleList = new HashSet<>();
			for (Schedule schedule : schedules) {
				SceduleDto scheduleDTO = new SceduleDto();
				scheduleDTO.setId(schedule.getId());
				scheduleDTO.setScheduleName(schedule.getScheduleName());	
				scheduleList.add(scheduleDTO);
			}}
		
		return scheduleList;
	}
*/
	@Override
	public SubScheduleDto getSubScheduleById(Long id) {
		SubScheduleDto subSceduleDto = null;
		SceduleDto sceduleDto = null;
		SubSchedule s = subscheduleDao.findById(id).orElseThrow(() -> new NotFoundException(String.format("subschedule %d not found", id)));
		Schedule schedule = scheduleDao.findById(s.getScheduleId()) .orElseThrow(() -> new NotFoundException(String.format("Schedule %d not found")));
		sceduleDto = new SceduleDto();
		subSceduleDto = new SubScheduleDto();
		sceduleDto.setId(schedule.getId());
		sceduleDto.setScheduleName(schedule.getScheduleName());
		subSceduleDto.setSchedule(sceduleDto);
		subSceduleDto.setSubScheduleId(s.getScheduleId());
		subSceduleDto.setSubScheduleIndex(s.getSubScheduleId());
		subSceduleDto.setSubScheduleName(s.getSubScheduleName());
		return subSceduleDto;
	}

	@Override
	public SubSchedule saveSubSchedule(SubSchedule subschedule) {
		return subscheduleDao.save(subschedule);
	}

	@Override
	public boolean deleteSubSchedule(Long id) {
		boolean status = false;
		SubSchedule subschedule = subscheduleDao.findById(id).orElseThrow(() -> new NotFoundException(String.format("subschedule %d not found", id)));
		if (subschedule != null) {
			subscheduleDao.delete(subschedule);
			status = true;
		}
		return status;
	}

	@Override
	public SubSchedule create(SubSchedule subschedule) {

		return subscheduleDao.save(subschedule);
	}


	
}

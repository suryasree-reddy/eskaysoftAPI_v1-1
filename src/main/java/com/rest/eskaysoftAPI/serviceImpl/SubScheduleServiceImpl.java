package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ScheduleDao;
import com.rest.eskaysoftAPI.dao.SubScheduleDao;
import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.SubScheduleDto;
import com.rest.eskaysoftAPI.service.SubScheduleService;

@Service
public class SubScheduleServiceImpl implements SubScheduleService {

	@Autowired
	private SubScheduleDao subscheduleDao;
	
	@Autowired
	private ScheduleDao scheduleDao;


	@Override
	public List<SubScheduleDto> listAllSubSchedules() {
		List<SubScheduleDto> subschList = new ArrayList<>();
		subscheduleDao.findAll().forEach(subschedule -> {
			SubScheduleDto subschModel = new SubScheduleDto();
			BeanUtils.copyProperties(subschedule, subschModel);
			subschList.add(subschModel);
		});
		Collections.sort(subschList);
		return subschList;
	}

	@Override
	public SubSchedule getSubScheduleById(Long id) {
		return subscheduleDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("subschedule %d not found", id)));
	}

	@Override
	public SubScheduleDto saveSubSchedule(SubScheduleDto subschModel) {
		Schedule sch = scheduleDao.findById(subschModel.getScheduleId())
				.orElseThrow(() -> new NotFoundException(String.format("Schedule %d not found", subschModel.getScheduleId())));
		SubSchedule subschedule = new SubSchedule();
		BeanUtils.copyProperties(subschModel, subschedule);
		subschedule.setScheduleId(sch);
		subschedule = subscheduleDao.save(subschedule);
		return subschModel;
	}

	@Override
	public boolean deleteSubSchedule(Long id) {
		boolean status = false;
		SubSchedule subschedule = subscheduleDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("subschedule %d not found", id)));
		if (subschedule != null) {
			subscheduleDao.delete(subschedule);
			status = true;
		}
		return status;
	}

	@Override
	public SubScheduleDto create(SubScheduleDto subschModel) {
		Schedule sch = scheduleDao.findById(subschModel.getScheduleId())
				.orElseThrow(() -> new NotFoundException(String.format("Schedule %d not found", subschModel.getScheduleId())));
		SubSchedule subschedule = new SubSchedule();
		BeanUtils.copyProperties(subschModel, subschedule);
		subschedule.setScheduleId(sch);
		subschedule = subscheduleDao.save(subschedule);
		subschModel.setSubScheduleId(subschedule.getSubScheduleId());
		return subschModel;
	}

}

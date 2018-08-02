package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.SubScheduleDao;
import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.SubScheduleDto;
import com.rest.eskaysoftAPI.service.SubScheduleService;

@Service
public class SubScheduleServiceImpl implements SubScheduleService {

	private SubScheduleDao subscheduleDao;

	@Autowired
	public void setsubscheduleDao(SubScheduleDao subscheduleDao) {
		this.subscheduleDao = subscheduleDao;
	}

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
	public SubSchedule saveSubSchedule(SubSchedule subschedule) {
		return subscheduleDao.save(subschedule);
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
	public SubSchedule create(SubSchedule subschedule) {

		return subscheduleDao.save(subschedule);
	}

}

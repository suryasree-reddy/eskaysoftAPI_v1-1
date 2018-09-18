package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.ScheduleDto;
import com.rest.eskaysoftAPI.repository.ScheduleRepository;
import com.rest.eskaysoftAPI.service.ScheduleService;


@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository schedrepo;

	@Override
	public List<ScheduleDto> listAllSchedules() {
		List<ScheduleDto> schList = new ArrayList<>();
		schedrepo.findAllByOrderByScheduleNameAsc().forEach(sch ->{
			ScheduleDto schModel = new ScheduleDto();	
			BeanUtils.copyProperties(sch, schModel);
			schList.add(schModel);
		});
		return schList;
	}

	@Override
	public Schedule getScheduleById(Long id) {
		return schedrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Schedule %d not found", id)));
	}

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		return schedrepo.save(schedule);
	}

	@Override
	public boolean deleteSchedule(Long id) {
		boolean status = false;
		Schedule schedule = getScheduleById(id);
		if (schedule != null) {
			schedrepo.delete(schedule);
			status = true;
		}
		return status;
	}

	@Override
	public Schedule create(Schedule schedule) {

		return schedrepo.save(schedule);
	}

}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.SubScheduleDto;
import com.rest.eskaysoftAPI.repository.ScheduleRepository;
import com.rest.eskaysoftAPI.repository.SubScheduleRepository;
import com.rest.eskaysoftAPI.service.SubScheduleService;

@Service
public class SubScheduleServiceImpl implements SubScheduleService {

	@Autowired
	private SubScheduleRepository subschrepo;

	@Autowired
	private ScheduleRepository schedrepo;

	@Override
	public List<SubScheduleDto> listAllSubSchedules() {
		List<SubScheduleDto> subschList = new ArrayList<>();
		subschrepo.findAllByOrderBySubScheduleNameAsc().forEach(subschedule -> {

			SubScheduleDto subschModel = new SubScheduleDto();
			BeanUtils.copyProperties(subschedule, subschModel);
			subschModel.setScheduleName(subschedule.getScheduleId().getScheduleName());
			subschModel.setScheduleId(subschedule.getScheduleId().getId());
			subschList.add(subschModel);
		});
		return subschList;
	}

	@Override
	public SubScheduleDto getSubScheduleById(Long id) {
		SubSchedule subschedule = subschrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("subschedule %d not found", id)));
		SubScheduleDto subschModel = new SubScheduleDto();
		BeanUtils.copyProperties(subschedule, subschModel);
		subschModel.setScheduleId(subschedule.getScheduleId().getId());
		return subschModel;
	}

	@Override
	public SubScheduleDto saveSubSchedule(SubScheduleDto subschModel) {
		Schedule sch = schedrepo.findById(subschModel.getScheduleId()).orElseThrow(
				() -> new NotFoundException(String.format("Schedule %d not found", subschModel.getScheduleId())));
		SubSchedule subschedule = new SubSchedule();
		BeanUtils.copyProperties(subschModel, subschedule);
		if(sch.getDeleteFlag()) {
			sch.setDeleteFlag(false);
			schedrepo.save(sch);
		}
		subschedule.setScheduleId(sch);
		subschedule = subschrepo.save(subschedule);
		return subschModel;
	}

	@Override
	public boolean deleteSubSchedule(Long id) {
		boolean status = false;
		SubSchedule subschedule = subschrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("subschedule %d not found", id)));
		if (subschedule != null) {
			subschrepo.delete(subschedule);
			status = true;
		}
		return status;
	}

	@Override
	public SubScheduleDto create(SubScheduleDto subschModel) {
		Schedule sch = schedrepo.findById(subschModel.getScheduleId()).orElseThrow(
				() -> new NotFoundException(String.format("Schedule %d not found", subschModel.getScheduleId())));
		SubSchedule subschedule = new SubSchedule();
		BeanUtils.copyProperties(subschModel, subschedule);
		if(sch.getDeleteFlag()) {
			sch.setDeleteFlag(false);
			schedrepo.save(sch);
		}
		subschedule.setScheduleId(sch);
		subschedule = subschrepo.save(subschedule);
		subschModel.setSubScheduleId(subschedule.getSubScheduleId());
		return subschModel;
	}

}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.StatesDao;
import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.StatesDto;
import com.rest.eskaysoftAPI.service.StatesService;

@Service
public class StatesServiceImpl implements StatesService {

	private StatesDao stateDao;

	@Autowired
	public void setscheduleDao(StatesDao stateDao) {
		this.stateDao = stateDao;
	}

	@Override
	public List<StatesDto> listAllStates() {
		List<StatesDto> stateList = new ArrayList<>();
		stateDao.findAllByOrderByStateNameAsc().forEach(states -> {
			StatesDto stateModel = new StatesDto();
			BeanUtils.copyProperties(states, stateModel);
			stateList.add(stateModel);
		});

		return stateList;
	}

	@Override
	public States getStateById(Long id) {
		System.out.println("****************" + id);
		return stateDao.findById(id).orElseThrow(() -> new NotFoundException(String.format("state %d not found", id)));
	}

	@Override
	public States saveState(States state) {
		return stateDao.save(state);
	}

	@Override
	public boolean deleteState(Long id) {
		boolean status = false;
		States state = getStateById(id);
		if (state != null) {
			stateDao.delete(state);
			status = true;
		}
		return status;
	}

	@Override
	public States create(States state) {

		return stateDao.save(state);
	}

}

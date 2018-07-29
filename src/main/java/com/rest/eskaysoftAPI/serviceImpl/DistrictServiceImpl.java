package com.rest.eskaysoftAPI.serviceImpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.DistrictsDao;
import com.rest.eskaysoftAPI.dao.StatesDao;
import com.rest.eskaysoftAPI.dto.DistrictDto;
import com.rest.eskaysoftAPI.dto.StatesDto;
import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.DistrictService;

@Service
public class DistrictServiceImpl implements DistrictService {

	private DistrictsDao districtsDao;

	@Autowired
	private StatesDao statesdao;

	@Autowired
	public void setdistrictsDao(DistrictsDao districtsDao) {
		this.districtsDao = districtsDao;
	}

	@Override
	public Set<DistrictDto> listAllDistricts() {
		DistrictDto districtDto = null;
		StatesDto statesDto = null;
		Set<DistrictDto> districts = new HashSet<>();
		Iterable<Districts> dicList = districtsDao.findAll();
		for (Districts s : dicList) {
			States states = statesdao.findById(s.getStatesId())
					.orElseThrow(() -> new NotFoundException(String.format("state %d not found")));
			statesDto = new StatesDto();
			districtDto = new DistrictDto();
			statesDto.setId(states.getId());
			statesDto.setStateName(states.getStateName());

			districtDto.setStates(statesDto);
			districtDto.setDistricId(s.getStatesId());
			districtDto.setDistrictName(s.getDistrictName());

			districts.add(districtDto);
		}
		return districts;
	}

	@Override
	public DistrictDto getdistrictsById(Long id) {
		DistrictDto districtDto = null;
		StatesDto statesDto = null;
		Districts s = districtsDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
		States states = statesdao.findById(s.getStatesId())
				.orElseThrow(() -> new NotFoundException(String.format("state %d not found")));
		statesDto = new StatesDto();
		districtDto = new DistrictDto();
		statesDto.setId(states.getId());
		statesDto.setStateName(states.getStateName());
		districtDto.setStates(statesDto);
		districtDto.setDistricId(s.getStatesId());
		districtDto.setDistrictName(s.getDistrictName());
		districtDto.setDistricId(s.getDistrictId());
		return districtDto;
	}

	@Override
	public Districts save(Districts districts) {
		return districtsDao.save(districts);
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		Districts districts = districtsDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
		if (districts != null) {
			districtsDao.delete(districts);
			status = true;
		}
		return status;
	}

	@Override
	public Districts create(Districts district) {

		return districtsDao.save(district);
	}

}

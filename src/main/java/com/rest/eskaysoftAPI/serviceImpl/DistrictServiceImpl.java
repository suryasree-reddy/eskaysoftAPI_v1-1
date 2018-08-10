package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.DistrictsDao;
import com.rest.eskaysoftAPI.dao.StatesDao;
import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.DistrictsDto;
import com.rest.eskaysoftAPI.service.DistrictService;

@Service
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictsDao districtsDao;

	@Autowired
	private StatesDao statesDao;

	@Autowired
	public void setdistrictsDao(DistrictsDao districtsDao) {
		this.districtsDao = districtsDao;
	}

	@Override
	public List<DistrictsDto> listAllDistricts() {
		List<DistrictsDto> districtsList = new ArrayList<>();
		districtsDao.findAllByOrderByDistrictNameAsc().forEach(districts -> {
			DistrictsDto districtsModel = new DistrictsDto();
			BeanUtils.copyProperties(districts, districtsModel);
			districtsModel.setStatesId(districts.getStatesId().getId());
			districtsList.add(districtsModel);
		});

		return districtsList;
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
	public DistrictsDto create(DistrictsDto dischModel) {
		States sts = statesDao.findById(dischModel.getStatesId()).orElseThrow(
				() -> new NotFoundException(String.format("states %d not found", dischModel.getStatesId())));
		Districts districts = new Districts();
		BeanUtils.copyProperties(dischModel, districts);
		districts.setStatesId(sts);
		districts = districtsDao.save(districts);
		dischModel.setDistrictId(districts.getDistrictId());
		return dischModel;
	}

	@Override
	public DistrictsDto save(DistrictsDto dischModel) {
		States sts = statesDao.findById(dischModel.getStatesId()).orElseThrow(
				() -> new NotFoundException(String.format("states %d not found", dischModel.getStatesId())));
		Districts districts = new Districts();
		BeanUtils.copyProperties(dischModel, districts);
		districts.setStatesId(sts);
		districts = districtsDao.save(districts);
		return dischModel;
	}

	@Override
	public DistrictsDto getdistrictsById(Long id) {
		Districts districts = districtsDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
		DistrictsDto disModel = new DistrictsDto();
		BeanUtils.copyProperties(districts, disModel);
		disModel.setStatesId(districts.getStatesId().getId());
		disModel.setDistrictId(districts.getDistrictId());

		return disModel;

	}
}
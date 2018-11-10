package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.DistrictsDto;
import com.rest.eskaysoftAPI.repository.DistrictsRepository;
import com.rest.eskaysoftAPI.repository.StatesRepository;
import com.rest.eskaysoftAPI.service.DistrictService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;

@Service
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictsRepository DisRepo;

	@Autowired
	private StatesRepository statesRepo;

	@Override
	public List<DistrictsDto> listAllDistricts() {
		List<DistrictsDto> districtsList = new ArrayList<>();
		DisRepo.findAllByOrderByDistrictNameAsc().forEach(districts -> {
			DistrictsDto districtsModel = new DistrictsDto();
			BeanUtils.copyProperties(districts, districtsModel);
			districtsModel.setStateName(districts.getStateId().getStateName());
			districtsModel.setStateId(districts.getStateId().getId());
			districtsModel.setTypeheadDisplay(districts.getDistrictName()+EskaysoftConstants.SEPERATOR + districts.getStateId().getStateName());
			districtsList.add(districtsModel);
		});

		return districtsList;
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		Districts districts = DisRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));

		if (districts != null) {
			DisRepo.delete(districts);
			status = true;
		}
		return status;
	}

	@Override
	public DistrictsDto create(DistrictsDto dischModel) {
		States sts = statesRepo.findById(dischModel.getStateId()).orElseThrow(
				() -> new NotFoundException(String.format("states %d not found", dischModel.getStateId())));
		Districts districts = new Districts();
		BeanUtils.copyProperties(dischModel, districts);
		districts.setStateId(sts);
		districts = DisRepo.save(districts);
		dischModel.setId(districts.getId());
		return dischModel;
	}

	@Override
	public DistrictsDto save(DistrictsDto dischModel) {
		States sts = statesRepo.findById(dischModel.getStateId()).orElseThrow(
				() -> new NotFoundException(String.format("states %d not found", dischModel.getStateId())));
		Districts districts = new Districts();
		BeanUtils.copyProperties(dischModel, districts);
		districts.setStateId(sts);
		districts = DisRepo.save(districts);
		return dischModel;
	}

	@Override
	public DistrictsDto getdistrictsById(Long id) {
		Districts districts = DisRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
		DistrictsDto disModel = new DistrictsDto();
		BeanUtils.copyProperties(districts, disModel);
		disModel.setStateId(districts.getStateId().getId());
		disModel.setStateName(districts.getStateId().getStateName());
		return disModel;

	}

}
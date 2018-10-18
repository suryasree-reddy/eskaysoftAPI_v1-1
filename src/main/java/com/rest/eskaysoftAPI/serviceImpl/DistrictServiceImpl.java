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

@Service
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictsRepository DisRepo;

	@Autowired
	private StatesRepository statesRepo;

	@Autowired
	public void setdistrictsDao(DistrictsRepository districtsDao) {
		this.DisRepo = districtsDao;
	}

	@Override
	public List<DistrictsDto> listAllDistricts() {
		List<DistrictsDto> districtsList = new ArrayList<>();
		DisRepo.findAllByOrderByDistrictNameAsc().forEach(districts -> {
			DistrictsDto districtsModel = new DistrictsDto();
			BeanUtils.copyProperties(districts, districtsModel);
			districtsModel.setStateName(districts.getStatesId().getStateName());
			districtsModel.setStatesId(districts.getStatesId().getId());
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
			List<Districts> disList = DisRepo.findByStatesIdId(districts.getStatesId().getId());
			if (null == disList || disList.isEmpty()) {
				States sts = districts.getStatesId();
				sts.setDeleteFlag(true);
				statesRepo.save(sts);
			}
		}
		return status;
	}

	@Override
	public DistrictsDto create(DistrictsDto dischModel) {
		States sts = statesRepo.findById(dischModel.getStatesId()).orElseThrow(
				() -> new NotFoundException(String.format("states %d not found", dischModel.getStatesId())));
		Districts districts = new Districts();
		BeanUtils.copyProperties(dischModel, districts);
		if (sts.getDeleteFlag()) {
			sts.setDeleteFlag(false);
			statesRepo.save(sts);
		}
		districts.setStatesId(sts);
		districts = DisRepo.save(districts);
		dischModel.setId(districts.getId());
		return dischModel;
	}

	@Override
	public DistrictsDto save(DistrictsDto dischModel) {
		States sts = statesRepo.findById(dischModel.getStatesId()).orElseThrow(
				() -> new NotFoundException(String.format("states %d not found", dischModel.getStatesId())));
		Districts districts = new Districts();
		BeanUtils.copyProperties(dischModel, districts);
		if (sts.getDeleteFlag()) {
			sts.setDeleteFlag(false);
			statesRepo.save(sts);
		}
		districts.setStatesId(sts);
		districts = DisRepo.save(districts);
		return dischModel;
	}

	@Override
	public DistrictsDto getdistrictsById(Long id) {
		Districts districts = DisRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
		DistrictsDto disModel = new DistrictsDto();
		BeanUtils.copyProperties(districts, disModel);
		disModel.setStatesId(districts.getStatesId().getId());
		return disModel;

	}

}
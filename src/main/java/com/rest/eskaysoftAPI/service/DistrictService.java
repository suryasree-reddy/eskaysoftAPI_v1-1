package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.DistrictsDto;

public interface DistrictService {

	List<DistrictsDto> listAllDistricts();

	DistrictsDto getdistrictsById(Long id);

	DistrictsDto save(DistrictsDto districts);

	boolean delete(Long id);

	DistrictsDto create(DistrictsDto districts);

}

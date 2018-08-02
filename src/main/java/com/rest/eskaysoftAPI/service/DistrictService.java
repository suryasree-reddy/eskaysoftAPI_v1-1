package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.model.DistrictsDto;

public interface DistrictService {

	List<DistrictsDto> listAllDistricts();

	Districts getdistrictsById(Long id);

	Districts save(Districts districts);

	boolean delete(Long id);

	Districts create(Districts districts);

}

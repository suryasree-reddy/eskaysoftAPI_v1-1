package com.rest.eskaysoftAPI.service;

import java.util.Set;

import com.rest.eskaysoftAPI.dto.DistrictDto;
import com.rest.eskaysoftAPI.entity.Districts;

public interface DistrictService {

	Set<DistrictDto> listAllDistricts();

	DistrictDto getdistrictsById(Long id);

	Districts save(Districts districts);


    boolean delete(Long id);


	Districts create(Districts districts);

}

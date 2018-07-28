package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.Districts;

public interface DistrictService {

	Iterable<Districts> listAllDistricts();

	Districts getdistrictsById(Long id);

	Districts save(Districts districts);


    boolean delete(Long id);


	Districts create(Districts districts);

}

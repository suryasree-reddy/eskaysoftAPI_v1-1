package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.AreaDto;

public interface AreaService {

	List<AreaDto> listAllArea();

	AreaDto getAreaById(Long id);

	AreaDto saveArea(AreaDto area);

	boolean delete(Long id);

	AreaDto create(AreaDto area);

}

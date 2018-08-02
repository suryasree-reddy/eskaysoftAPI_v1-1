package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.model.AreaDto;

public interface AreaService {

	List<AreaDto> listAllArea();

	Area getAreaById(Long id);

	Area saveArea(Area area);

	boolean delete(Long id);

	Area create(Area area);

}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.AreaDao;
import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AreaDto;
import com.rest.eskaysoftAPI.model.DistrictsDto;
import com.rest.eskaysoftAPI.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	private AreaDao areaDao;

	@Autowired
	public void setAreaDao(AreaDao areaDao) {
		this.areaDao = areaDao;
	}

	@Override
	public List<AreaDto> listAllArea() {
		List<AreaDto> areaList = new ArrayList<>();
		areaDao.findAll().forEach(area ->{
			AreaDto areaModel = new AreaDto();	
			BeanUtils.copyProperties(area, areaModel);
			areaList.add(areaModel);
		});
		Collections.sort(areaList);
		return areaList;
	}
	@Override
	public Area getAreaById(Long id) {
		System.out.println("****************" + id);
		return areaDao.findById(id).orElseThrow(() -> new NotFoundException(String.format("area %d not found", id)));

	}

	@Override
	public Area saveArea(Area area) {
		return areaDao.save(area);
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		Area area = areaDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("area %d not found", id)));
		if (area != null) {
			areaDao.delete(area);
			status = true;
		}
		return status;
	}

	@Override
	public Area create(Area area) {

		return areaDao.save(area);
	}

}

package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.AreaDao;
import com.rest.eskaysoftAPI.dao.BusinessExecutiveDao;
import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AreaDto;
import com.rest.eskaysoftAPI.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;

	@Autowired
	private BusinessExecutiveDao businessExecutiveDao;

	@Override
	public List<AreaDto> listAllArea() {
		List<AreaDto> areaList = new ArrayList<>();
		areaDao.findAll().forEach(area -> {

			AreaDto areaModel = new AreaDto();
			BeanUtils.copyProperties(area, areaModel);

			areaModel.setBusinessexecutiveId(area.getBusinessExecutiveId().getId());
			areaList.add(areaModel);
		});
		Collections.sort(areaList);
		return areaList;
	}

	@Override
	public AreaDto getAreaById(Long id) {

		Area area = areaDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("area %d not found", id)));
		if (area != null) {
			AreaDto areaModel = new AreaDto();
			BeanUtils.copyProperties(area, areaModel);
			areaModel.setAreaId(area.getAreaId());
			areaModel.setAreaName(area.getAreaName());
			areaModel.setBusinessexecutiveId(area.getBusinessExecutiveId().getId());
			return areaModel;

		}
		return null;

	}

	@Override
	public AreaDto saveArea(AreaDto areaModel) {
		BusinessExecutive businessexecutive = businessExecutiveDao.findById(areaModel.getBusinessexecutiveId())
				.orElseThrow(() -> new NotFoundException(
						String.format("BusinessExecutive %d not found", areaModel.getBusinessexecutiveId())));
		Area area = new Area();
		BeanUtils.copyProperties(areaModel, area);
		area.setBusinessExecutiveId(businessexecutive);
		area = areaDao.save(area);
		return areaModel;
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
	public AreaDto create(AreaDto areaModel) {
		BusinessExecutive businessexecutive = businessExecutiveDao.findById(areaModel.getBusinessexecutiveId())
				.orElseThrow(() -> new NotFoundException(
						String.format("BusinessExecutive %d not found", areaModel.getBusinessexecutiveId())));
		Area area = new Area();
		BeanUtils.copyProperties(areaModel, area);
		area.setBusinessExecutiveId(businessexecutive);
		area = areaDao.save(area);
		areaModel.setAreaId(area.getAreaId());
		return areaModel;
	}
}

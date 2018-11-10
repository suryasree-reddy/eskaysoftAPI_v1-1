package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AreaDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.AreaRepository;
import com.rest.eskaysoftAPI.repository.BusinessExecutiveRepository;
import com.rest.eskaysoftAPI.service.AreaService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaRepository areaRepository;

	@Autowired
	private BusinessExecutiveRepository busExrepo;

	@Autowired
	private AccountInformationRepository acinfrRepo;
	
	@Override
	public List<AreaDto> listAllArea() {
		List<AreaDto> areaList = new ArrayList<>();
		areaRepository.findAllByOrderByAreaNameAsc().forEach(area -> {
			AreaDto areaModel = new AreaDto();
			BeanUtils.copyProperties(area, areaModel);
			List<AccountInformation> aiList = acinfrRepo.findByareaIdId(area.getId());
			if(null == aiList || aiList.isEmpty()) {
				areaModel.setDeleteFlag(true);
			}
			areaModel.setBusinessExecutiveName(area.getBusinessExecutiveId().getName());
			areaModel.setBusinessExecutiveId(area.getBusinessExecutiveId().getId());
			areaModel.setTypeheadDisplay(area.getAreaName()+EskaysoftConstants.SEPERATOR+area.getBusinessExecutiveId().getName());
			areaList.add(areaModel);
		});

		return areaList;
	}

	@Override
	public AreaDto getAreaById(Long id) {

		Area area = areaRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("area %d not found", id)));
		AreaDto areaModel = new AreaDto();
		BeanUtils.copyProperties(area, areaModel);
		areaModel.setBusinessExecutiveId(area.getBusinessExecutiveId().getId());
		areaModel.setBusinessExecutiveName(area.getBusinessExecutiveId().getName());

		return areaModel;

	}

	@Override
	public AreaDto saveArea(AreaDto areaModel) {
		BusinessExecutive businessexecutive = busExrepo.findById(areaModel.getBusinessExecutiveId())
				.orElseThrow(() -> new NotFoundException(
						String.format("BusinessExecutive %d not found", areaModel.getBusinessExecutiveId())));
		Area area = new Area();
		BeanUtils.copyProperties(areaModel, area);
		area.setBusinessExecutiveId(businessexecutive);
		area = areaRepository.save(area);
		return areaModel;
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		Area area = areaRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("area %d not found", id)));
		if (area != null) {
			areaRepository.delete(area);
			status = true;
		}
		return status;
	}

	@Override
	public AreaDto create(AreaDto areaModel) {
		BusinessExecutive businessexecutive = busExrepo.findById(areaModel.getBusinessExecutiveId())
				.orElseThrow(() -> new NotFoundException(
						String.format("BusinessExecutive %d not found", areaModel.getBusinessExecutiveId())));
		Area area = new Area();
		BeanUtils.copyProperties(areaModel, area);
		area.setBusinessExecutiveId(businessexecutive);
		area = areaRepository.save(area);
		areaModel.setId(area.getId());
		return areaModel;
	}
}

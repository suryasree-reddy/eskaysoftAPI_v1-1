package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ManfacturerDao;
import com.rest.eskaysoftAPI.entity.Manfacturer;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.ManfacturerDto;
import com.rest.eskaysoftAPI.service.ManfacturerService;

@Service
public class ManfacturerServiceImpl implements ManfacturerService {

	private ManfacturerDao manfacturerDao;

	@Autowired
	public void setAccountInformationDao(ManfacturerDao manfacturerDao) {
		this.manfacturerDao = manfacturerDao;
	}

	@Override
	public List<ManfacturerDto> listAllManfacturer() {
		List<ManfacturerDto> manfacturerList = new ArrayList<>();
		manfacturerDao.findAllByOrderByManfacturerNameAsc().forEach(manfacturer -> {
			ManfacturerDto manfacturerModel = new ManfacturerDto();
			BeanUtils.copyProperties(manfacturer, manfacturerModel);
			manfacturerList.add(manfacturerModel);
		});

		return manfacturerList;
	}

	@Override
	public Manfacturer getManfacturerById(Long id) {
		System.out.println("****************" + id);
		return manfacturerDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("manfacturer %d not found", id)));
	}

	@Override
	public Manfacturer save(Manfacturer manfacturer) {
		return manfacturerDao.save(manfacturer);
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		Manfacturer manfacturer = getManfacturerById(id);
		if (manfacturer != null) {
			manfacturerDao.delete(manfacturer);
			status = true;
		}
		return status;
	}

	@Override
	public Manfacturer create(Manfacturer manfacturer) {

		return manfacturerDao.save(manfacturer);
	}

}

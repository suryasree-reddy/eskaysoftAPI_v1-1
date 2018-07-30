package com.rest.eskaysoftAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.DistrictsDao;
import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.DistrictService;

@Service
public class DistrictServiceImpl implements DistrictService {

	private DistrictsDao districtsDao;

	@Autowired
	public void setdistrictsDao(DistrictsDao districtsDao) {
		this.districtsDao = districtsDao;
	}

	@Override
	public Iterable<Districts> listAllDistricts() {
		return districtsDao.findAll();
	}

	@Override
	public Districts save(Districts districts) {
		return districtsDao.save(districts);
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		Districts districts = districtsDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
		if (districts != null) {
			districtsDao.delete(districts);
			status = true;
		}
		return status;
	}

	@Override
	public Districts create(Districts district) {

		return districtsDao.save(district);
	}

	@Override
	public Districts getdistrictsById(Long id) {
		System.out.println("****************" + id);
		return districtsDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
	}

}

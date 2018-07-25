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
	public void setAccountInformationDao(DistrictsDao districtsDao) {
		this.districtsDao = districtsDao;
	}

	@Override
	public Iterable<Districts> listAllDistricts() {
		return districtsDao.findAll();
	}

	@Override
	public Districts getdistrictsById(Long id) {
		System.out.println("****************" + id);
		return districtsDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("districts %d not found", id)));
	}

	@Override
	public Districts save(Districts districts) {
		return districtsDao.save(districts);
	}

	@Override
	public Districts delete(Long id) {
		Districts districts = getdistrictsById(id);
		if (districts != null) {
			districtsDao.delete(districts);
		}
		return districts;
	}

	@Override
	public Districts create(Districts manfacturer) {

		return districtsDao.save(manfacturer);
	}

}

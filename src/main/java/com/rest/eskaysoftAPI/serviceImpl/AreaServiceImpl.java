package com.rest.eskaysoftAPI.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.AreaDao;
import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

    private AreaDao areaDao;

    @Autowired
    public void setAccountInformationDao(AreaDao areaDao) {
        this.areaDao = areaDao;
    }


    @Override
    public Iterable<Area> listAllArea() {
        return areaDao.findAll();
    }

    @Override
	public Area getAreaById(Long id) {
    	System.out.println("****************"+id);
		return areaDao.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("area %d not found", id)));
    }

    @Override
    public Area saveArea(Area area) {
        return areaDao.save(area);
    }

    @Override
    public Area deleteArea(Long id) {
        Area area = getAreaById(id);
        if(area != null){
        	areaDao.delete(area);
        }
        return area;
    }


    @Override
    public Area create(Area area) {

            return areaDao.save(area);
        }


	



	



}

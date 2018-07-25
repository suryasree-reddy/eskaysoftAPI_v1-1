package com.rest.eskaysoftAPI.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.StatesDao;
import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.StatesService;

@Service
public class StatesServiceImpl implements StatesService {

    private StatesDao stateDao;

    @Autowired
    public void setscheduleDao(StatesDao stateDao) {
        this.stateDao = stateDao;
    }


    @Override
    public Iterable<States> listAllStates() {
        return stateDao.findAll();
    }

    @Override
	public States getStateById(Long id) {
    	System.out.println("****************"+id);
		return stateDao.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("state %d not found", id)));
    }

    @Override
    public States saveState(States state) {
        return stateDao.save(state);
    }

    @Override
    public States deleteState(Long id) {
        States state = getStateById(id);
        if(state != null){
        	stateDao.delete(state);
        }
        return state;
    }


    @Override
    public States create(States state) {

            return stateDao.save(state);
        }


}

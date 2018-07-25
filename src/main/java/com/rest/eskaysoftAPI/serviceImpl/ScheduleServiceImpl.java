package com.rest.eskaysoftAPI.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ScheduleDao;
import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private ScheduleDao scheduleDao;

    @Autowired
    public void setscheduleDao(ScheduleDao scheduleDao) {
        this.scheduleDao = scheduleDao;
    }


    @Override
    public Iterable<Schedule> listAllSchedules() {
        return scheduleDao.findAll();
    }

    @Override
	public Schedule getScheduleById(Long id) {
    	System.out.println("****************"+id);
		return scheduleDao.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Schedule %d not found", id)));
    }

    @Override
    public Schedule saveSchedule(Schedule schedule) {
        return scheduleDao.save(schedule);
    }

    @Override
    public Schedule deleteSchedule(Long id) {
        Schedule schedule = getScheduleById(id);
        if(schedule != null){
            scheduleDao.delete(schedule);
        }
        return schedule;
    }


    @Override
    public Schedule create(Schedule schedule) {

            return scheduleDao.save(schedule);
        }


}

package com.rest.eskaysoftAPI.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.service.ScheduleService;

@Resource(name = "schedules")
@Path("/schedules")
public class ScheduleResource {
	private static final Logger logger = LoggerFactory.getLogger(ScheduleResource.class);

	@Autowired
    ScheduleService scheduleService;

	@GET
	@Produces("application/json")
    public Iterable<Schedule> findAll(){
		logger.info("findAll schedules");
        return scheduleService.listAllSchedules();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Schedule findOne(@PathParam("id") long id){
        return scheduleService.getScheduleById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Schedule create(@RequestBody Schedule schedule){
        return scheduleService.create(schedule);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Schedule update(@RequestBody Schedule schedule){
        return scheduleService.saveSchedule(schedule);
    }


    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return scheduleService.deleteSchedule(id);
    }


}
package com.rest.eskaysoftAPI.resource;

import java.util.Set;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.dto.SubScheduleDto;
import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.service.SubScheduleService;

@Resource(name = "subschedules")
@Path("/subschedules")
public class SubScheduleResource {

	@Autowired
    SubScheduleService subscheduleService;

	@GET
	@Produces("application/json")
    public Set<SubScheduleDto> findAll(){
        return subscheduleService.listAllSubSchedules();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public SubScheduleDto findOne(@PathParam("id") long id){
        return subscheduleService.getSubScheduleById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public SubSchedule create(@RequestBody SubSchedule subschedule){
        return subscheduleService.create(subschedule);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public SubSchedule update(@RequestBody SubSchedule subschedule){
        return subscheduleService.saveSubSchedule(subschedule);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return subscheduleService.deleteSubSchedule(id);
    }

}
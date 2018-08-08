package com.rest.eskaysoftAPI.resource;

import java.util.List;

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

import com.rest.eskaysoftAPI.model.SubScheduleDto;
import com.rest.eskaysoftAPI.service.SubScheduleService;

@Resource(name = "subschedules")
@Path("/subschedules")
public class SubScheduleResource {

	@Autowired
	SubScheduleService subscheduleService;

	@GET
	@Produces("application/json")
	public List<SubScheduleDto> findAll() {
		return subscheduleService.listAllSubSchedules();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public SubScheduleDto findOne(@PathParam("id") long id) {
		return subscheduleService.getSubScheduleById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public SubScheduleDto create(@RequestBody SubScheduleDto subschedule) {
		return subscheduleService.create(subschedule);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public SubScheduleDto update(@RequestBody SubScheduleDto subschedule) {
		return subscheduleService.saveSubSchedule(subschedule);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return subscheduleService.deleteSubSchedule(id);
	}

}
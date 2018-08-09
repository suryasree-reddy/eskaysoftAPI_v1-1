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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.model.SubScheduleDto;
import com.rest.eskaysoftAPI.service.SubScheduleService;

@Resource(name = "subschedules")
@Path("/subschedules")
public class SubScheduleResource {
	private static final Logger logger = LoggerFactory.getLogger(SubScheduleResource.class);

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
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return subscheduleService.getSubScheduleById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public SubScheduleDto create(@RequestBody SubScheduleDto subschedule) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted Schedule = " + subschedule.getSubScheduleName());
		}
		return subscheduleService.create(subschedule);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public SubScheduleDto update(@RequestBody SubScheduleDto subschedule) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted subschedule = " + subschedule.getScheduleId());
		}
		return subscheduleService.saveSubSchedule(subschedule);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return subscheduleService.deleteSubSchedule(id);
	}

}
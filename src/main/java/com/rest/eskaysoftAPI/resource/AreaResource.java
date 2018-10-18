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

import com.rest.eskaysoftAPI.model.AreaDto;
import com.rest.eskaysoftAPI.service.AreaService;

@Resource(name = "area")
@Path("/area")
public class AreaResource {
	private static final Logger logger = LoggerFactory.getLogger(AreaResource.class);

	@Autowired
	AreaService areaService;

	@GET
	@Produces("application/json")
	public List<AreaDto> findAll() {
		return areaService.listAllArea();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public AreaDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return areaService.getAreaById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public AreaDto create(@RequestBody AreaDto area) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted Area = " + area.getAreaName());
		}
		return areaService.create(area);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public AreaDto update(@RequestBody AreaDto area) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted Area = " + area.getId());
		}
		return areaService.saveArea(area);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return areaService.delete(id);
	}

}
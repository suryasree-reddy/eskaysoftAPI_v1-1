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

import com.rest.eskaysoftAPI.model.DistrictsDto;
import com.rest.eskaysoftAPI.service.DistrictService;

@Resource(name = "districts")
@Path("/districts")
public class DistrictsResource {
	private static final Logger logger = LoggerFactory.getLogger(DistrictsResource.class);

	@Autowired
	DistrictService districtService;

	@GET
	@Produces("application/json")
	public List<DistrictsDto> findAll() {
		logger.info("findAll districs");
		return districtService.listAllDistricts();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public DistrictsDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return districtService.getdistrictsById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public DistrictsDto create(@RequestBody DistrictsDto districs) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted districs = " + districs.getDistrictName());
		}
		return districtService.create(districs);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public DistrictsDto update(@RequestBody DistrictsDto districs) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted districs = " + districs.getId());
		}
		return districtService.save(districs);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return districtService.delete(id);
	}

}
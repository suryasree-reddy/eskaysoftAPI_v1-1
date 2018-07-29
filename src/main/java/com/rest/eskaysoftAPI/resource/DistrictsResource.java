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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.dto.DistrictDto;
import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.service.DistrictService;

@Resource(name = "districts")
@Path("/districts")
public class DistrictsResource {
	private static final Logger logger = LoggerFactory.getLogger(DistrictsResource.class);

	@Autowired
	DistrictService districtService;

	@GET
	@Produces("application/json")
	public Set<DistrictDto> findAll() {
		logger.info("findAll districs");
		return districtService.listAllDistricts();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public DistrictDto findOne(@PathParam("id") long id) {
		return districtService.getdistrictsById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Districts create(@RequestBody Districts districs) {
		return districtService.create(districs);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Districts update(@RequestBody Districts districs) {
		return districtService.save(districs);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return districtService.delete(id);
	}

}
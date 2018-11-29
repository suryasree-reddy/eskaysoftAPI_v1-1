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

import com.rest.eskaysoftAPI.model.GSTChallanEntryDto;
import com.rest.eskaysoftAPI.service.GSTChallanService;

@Resource(name = "gSTChallan")
@Path("/gSTChallan")
public class GSTChallanResource {
	private static final Logger logger = LoggerFactory.getLogger(GSTChallanResource.class);

	@Autowired
	GSTChallanService gstChallanService;

	@GET
	@Produces("application/json")
	public List<GSTChallanEntryDto> findAll() {
		logger.info("findAll GSTChallan");
		return gstChallanService.listAllGSTChallan();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public GSTChallanEntryDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return gstChallanService.getGSTChallanById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public GSTChallanEntryDto create(@RequestBody GSTChallanEntryDto gstChallan) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted gstChallan = " + gstChallan.getProductName());
		}
		return gstChallanService.create(gstChallan);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public GSTChallanEntryDto update(@RequestBody GSTChallanEntryDto gstChallan) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted gstChallan = " + gstChallan.getId());
		}
		return gstChallanService.save(gstChallan);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return gstChallanService.delete(id);
	}

}
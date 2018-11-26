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

import com.rest.eskaysoftAPI.model.InternalStockAdjustmentsDto;
import com.rest.eskaysoftAPI.service.InternalStockAdjustmentsService;

@Resource(name = "internalStockAdjustments")
@Path("/internalStockAdjustments")
public class InternalStockAdjustmentsResource {
	private static final Logger logger = LoggerFactory.getLogger(InternalStockAdjustmentsResource.class);

	@Autowired
	InternalStockAdjustmentsService internalStockAdjustmentsService;

	@GET
	@Produces("application/json")
	public List<InternalStockAdjustmentsDto> findAll() {
		logger.info("findAll InternalStockAdjustments");
		return internalStockAdjustmentsService.listAllInternalStockAdjustments();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public InternalStockAdjustmentsDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return internalStockAdjustmentsService.getInternalStockAdjustmentsById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public InternalStockAdjustmentsDto create(@RequestBody InternalStockAdjustmentsDto internalStockAdjustments) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted InternalStockAdjustments = " + internalStockAdjustments.getNumber());
		}
		return internalStockAdjustmentsService.create(internalStockAdjustments);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public InternalStockAdjustmentsDto update(@RequestBody InternalStockAdjustmentsDto internalStockAdjustments) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted internalStockAdjustments = " + internalStockAdjustments.getId());
		}
		return internalStockAdjustmentsService.save(internalStockAdjustments);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return internalStockAdjustmentsService.delete(id);
	}

}
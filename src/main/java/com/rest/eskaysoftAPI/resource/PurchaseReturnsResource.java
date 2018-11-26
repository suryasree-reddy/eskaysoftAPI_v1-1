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

import com.rest.eskaysoftAPI.model.PurchaseReturnsDto;
import com.rest.eskaysoftAPI.service.PurchaseReturnsService;

@Resource(name = "purchaseReturns")
@Path("/purchaseReturns")
public class PurchaseReturnsResource {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleResource.class);

	@Autowired
	PurchaseReturnsService purchaseReturnsService;

	@GET
	@Produces("application/json")
	public List<PurchaseReturnsDto> findAll() {
		return purchaseReturnsService.listAllpurchaseReturns();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public PurchaseReturnsDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return purchaseReturnsService.getpurchaseReturnsById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public PurchaseReturnsDto create(@RequestBody PurchaseReturnsDto purchaseReturns) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted purchaseReturns = " + purchaseReturns.getPurReturnNumber());
		}
		return purchaseReturnsService.create(purchaseReturns);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public PurchaseReturnsDto update(@RequestBody PurchaseReturnsDto purchaseReturns) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted purchaseReturns = " + purchaseReturns.getId());
		}
		return purchaseReturnsService.savePurchaseReturns(purchaseReturns);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return purchaseReturnsService.deletePurchaseReturns(id);
	}

}

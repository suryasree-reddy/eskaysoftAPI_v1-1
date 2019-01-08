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

import com.rest.eskaysoftAPI.model.SalesReturnsDto;
import com.rest.eskaysoftAPI.service.SalesReturnsService;

@Resource(name = "salesReturns")
@Path("/salesReturns")
public class SalesReturnsResource {
	private static final Logger logger = LoggerFactory.getLogger(SalesReturnsResource.class);

	@Autowired
	SalesReturnsService salesReturnsService;

	@GET
	@Produces("application/json")
	public List<SalesReturnsDto> findAll() {
		return salesReturnsService.listAllSalesReturns();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public SalesReturnsDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return salesReturnsService.getSalesReturnsById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public SalesReturnsDto createSalesReturns(@RequestBody SalesReturnsDto SalesReturns) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted SalesReturns = " + SalesReturns.getProductName());
		}
		return salesReturnsService.createSalesReturns(SalesReturns);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public SalesReturnsDto saveSalesReturns(@RequestBody SalesReturnsDto SalesReturns) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted SalesReturns = " + SalesReturns.getId());
		}
		return salesReturnsService.saveSalesReturns(SalesReturns);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean deleteSalesReturns(@PathParam("id") long id) {
		return salesReturnsService.deleteSalesReturns(id);
	}

	@DELETE
	@Path("returnNo/{id}")
	@Produces("application/json")
	public boolean deleteSalesReturnsBysalesReturnNo(@PathParam("id") int id) {
		return salesReturnsService.deleteSalesReturnsBysalesReturnNo(id);
	}
}

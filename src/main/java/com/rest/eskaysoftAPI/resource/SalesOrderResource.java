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

import com.rest.eskaysoftAPI.model.SalesOrderDto;
import com.rest.eskaysoftAPI.service.SalesOrderService;

@Resource(name = "salesOrder")
@Path("/salesOrder")
public class SalesOrderResource {
	private static final Logger logger = LoggerFactory.getLogger(SalesOrderResource.class);

	@Autowired
	SalesOrderService salesOderService;

	@GET
	@Produces("application/json")
	public List<SalesOrderDto> findAll() {
		logger.info("findAll SalesOrder");
		return salesOderService.listAllSalesOrder();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public SalesOrderDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return salesOderService.getSalesOrderById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public SalesOrderDto create(@RequestBody SalesOrderDto sales) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted SalesOrder = " + sales.getProductName());
		}
		return salesOderService.create(sales);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public SalesOrderDto update(@RequestBody SalesOrderDto sales) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted salesOder = " + sales.getId());
		}
		return salesOderService.save(sales);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return salesOderService.delete(id);
	}

}
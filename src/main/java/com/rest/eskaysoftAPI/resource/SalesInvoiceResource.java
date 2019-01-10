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

import com.rest.eskaysoftAPI.model.SalesInvoiceDto;
import com.rest.eskaysoftAPI.service.SalesInvoiceService;

@Resource(name = "salesInvoice")
@Path("/salesInvoice")
public class SalesInvoiceResource {
	private static final Logger logger = LoggerFactory.getLogger(GSTChallanResource.class);

	@Autowired
	SalesInvoiceService salesInvoiceService;

	@GET
	@Produces("application/json")
	public List<SalesInvoiceDto> findAll() {
		logger.info("findAll GSTChallan");
		return salesInvoiceService.listAllSalesInvoice();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public SalesInvoiceDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return salesInvoiceService.getSalesInvoiceById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public SalesInvoiceDto create(@RequestBody SalesInvoiceDto inv) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted gstChallan = " + inv.getProductName());
		}
		return salesInvoiceService.create(inv);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public SalesInvoiceDto update(@RequestBody SalesInvoiceDto inv) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted gstChallan = " + inv.getId());
		}
		return salesInvoiceService.save(inv);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return salesInvoiceService.delete(id);
	}

	@DELETE
	@Path("dcno/{id}")
	@Produces("application/json")
	public boolean deleteSalesInvoiceByOrderNum(@PathParam("id") int id) {
		return salesInvoiceService.deleteSalesInvoiceByOrderNum(id);
	}
}
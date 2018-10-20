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

import com.rest.eskaysoftAPI.entity.Tax;
import com.rest.eskaysoftAPI.model.TaxDto;
import com.rest.eskaysoftAPI.service.TaxService;

@Resource(name = "tax")
@Path("/tax")
public class TaxResource {
	private static final Logger logger = LoggerFactory.getLogger(TaxResource.class);

	@Autowired
	TaxService taxService;

	@GET
	@Produces("application/json")
	public List<TaxDto> findAll() {
		return taxService.listAllTaxs();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Tax findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return taxService.getTaxById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Tax create(@RequestBody Tax Tax) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted Tax = " );
		}
		return taxService.create(Tax);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Tax update(@RequestBody Tax Tax) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted Tax = " + Tax.getId());
		}
		return taxService.saveTax(Tax);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return taxService.deleteTax(id);
	}

}
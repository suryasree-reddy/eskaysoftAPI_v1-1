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

import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.model.BusinessExecutiveDto;
import com.rest.eskaysoftAPI.service.BusinessExecutiveService;

@Resource(name = "businessexecutive")
@Path("/businessexecutive")
public class BusinessExecutiveResource {
	private static final Logger logger = LoggerFactory.getLogger(BusinessExecutiveResource.class);


	@Autowired
	BusinessExecutiveService bankInformationService;

	@GET
	@Produces("application/json")
	public List<BusinessExecutiveDto> findAll() {
		return bankInformationService.listAllBusinessExecutive();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public BusinessExecutive findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return bankInformationService.getBusinessExecutiveById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public BusinessExecutive create(@RequestBody BusinessExecutive businessexecutive) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted Bankinformation = " + businessexecutive.getName());
		}
		return bankInformationService.create(businessexecutive);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public BusinessExecutive update(@RequestBody BusinessExecutive businessexecutive) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted BusinessExecutive = " + businessexecutive.getId());
		}
		return bankInformationService.saveBusinessExecutive(businessexecutive);
	}

    @DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return bankInformationService.deleteBusinessExecutive(id);
	}


}
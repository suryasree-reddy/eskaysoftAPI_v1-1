package com.rest.eskaysoftAPI.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.service.BusinessExecutiveService;

@Resource(name = "businessexecutive")
@Path("/businessexecutive")
public class BusinessExecutiveResource {

	@Autowired
	BusinessExecutiveService bankInformationService;

	@GET
	@Produces("application/json")
	public Iterable<BusinessExecutive> findAll() {
		return bankInformationService.listAllBusinessExecutive();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public BusinessExecutive findOne(@PathParam("id") long id) {
		return bankInformationService.getBusinessExecutiveById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public BusinessExecutive create(@RequestBody BusinessExecutive bankinformation) {
		return bankInformationService.create(bankinformation);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public BusinessExecutive update(@RequestBody BusinessExecutive bankinformation) {
		return bankInformationService.saveBusinessExecutive(bankinformation);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public BusinessExecutive delete(@PathParam("id") long id) {
		return bankInformationService.deleteBusinessExecutive(id);
	}

}
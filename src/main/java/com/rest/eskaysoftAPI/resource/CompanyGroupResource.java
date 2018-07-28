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

import com.rest.eskaysoftAPI.entity.CompanyGroup;
import com.rest.eskaysoftAPI.service.CompanyGroupService;

@Resource(name = "companygroup")
@Path("/companygroup")
public class CompanyGroupResource {

	@Autowired
	CompanyGroupService companyGroupService;

	@GET
	@Produces("application/json")
	public Iterable<CompanyGroup> findAll() {
		return companyGroupService.listAllCompanygroup();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public CompanyGroup findOne(@PathParam("id") long id) {
		return companyGroupService.getCompanygroupById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public CompanyGroup create(@RequestBody CompanyGroup bankinformation) {
		return companyGroupService.create(bankinformation);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public CompanyGroup update(@RequestBody CompanyGroup bankinformation) {
		return companyGroupService.saveCompanygroup(bankinformation);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return companyGroupService.deleteCompanygroup(id);
	}

}
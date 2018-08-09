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

import com.rest.eskaysoftAPI.model.CompanyDto;
import com.rest.eskaysoftAPI.service.CompanyService;

@Resource(name = "company")
@Path("/company")
public class CompanyResource {
	private static final Logger logger = LoggerFactory.getLogger(CompanyResource.class);

	@Autowired
	CompanyService companyService;

	@GET
	@Produces("application/json")
	public List<CompanyDto> findAll() {
		return companyService.listAllCompany();
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public CompanyDto create(@RequestBody CompanyDto company) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted company = " + company.getCompanyName());
		}
		
		return companyService.create(company);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public CompanyDto update(@RequestBody CompanyDto company) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted company = " + company.getCompanyName());
		}
		return companyService.save(company);
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public CompanyDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return companyService.getCompanyById(id);

	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return companyService.deleteCompany(id);
	}

}
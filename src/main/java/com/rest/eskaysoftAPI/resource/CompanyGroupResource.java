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

import com.rest.eskaysoftAPI.entity.CompanyGroup;
import com.rest.eskaysoftAPI.model.CompanyGroupDto;
import com.rest.eskaysoftAPI.service.CompanyGroupService;

@Resource(name = "companygroup")
@Path("/companygroup")
public class CompanyGroupResource {
	private static final Logger logger = LoggerFactory.getLogger(CompanyGroupResource.class);


	@Autowired
	CompanyGroupService companyGroupService;

	@GET
	@Produces("application/json")
	public List<CompanyGroupDto> findAll() {
		return companyGroupService.listAllCompanygroup();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public CompanyGroup findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return companyGroupService.getCompanygroupById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public CompanyGroup create(@RequestBody CompanyGroup companygroup) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted companygroup = " + companygroup.getCompanyGroup());
		}
		return companyGroupService.create(companygroup);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public CompanyGroup update(@RequestBody CompanyGroup companygroup) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted companygroup = " + companygroup.getId());
		}
		return companyGroupService.saveCompanygroup(companygroup);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return companyGroupService.deleteCompanygroup(id);
	}

}
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

import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.service.CompanyService;

@Resource(name = "company")
@Path("/company")
public class CompanyResource {

	@Autowired
	CompanyService companyService;

	@GET
	@Produces("application/json")
	public Iterable<Company> findAll() {
		return companyService.listAllCompany();
	}

	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Company create(@RequestBody Company company) {
		return companyService.create(company);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Company update(@RequestBody Company company) {
		return companyService.save(company);
	}
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Company findOne(@PathParam("id") long id){
        return companyService.getCompanyById(id);

    }
	 @DELETE
	    @Path("/{id}")
	    @Produces("application/json")
	    public Company delete(@PathParam("id") long id)
	    {
	        return companyService.deleteCompany(id);
	    }
}
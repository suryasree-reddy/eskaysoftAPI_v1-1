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

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.service.AccountInformationService;

@Resource(name = "accountinformation")
@Path("/accountinformation")
public class AccountInformationResource {

	@Autowired
	AccountInformationService accountInformationService;

	@GET
	@Produces("application/json")
	public Iterable<AccountInformation> findAll() {
		return accountInformationService.listAllAccountInformation();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public AccountInformation findOne(@PathParam("id") long id) {
		return accountInformationService.getAccountInformationById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public AccountInformation create(@RequestBody AccountInformation accountInformation) {
		return accountInformationService.create(accountInformation);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public AccountInformation update(@RequestBody AccountInformation accountInformation) {
		return accountInformationService.saveAccountInformation(accountInformation);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public AccountInformation delete(@PathParam("id") long id) {
		return accountInformationService.deleteAccountInformation(id);
	}

}
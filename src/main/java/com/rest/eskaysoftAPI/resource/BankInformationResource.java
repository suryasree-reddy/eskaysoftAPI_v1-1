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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.entity.BankInformation;
import com.rest.eskaysoftAPI.model.BankInformationDto;
import com.rest.eskaysoftAPI.service.BankInformationService;

@Resource(name = "bankinformation")
@Path("/bankinformation")
public class BankInformationResource {

	@Autowired
	BankInformationService bankInformationService;

	@GET
	@Produces("application/json")
	public List<BankInformationDto> findAll() {
		return bankInformationService.listAllBankInformation();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public BankInformation findOne(@PathParam("id") long id) {
		return bankInformationService.getbankinformationById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public BankInformation create(@RequestBody BankInformation bankinformation) {
		return bankInformationService.create(bankinformation);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public BankInformation update(@RequestBody BankInformation bankinformation) {
		return bankInformationService.savebankinformation(bankinformation);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return bankInformationService.deletebankinformation(id);
	}

}
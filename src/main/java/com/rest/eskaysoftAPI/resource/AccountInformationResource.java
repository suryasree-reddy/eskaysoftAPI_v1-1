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

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.model.AccountInformationDto;
import com.rest.eskaysoftAPI.service.AccountInformationService;

@Resource(name = "accountinformation")
@Path("/accountinformation")
public class AccountInformationResource {
	private static final Logger logger = LoggerFactory.getLogger(AccountInformationResource.class);

	@Autowired
	AccountInformationService accountInformationService;

	@GET
	@Produces("application/json")
	public List<AccountInformationDto> findAll() {
		return accountInformationService.listAllAccountInformation();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public AccountInformation findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return accountInformationService.getAccountInformationById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public AccountInformation create(@RequestBody AccountInformation accountInformation) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted AccountInformation = " + accountInformation.getAccountName());
		}
		return accountInformationService.create(accountInformation);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public AccountInformation update(@RequestBody AccountInformation accountInformation) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted AccountInformation = " + accountInformation.getId());
		}
		return accountInformationService.saveAccountInformation(accountInformation);
	}

    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return accountInformationService.deleteAccountInformation(id);
    }
}
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

import com.rest.eskaysoftAPI.entity.AccountOpenings;
import com.rest.eskaysoftAPI.model.AccountOpeningsDto;
import com.rest.eskaysoftAPI.service.AccountOpeningsService;

@Resource(name = "accountopenings")
@Path("/accountopenings")
public class AccountOpeningsResource {
	private static final Logger logger = LoggerFactory.getLogger(AccountOpeningsResource.class);


	@Autowired
	AccountOpeningsService accountOpeningsService;

	@GET
	@Produces("application/json")
    public List<AccountOpeningsDto> findAll(){
        return accountOpeningsService.listAllAccountOpenings();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public AccountOpenings findOne(@PathParam("id") long id){
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
        return accountOpeningsService.getAccountOpeningsById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public AccountOpenings create(@RequestBody AccountOpenings accountopenings){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted AccountOpenings = " + accountopenings.getAccountName());
		}
        return accountOpeningsService.create(accountopenings);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public AccountOpenings update(@RequestBody AccountOpenings accountopenings){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted AccountOpenings = " + accountopenings.getId());
		}
        return accountOpeningsService.saveAccountOpenings(accountopenings);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return accountOpeningsService.deleteAccountOpenings(id);
    }

}
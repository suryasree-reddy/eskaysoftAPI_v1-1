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

import com.rest.eskaysoftAPI.entity.AccountOpenings;
import com.rest.eskaysoftAPI.service.AccountOpeningsService;

@Resource(name = "accountopenings")
@Path("/accountopenings")
public class AccountOpeningsResource {

	@Autowired
	AccountOpeningsService accountOpeningsService;

	@GET
	@Produces("application/json")
    public Iterable<AccountOpenings> findAll(){
        return accountOpeningsService.listAllAccountOpenings();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public AccountOpenings findOne(@PathParam("id") long id){
        return accountOpeningsService.getAccountOpeningsById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public AccountOpenings create(@RequestBody AccountOpenings accountopenings){
        return accountOpeningsService.create(accountopenings);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public AccountOpenings update(@RequestBody AccountOpenings accountopenings){
        return accountOpeningsService.saveAccountOpenings(accountopenings);
    }
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public AccountOpenings delete(@PathParam("id") long id)
    {
        return accountOpeningsService.deleteAccountOpenings(id);
    }


}
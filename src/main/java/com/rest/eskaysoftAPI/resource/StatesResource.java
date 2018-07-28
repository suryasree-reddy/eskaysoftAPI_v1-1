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

import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.service.StatesService;

@Resource(name = "states")
@Path("/states")
public class StatesResource {

	@Autowired
    StatesService stateService;

	@GET
	@Produces("application/json")
    public Iterable<States> findAll(){
        return stateService.listAllStates();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public States findOne(@PathParam("id") long id){
        return stateService.getStateById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public States create(@RequestBody States State){
        return stateService.create(State);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public States update(@RequestBody States State){
        return stateService.saveState(State);
    }
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return stateService.deleteState(id);
    }


}
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

import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.model.StatesDto;
import com.rest.eskaysoftAPI.service.StatesService;

@Resource(name = "states")
@Path("/states")
public class StatesResource {
	private static final Logger logger = LoggerFactory.getLogger(StatesResource.class);

	@Autowired
    StatesService stateService;

	@GET
	@Produces("application/json")
    public List<StatesDto> findAll(){
        return stateService.listAllStates();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public States findOne(@PathParam("id") long id){
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
        return stateService.getStateById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public States create(@RequestBody States State){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted State = " + State.getStateName());
		}
        return stateService.create(State);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public States update(@RequestBody States State){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted State = " + State.getId());
		}
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
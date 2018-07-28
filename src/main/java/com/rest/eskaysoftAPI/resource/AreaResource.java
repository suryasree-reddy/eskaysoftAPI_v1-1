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

import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.service.AreaService;

@Resource(name = "area")
@Path("/area")
public class AreaResource {

	@Autowired
    AreaService areaService;

	@GET
	@Produces("application/json")
    public Iterable<Area> findAll(){
        return areaService.listAllArea();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Area findOne(@PathParam("id") long id){
        return areaService.getAreaById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Area create(@RequestBody Area area){
        return areaService.create(area);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Area update(@RequestBody Area area){
        return areaService.saveArea(area);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return areaService.deleteArea(id);
    }

}
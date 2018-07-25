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

import com.rest.eskaysoftAPI.entity.Manfacturer;
import com.rest.eskaysoftAPI.service.ManfacturerService;

@Resource(name = "manfacturer")
@Path("/manfacturer")
public class ManfacturerResource {

	@Autowired
    ManfacturerService manfacturerService;

	@GET
	@Produces("application/json")
    public Iterable<Manfacturer> findAll(){
        return manfacturerService.listAllManfacturer();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Manfacturer findOne(@PathParam("id") long id){
        return manfacturerService.getManfacturerById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Manfacturer create(@RequestBody Manfacturer manfacturer){
        return manfacturerService.create(manfacturer);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Manfacturer update(@RequestBody Manfacturer manfacturer){
        return manfacturerService.save(manfacturer);
    }
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public Manfacturer deletemanfacturer(@PathParam("id") long id)
    {
        return manfacturerService.delete(id);
    }


}
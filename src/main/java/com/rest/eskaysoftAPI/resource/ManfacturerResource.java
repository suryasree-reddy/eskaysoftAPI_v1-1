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

import com.rest.eskaysoftAPI.entity.Manfacturer;
import com.rest.eskaysoftAPI.model.ManfacturerDto;
import com.rest.eskaysoftAPI.service.ManfacturerService;

@Resource(name = "manfacturer")
@Path("/manfacturer")
public class ManfacturerResource {
	private static final Logger logger = LoggerFactory.getLogger(ManfacturerResource.class);

	@Autowired
    ManfacturerService manfacturerService;

	@GET
	@Produces("application/json")
    public List<ManfacturerDto> findAll(){
        return manfacturerService.listAllManfacturer();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Manfacturer findOne(@PathParam("id") long id){
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
        return manfacturerService.getManfacturerById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Manfacturer create(@RequestBody Manfacturer manfacturer){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted manfacturer = " + manfacturer.getManfacturerName());
		}
        return manfacturerService.create(manfacturer);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Manfacturer update(@RequestBody Manfacturer manfacturer){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted manfacturer = " + manfacturer.getId());
		}
        return manfacturerService.save(manfacturer);
    }
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return manfacturerService.delete(id);
    }


}
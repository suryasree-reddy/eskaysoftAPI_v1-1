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

import com.rest.eskaysoftAPI.entity.ProductGroup;
import com.rest.eskaysoftAPI.model.ProductGroupDto;
import com.rest.eskaysoftAPI.service.ProductGroupService;

@Resource(name = "productgroup")
@Path("/productgroup")
public class ProductGroupResource {
	private static final Logger logger = LoggerFactory.getLogger(ProductGroupResource.class);

	@Autowired
	ProductGroupService productGroupService;

	@GET
	@Produces("application/json")
    public List<ProductGroupDto> findAll(){
        return productGroupService.listAllProductGroups();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public ProductGroup findOne(@PathParam("id") long id){
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
        return productGroupService.getProductGroupById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ProductGroup create(@RequestBody ProductGroup productgroup){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted productgroup = " + productgroup.getProductGroupName());
		}
        return productGroupService.create(productgroup);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public ProductGroup update(@RequestBody ProductGroup productgroup){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted productgroup = " + productgroup.getId());
		}
        return productGroupService.saveProductGroup(productgroup);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return productGroupService.deleteProductGroup(id);
    }


}
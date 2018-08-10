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

import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.model.ProductDto;
import com.rest.eskaysoftAPI.service.ProductService;

@Resource(name = "product")
@Path("/product")
public class ProductResource {
	private static final Logger logger = LoggerFactory.getLogger(ProductResource.class);

	@Autowired
    ProductService productService;

	@GET
	@Produces("application/json")
    public List<ProductDto> findAll(){
        return productService.listAllProduct();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Product findOne(@PathParam("id") long id){
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
        return productService.getProductById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Product create(@RequestBody Product product){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted product = " + product.getName());
		}
        return productService.create(product);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Product update(@RequestBody Product product){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted product = " + product.getId());
		}
        return productService.saveProduct(product);
    }


    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return productService.deleteProduct(id);
    }


}
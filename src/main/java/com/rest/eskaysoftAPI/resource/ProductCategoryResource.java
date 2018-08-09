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

import com.rest.eskaysoftAPI.entity.ProductCategory;
import com.rest.eskaysoftAPI.model.ProductCategoryDto;
import com.rest.eskaysoftAPI.service.ProductCategoryService;

@Resource(name = "productcategory")
@Path("/productcategory")
public class ProductCategoryResource {
	private static final Logger logger = LoggerFactory.getLogger(ProductCategoryResource.class);


	@Autowired
	ProductCategoryService productcategoryService;

	@GET
	@Produces("application/json")
    public List<ProductCategoryDto> findAll(){
        return productcategoryService.listAllProductcategories();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public ProductCategory findOne(@PathParam("id") long id){
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
        return productcategoryService.getProductCategoryById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ProductCategory create(@RequestBody ProductCategory productcategory){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted productcategory = " + productcategory.getProductCategoryName());
		}
        return productcategoryService.create(productcategory);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public ProductCategory update(@RequestBody ProductCategory productcategory){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted productcategory = " + productcategory.getProductCategoryId());
		}
        return productcategoryService.saveProductCategory(productcategory);
    }
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return productcategoryService.deleteProductCategory(id);
    }


}
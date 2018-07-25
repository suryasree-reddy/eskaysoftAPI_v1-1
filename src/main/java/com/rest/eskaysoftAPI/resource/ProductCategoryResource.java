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

import com.rest.eskaysoftAPI.entity.ProductCategory;
import com.rest.eskaysoftAPI.service.ProductCategoryService;

@Resource(name = "productcategory")
@Path("/productcategory")
public class ProductCategoryResource {

	@Autowired
	ProductCategoryService productcategoryService;

	@GET
	@Produces("application/json")
    public Iterable<ProductCategory> findAll(){
        return productcategoryService.listAllProductcategories();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public ProductCategory findOne(@PathParam("id") long id){
        return productcategoryService.getProductCategoryById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ProductCategory create(@RequestBody ProductCategory productcategory){
        return productcategoryService.create(productcategory);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public ProductCategory update(@RequestBody ProductCategory productcategory){
        return productcategoryService.saveProductCategory(productcategory);
    }
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public ProductCategory delete(@PathParam("id") long id)
    {
        return productcategoryService.deleteProductCategory(id);
    }


}
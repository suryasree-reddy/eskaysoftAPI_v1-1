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

import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.model.CustomerWiseDiscountsDto;
import com.rest.eskaysoftAPI.service.CustomerWiseDiscountsService;

@Resource(name = "customerwisediscount")
@Path("/customerwisediscount")
public class CustomerWiseDiscountsResource {
	private static final Logger logger = LoggerFactory.getLogger(CustomerWiseDiscountsResource.class);
	
	@Autowired
	CustomerWiseDiscountsService customerWiseDiscountsService;

	@GET
	@Produces("application/json")
    public List<CustomerWiseDiscountsDto> findAll(){
        return customerWiseDiscountsService.listAllCustomerWiseDiscounts();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public CustomerWiseDiscounts findOne(@PathParam("id") long id){
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
        return customerWiseDiscountsService.getCustomerWiseDiscountsById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public CustomerWiseDiscounts create(@RequestBody CustomerWiseDiscounts customerWiseDiscounts){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted customerWiseDiscounts = " + customerWiseDiscounts.getId());
		}
        return customerWiseDiscountsService.create(customerWiseDiscounts);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public CustomerWiseDiscounts update(@RequestBody CustomerWiseDiscounts customerWiseDiscounts){
    	if (logger.isDebugEnabled()) {
			logger.debug("Requsted customerWiseDiscounts = " + customerWiseDiscounts.getId());
		}
        return customerWiseDiscountsService.saveCustomerWiseDiscounts(customerWiseDiscounts);
    }


    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean deleteCustomerWiseDiscounts(@PathParam("id") long id)
    {
        return customerWiseDiscountsService.deleteCustomerWiseDiscounts(id);
    }



}
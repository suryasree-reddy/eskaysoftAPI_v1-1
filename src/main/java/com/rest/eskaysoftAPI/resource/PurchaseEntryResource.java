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

import com.rest.eskaysoftAPI.entity.PurchaseEntry;
import com.rest.eskaysoftAPI.service.PurchaseEntryService;

@Resource(name = "purchaseentry")
@Path("/purchaseentry")
public class PurchaseEntryResource {

	@Autowired
    PurchaseEntryService purchaseEntryService;

	@GET
	@Produces("application/json")
    public Iterable<PurchaseEntry> findAll(){
        return purchaseEntryService.listAllPurchaseEntries();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public PurchaseEntry findOne(@PathParam("id") long id){
        return purchaseEntryService.getPurchaseEntryById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public PurchaseEntry create(@RequestBody PurchaseEntry purchaseEntry){
        return purchaseEntryService.create(purchaseEntry);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public PurchaseEntry update(@RequestBody PurchaseEntry purchaseEntry){
        return purchaseEntryService.savePurchaseEntry(purchaseEntry);
    }
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public PurchaseEntry delete(@PathParam("id") long id)
    {
        return purchaseEntryService.deletePurchaseEntry(id);
    }


}
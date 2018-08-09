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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.entity.PurchaseEntry;
import com.rest.eskaysoftAPI.service.PurchaseEntryService;

@Resource(name = "purchaseentry")
@Path("/purchaseentry")
public class PurchaseEntryResource {
	private static final Logger logger = LoggerFactory.getLogger(SubScheduleResource.class);
	
	@Autowired
	PurchaseEntryService purchaseEntryService;

	@GET
	@Produces("application/json")
	public Iterable<PurchaseEntry> findAll() {
		return purchaseEntryService.listAllPurchaseEntries();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public PurchaseEntry findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return purchaseEntryService.getPurchaseEntryById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public PurchaseEntry create(@RequestBody PurchaseEntry purchaseEntry) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted purchaseEntry = " + purchaseEntry.getMfgName());
		}
		return purchaseEntryService.create(purchaseEntry);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public PurchaseEntry update(@RequestBody PurchaseEntry purchaseEntry) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted purchaseEntry = " + purchaseEntry.getId());
		}
		return purchaseEntryService.savePurchaseEntry(purchaseEntry);
	}

	@DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return purchaseEntryService.deletePurchaseEntry(id);
    }
}
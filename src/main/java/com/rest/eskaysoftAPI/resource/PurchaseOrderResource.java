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

import com.rest.eskaysoftAPI.model.PurchaseOrderDto;
import com.rest.eskaysoftAPI.service.PurchaseOrderService;

@Resource(name = "purchaseOrder")
@Path("/purchaseOrder")
public class PurchaseOrderResource {

	private static final Logger logger = LoggerFactory.getLogger(PurchaseOrderResource.class);
	@Autowired
	PurchaseOrderService purchaseOrderService;

	@GET
	@Produces("application/json")
	public List<PurchaseOrderDto> findAll() {
		return purchaseOrderService.listAllPurchaseOrder();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public PurchaseOrderDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return purchaseOrderService.getPurchaseOrderById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public PurchaseOrderDto create(@RequestBody PurchaseOrderDto purchaseorder) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted purchaseorder = " + purchaseorder.getProductId());
		}
		return purchaseOrderService.create(purchaseorder);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public PurchaseOrderDto update(@RequestBody PurchaseOrderDto purchaseorder) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted purchaseorder = " + purchaseorder.getId());
		}
		return purchaseOrderService.updatePurchaseOrder(purchaseorder);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return purchaseOrderService.deletePurchaseOrder(id);
	}

	@DELETE
	@Path("orderNumber/{id}")
	@Produces("application/json")
	public boolean deletePurchaseOrderByOrderNum(@PathParam("id") int id) {
		return purchaseOrderService.deletePurchaseOrderByOrderNum(id);
	}
	
	
}

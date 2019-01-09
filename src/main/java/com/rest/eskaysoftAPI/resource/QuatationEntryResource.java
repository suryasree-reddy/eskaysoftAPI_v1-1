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

import com.rest.eskaysoftAPI.model.QuatationEntryDto;
import com.rest.eskaysoftAPI.service.QuatationEntryService;

@Resource(name = " quatationEntry")
@Path("/quatationEntry")
public class QuatationEntryResource {

	private static final Logger logger = LoggerFactory.getLogger(QuatationEntryResource.class);
	@Autowired
	QuatationEntryService quatationEntryService;

	@GET
	@Produces("application/json")
	public List<QuatationEntryDto> findAll() {
		return quatationEntryService.listAllQuatationEntry();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public QuatationEntryDto findOne(@PathParam("id") long id) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted ID = " + id);
		}
		return quatationEntryService.getquatationEntryById(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public QuatationEntryDto create(@RequestBody QuatationEntryDto quatationEntry) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted quatationEntry = " + quatationEntry.getProductId());
		}
		return quatationEntryService.create(quatationEntry);
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public QuatationEntryDto update(@RequestBody QuatationEntryDto quatationEntry) {
		if (logger.isDebugEnabled()) {
			logger.debug("Requsted quatationEntry = " + quatationEntry.getId());
		}
		return quatationEntryService.updatequatationEntry(quatationEntry);
	}

	@DELETE
	@Path("/{id}")
	@Produces("application/json")
	public boolean delete(@PathParam("id") long id) {
		return quatationEntryService.deletequatationEntryService(id);
	}

	
	@DELETE
	@Path("orderNumber/{id}")
	@Produces("application/json")
	public boolean deleteQuatationByOrderNum(@PathParam("id") int id) {
		return quatationEntryService.deleteQuatationByOrderNum(id);
	}
}

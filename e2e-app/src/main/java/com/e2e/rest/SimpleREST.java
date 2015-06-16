package com.e2e.rest;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.training.jee.demo.entities.CompactDisc;
import com.tranning.jee.bean.CompactDiscLocal;

@Path("/")
public class SimpleREST {
	
	
	@Inject
	private CompactDiscLocal cdService;
	
	@GET()
	@Produces({"application/json"})
	@Path("/Hotel")
	public Collection<CompactDisc> getAllDiscs() {
		return cdService.getDiscs();
	}
}

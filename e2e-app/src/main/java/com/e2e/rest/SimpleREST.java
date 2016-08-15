package com.e2e.rest;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.e2e.bean.CompactDiscLocal;
import com.e2e.entities.CompactDisc;

@Path("/")
public class SimpleREST {
	
	
	@Inject
	private CompactDiscLocal cdService;
	
	@GET()
	@Produces({"application/json"})
	@Path("/getAllDiscs")
	public Collection<CompactDisc> getAllDiscs() {
		return cdService.getDiscs();
	}
	
	@POST
    @Path("/addNewDisc")
    @Consumes({MediaType.TEXT_PLAIN})
    public void addNewDisc(String s) {
		//Hotel hotel = new Hotel(name, noOfRooms);
		System.out.println("recieved in rest "+s);
		cdService.addNewDisc(s);
    }
}

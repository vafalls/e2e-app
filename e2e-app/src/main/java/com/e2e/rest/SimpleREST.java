package com.e2e.rest;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class SimpleREST {
	
	@GET()
	@Produces({"application/json"})
	@Path("/Hotel")
	public ArrayList<String> getHotels() {
		ArrayList<String> a = new ArrayList<String>();
		a.add("david");
		a.add("nogen");
	    return a;
	}
	
//	@GET
//  @Path("/{name}")
//  @Produces({"application/xml","application/json", "text/plain"})
//  public String sayHello(@PathParam("name") String name){
//     return "hello " + name;
//  }
}

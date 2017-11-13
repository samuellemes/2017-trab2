package br.edu.univas.si8.ta.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("service")
public interface ClientService {
	
	@GET
	@Path("/clients/names")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listProductNames();
	
	@POST
	@Path("/clients/{name}/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewProduct(@PathParam("name") String name, @PathParam("email") String email);
}

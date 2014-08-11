/**
 * 
 */
package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author pramod.simikeri
 *
 */
@Path("test")
public class TestService {

	@GET
	@Path("print")
	@Produces(MediaType.APPLICATION_JSON)
	public String printMessage(){
		//return Response.status(200).entity("Hello World!").build();
		return "{name:pramod}";
	}
}

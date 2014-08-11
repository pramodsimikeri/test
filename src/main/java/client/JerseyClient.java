/**
 * 
 */
package client;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author pramod.simikeri
 * 
 */
public class JerseyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(getBaseURI());
		System.out.println(resource.path("test").path("print")
				.accept(MediaType.APPLICATION_JSON).get(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8090/KaptchaTest/service")
				.build();
	}
}

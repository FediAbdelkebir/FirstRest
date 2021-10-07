import java.net.URI;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

public class HelloRESTClient {

	public HelloRESTClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Client Client=ClientBuilder.newClient();
		
		WebTarget target=Client.target("http://localhost:8080/Hello_JAX_RS/rest/greetings/");
		
		Response response=target.request().get();
		
		String result=response.readEntity(String.class);
		
		System.out.println("Resultat : "+result);
		
		response.close();
		//Deuxieme Target
	WebTarget target2=target.path("Fedi").path("Abdelkebir");
		
		Response response2=target2.request().get();
		
		String result2=response2.readEntity(String.class);
		
		System.out.println("Resultat : "+result2);
		
		response2.close();
		//Trois
		
		//Deuxieme Target
		WebTarget target3=target.queryParam("FirstName", "Fedi").queryParam("LastName", "Abdelkebir");
			
			Response response3=target3.request().get();
			
			String result3=response3.readEntity(String.class);
			
			System.out.println("Resultat : "+result3);
			
			response3.close();
}
}
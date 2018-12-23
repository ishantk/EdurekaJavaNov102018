package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path; // Java API's for Restful Web Services
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer; (Must be configure in XML File -> web.xml)

// Web Service
@Path("/hello")
public class Hello {
	

	// All the Business Logics can be handled in the Web Methods
	// Our RESTful Web Service is capable of responding in different formats
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){
		// Web Method returning Textual Data 
		String responseMessage = "Plain Hello from Jersey";
		return responseMessage;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		// Web Method returning HTML Data 
		String responseMessage = "<html><body><h3>HTML Hello from Jersey</h3></body></html>";
		return responseMessage;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		// Web Method returning XML Data 
		String responseMessage = "<?xml version='1.0' encoding='UTF-8'?><hello>XML Hello from Jersey</hello>";
		return responseMessage;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		// Web Method returning JSON Data 
		String responseMessage = "{'name':'John','age':30,'address':'Redwodd Shores'}";
		return responseMessage;
	}
	
}

<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rest Client</title>
</head>
<body>
	<center>
			<br/>
			<h3>Jersey Client</h3>
			
			<%
				// To Consume WebService Hello we shall write Client API's
				ClientConfig cConfig = new ClientConfig();
				Client client = ClientBuilder.newClient(cConfig); // RESTful Client, which can send Request to our WebService
				
				// Target to our WebService's Project
				WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session15RestWS").build());
				
				// Access WebService 
												// /rest/hello
				String plainResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
				String htmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
				String xmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
				String jsonResponse = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
				
			%>
			
			Plain Response : <%= plainResponse %>
			<br/>
			HTML  Response : <%= htmlResponse %>
			<br/>
			XML   Response : <%= xmlResponse %>
			<br/>
			JSON  Response : <%= jsonResponse %>
			<br/>
			
	</center>
</body>
</html>
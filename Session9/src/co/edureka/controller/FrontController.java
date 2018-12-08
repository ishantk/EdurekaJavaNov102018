package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet({ "/FrontController", "/Service" })
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("txtType");
		
		// 3. Send Back Response to the Client !!
		response.setContentType("text/html"); // Response can be either text of HTML
		//PrintWriter : Writes the Response back to the Client
		PrintWriter out = response.getWriter();
		out.print("<h3>This is from Front Controller</h3>"); // we are sending response from FrontController before even we forward the request and response
		
		if(type.equals("Login")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginServlet");
			//dispatcher.forward(request, response); // forwarding request and Response to other Servlet, and not include response
			dispatcher.include(request, response);   // forwarding request and Response to other Servlet, and include response
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterServlet");
			dispatcher.forward(request, response);
		}
		
	}

}

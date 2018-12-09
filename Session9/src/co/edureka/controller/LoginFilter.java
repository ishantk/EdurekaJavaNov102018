package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public void destroy() {
		System.out.println(">> filter destroy executed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html"); // Response can be either text of HTML
		PrintWriter out = response.getWriter();
		
		// Pre-Processing Code goes here
		out.print("<center><h3>==Pre Processing==</h3></center>");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(email.isEmpty() || password.isEmpty()){
			out.print("<center><h3>==Email or Password Missing==</h3></center>");
		}else{
			chain.doFilter(request, response); // Dispatches the request to corresponding Servlet (LoginServlet as in web.xml file)
		}
		// Post Processing Code goes here
		out.print("<center><h3>==Post Processing==</h3></center>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(">> filter init executed");
	}

}

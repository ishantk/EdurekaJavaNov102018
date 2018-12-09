package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // Response can be either text of HTML
		PrintWriter out = response.getWriter();
		
		// 2. URL ReWriting | 3. Hidden Form Field
		/*String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("email");*/
		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		String email = (String)session.getAttribute("keyEmail");
		
		// int iAge = Integer.parseInt(age); | String to Integer
		
		String htmlResponse = "<html><body><center>Welcome "+name+" to Home !!<br/>Age is:"+age+" and email is: "+email+"</center></body></html>";
		
		// 1. Cookies
		/*Cookie[] ckArr = request.getCookies();
		
		for(Cookie ck : ckArr){
			out.print("<h3>"+ck.getName()+" - "+ck.getValue()+"</h3>");
			
			if(ck.getName().equals("keyEmail")){
				out.print("Hey !!");
			}
		}*/
		
		out.print(htmlResponse); // Sending HTML Response to the Client
	}

}

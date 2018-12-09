package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	// doPost is executed when client sends a request with method as post
	// doGet is executed when client sends a request with method as get
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Extracted the Data from Client Request
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		if(user.email.isEmpty()){
			response.sendRedirect("https://www.google.co.in");
		}
		
		System.out.println(">> "+user.toString());
		
		// 2. Login User Object from DataBase
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean check = helper.loginUser(user); 
		helper.closeConnection();
		
		// 3. Send Back Response to the Client !!
		response.setContentType("text/html"); // Response can be either text of HTML
		//PrintWriter : Writes the Response back to the Client
		PrintWriter out = response.getWriter();
		
		String res = "";
		if(check){
			
			// Hard-Coded data in LoginServlet (This may be dynamic !!)
			String name = "Jim Jackson";
			int age = 32;
			
			// 1. Cookies - Session Tracking | Persisting Data in Session
			//String url = "Home";
			/*Cookie ck1 = new Cookie("keyName",name);
			Cookie ck2 = new Cookie("keyAge",String.valueOf(age)); 
			Cookie ck3 = new Cookie("keyEmail",user.email); 
			
			//ck1.setMaxAge(expiry); // To determine the life of cookie on client's machine
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			//2. URL ReWriting | Session Tracking | Data becomes part of URL
			//String url = "Home?name="+name+"&age="+age+"&email="+user.email;
			
			//3. Hidden Form Field
			/*String form = "<form action='Home' method='post'>"
						+ "<input type='hidden' name='name' value='"+name+"'/>"
						+ "<input type='hidden' name='age' value='"+age+"'/>"
						+ "<input type='hidden' name='email' value='"+user.email+"'/>"
						+ "<input type='submit' value='Enter Home'/>"
						+ "</form>";*/
			
			//4. HttpSession Object | Session Tracking - Get reference of object from request
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age); 		// maintains the type of data
			session.setAttribute("keyEmail", user.email);
			
			// HW: Implement Login and Logout using HttpSession API :)
			//     Implement One Time Login Using Cookies :)
			
			String url = "Home";
			res = user.email+" Logged In Successfuly !!"
					+ "<br/><a href='"+url+"'>Enter Home</a>";
					//+ "<br/>"+form;
		}else{
			res = user.email+" Not Logged In Successfuly !!";
			System.out.println(">> Redirecting...");
		}
		
		Date date = new Date();
		String timeStamp = date.toString();
		
		String htmlResponse = "<html><body><center>"+res+"<br/>Logged in at :"+timeStamp+"</center></body></html>";
		out.print(htmlResponse); // Sending HTML Response to the Client
	}

}

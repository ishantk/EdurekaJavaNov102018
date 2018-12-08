package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			res = user.email+" Logged In Successfuly !!";
		}else{
			res = user.email+" Not Logged In Successfuly !!";
		}
		
		Date date = new Date();
		String timeStamp = date.toString();
		
		String htmlResponse = "<html><body><center>"+res+"<br/>Logged in at :"+timeStamp+"</center></body></html>";
		out.print(htmlResponse); // Sending HTML Response to the Client
	}

}

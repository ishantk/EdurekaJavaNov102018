package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;

@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	 
	// Executed only once when Web Server creates the Object
	// Acts as Constructor
   	public void init(ServletConfig config) throws ServletException {
   		System.out.println(">> init Executed");
	}
   	
	// Executed only once when Web Server has no usage to the Object.
	// Acts as Destructor
	public void destroy() {
		System.out.println(">> destroy Executed");
	}

	// This is executed when any request by any client comes
	// service is executed when client sends a request with any type of method either get or post or any other !!
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// your logic goes here
		System.out.println(">> service Executed");
		
		// 1. Extracted the Data from Client Request
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> "+user.toString());
		
		// 2. Saving User Object Data in DataBase
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user); 
		helper.closeConnection();
		
		// 3. Send Back Response to the Client !!
		response.setContentType("text/html"); // Response can be either text of HTML
		//PrintWriter : Writes the Response back to the Client
		PrintWriter out = response.getWriter();
		
		String res = "";
		if(i>0){
			res = user.name+" Registered Successfuly !!";
		}else{
			res = user.name+" Not Registered Successfuly !!";
		}
		
		String htmlResponse = "<html><body><center>"+res+"</center></body></html>";
		out.print(htmlResponse); // Sending HTML Response to the Client
	}

}

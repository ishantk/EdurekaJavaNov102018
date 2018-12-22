<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// Similar Code can be written in Servlet as well.
	// We can also write code which fetches data from DB and returns back !!
	// Read Data from Client Request
	String data = request.getParameter("data");
	try{
		int number = Integer.parseInt(data);
		for(int i=1;i<=10;i++){
			out.print(number+" "+i+"'s are "+(number*i)+"<br/>");
		}
	}catch(Exception e){
		out.print("Please Enter a Valid Number");
		//e.printStackTrace();
	}
%>
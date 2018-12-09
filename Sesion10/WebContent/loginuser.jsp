<%@ page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>

	<br/>
		Logging In: ${param.txtEmail}
	<br/>

	<%
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean check = helper.loginUser(user);
		helper.closeConnection();
		
		if(check){
			
			// 1. Session Tracking - Cookies
			
			Cookie ck1 = new Cookie("keyEmail",user.email);
			Cookie ck2 = new Cookie("keyName","Sia Flynn");
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			
			// 2. URL Rewriting
			// 3. Hidden Form Fields
			
			// 4. HttpSession
			session.setAttribute("keyEmail", user.email);
			session.setAttribute("keyName", "Sia Flynn");
			
			// 5. PageContext
			pageContext.setAttribute("keyName", "Sia Flynn", PageContext.SESSION_SCOPE);
	%>
			<b> <%= user.email %> Logged In !!</b>
			<br/>
			<!-- <b></b><a href="welcome.jsp">Enter Home</a></b> -->
			<jsp:forward page="welcome.jsp"/>
	<%		
		}else{
	%>
			<b> <%= user.email %> Not Logged In !!</b>
	<%
		response.sendRedirect("https://www.google.co.in");
		}
	%>
	
	<!-- Action tag Example -->
	<jsp:include page="footer.jsp"/>
	
	</center>
</body>
</html>
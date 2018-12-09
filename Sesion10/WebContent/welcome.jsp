<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<center>
	
	<h3>Welcome Home <%= session.getAttribute("keyName")%> !!<br/>Email is: <%= session.getAttribute("keyEmail") %></h3>
	
	
	<%
		Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}
		
		//String name = (String)pageContext.getAttribute("keyName");
	%>
	
	</center>
</body>
</html>
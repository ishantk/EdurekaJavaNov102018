<%@ page import="co.edureka.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorhandler.jsp" %>    
<%@ page buffer="8kb" %>
<%@ page isThreadSafe="true" %> <!-- Synchrnozied -->
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<center>
		<h3>JSP Demo</h3>
		
		<%-- <h3>Sum is: <% out.print(num3); %></h3> error --%>
		<h3>PI is: <% out.print(pi); %></h3>
		
		Scriptlet Tag Demo:
		<%
			int num1 = 10;
			int num2 = 20;
			int num3 = num1+num2;
		%>
		
		<h3>Sum is: <% out.print(num3); %></h3>
		
		Declarative Tag Demo:
		<%!
			double pi = 3.14;
		
			double area(double radius){
				double a = pi * radius * radius;
				return a;
			}
		%>
		
		<h3>Area of Circle with Radius 5.2 is: <% out.print(area(5.2)); %></h3>
		
		Expression Tag Demo:
		<h3>Area of Circle with Radius 7.2 is: <%= area(7.2) %></h3>
		
		<%
			
			int[] arr = {10, 20, 30, 40, 50};
			out.print("arr[2] is: "+arr[2]);
		%>
		
		<br/>
		
		<%
			// Java Object Construction
			Student sRef = new Student();
			sRef.setRoll(101);
			sRef.setName("John");
			sRef.setAge(30);
		%>
		<br/>
		Student Details:
		<br/>
		Roll: <%=sRef.getRoll() %> | Name: <%= sRef.getName() %> | Age: <%= sRef.getAge() %>
		<br/>
		
		<jsp:useBean id="sRef1" class="co.edureka.model.Student"/>
		<jsp:setProperty property="roll" name="sRef1" value="201"/>
		<jsp:setProperty property="name" name="sRef1" value="Jennie"/>
		<jsp:setProperty property="age" name="sRef1" value="32"/>
		
		<br/>
		Student Details:
		<br/>
		Roll: <jsp:getProperty property="roll" name="sRef1"/> | Name: <jsp:getProperty property="name" name="sRef1"/> | Age: <jsp:getProperty property="age" name="sRef1"/> 
		<br/>
		
		JSTL Demo:
		<br/>
		<c:forEach var="i" begin="1" end="10">
			<b>i is: <c:out value="${i}"/><br/>  </b>
		</c:forEach>
		
		<%-- <c:redirect url="https://edureka.co"/> --%>
		
	</center>

</body>
</html>
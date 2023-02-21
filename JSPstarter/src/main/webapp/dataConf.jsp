<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

if(request.getParameter("name")!=null && request.getParameter("id")!=null && request.getParameter("age")!=null && request.getParameter("adress")!=null){
String name=request.getParameter("name"); 
int id=Integer.parseInt(request.getParameter("id")); 
int age=Integer.parseInt(request.getParameter("age"));
String adress=request.getParameter("adress");

}

%>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/employee" user="root" password="2001" />
	<sql:update dataSource="${db}" var="param">
	INSERT INTO tabjsp(name,id,age,adress) VALUES (?, ?, ?, ?)
	<sql:param value="${param.name}" />
	<sql:param value="${param.id}" />
	<sql:param value="${param.age}" />
	<sql:param value="${param.adress}" />
	</sql:update>
	<c:out value="values inserted in Employee_Surya Table" />
</body>
</html> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    

<c:url value="/home/logout" var="urlLogout"></c:url>
<c:url value="/home/pages/manufacturers"  var="manufacturersView"/>


	<p>	Welcome, ${loginUser.username} </p>
	<div style="float:right"><a href="${urlLogout}">Log out</a></div>
	
	<header>
		<nav><a href="${manufacturersView}" >View manufacturers</a></nav>
		<nav><a href=#>Add manufacturers</a></nav>
		<nav><a href=#>View cities</a></nav>
	</header>
	



 

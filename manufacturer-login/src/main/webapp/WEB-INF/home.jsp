<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/home/pages/manufacturers"  var="manufacturersView"/>


<html>
<body>

<jsp:include page="fragments/header.jsp" />  

	<header>
		<nav><a href="${manufacturersView}" >View manufacturers</a></nav>
		<nav>Add manufacturers</nav>
		<nav>View cities</nav>
	</header>
	
	<main>
		<h2>Welcome! You successfully logged in!</h2>
		<article>
			<div>
				Home page
			</div>
		</article>
	</main>
	
	
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/home/pages/manufacturers"  var="manufacturersView"/>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<style>
html {
  background-color: #56baed;
}

body {
  font-family: "Poppins", sans-serif;
  height: 100vh;
}

.wrapper {
  display: flex;
  align-items: center;
  flex-direction: column; 
  justify-content: center;
  width: 100%;
  min-height: 100%;
  padding: 10px;
}

.flex-container{
	display: flex;
	align-items: center;
  	flex-direction: column;
  	
  	justify-content: space-between; 
}

</style>

<html>
<body class="wrapper">

<jsp:include page="fragments/header.jsp" />  

	<header>
		<nav class="flex-container">
			
			<a href="${manufacturersView}" >View manufacturers</a>
			<a href="#">Add manufacturers</a>
			<a href="#">View cities</a>
		</nav>
	</header>
	
	<main>
		<h2>You successfully logged in!</h2>
		
	</main>
	
	
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manufacturer</title>

<style><%@include file="/WEB-INF/style/style.css"%></style>

</head>
<body>

<header>
	<jsp:include page="../fragments/header.jsp" />  
</header>


	
	<main class="wrapper">
		<h2>Manufacturer Info</h2>
		<article>
			<div>
				<form action="edit" method="post">
					<label>Personal Number</label> <input type="text" name="pNumber"
						value="${manufacturer.pNumber}"/>
						
						<label>Address</label>
					<input type="text" name="name" value="${manufacturer.address}"
						 />
						 <label>City</label>
					<input type="text" name="name" value="${manufacturer.location}"
					 />
					
					<div>
							
						<input type="submit" name="button" value="Edit">	
					</div>
					
				</form>
				
				<div>
					
						<button name="button" onclick="history.back()">Cancel</button>
						
					</div>
				
			
			</div>


		</article>
	</main>

	<footer> Copyright 2022.</footer>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manufacturer</title>
</head>
<body>

<header>
	<jsp:include page="../fragments/header.jsp" />  
</header>
	
	
	
	<main>
		<h2>Manufacturer Info</h2>
		<article>
			<div>
				<form action="///" method="post">
					<label>Maticni broj</label> <input type="text" name="pNumber"
						value="${manufacturer.pNumber}" readonly="readonly" />
						<label>Grad</label>
					<input type="text" name="name" value="${manufacturer.location}"
						readonly="readonly" />
					
					<div>
							
						<input type="submit" name="button" value="Edit">	
					</div>
					
					<div>
					
						<input type="submit" name="button" value="Cancel">
						
					</div>
	
				</form>
				
			
			</div>


		</article>
	</main>

	<footer> Copyright 2022.</footer>

</body>
</html>
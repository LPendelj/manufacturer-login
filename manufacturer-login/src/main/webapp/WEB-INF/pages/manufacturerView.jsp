<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manufacturer</title>
<style type="text/css">
	

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
  padding: 20px;
}
	
</style>

</head>
<body>

<header>
	<jsp:include page="../fragments/header.jsp" />  
</header>
	
	
	
	<main class="wrapper">
		<h2>Manufacturer Info</h2>
		<article>
			<div>
				<form action="///" method="post">
					<label>Personal Number</label> <input type="text" name="pNumber"
						value="${manufacturer.pNumber}" readonly="readonly" />
						<label>City</label>
					<input type="text" name="name" value="${manufacturer.location}"
						readonly="readonly" />
						<label>Address</label>
					<input type="text" name="name" value="${manufacturer.address}"
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Manufacturers</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >

<style type="text/css">



</style>
<c:url value="/home/pages/manufacturers/view?pNumber="  var="manufacturerView"/>
</head>
<body>

<header>
	<jsp:include page="../fragments/header.jsp" />  
</header>

<table class="table">
	
	
	<thead>
	<tr>
		<td>Manufacturer ID</td>
		<td>Address</td>
		<td>Location</td>
		<td>Action</td>
	</tr>
	</thead>
	
					<tbody>
						<c:forEach var="manufacturer" items="${manufacturers}">
							<tr>
								<th>${manufacturer.pNumber}</th>
								<th>${manufacturer.address}</th>
								<th>${manufacturer.location}</th>
								 <th><a href="${manufacturerView}${manufacturer.pNumber}">View</a></th> 
							</tr>
						</c:forEach>
					</tbody>

</table>

	<!-- 	
	<a href="/simplewebapp/application/city/view/${city.zipCode}">Pogledaj map</a>
									<br/>
									<a href="/simplewebapp/application/city/view?zipCode=${city.zipCode}">Pogledaj url</a>
									<br/>
									
		 -->


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Manufacturers</title>
</head>
<body>

<header>
	<jsp:include page="../fragments/header.jsp" />  
</header>

<table>
	
	
	<thead>
	<tr>
		<td>Manufacturer ID</td>
		<td>Address</td>
		<td>Location</td>
	</tr>
	</thead>
	
					<tbody>
						<c:forEach var="manufacturer" items="${manufacturers}">
							<tr>
								<th>${manufacturer.pNumber}</th>
								<th>${manufacturer.address}</th>
								<th>${manufacturer.location}</th>
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
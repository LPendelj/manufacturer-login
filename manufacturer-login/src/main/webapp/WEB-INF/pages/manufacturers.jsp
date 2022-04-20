<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Manufacturers</title>
<style><%@include file="/WEB-INF/style/style.css"%></style>



<c:url value="/home/pages/manufacturers/view?pNumber="  var="manufacturerView"/>
<c:url value="/home/pages/manufacturers/delete?pNumber="  var="manufacturerDelete"/>
</head>
<body>

<header>
	<jsp:include page="../fragments/header.jsp" />  
</header>

<script>
function myFunction() {
  alert("Item deleted");
}
</script>

<table class="wrapper">
	
	
	
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
								 <th><a href="${manufacturerDelete}${manufacturer.pNumber}" onclick="myFunction()">Remove</a></th> 
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
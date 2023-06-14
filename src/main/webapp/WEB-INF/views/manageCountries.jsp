<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> --%>
	<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="/resources/js/jquery.min.js"></script>
<script
	src="/resources/js/bootstrap.min.js"></script>
<script
	src="/resources/js/countryOperations.js"></script>	
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="well well-lg">
<%@ include file="/WEB-INF/views/adminHeader.jsp" %>
<h3>From CountryController Example</h3>
<h3>Add Country:</h3>
	<form:form method="post" action="addCountry" commandName="country">
	<form:hidden path="countryNo" title="Enter countryNo" />
	Enter CountryName :<form:input path="countryName" title="Enter country" /><br>
		<input type="submit" value="Submit" /><br>
	</form:form>
	<p class="bg-success">${countryData.countryNo}- ${countryData.countryName}</p>
<h3>Get Country:</h3>
	<form action="getCountry" method="get">
		Enter countryNo :<input type="text" name="countryNo" /><br> 
		<input type="submit" value="GetCountry" /><br>
	</form>
<p class="bg-success">${getCountryData.countryNo} - ${getCountryData.countryName}</p>
<h3>Get All Countries:</h3>
	<%-- <form action="getAllUsers" method="get">
		<input type="submit" value="GetAllUsers" /><br>
	</form> --%>
		Search Country Name:<input type="text" id="user_Name" placeholder="searchName" /><br>
	<table class="table" id="userTable">
		<thead>
			<tr class="danger">
				<td>CountryNo</td>
				<td>Country Name</td>
				<td>Delete</td>
				<td>Update</td>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${countryList}" var="country">
				<tr>
					<td><c:out value="${country.countryNo}"></c:out></td>
					<td><c:out value="${country.countryName}"></c:out></td>
					<td><a
						href="deleteCountry?countryNo=<c:out value="${country.countryNo}"></c:out>"><span
							class="glyphicon glyphicon-trash"></span></a></td>
					<td><a
						href="updateCountry?countryNo=<c:out value="${country.countryNo}"></c:out>">
							<span class="glyphicon glyphicon-edit"></span>
					</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</div>
</body>
</html>
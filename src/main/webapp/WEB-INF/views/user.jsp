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
	src="/resources/js/userOperations.js"></script>	
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="well well-lg">
<%@ include file="/WEB-INF/views/adminHeader.jsp" %>
<h3>From UserController Example</h3>
<h3>Add User:</h3>
	<form:form method="post" action="addUser" commandName="user">
	<form:hidden path="userId" title="Enter UserId" />
	Enter UserName :<form:input path="userName" title="Enter UserName" /><br>
	Enter Email :<form:input path="email" title="Enter Email" /><br>
		<input type="submit" value="Submit" /><br>
	</form:form>
	<p class="bg-success">${userData.userId}- ${userData.userName}-${userData.email}</p>
<h3>Get User:</h3>
	<form action="getUser" method="get">
		Enter UserId :<input type="text" name="userId" /><br> 
		<input type="submit" value="GetUser" /><br>
	</form>
<p class="bg-success">${getUserData.userId} - ${getUserData.userName}- ${getUserData.email}</p>
<h3>Get All Users:</h3>
	<%-- <form action="getAllUsers" method="get">
		<input type="submit" value="GetAllUsers" /><br>
	</form> --%>
		Search Name:<input type="text" id="user_Name" placeholder="searchName" /><br>
	<table class="table" id="userTable">
		<thead>
			<tr class="danger">
				<td>UserId</td>
				<td>UserName</td>
				<td>Email</td>
				<td>Delete</td>
				<td>Update</td>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td><c:out value="${user.userId}"></c:out></td>
					<td><c:out value="${user.userName}"></c:out></td>
					<td><c:out value="${user.email}"></c:out></td>
					<td><a
						href="deleteUser?userId=<c:out value="${user.userId}"></c:out>"><span
							class="glyphicon glyphicon-trash"></span></a></td>
					<td><a
						href="updateUser?userId=<c:out value="${user.userId}"></c:out>">
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
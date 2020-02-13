
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="userUrl" value="/user/save"></c:url>
	<form:form action="${userUrl }" modelAttribute="user">
		<div class="container-fluid">

			<c:if test="${!empty user.userName }">
				<div class="form-group">
					<form:label path="id">Id</form:label>
					<form:input path="id" readonly="true" disabled="true"
						class="form-control" />
					<form:hidden path="id" />
				</div>
			</c:if>
		
			<div class="form-group">
				<form:label path="userName">User Name</form:label>
				<form:input path="userName" class="form-control" />
			</div>
			
			<div class="form-group">
				<form:label path="fullName">Full Name</form:label>
				<form:input path="fullName" class="form-control" />
			</div>
			<div class="form-group">
				<form:label path="email">Email</form:label>
				<form:input path="email" class="form-control" />
			</div>
			<div class="form-group">
				<form:label path="phone">Phone</form:label>
				<form:input path="phone" class="form-control" />
			</div>
			<div class="form-group">
				<form:label path="password">Password</form:label>
				<form:input path="password" class="form-control" />
			</div>
			<div class="form-group">


				<c:if test="${empty user.userName}">
					<input type="submit" value="Register">
				</c:if>
				<c:if test="${!empty user.userName}">
					<input type="submit" value="Update">
				</c:if>

			</div>

		</div>
	</form:form>
	<br />
	<br />
	<div>
		<table border="1">

			<tr>
				<th>ID</th>
				<th>Email</th>
				<th>FullName</th>
				<th>password</th>
				<th>phone</th>
				<th>UserName</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="user" items="${list}">
				<tr>
					<td>${user.id}</td>
					<td>${user.email }</td>
					<td>${user.fullName}</td>
					<td>${user.password }</td>
					<td>${user.phone }</td>
					<td>${user.userName }</td>
					<td><a href="<c:url value='/remove/${user.id}' />">Remove</a>
						| <a href="<c:url value='/update/${user.id}' />">Update</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>

</body>
</html>
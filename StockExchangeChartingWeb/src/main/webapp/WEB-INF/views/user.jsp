<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
<table border="1">
	  <tr>
	      <th>ID</th>
	      <th>Email</th>
	      <th>FullName</th>
	      <th>password</th>
	      <th>phone</th>
	      <th>UserName</th>
	  </tr>
	  <c:forEach var="user" items="${list}">
       <tr>
		   <td>${user.id}</td>
		   <td>${user.email }</td>
		   <td>${user.fullName}</td>
		   <td>${user.password }</td>
		   <td>${user.phone }</td>
		   <td>${user.userName }</td>
       </tr>
		</c:forEach>
	 
	</table>
</body>
</html>
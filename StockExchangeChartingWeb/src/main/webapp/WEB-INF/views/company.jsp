<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company Page</title>
</head>
<body>
${message}
<hr>
<table border="1">
	  <tr>
	      <th>idNumber</th>
	      <th>Company Name</th>
	      <th>CEO Name</th>
	      <th>Board Member</th>
	      <th>Turn Over</th>
	      <th>Brief Description</th>
	      <th>IPO Date</th>
	   
	  </tr>
	  <c:forEach var="company" items="${list}">
       <tr>
		   <td>${company.idNumber}</td>
		    <td>${company.companyName}</td>  
		    <td>${company.ceoName}</td>
		  <td>${company.boardMember}</td>
		     <td>${company.turnOver}</td>
		  <td>${company.briefDescription}</td>
		  <td>${company.ipoDate}</td>
       </tr>
		</c:forEach>
	 
	</table>
</body>
</html>
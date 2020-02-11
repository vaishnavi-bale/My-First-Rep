<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock Price</title>
</head>
<body>
${message}
<hr>
<table border="1">
	  <tr>
	      <th>CompanyCode</th>
	      <th>Current Price</th>
	      <th>Date</th>
	      <th>StockExchange</th>
	      <th>Time</th>
	   
	  </tr>
	  <c:forEach var="stockprice" items="${list}">
       <tr>
		   <td>${stockprice.companyCode}</td>
		    <td>${stockprice.currentPrice}</td>  
		    <td>${stockprice.date}</td>
		  <td>${stockprice.stockExchange}</td>
		     <td>${stockprice.time}</td>
		  
       </tr>
		</c:forEach>
	 
	</table>
</body>
</html>
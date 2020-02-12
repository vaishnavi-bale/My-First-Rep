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
	<c:url var="stockpriceUrl" value="/stockprice/save-stockprice"></c:url>
	<form:form action="${stockpriceUrl }" modelAttribute="stockprice">
		<div>
			<table>
				<tr>
					<td><form:label path="companyCode">CompanyCode</form:label></td>
					<td><form:input path="companyCode" /></td>
				</tr>
				<tr>
					<td><form:label path="currentPrice">Current Price</form:label></td>
					<td><form:input path="currentPrice" /></td>
				</tr>
				<tr>
					<td><form:label path="date">Date</form:label></td>
					<td><form:input type="date" path="date" /></td>
				</tr>
				<tr>
					<td><form:label path="stockExchange">StockExchange</form:label></td>
					<td><form:input path="stockExchange" /></td>
				</tr>
				<tr>
					<td><form:label path="time">Time</form:label></td>
					<td><form:input path="time" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</div>
	</form:form>
	<br />
	<br />
	<div>
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
	</div>

</body>
</html>
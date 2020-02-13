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
		<div class="container-fluid">
		<c:if test="${!empty stockprice.stockExchange }">
				<div class="form-group">
					<form:label path="companyCode">CompanyCode</form:label>
					<form:input path="companyCode" readonly="true" disabled="true"
						class="form-control" />
					<form:hidden path="companyCode" />
				</div>
			</c:if>
				
				<div class="form-group">
				<form:label path="currentPrice">Current Price</form:label>
				<form:input path="currentPrice" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="date">Date</form:label>
					<form:input path="date" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="stockExchange">StockExchange</form:label>
					<form:input path="stockExchange" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="time">Time</form:label>
			        <form:input path="time" class="form-control"/>
				</div>
				<div class="form-group">
					<c:if test="${empty stockprice.stockExchange}">
					<input type="submit" value="Register">
				</c:if>
				<c:if test="${!empty stockprice.stockExchange}">
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
				<th>CompanyCode</th>
				<th>Current Price</th>
				<th>Date</th>
				<th>StockExchange</th>
				<th>Time</th>
				<th>Actions</th>

			</tr>
			<c:forEach var="stockprice" items="${list}">
				<tr>
					<td>${stockprice.companyCode}</td>
					<td>${stockprice.currentPrice}</td>
					<td>${stockprice.date}</td>
					<td>${stockprice.stockExchange}</td>
					<td>${stockprice.time}</td>
                    <td><a href="<c:url value='/remove-stockprice/{companyCode}' />">Remove</a>|
						 <a href="<c:url value='/update-stockprice/{companyCode}' />">Update</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>

</body>
</html>
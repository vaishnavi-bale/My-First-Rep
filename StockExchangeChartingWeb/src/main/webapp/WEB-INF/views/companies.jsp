 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp" %>
	<c:url var="companyUrl" value="/company/save-company"></c:url>
	<form:form action="${companyUrl }" modelAttribute="company">
		<div class="container-fluid">
			
				<div class="form-group">
					<form:label path="idNumber">idNumber</form:label>
					<form:input path="idNumber" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="companyName">Company Name</form:label>
					<form:input path="companyName" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="ceoName">CEO Name</form:label>
					<form:input path="ceoName" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="boardMember">Board Member</form:label>
					<form:input path="boardMember" class="form-control"/>
				</div>
				<div class="form-group">
				   <form:label path="turnOver">Turn Over</form:label>
					<form:input path="turnOver" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="briefDescription">Brief Description</form:label>
				  <form:input path="briefDescription" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="ipoDate">IPO Date</form:label>
					<form:input path="ipoDate" class="form-control"/>
				</div>

				<div>
					
					<input type="submit" value="Register">
				</div>
		
		</div>
	</form:form>
	<br />
	<br />
	<div>
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
	</div>
</body>
</html>
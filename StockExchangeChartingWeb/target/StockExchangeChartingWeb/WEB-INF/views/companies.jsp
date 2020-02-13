 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp" %>
	<c:url var="companyUrl" value="/company/save-company"></c:url>
	<form:form action="${companyUrl }" modelAttribute="company">
		<div>
			<table>
				<tr>
					<td><form:label path="idNumber">idNumber</form:label></td>
					<td><form:input path="idNumber" /></td>
				</tr>
				<tr>
					<td><form:label path="companyName">Company Name</form:label></td>
					<td><form:input path="companyName" /></td>
				</tr>
				<tr>
					<td><form:label path="ceoName">CEO Name</form:label></td>
					<td><form:input path="ceoName" /></td>
				</tr>
				<tr>
					<td><form:label path="boardMember">Board Member</form:label></td>
					<td><form:input path="boardMember" /></td>
				</tr>
				<tr>
					<td><form:label path="turnOver">Turn Over</form:label></td>
					<td><form:input path="turnOver" /></td>
				</tr>
				<tr>
					<td><form:label path="briefDescription">Brief Description</form:label></td>
					<td><form:input path="briefDescription" /></td>
				</tr>
				<tr>
					<td><form:label path="ipoDate">IPO Date</form:label></td>
					<td><form:input path="ipoDate" /></td>
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
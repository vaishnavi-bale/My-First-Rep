 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="userUrl" value="/user/save"></c:url>
<form:form action="${userUrl }" modelAttribute="user">
   <div>
    <table>
     <c:if test="${!empty user.userName }">
       <tr>
           <td><form:label path="id">Id</form:label></td>
           <td><form:input path="id" readonly="true" disabled="true"/></td>
           <td><form:hidden path="id"/></td>
       </tr>
   </c:if>
   
       <tr>
           <td><form:label path="userName">User Name</form:label></td>
           <td><form:input path="userName"/></td>
       </tr>
       <tr>
           <td><form:label path="fullName">Full Name</form:label></td>
           <td><form:input path="fullName"/></td>
       </tr>
        <tr>
           <td><form:label path="email">Email</form:label></td>
           <td><form:input path="email"/></td>
       </tr>
        <tr>
           <td><form:label path="phone">Phone</form:label></td>
           <td><form:input path="phone"/></td>
       </tr>
        <tr>
           <td><form:label path="password">Password</form:label></td>
           <td><form:input path="password"/></td>
       </tr>
        <tr>
           <td></td>
           <td>
           <c:if test="${empty user.userName}">
           <input type="submit" value="Register">
           </c:if>
           <c:if test="${!empty user.userName}">
           <input type="submit" value="Update">
           </c:if>
           </td>
       </tr>
    </table>
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
		   <td><a href="<c:url value='/remove/${user.id}' />">Remove</a> |
		       <a href="<c:url value='/update/${user.id}' />">Update</a>
		   </td>
       </tr>
		</c:forEach>
	 
	</table>
   </div>
   
</body>
</html>
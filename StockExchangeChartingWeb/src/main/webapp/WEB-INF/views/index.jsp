<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
	<h2>Hello World!</h2>
	<hr>
	${message}
	<hr><%-- 
	<ol>
		<c:forEach var="name" items="${list}">

			<li><h3>${name}</h3></li>

		</c:forEach>
	</ol> --%>
	
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

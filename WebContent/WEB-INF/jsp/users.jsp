<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
.table {
    max-width: 40% !important;
}
</style>

<h3>Register your account: <a href='<spring:url value="/register.html" />'>here</a></h3>
<br>

<table class="table table-bordered table-hover table-condensed">
	<thead>
		<tr>
			<th bgcolor="grey">ID</th>
			<th bgcolor="grey">User</th>
			<th bgcolor="grey">Email</th>
			<th bgcolor="grey">Action</th>
		</tr>
<%-- items="${users}" from UserController.java --%>
	</thead>
	
	<c:if test="${!empty users}">
	
	<tbody>
		<c:forEach items="${users}" var="user">

			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td><spring:url value="/users/${user.id}.html" var="url" /> <a
					href="${url}">February: ${user.name}</a>
				</td>
			</tr>
		
		</c:forEach>		

	</tbody>
	
	</c:if>
	
</table><%-- ${user.name} From User.java entity package --%>

<br>


<br>
${url} <br>
Lorem Ipsum

<br><br><br>
Ipsum Ipsum <br>
<c:forEach items="${entries}" var="entry">
		${entry.entryContent} <br>
		
</c:forEach>

<br>

Lorem Ipsum

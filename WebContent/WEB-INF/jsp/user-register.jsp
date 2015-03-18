<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
.table {
    max-width: 40% !important;
}
</style>

<table>
<!--  path="name" corresponds to User.java in enitity -->
<form:form commandName="user">
	<tr>
	<td><label for="name">Name:	</label></td>
	
	<td><form:input path="name" /></td>
	</tr>
	<tr>
		<td><label for="password">Password:	</label></td>
	<td><form:password path="password" /></td>
	</tr>
</table>	
	<input type="submit" value="Save" /> 
	
</form:form>


<br><br>
<h1>Lorem Ipsum</h1>
<br>

<!-- Auto updates when form is sent -->
<center>
<table class="table table-bordered table-hover table-condensed">
	<thead>
		<tr>
			<th bgcolor="grey">ID</th>
			<th bgcolor="grey">user in table</th>
			<th bgcolor="grey">Link</th>
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
					href="${url}">February: ${user.name}</a> <%-- <a href="<spring:url value:"/users/${user.id}.html" />">February: ${user.name} </a></td>--%>
				</td>
			</tr>
		
		</c:forEach>
		

	</tbody>
	</c:if>
</table>
</center>
	
	<br>
	<c:forEach items="${bambucha}" var="itemki">
		${itemki.title} <br>
</c:forEach>
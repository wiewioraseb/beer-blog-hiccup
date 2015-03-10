<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<table class="table table-bordered table-hover table-condensed">
	<thead>
		<tr>
			<th bgcolor="grey">user in table</th>
		</tr>
<%-- items="${users}" from UserController.java --%>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.name}</td>
			</tr>

		</c:forEach>
		
		
 https://www.youtube.com/watch?v=6LewRDc6DPc&index=14&list=PLmcxdcWPhFqMq2BctGktOcIJKUw23wJeh
		
		<tr>
			<td>
			<spring:url value="/users/${user.id}.html" />
			<a href="${url}">February: ${user.name}</a>
			<%-- <a href="<spring:url value:"/users/${user.id}.html" />">February: ${user.name} </a></td>--%>
			</td>
		</tr>
	</tbody>

</table><%-- ${user.name} From User.java entity package --%>

<a href="${url}">...</a>



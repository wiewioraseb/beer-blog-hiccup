<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<br><br><br><br><br><br><br><br><br>

<table>
	<thead>
		<tr>
			<th>user in table</th>
		</tr>

	</thead>
	<tbody>
		<c:forEach items="${users}"
			<%-- users from UserController.java --%>  var="user">
			<tr>
				<td>${user.name} <%-- From User.java entity package --%>
				</td>
			</tr>
		</c:forEach>
	</tbody>

</table>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<body>
${message}

	<br>

	<c:if test="${!empty entries}">
		<c:forEach items="${entries}" var="entry">
	
	<table border="4" style="width: 50%">
				<thead>
					<tr>
						<td>Entry No. ${entry.id }</td>
						<td><strong>${entry.title}</strong></td>
						<td>Published: ${entry.publishedDate}</td>
						<td>
							<spring:url value="/delete_entry/${entry.id}.html" var="url" />
							<a href="${url}">Delete</a>
						</td>
						
					</tr>
				</thead>
				<tr>
					<td colspan="4">${entry.entryContent}</td>
				</tr>
			</table>
			<br>
		</c:forEach>
		
	</c:if>


	<form:form commandName="entry">

		<label for="title">Title: </label>
		<form:input path="title" />
		<br>
		<label for="entryContent">Entry content: </label>
		<form:textarea path="entryContent" rows="4" cols="35" />

		<input type="submit" value="Post entry" /> 
		<c:if test="${param.entry_successful eq true }">Published!</c:if>

	</form:form>


	<br>Going back to the beginning - <a href='<spring:url value="/" />'>Blue</a>




</body>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    


<body>${message}

	<br>
	The acutal date and time is: ${serverTime}
	<br>

		Going back to the beginning - <a href='<spring:url value="/" />'>Blue</a>
	
</body>

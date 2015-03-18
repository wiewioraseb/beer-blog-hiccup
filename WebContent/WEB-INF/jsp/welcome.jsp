<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    
<html>

<body>${message}

	<br>
	<br>
	<div align='center'
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px;">

		Going back to the beginning - <a href='<spring:url value="/" />'>Blue</a>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%-- Background image for every page --%>
<style type="text/css"> 
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> <tiles:getAsString name="title" /> </title> 
</head>
<body> 
	<tiles:insertAttribute name="body" />

	<br>
	<br>
	<center>
		<tiles:insertAttribute name="footer" /> 
	</center>
</body>
</html>
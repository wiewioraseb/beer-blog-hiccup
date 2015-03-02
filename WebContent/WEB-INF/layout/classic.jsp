<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%-- Background image for every page --%>
<style type="text/css"> 
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>


	<%-- https://developers.google.com/speed/libraries/devguide#jquery --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<%-- Bootstrap --%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> <tiles:getAsString name="title" /> </title> 
</head>
<body>

<style type="text/css"> 
body {
	background-image: url('http://crunchify.com/bg.png');
}
.container {
background-color: #191919;
}
.navbar {
    display: block;
    box-sizing: border-box;
}
.navbar-brand {
 font-size: 22px !important;
 font-weight: bold;
}



</style>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<%-- From bootstrap examples: http://getbootstrap.com/examples/starter-template/ --%>
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Hiccup</a>
		</div>
		
		
		
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href='<spring:url value="/" />'>Home</a></li>
				<li><a href='<spring:url value="/indeksownia.html" />'>About</a></li>
				<li><a href='<spring:url value="/bonus.html" />'>Contact</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<tiles:insertAttribute name="body" />

	<center>
		<tiles:insertAttribute name="footer" />
	</center>


</body>
</html>
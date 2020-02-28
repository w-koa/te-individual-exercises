<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:url value="/css/site.css" var="cssURL" />
<link rel="stylesheet" type="text/css" href="${cssURL}">
<title>Solar System Geek</title>
</head>

<body>

<div id="content">
<p> this is placeholder.</p>

	<c:url value = "/img/ssg_logo.png" var = "logoImageURL"/>
	
	<img src = "${logoImageURL}"/>

    <nav>
		<c:url value = "/" var = "homePageURL" />
		<c:url value = "/aboutUs" var = "aboutUsURL"/>
		<ul>
			<li><a href = "${homePageURL}">Home Page</a></li>
			<li><a href = "${aboutUsURL}">About Us</a>
		</ul>
    </nav>
<h1><c:out value = "${param.pageTitle}"/></h1>
<h2><c:out value = "by Jon Smeeth"/></h2>
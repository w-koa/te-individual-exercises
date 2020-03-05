<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="common/header.jspf"%>
<meta charset="ISO-8859-1">
<title>Log In</title>
</head>
<body>
	<div class="body-content">
		<c:url var="formAction" value="/login" />
		<form:form action="${formAction}" method="POST" modelAttribute="login">
			<div>
				<label for="email">Email</label>
				<form:input path="email" />
				<form:errors path="email" cssClass="error" />
			</div>
		</form:form>


	</div>


</body>
</html>

<%@include file="common/footer.jspf"%>
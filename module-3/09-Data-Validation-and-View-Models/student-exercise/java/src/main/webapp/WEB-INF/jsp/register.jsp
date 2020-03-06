<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="common/header.jspf"%>
<meta charset="ISO-8859-1">
<title>New User Registration</title>
</head>
<body>
	<div class="body-content">
		<c:url var="registerUrl" value="/register" />
		<form:form method="POST" action="${registerUrl}"
			modelAttribute="register">
			<div>
				<label for="firstName">First Name</label>
				<form:input path="firstName" placeholder="enter first name" />
				<form:errors path="firstName" cssClass="error" />
			</div>
			<div>
				<label for="lastName">Last Name</label>
				<form:input path="lastName" placeholder="enter last name" />
				<form:errors path="lastName" cssClass="error" />
			</div>
			<div>
				<label for="email">Email Address</label>
				<form:input path="email" placeholder="enter email" id="email"/>
				<form:errors path="email" cssClass="error" />
			</div>
			<div>
				<label for="confirmEmail">Confirm Email Address</label>
				<form:input path="confirmEmail" placeholder="confirm email" id="confirmEmail"/>
				<form:errors path="confirmEmail" cssClass="error" />
				<form:errors path="emailMatching" cssClass="error"/>
			</div>
			<div>
				<label for="password">Password</label>
				<form:input path="password" placeholder="enter password" id="password"/>
				<form:errors path="password" cssClass="error" />
			</div>
			<div>
				<label for="confirmPassword">Confirm Password</label>
				<form:input path="confirmPassword" placeholder="confirm password" id="confirmPassword"/>
				<form:errors path="confirmPassword" cssClass="error" />
				<form:errors path="passwordMatching" cssClass="error"/>
			</div>
			<div>
				<label for="birthday">Birthday</label>
				<form:input path="birthday" placeholder="enter birthday mm/dd/yyyy"/>
				<form:errors path="birthday" cssClass="error" />
			</div>
			<div>
				<label for="tickets">Number of Tickets</label>
				<form:input path="numberOfTickets" placeholder="enter number of tickets 1-10"/>
				<form:errors path="numberOfTickets" cssClass="error" />
			</div>
			<div>
				<input type="submit" value="Sign Me Up!" />
			</div>
		</form:form>





	</div>
</body>
</html>

<%@include file="common/footer.jspf"%>
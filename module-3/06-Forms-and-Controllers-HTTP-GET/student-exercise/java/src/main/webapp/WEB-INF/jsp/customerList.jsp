<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>


<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<input type="text" name="lastName" id="actorSearch"
			placeholder="Search" />
	
	<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>









<%@include file="common/footer.jspf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>
<!-- Form goes here -->

<c:url var="formAction" value="/actorSearchResult" />

<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<input type="text" name="lastName" id="actorSearch"
			placeholder="Search" />
	
	<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>

<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${matchingActors}" var="actor">
		<tr>
			<td><c:out value="${actor.firstName} ${actor.lastName}" /></td>
			<!-- What do we print here for each actor? -->
		</tr>
	</c:forEach>
</table>
<%@include file="common/footer.jspf"%>